
package net.alastairwyse.oraclepermissiongeneratorwebserviceapiconsumer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OracleObjectPermissionSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OracleObjectPermissionSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectPermissions" type="{http://schemas.datacontract.org/2004/07/CxfDemo.Containers}ArrayOfRoleToPermissionMap" minOccurs="0"/>
 *         &lt;element name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemoveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OracleObjectPermissionSet", propOrder = {
    "addFlag",
    "objectName",
    "objectOwner",
    "objectPermissions",
    "objectType",
    "removeFlag"
})
public class OracleObjectPermissionSet {

    @XmlElement(name = "AddFlag")
    protected Boolean addFlag;
    @XmlElementRef(name = "ObjectName", namespace = "http://schemas.datacontract.org/2004/07/CxfDemo.Containers", type = JAXBElement.class, required = false)
    protected JAXBElement<String> objectName;
    @XmlElementRef(name = "ObjectOwner", namespace = "http://schemas.datacontract.org/2004/07/CxfDemo.Containers", type = JAXBElement.class, required = false)
    protected JAXBElement<String> objectOwner;
    @XmlElementRef(name = "ObjectPermissions", namespace = "http://schemas.datacontract.org/2004/07/CxfDemo.Containers", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRoleToPermissionMap> objectPermissions;
    @XmlElementRef(name = "ObjectType", namespace = "http://schemas.datacontract.org/2004/07/CxfDemo.Containers", type = JAXBElement.class, required = false)
    protected JAXBElement<String> objectType;
    @XmlElement(name = "RemoveFlag")
    protected Boolean removeFlag;

    /**
     * Gets the value of the addFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddFlag() {
        return addFlag;
    }

    /**
     * Sets the value of the addFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddFlag(Boolean value) {
        this.addFlag = value;
    }

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObjectName(JAXBElement<String> value) {
        this.objectName = value;
    }

    /**
     * Gets the value of the objectOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObjectOwner() {
        return objectOwner;
    }

    /**
     * Sets the value of the objectOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObjectOwner(JAXBElement<String> value) {
        this.objectOwner = value;
    }

    /**
     * Gets the value of the objectPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoleToPermissionMap }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRoleToPermissionMap> getObjectPermissions() {
        return objectPermissions;
    }

    /**
     * Sets the value of the objectPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoleToPermissionMap }{@code >}
     *     
     */
    public void setObjectPermissions(JAXBElement<ArrayOfRoleToPermissionMap> value) {
        this.objectPermissions = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObjectType(JAXBElement<String> value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the removeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveFlag() {
        return removeFlag;
    }

    /**
     * Sets the value of the removeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveFlag(Boolean value) {
        this.removeFlag = value;
    }

}
