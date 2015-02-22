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
using System.ServiceModel;
using CxfDemo.Containers;

namespace CxfDemo
{
    /// <summary>
    /// Defines methods which expose the data interface layer of the Oracle Permission Generator application over a web service.
    /// </summary>
    [ServiceContract]
    public interface IOraclePermissionGeneratorWebServiceAPI
    {
        /// <include file='InterfaceDocumentationComments.xml' path='doc/members/member[@name="M:CxfDemo.IOraclePermissionGeneratorWebServiceAPI.AddUser(System.String)"]/*'/>
        void AddUser(string userIdentifier);

        /// <include file='InterfaceDocumentationComments.xml' path='doc/members/member[@name="M:CxfDemo.IOraclePermissionGeneratorWebServiceAPI.GetObjects(CxfDemo.AuthenticationContext,CxfDemo.TrackingData)"]/*'/>
        [OperationContract]
        List<OracleObjectPermissionSet> GetObjects(AuthenticationContext authenticationContext, TrackingData trackingInformation);

        /// <include file='InterfaceDocumentationComments.xml' path='doc/members/member[@name="M:CxfDemo.IOraclePermissionGeneratorWebServiceAPI.ConvertToUpperCase(System.String)"]/*'/>
        [OperationContract]
        String ConvertToUpperCase(String inputString);
    }
}
