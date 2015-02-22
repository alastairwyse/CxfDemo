
package net.alastairwyse.oraclepermissiongeneratorwebserviceapiconsumer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackingData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IpV4Address" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://schemas.datacontract.org/2004/07/CxfDemo}Location" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingData", namespace = "http://schemas.datacontract.org/2004/07/CxfDemo", propOrder = {
    "ipV4Address",
    "location"
})
public class TrackingData {

    @XmlElementRef(name = "IpV4Address", namespace = "http://schemas.datacontract.org/2004/07/CxfDemo", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> ipV4Address;
    @XmlElementRef(name = "Location", namespace = "http://schemas.datacontract.org/2004/07/CxfDemo", type = JAXBElement.class, required = false)
    protected JAXBElement<Location> location;

    /**
     * Gets the value of the ipV4Address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getIpV4Address() {
        return ipV4Address;
    }

    /**
     * Sets the value of the ipV4Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setIpV4Address(JAXBElement<byte[]> value) {
        this.ipV4Address = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public JAXBElement<Location> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public void setLocation(JAXBElement<Location> value) {
        this.location = value;
    }

}
