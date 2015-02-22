
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
 *         &lt;element name="authenticationContext" type="{http://schemas.datacontract.org/2004/07/CxfDemo}AuthenticationContext" minOccurs="0"/>
 *         &lt;element name="trackingInformation" type="{http://schemas.datacontract.org/2004/07/CxfDemo}TrackingData" minOccurs="0"/>
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
    "authenticationContext",
    "trackingInformation"
})
@XmlRootElement(name = "GetObjects", namespace = "http://tempuri.org/")
public class GetObjects {

    @XmlElementRef(name = "authenticationContext", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthenticationContext> authenticationContext;
    @XmlElementRef(name = "trackingInformation", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TrackingData> trackingInformation;

    /**
     * Gets the value of the authenticationContext property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthenticationContext }{@code >}
     *     
     */
    public JAXBElement<AuthenticationContext> getAuthenticationContext() {
        return authenticationContext;
    }

    /**
     * Sets the value of the authenticationContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthenticationContext }{@code >}
     *     
     */
    public void setAuthenticationContext(JAXBElement<AuthenticationContext> value) {
        this.authenticationContext = value;
    }

    /**
     * Gets the value of the trackingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrackingData }{@code >}
     *     
     */
    public JAXBElement<TrackingData> getTrackingInformation() {
        return trackingInformation;
    }

    /**
     * Sets the value of the trackingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrackingData }{@code >}
     *     
     */
    public void setTrackingInformation(JAXBElement<TrackingData> value) {
        this.trackingInformation = value;
    }

}
