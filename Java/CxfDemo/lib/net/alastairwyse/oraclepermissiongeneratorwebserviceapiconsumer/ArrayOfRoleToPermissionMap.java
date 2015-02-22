
package net.alastairwyse.oraclepermissiongeneratorwebserviceapiconsumer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRoleToPermissionMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRoleToPermissionMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoleToPermissionMap" type="{http://schemas.datacontract.org/2004/07/CxfDemo.Containers}RoleToPermissionMap" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoleToPermissionMap", propOrder = {
    "roleToPermissionMap"
})
public class ArrayOfRoleToPermissionMap {

    @XmlElement(name = "RoleToPermissionMap", nillable = true)
    protected List<RoleToPermissionMap> roleToPermissionMap;

    /**
     * Gets the value of the roleToPermissionMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleToPermissionMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleToPermissionMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleToPermissionMap }
     * 
     * 
     */
    public List<RoleToPermissionMap> getRoleToPermissionMap() {
        if (roleToPermissionMap == null) {
            roleToPermissionMap = new ArrayList<RoleToPermissionMap>();
        }
        return this.roleToPermissionMap;
    }

}
