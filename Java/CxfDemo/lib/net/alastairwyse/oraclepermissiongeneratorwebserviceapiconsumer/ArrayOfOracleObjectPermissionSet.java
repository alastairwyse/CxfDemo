
package net.alastairwyse.oraclepermissiongeneratorwebserviceapiconsumer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOracleObjectPermissionSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOracleObjectPermissionSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OracleObjectPermissionSet" type="{http://schemas.datacontract.org/2004/07/CxfDemo.Containers}OracleObjectPermissionSet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOracleObjectPermissionSet", propOrder = {
    "oracleObjectPermissionSet"
})
public class ArrayOfOracleObjectPermissionSet {

    @XmlElement(name = "OracleObjectPermissionSet", nillable = true)
    protected List<OracleObjectPermissionSet> oracleObjectPermissionSet;

    /**
     * Gets the value of the oracleObjectPermissionSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oracleObjectPermissionSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOracleObjectPermissionSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OracleObjectPermissionSet }
     * 
     * 
     */
    public List<OracleObjectPermissionSet> getOracleObjectPermissionSet() {
        if (oracleObjectPermissionSet == null) {
            oracleObjectPermissionSet = new ArrayList<OracleObjectPermissionSet>();
        }
        return this.oracleObjectPermissionSet;
    }

}
