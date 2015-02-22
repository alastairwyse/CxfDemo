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

namespace CxfDemo
{
    /// <summary>
    /// Converts container objects in the OraclePermissionGeneratorDataModel namespace to equivalent objects in the CxfDemo.Containers namespace, so they can be serialized and exposed as a web service by Windows Communication Foundation.
    /// </summary>
    public class ContainerObjectConverter
    {
        /// <summary>
        /// Converts an object implementing interface OraclePermissionGeneratorDataModel.IRoleToPermissionMapCollection to a List of CxfDemo.Containers.RoleToPermissionMap objects.
        /// </summary>
        /// <param name="roleToPermissionMapCollection">The IRoleToPermissionMapCollection to convert.</param>
        /// <returns>The converted object.</returns>
        public List<RoleToPermissionMap> Convert(IRoleToPermissionMapCollection roleToPermissionMapCollection)
        {
            List<RoleToPermissionMap> returnList = new List<RoleToPermissionMap>();

            foreach (IStringMapper currentStringMapper in roleToPermissionMapCollection)
            {
                RoleToPermissionMap roleToPermissionMap = new RoleToPermissionMap();
                roleToPermissionMap.Role = currentStringMapper.MappedFrom;
                roleToPermissionMap.Permission = currentStringMapper.MappedTo;
                returnList.Add(roleToPermissionMap);
            }

            return returnList;
        }

        /// <summary>
        /// Converts a list of objects implementing interface OraclePermissionGeneratorDataModel.IGenerateableOracleObjectPermissionSet to a list of CxfDemo.Containers.OracleObjectPermissionSet objects.
        /// </summary>
        /// <param name="inputList">The list of IGenerateableOracleObjectPermissionSet objects to convert.</param>
        /// <returns>The converted list.</returns>
        public List<Containers.OracleObjectPermissionSet> Convert(List<IGenerateableOracleObjectPermissionSet> inputList)
        {
            List<Containers.OracleObjectPermissionSet> returnList = new List<Containers.OracleObjectPermissionSet>();

            foreach (IGenerateableOracleObjectPermissionSet currentGenerateableOracleObjectPermissionSet in inputList)
            {
                Containers.OracleObjectPermissionSet newOracleObjectPermissionSet = new Containers.OracleObjectPermissionSet();
                newOracleObjectPermissionSet.ObjectName = currentGenerateableOracleObjectPermissionSet.ObjectName;
                newOracleObjectPermissionSet.ObjectType = currentGenerateableOracleObjectPermissionSet.ObjectType;
                newOracleObjectPermissionSet.ObjectOwner = currentGenerateableOracleObjectPermissionSet.ObjectOwner;
                newOracleObjectPermissionSet.AddFlag = currentGenerateableOracleObjectPermissionSet.AddFlag;
                newOracleObjectPermissionSet.RemoveFlag = currentGenerateableOracleObjectPermissionSet.RemoveFlag;
                newOracleObjectPermissionSet.ObjectPermissions = Convert(currentGenerateableOracleObjectPermissionSet.ObjectPermissions);
                returnList.Add(newOracleObjectPermissionSet);
            }

            return returnList;
        }
    }
}
