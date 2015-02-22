/*
 * Copyright 2015 Alastair Wyse (http://www.oraclepermissiongenerator.net/cxfdemo/)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using CxfDemo.Containers;
using OraclePermissionGeneratorDataModel;
using OraclePermissionGeneratorDataInterfaceModel;

namespace CxfDemo
{
    /// <summary>
    /// Exposes the data interface layer of the Oracle Permission Generator application over a web service.
    /// </summary>
    public class OraclePermissionGeneratorWebServiceAPI : IOraclePermissionGeneratorWebServiceAPI
    {
        // Dictionary holding a copy of the Oracle Permission Generator data model for each user of the web service API
        private Dictionary<string, OraclePermissionGeneratorDataInterfaceLayer> userDataRepository;
        private ContainerObjectConverter containerObjectConverter;

        /// <summary>
        /// Initialises a new instance of the OraclePermissionGeneratorWebServiceAPI.OraclePermissionGeneratorWebServiceAPI class.
        /// </summary>
        public OraclePermissionGeneratorWebServiceAPI()
        {
            userDataRepository = new Dictionary<string, OraclePermissionGeneratorDataInterfaceLayer>();
            containerObjectConverter = new ContainerObjectConverter();

            // Setup test data 
            string tempUser = "test@tempuri.org";
            AddUser(tempUser);
            SetupTestData(tempUser);
        }

        /// <include file='InterfaceDocumentationComments.xml' path='doc/members/member[@name="M:CxfDemo.IOraclePermissionGeneratorWebServiceAPI.AddUser(System.String)"]/*'/>
        public void AddUser(string userIdentifier)
        {
            // Throw an exception if the user identifier is blank
            if (userIdentifier.Trim() == "")
            {
                throw new ArgumentException("Parameter 'userIdentifier' cannot be blank.", "userIdentifier");
            }

            // Throw an exception if the user identifier already exists in the data repository
            if (userDataRepository.ContainsKey(userIdentifier) == true)
            {
                throw new ArgumentException("User identifier '" + userIdentifier + "' already exists.", "userIdentifier");
            }

            OraclePermissionGeneratorDataInterfaceLayer userDataInterfaceLayer = new OraclePermissionGeneratorDataInterfaceLayer();
            userDataRepository.Add(userIdentifier, userDataInterfaceLayer);
        }

        /// <include file='InterfaceDocumentationComments.xml' path='doc/members/member[@name="M:CxfDemo.IOraclePermissionGeneratorWebServiceAPI.GetObjects(CxfDemo.AuthenticationContext,CxfDemo.TrackingData)"]/*'/>
        public List<Containers.OracleObjectPermissionSet> GetObjects(AuthenticationContext authenticationContext, TrackingData trackingInformation)
        {
            ValidateUser(authenticationContext.UserIdentifier);
            List<IGenerateableOracleObjectPermissionSet> permissionSetList = userDataRepository[authenticationContext.UserIdentifier].GetObjects();
            List<Containers.OracleObjectPermissionSet> returnObjects = containerObjectConverter.Convert(permissionSetList);

            // Log tracking information to the console
            Console.WriteLine(DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss.fff") + " : Method GetObjects() called.");
            if (trackingInformation != null)
            {
                Console.WriteLine("  Source IP Address: " + trackingInformation.IpV4Address[0] + "." + trackingInformation.IpV4Address[1] + "." + trackingInformation.IpV4Address[2] + "." + trackingInformation.IpV4Address[3]);
                Console.WriteLine("  Location longitude: " + trackingInformation.Location.Longitude);
                Console.WriteLine("  Location latitude: " + trackingInformation.Location.Latitude);
            }
            else
            {
                Console.WriteLine("  Tracking information not received");
            }
            Console.WriteLine();
            

            return returnObjects;
        }

        /// <include file='InterfaceDocumentationComments.xml' path='doc/members/member[@name="M:CxfDemo.IOraclePermissionGeneratorWebServiceAPI.ConvertToUpperCase(System.String)"]/*'/>
        public String ConvertToUpperCase(String inputString)
        {
            return inputString.ToUpper();
        }

        #region Private Methods

        /// <summary>
        /// Throws an exception if the inputted user cannot be validated.
        /// </summary>
        /// <param name="userIdentifier">The unique identifier of the user to validate.</param>
        private void ValidateUser(string userIdentifier)
        {
            if (userDataRepository.ContainsKey(userIdentifier) == false)
            {
                throw new Exception("User '" + userIdentifier + "' not recognized.");
            }
        }

        /// <summary>
        /// Sets up test data in the data model for the specified user.
        /// </summary>
        /// <param name="userIdentifier">The user to setup the data for.</param>
        private void SetupTestData(string userIdentifier)
        {
            ValidateUser(userIdentifier);

            // Setup role to user mapping
            userDataRepository[userIdentifier].AddRoleToUserMap("XZYON_APP_ROLE", "XZYON_APP_USER");
            userDataRepository[userIdentifier].AddRoleToUserMap("XYZON_POWER_ROLE", "XYZON_POWER_USER");
            userDataRepository[userIdentifier].AddRoleToUserMap("XYZON_READ_ROLE", "JONES_SAM");
            userDataRepository[userIdentifier].AddRoleToUserMap("XYZON_READ_ROLE", "SMITH_JOHN");

            // Setup object type to permission mapping
            userDataRepository[userIdentifier].AddObjectTypeToPermissionMap("Table", "SELECT");
            userDataRepository[userIdentifier].AddObjectTypeToPermissionMap("Table", "INSERT");
            userDataRepository[userIdentifier].AddObjectTypeToPermissionMap("Table", "UPDATE");
            userDataRepository[userIdentifier].AddObjectTypeToPermissionMap("Table", "DELETE");
            userDataRepository[userIdentifier].AddObjectTypeToPermissionMap("View", "SELECT");
            userDataRepository[userIdentifier].AddObjectTypeToPermissionMap("Stored Procedure", "EXECUTE");

            // Setup permission set objects
            userDataRepository[userIdentifier].AddObjectPermissionSet("CUSTOMERS", "Table", "XYZON", true, false, new RoleToPermissionMapCollection());
            userDataRepository[userIdentifier].GetObjectPermissionSet("CUSTOMERS").ObjectPermissions.Add("XYZON_POWER_ROLE", "SELECT");
            userDataRepository[userIdentifier].GetObjectPermissionSet("CUSTOMERS").ObjectPermissions.Add("XYZON_READ_ROLE", "SELECT");

            userDataRepository[userIdentifier].AddObjectPermissionSet("ITEMS", "Table", "XYZON", true, false, new RoleToPermissionMapCollection());
            userDataRepository[userIdentifier].GetObjectPermissionSet("ITEMS").ObjectPermissions.Add("XYZON_POWER_ROLE", "SELECT");
            userDataRepository[userIdentifier].GetObjectPermissionSet("ITEMS").ObjectPermissions.Add("XYZON_READ_ROLE", "SELECT");

            userDataRepository[userIdentifier].AddObjectPermissionSet("ORDERS", "Table", "XYZON", true, false, new RoleToPermissionMapCollection());
            userDataRepository[userIdentifier].GetObjectPermissionSet("ORDERS").ObjectPermissions.Add("XYZON_POWER_ROLE", "SELECT");
            userDataRepository[userIdentifier].GetObjectPermissionSet("ORDERS").ObjectPermissions.Add("XYZON_READ_ROLE", "SELECT");

            userDataRepository[userIdentifier].AddObjectPermissionSet("APPLICATION_STATS", "Table", "XYZON", true, false, new RoleToPermissionMapCollection());
            userDataRepository[userIdentifier].GetObjectPermissionSet("APPLICATION_STATS").ObjectPermissions.Add("XYZON_POWER_ROLE", "SELECT");
            userDataRepository[userIdentifier].GetObjectPermissionSet("APPLICATION_STATS").ObjectPermissions.Add("XYZON_READ_ROLE", "SELECT");
            userDataRepository[userIdentifier].GetObjectPermissionSet("APPLICATION_STATS").ObjectPermissions.Add("XZYON_APP_ROLE", "SELECT");
            userDataRepository[userIdentifier].GetObjectPermissionSet("APPLICATION_STATS").ObjectPermissions.Add("XZYON_APP_ROLE", "INSERT");
            userDataRepository[userIdentifier].GetObjectPermissionSet("APPLICATION_STATS").ObjectPermissions.Add("XZYON_APP_ROLE", "UPDATE");
            userDataRepository[userIdentifier].GetObjectPermissionSet("APPLICATION_STATS").ObjectPermissions.Add("XZYON_APP_ROLE", "DELETE");

            userDataRepository[userIdentifier].AddObjectPermissionSet("VW_CUSTOMERS", "View", "XYZON", true, false, new RoleToPermissionMapCollection());
            userDataRepository[userIdentifier].GetObjectPermissionSet("VW_CUSTOMERS").ObjectPermissions.Add("XYZON_POWER_ROLE", "SELECT");
            userDataRepository[userIdentifier].GetObjectPermissionSet("VW_CUSTOMERS").ObjectPermissions.Add("XYZON_READ_ROLE", "SELECT");
            userDataRepository[userIdentifier].GetObjectPermissionSet("VW_CUSTOMERS").ObjectPermissions.Add("XZYON_APP_ROLE", "SELECT");

            userDataRepository[userIdentifier].AddObjectPermissionSet("VW_ITEMS", "View", "XYZON", true, false, new RoleToPermissionMapCollection());
            userDataRepository[userIdentifier].GetObjectPermissionSet("VW_ITEMS").ObjectPermissions.Add("XYZON_POWER_ROLE", "SELECT");
            userDataRepository[userIdentifier].GetObjectPermissionSet("VW_ITEMS").ObjectPermissions.Add("XYZON_READ_ROLE", "SELECT");
            userDataRepository[userIdentifier].GetObjectPermissionSet("VW_ITEMS").ObjectPermissions.Add("XZYON_APP_ROLE", "SELECT");

            userDataRepository[userIdentifier].AddObjectPermissionSet("VW_ORDERS", "View", "XYZON", true, false, new RoleToPermissionMapCollection());
            userDataRepository[userIdentifier].GetObjectPermissionSet("VW_ORDERS").ObjectPermissions.Add("XYZON_POWER_ROLE", "SELECT");
            userDataRepository[userIdentifier].GetObjectPermissionSet("VW_ORDERS").ObjectPermissions.Add("XYZON_READ_ROLE", "SELECT");
            userDataRepository[userIdentifier].GetObjectPermissionSet("VW_ORDERS").ObjectPermissions.Add("XZYON_APP_ROLE", "SELECT");

            userDataRepository[userIdentifier].AddObjectPermissionSet("SP_CUSTOMERS_INS", "Stored Procedure", "XYZON", true, false, new RoleToPermissionMapCollection());
            userDataRepository[userIdentifier].GetObjectPermissionSet("SP_CUSTOMERS_INS").ObjectPermissions.Add("XYZON_POWER_ROLE", "EXECUTE");
            userDataRepository[userIdentifier].GetObjectPermissionSet("SP_CUSTOMERS_INS").ObjectPermissions.Add("XZYON_APP_ROLE", "EXECUTE");

            userDataRepository[userIdentifier].AddObjectPermissionSet("SP_CUSTOMERS_UPD", "Stored Procedure", "XYZON", true, false, new RoleToPermissionMapCollection());
            userDataRepository[userIdentifier].GetObjectPermissionSet("SP_CUSTOMERS_UPD").ObjectPermissions.Add("XYZON_POWER_ROLE", "EXECUTE");
            userDataRepository[userIdentifier].GetObjectPermissionSet("SP_CUSTOMERS_UPD").ObjectPermissions.Add("XZYON_APP_ROLE", "EXECUTE");

            userDataRepository[userIdentifier].AddObjectPermissionSet("SP_ITEMS_INS", "Stored Procedure", "XYZON", true, false, new RoleToPermissionMapCollection());
            userDataRepository[userIdentifier].GetObjectPermissionSet("SP_ITEMS_INS").ObjectPermissions.Add("XYZON_POWER_ROLE", "EXECUTE");
            userDataRepository[userIdentifier].GetObjectPermissionSet("SP_ITEMS_INS").ObjectPermissions.Add("XZYON_APP_ROLE", "EXECUTE");

            userDataRepository[userIdentifier].AddObjectPermissionSet("SP_ITEMS_UPD", "Stored Procedure", "XYZON", true, false, new RoleToPermissionMapCollection());
            userDataRepository[userIdentifier].GetObjectPermissionSet("SP_ITEMS_UPD").ObjectPermissions.Add("XYZON_POWER_ROLE", "EXECUTE");
            userDataRepository[userIdentifier].GetObjectPermissionSet("SP_ITEMS_UPD").ObjectPermissions.Add("XZYON_APP_ROLE", "EXECUTE");

            userDataRepository[userIdentifier].AddObjectPermissionSet("SP_ORDERS_INS", "Stored Procedure", "XYZON", true, false, new RoleToPermissionMapCollection());
            userDataRepository[userIdentifier].GetObjectPermissionSet("SP_ORDERS_INS").ObjectPermissions.Add("XYZON_POWER_ROLE", "EXECUTE");
            userDataRepository[userIdentifier].GetObjectPermissionSet("SP_ORDERS_INS").ObjectPermissions.Add("XZYON_APP_ROLE", "EXECUTE");

            userDataRepository[userIdentifier].AddObjectPermissionSet("SP_ORDERS_UPD", "Stored Procedure", "XYZON", true, false, new RoleToPermissionMapCollection());
            userDataRepository[userIdentifier].GetObjectPermissionSet("SP_ORDERS_UPD").ObjectPermissions.Add("XYZON_POWER_ROLE", "EXECUTE");
            userDataRepository[userIdentifier].GetObjectPermissionSet("SP_ORDERS_UPD").ObjectPermissions.Add("XZYON_APP_ROLE", "EXECUTE");
        }

        #endregion
    }
}
