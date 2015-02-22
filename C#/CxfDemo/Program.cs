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
using System.ServiceModel.Description;

namespace CxfDemo
{
    /// <summary>
    /// Entry point to the CxfDemo application.
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            Uri baseAddress = new Uri("http://localhost:5000/OraclePermissionGeneratorWebServiceAPI");

            // Create and start the service host
            using (ServiceHost myHost = new ServiceHost(typeof(OraclePermissionGeneratorWebServiceAPI), baseAddress))
            {
                // Set metadata settings
                ServiceMetadataBehavior serviceMetadataBehavior = new ServiceMetadataBehavior();
                serviceMetadataBehavior.HttpGetEnabled = true;
                serviceMetadataBehavior.MetadataExporter.PolicyVersion = PolicyVersion.Policy15;
                myHost.Description.Behaviors.Add(serviceMetadataBehavior);

                // Turn on option to include exception details in any web service interface errors
                myHost.Description.Behaviors.Find<ServiceDebugBehavior>().IncludeExceptionDetailInFaults = true;

                // Start the service
                myHost.Open();
                Console.WriteLine("Press [Enter] to stop the service.");
                Console.ReadLine();
                myHost.Close();
            }
        }
    }
}
