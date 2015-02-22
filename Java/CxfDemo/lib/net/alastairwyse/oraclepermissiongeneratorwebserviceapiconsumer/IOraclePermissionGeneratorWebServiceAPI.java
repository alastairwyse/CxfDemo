package net.alastairwyse.oraclepermissiongeneratorwebserviceapiconsumer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2015-01-18T17:52:06.563+09:00
 * Generated source version: 3.0.1
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "IOraclePermissionGeneratorWebServiceAPI")
@XmlSeeAlso({ObjectFactory.class})
public interface IOraclePermissionGeneratorWebServiceAPI {

    @WebResult(name = "ConvertToUpperCaseResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IOraclePermissionGeneratorWebServiceAPI/ConvertToUpperCase", output = "http://tempuri.org/IOraclePermissionGeneratorWebServiceAPI/ConvertToUpperCaseResponse")
    @RequestWrapper(localName = "ConvertToUpperCase", targetNamespace = "http://tempuri.org/", className = "net.alastairwyse.oraclepermissiongeneratorwebserviceapiconsumer.ConvertToUpperCase")
    @WebMethod(operationName = "ConvertToUpperCase", action = "http://tempuri.org/IOraclePermissionGeneratorWebServiceAPI/ConvertToUpperCase")
    @ResponseWrapper(localName = "ConvertToUpperCaseResponse", targetNamespace = "http://tempuri.org/", className = "net.alastairwyse.oraclepermissiongeneratorwebserviceapiconsumer.ConvertToUpperCaseResponse")
    public java.lang.String convertToUpperCase(
        @WebParam(name = "inputString", targetNamespace = "http://tempuri.org/")
        java.lang.String inputString
    );

    @WebResult(name = "GetObjectsResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IOraclePermissionGeneratorWebServiceAPI/GetObjects", output = "http://tempuri.org/IOraclePermissionGeneratorWebServiceAPI/GetObjectsResponse")
    @RequestWrapper(localName = "GetObjects", targetNamespace = "http://tempuri.org/", className = "net.alastairwyse.oraclepermissiongeneratorwebserviceapiconsumer.GetObjects")
    @WebMethod(operationName = "GetObjects", action = "http://tempuri.org/IOraclePermissionGeneratorWebServiceAPI/GetObjects")
    @ResponseWrapper(localName = "GetObjectsResponse", targetNamespace = "http://tempuri.org/", className = "net.alastairwyse.oraclepermissiongeneratorwebserviceapiconsumer.GetObjectsResponse")
    public net.alastairwyse.oraclepermissiongeneratorwebserviceapiconsumer.ArrayOfOracleObjectPermissionSet getObjects(
        @WebParam(name = "authenticationContext", targetNamespace = "http://tempuri.org/")
        net.alastairwyse.oraclepermissiongeneratorwebserviceapiconsumer.AuthenticationContext authenticationContext,
        @WebParam(name = "trackingInformation", targetNamespace = "http://tempuri.org/")
        net.alastairwyse.oraclepermissiongeneratorwebserviceapiconsumer.TrackingData trackingInformation
    );
}
