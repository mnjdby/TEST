//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.13 at 04:35:28 PM IST 
//


package com.fullerton.olp.wsdao.crmnext.model;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRMRenameObjectInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMRenameObjectInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.crmnext.com/api/}CRMnextObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoginUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OwnerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RenamingObjectCollection" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfintRenamingInfoT0cVq0F7" minOccurs="0"/&gt;
 *         &lt;element name="RoleID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMRenameObjectInfo", propOrder = {
    "loginUserID",
    "ownerID",
    "renamingObjectCollection",
    "roleID"
})
public class CRMRenameObjectInfo
    extends CRMnextObject
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "LoginUserID")
    protected Integer loginUserID;
    @XmlElement(name = "OwnerID")
    protected Integer ownerID;
    @XmlElementRef(name = "RenamingObjectCollection", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfintRenamingInfoT0CVq0F7> renamingObjectCollection;
    @XmlElement(name = "RoleID")
    protected Integer roleID;

    /**
     * Gets the value of the loginUserID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoginUserID() {
        return loginUserID;
    }

    /**
     * Sets the value of the loginUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoginUserID(Integer value) {
        this.loginUserID = value;
    }

    /**
     * Gets the value of the ownerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOwnerID() {
        return ownerID;
    }

    /**
     * Sets the value of the ownerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOwnerID(Integer value) {
        this.ownerID = value;
    }

    /**
     * Gets the value of the renamingObjectCollection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintRenamingInfoT0CVq0F7 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfintRenamingInfoT0CVq0F7> getRenamingObjectCollection() {
        return renamingObjectCollection;
    }

    /**
     * Sets the value of the renamingObjectCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintRenamingInfoT0CVq0F7 }{@code >}
     *     
     */
    public void setRenamingObjectCollection(JAXBElement<ArrayOfKeyValueOfintRenamingInfoT0CVq0F7> value) {
        this.renamingObjectCollection = value;
    }

    /**
     * Gets the value of the roleID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoleID() {
        return roleID;
    }

    /**
     * Sets the value of the roleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoleID(Integer value) {
        this.roleID = value;
    }

}
