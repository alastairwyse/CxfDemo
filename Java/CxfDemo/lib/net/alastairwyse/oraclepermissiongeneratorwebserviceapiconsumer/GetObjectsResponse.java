
package net.alastairwyse.oraclepermissiongeneratorwebserviceapiconsumer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetObjectsResult" type="{http://schemas.datacontract.org/2004/07/CxfDemo.Containers}ArrayOfOracleObjectPermissionSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getObjectsResult"
})
@XmlRootElement(name = "GetObjectsResponse", namespace = "http://tempuri.org/")
public class GetObjectsResponse {

    @XmlElementRef(name = "GetObjectsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOracleObjectPermissionSet> getObjectsResult;

    /**
     * Gets the value of the getObjectsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOracleObjectPermissionSet }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOracleObjectPermissionSet> getGetObjectsResult() {
        return getObjectsResult;
    }

    /**
     * Sets the value of the getObjectsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOracleObjectPermissionSet }{@code >}
     *     
     */
    public void setGetObjectsResult(JAXBElement<ArrayOfOracleObjectPermissionSet> value) {
        this.getObjectsResult = value;
    }

}
