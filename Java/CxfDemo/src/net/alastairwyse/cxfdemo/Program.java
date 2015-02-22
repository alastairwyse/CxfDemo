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

package net.alastairwyse.cxfdemo;

import java.net.*;
import java.util.*;

import net.alastairwyse.oraclepermissiongeneratorwebserviceapiconsumer.*;

/**
 * Main entry point for the cxfdemo program.
 * @author Alastair Wyse
 */
public class Program {

    public static void main(String[] args) throws Exception {
        // Define a url holding the location of the web service wsdl, and objects to represent the web service itself
        URL serviceUrl = new URL("http://localhost:5000/OraclePermissionGeneratorWebServiceAPI?wsdl");
        OraclePermissionGeneratorWebServiceAPI webServiceApi = new OraclePermissionGeneratorWebServiceAPI(serviceUrl);
        IOraclePermissionGeneratorWebServiceAPI webServiceApiInterface = webServiceApi.getBasicHttpBindingIOraclePermissionGeneratorWebServiceAPI();
        // Create an object factory to convert objects to their wsdl XML representations and vice versa
        ObjectFactory jaxbObjectFactory = new ObjectFactory();

        // Call the ConvertToUpperCase() method 
        //   This is a simple method call with a string as the parameter and return value
        String returnedString = webServiceApiInterface.convertToUpperCase("abcdef");
        System.out.println("Result of ConvertToUpperCase() call...");
        System.out.println(returnedString);
        System.out.println();
        
        // Call the GetObjects() method
        //   This is a more complex method call with complex objects passed as parameters and returned
        
        // Use the object factory to setup the input parameters
        AuthenticationContext authenticationContext = jaxbObjectFactory.createAuthenticationContext();
        authenticationContext.setUserIdentifier(jaxbObjectFactory.createAuthenticationContextUserIdentifier("test@tempuri.org"));
        
        Location location = jaxbObjectFactory.createLocation();
        location.setLatitude(new Double(35.6895));
        location.setLongitude(new Double(139.6917));

        TrackingData trackingInformation = jaxbObjectFactory.createTrackingData();
        trackingInformation.setLocation(jaxbObjectFactory.createLocation(location));
        byte[] inetAddress = InetAddress.getLocalHost().getAddress();
        trackingInformation.setIpV4Address(jaxbObjectFactory.createTrackingDataIpV4Address(inetAddress));
        // Call the GetObjects() method
        ArrayOfOracleObjectPermissionSet result = webServiceApiInterface.getObjects(authenticationContext, trackingInformation);

        // Print the contents of the returned array of Oracle permission set objects to the console
        System.out.println("Result of GetObjects() call...");
        PrintToConsole(result.getOracleObjectPermissionSet());
        
        // Call the GetObjects() method a null parameter
        result = webServiceApiInterface.getObjects(authenticationContext, null);
    }

    /**
     * Prints the contents of the inputted array of oracle permission set objects to the console.
     * @param permissionSetArray
     */
    private static void PrintToConsole(List<OracleObjectPermissionSet> permissionSetList) {
        for(OracleObjectPermissionSet currentPermissionSet : permissionSetList) {
            // Write the basic properties
            System.out.println("Object Name: " + currentPermissionSet.getObjectName().getValue());
            System.out.println("  Object Type: " + currentPermissionSet.getObjectType().getValue());
            System.out.println("  Object Owner: " + currentPermissionSet.getObjectOwner().getValue());
            
            // Iterate through and write the list of of role to permission mappings
            System.out.println("  Role to permission mappings: ");
            List<RoleToPermissionMap> roleToPermissionMaps = currentPermissionSet.getObjectPermissions().getValue().getRoleToPermissionMap();
            for(RoleToPermissionMap currentRoleToPermissionMap : roleToPermissionMaps) {
                String role = currentRoleToPermissionMap.getRole().getValue();
                String permission = currentRoleToPermissionMap.getPermission().getValue();
                System.out.println("    " + role + " : " + permission);
            }
            
            // Write the add and remove permissions
            System.out.println("  Add Permission: " + currentPermissionSet.isAddFlag());
            System.out.println("  Remove Permission: " + currentPermissionSet.isRemoveFlag());
        }
    }
}
