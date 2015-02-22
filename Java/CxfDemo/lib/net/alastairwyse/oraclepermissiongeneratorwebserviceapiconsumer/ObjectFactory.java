
package net.alastairwyse.oraclepermissiongeneratorwebserviceapiconsumer;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.alastairwyse.oraclepermissiongeneratorwebserviceapiconsumer package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Location_QNAME = new QName("http://schemas.datacontract.org/2004/07/CxfDemo", "Location");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _RoleToPermissionMap_QNAME = new QName("http://schemas.datacontract.org/2004/07/CxfDemo.Containers", "RoleToPermissionMap");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _AuthenticationContext_QNAME = new QName("http://schemas.datacontract.org/2004/07/CxfDemo", "AuthenticationContext");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _TrackingData_QNAME = new QName("http://schemas.datacontract.org/2004/07/CxfDemo", "TrackingData");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfOracleObjectPermissionSet_QNAME = new QName("http://schemas.datacontract.org/2004/07/CxfDemo.Containers", "ArrayOfOracleObjectPermissionSet");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _OracleObjectPermissionSet_QNAME = new QName("http://schemas.datacontract.org/2004/07/CxfDemo.Containers", "OracleObjectPermissionSet");
    private final static QName _ArrayOfRoleToPermissionMap_QNAME = new QName("http://schemas.datacontract.org/2004/07/CxfDemo.Containers", "ArrayOfRoleToPermissionMap");
    private final static QName _TrackingDataIpV4Address_QNAME = new QName("http://schemas.datacontract.org/2004/07/CxfDemo", "IpV4Address");
    private final static QName _GetObjectsResponseGetObjectsResult_QNAME = new QName("http://tempuri.org/", "GetObjectsResult");
    private final static QName _RoleToPermissionMapPermission_QNAME = new QName("http://schemas.datacontract.org/2004/07/CxfDemo.Containers", "Permission");
    private final static QName _RoleToPermissionMapRole_QNAME = new QName("http://schemas.datacontract.org/2004/07/CxfDemo.Containers", "Role");
    private final static QName _ConvertToUpperCaseInputString_QNAME = new QName("http://tempuri.org/", "inputString");
    private final static QName _OracleObjectPermissionSetObjectOwner_QNAME = new QName("http://schemas.datacontract.org/2004/07/CxfDemo.Containers", "ObjectOwner");
    private final static QName _OracleObjectPermissionSetObjectType_QNAME = new QName("http://schemas.datacontract.org/2004/07/CxfDemo.Containers", "ObjectType");
    private final static QName _OracleObjectPermissionSetObjectPermissions_QNAME = new QName("http://schemas.datacontract.org/2004/07/CxfDemo.Containers", "ObjectPermissions");
    private final static QName _OracleObjectPermissionSetObjectName_QNAME = new QName("http://schemas.datacontract.org/2004/07/CxfDemo.Containers", "ObjectName");
    private final static QName _AuthenticationContextUserIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/CxfDemo", "UserIdentifier");
    private final static QName _ConvertToUpperCaseResponseConvertToUpperCaseResult_QNAME = new QName("http://tempuri.org/", "ConvertToUpperCaseResult");
    private final static QName _GetObjectsTrackingInformation_QNAME = new QName("http://tempuri.org/", "trackingInformation");
    private final static QName _GetObjectsAuthenticationContext_QNAME = new QName("http://tempuri.org/", "authenticationContext");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.alastairwyse.oraclepermissiongeneratorwebserviceapiconsumer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetObjects }
     * 
     */
    public GetObjects createGetObjects() {
        return new GetObjects();
    }

    /**
     * Create an instance of {@link AuthenticationContext }
     * 
     */
    public AuthenticationContext createAuthenticationContext() {
        return new AuthenticationContext();
    }

    /**
     * Create an instance of {@link TrackingData }
     * 
     */
    public TrackingData createTrackingData() {
        return new TrackingData();
    }

    /**
     * Create an instance of {@link GetObjectsResponse }
     * 
     */
    public GetObjectsResponse createGetObjectsResponse() {
        return new GetObjectsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOracleObjectPermissionSet }
     * 
     */
    public ArrayOfOracleObjectPermissionSet createArrayOfOracleObjectPermissionSet() {
        return new ArrayOfOracleObjectPermissionSet();
    }

    /**
     * Create an instance of {@link ConvertToUpperCaseResponse }
     * 
     */
    public ConvertToUpperCaseResponse createConvertToUpperCaseResponse() {
        return new ConvertToUpperCaseResponse();
    }

    /**
     * Create an instance of {@link ConvertToUpperCase }
     * 
     */
    public ConvertToUpperCase createConvertToUpperCase() {
        return new ConvertToUpperCase();
    }

    /**
     * Create an instance of {@link RoleToPermissionMap }
     * 
     */
    public RoleToPermissionMap createRoleToPermissionMap() {
        return new RoleToPermissionMap();
    }

    /**
     * Create an instance of {@link OracleObjectPermissionSet }
     * 
     */
    public OracleObjectPermissionSet createOracleObjectPermissionSet() {
        return new OracleObjectPermissionSet();
    }

    /**
     * Create an instance of {@link ArrayOfRoleToPermissionMap }
     * 
     */
    public ArrayOfRoleToPermissionMap createArrayOfRoleToPermissionMap() {
        return new ArrayOfRoleToPermissionMap();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CxfDemo", name = "Location")
    public JAXBElement<Location> createLocation(Location value) {
        return new JAXBElement<Location>(_Location_QNAME, Location.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleToPermissionMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CxfDemo.Containers", name = "RoleToPermissionMap")
    public JAXBElement<RoleToPermissionMap> createRoleToPermissionMap(RoleToPermissionMap value) {
        return new JAXBElement<RoleToPermissionMap>(_RoleToPermissionMap_QNAME, RoleToPermissionMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CxfDemo", name = "AuthenticationContext")
    public JAXBElement<AuthenticationContext> createAuthenticationContext(AuthenticationContext value) {
        return new JAXBElement<AuthenticationContext>(_AuthenticationContext_QNAME, AuthenticationContext.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackingData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CxfDemo", name = "TrackingData")
    public JAXBElement<TrackingData> createTrackingData(TrackingData value) {
        return new JAXBElement<TrackingData>(_TrackingData_QNAME, TrackingData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOracleObjectPermissionSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CxfDemo.Containers", name = "ArrayOfOracleObjectPermissionSet")
    public JAXBElement<ArrayOfOracleObjectPermissionSet> createArrayOfOracleObjectPermissionSet(ArrayOfOracleObjectPermissionSet value) {
        return new JAXBElement<ArrayOfOracleObjectPermissionSet>(_ArrayOfOracleObjectPermissionSet_QNAME, ArrayOfOracleObjectPermissionSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OracleObjectPermissionSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CxfDemo.Containers", name = "OracleObjectPermissionSet")
    public JAXBElement<OracleObjectPermissionSet> createOracleObjectPermissionSet(OracleObjectPermissionSet value) {
        return new JAXBElement<OracleObjectPermissionSet>(_OracleObjectPermissionSet_QNAME, OracleObjectPermissionSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoleToPermissionMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CxfDemo.Containers", name = "ArrayOfRoleToPermissionMap")
    public JAXBElement<ArrayOfRoleToPermissionMap> createArrayOfRoleToPermissionMap(ArrayOfRoleToPermissionMap value) {
        return new JAXBElement<ArrayOfRoleToPermissionMap>(_ArrayOfRoleToPermissionMap_QNAME, ArrayOfRoleToPermissionMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CxfDemo", name = "IpV4Address", scope = TrackingData.class)
    public JAXBElement<byte[]> createTrackingDataIpV4Address(byte[] value) {
        return new JAXBElement<byte[]>(_TrackingDataIpV4Address_QNAME, byte[].class, TrackingData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CxfDemo", name = "Location", scope = TrackingData.class)
    public JAXBElement<Location> createTrackingDataLocation(Location value) {
        return new JAXBElement<Location>(_Location_QNAME, Location.class, TrackingData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOracleObjectPermissionSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetObjectsResult", scope = GetObjectsResponse.class)
    public JAXBElement<ArrayOfOracleObjectPermissionSet> createGetObjectsResponseGetObjectsResult(ArrayOfOracleObjectPermissionSet value) {
        return new JAXBElement<ArrayOfOracleObjectPermissionSet>(_GetObjectsResponseGetObjectsResult_QNAME, ArrayOfOracleObjectPermissionSet.class, GetObjectsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CxfDemo.Containers", name = "Permission", scope = RoleToPermissionMap.class)
    public JAXBElement<String> createRoleToPermissionMapPermission(String value) {
        return new JAXBElement<String>(_RoleToPermissionMapPermission_QNAME, String.class, RoleToPermissionMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CxfDemo.Containers", name = "Role", scope = RoleToPermissionMap.class)
    public JAXBElement<String> createRoleToPermissionMapRole(String value) {
        return new JAXBElement<String>(_RoleToPermissionMapRole_QNAME, String.class, RoleToPermissionMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "inputString", scope = ConvertToUpperCase.class)
    public JAXBElement<String> createConvertToUpperCaseInputString(String value) {
        return new JAXBElement<String>(_ConvertToUpperCaseInputString_QNAME, String.class, ConvertToUpperCase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CxfDemo.Containers", name = "ObjectOwner", scope = OracleObjectPermissionSet.class)
    public JAXBElement<String> createOracleObjectPermissionSetObjectOwner(String value) {
        return new JAXBElement<String>(_OracleObjectPermissionSetObjectOwner_QNAME, String.class, OracleObjectPermissionSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CxfDemo.Containers", name = "ObjectType", scope = OracleObjectPermissionSet.class)
    public JAXBElement<String> createOracleObjectPermissionSetObjectType(String value) {
        return new JAXBElement<String>(_OracleObjectPermissionSetObjectType_QNAME, String.class, OracleObjectPermissionSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoleToPermissionMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CxfDemo.Containers", name = "ObjectPermissions", scope = OracleObjectPermissionSet.class)
    public JAXBElement<ArrayOfRoleToPermissionMap> createOracleObjectPermissionSetObjectPermissions(ArrayOfRoleToPermissionMap value) {
        return new JAXBElement<ArrayOfRoleToPermissionMap>(_OracleObjectPermissionSetObjectPermissions_QNAME, ArrayOfRoleToPermissionMap.class, OracleObjectPermissionSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CxfDemo.Containers", name = "ObjectName", scope = OracleObjectPermissionSet.class)
    public JAXBElement<String> createOracleObjectPermissionSetObjectName(String value) {
        return new JAXBElement<String>(_OracleObjectPermissionSetObjectName_QNAME, String.class, OracleObjectPermissionSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CxfDemo", name = "UserIdentifier", scope = AuthenticationContext.class)
    public JAXBElement<String> createAuthenticationContextUserIdentifier(String value) {
        return new JAXBElement<String>(_AuthenticationContextUserIdentifier_QNAME, String.class, AuthenticationContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConvertToUpperCaseResult", scope = ConvertToUpperCaseResponse.class)
    public JAXBElement<String> createConvertToUpperCaseResponseConvertToUpperCaseResult(String value) {
        return new JAXBElement<String>(_ConvertToUpperCaseResponseConvertToUpperCaseResult_QNAME, String.class, ConvertToUpperCaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackingData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "trackingInformation", scope = GetObjects.class)
    public JAXBElement<TrackingData> createGetObjectsTrackingInformation(TrackingData value) {
        return new JAXBElement<TrackingData>(_GetObjectsTrackingInformation_QNAME, TrackingData.class, GetObjects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authenticationContext", scope = GetObjects.class)
    public JAXBElement<AuthenticationContext> createGetObjectsAuthenticationContext(AuthenticationContext value) {
        return new JAXBElement<AuthenticationContext>(_GetObjectsAuthenticationContext_QNAME, AuthenticationContext.class, GetObjects.class, value);
    }

}
