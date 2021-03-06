//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.19 at 07:02:40 PM IST 
//


package com.fullerton.olp.wsdao.crmnext.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSharingMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSharingMember"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemOwnerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ItemOwnerTypeID" type="{http://schemas.datacontract.org/2004/07/Acidaes.CRMnext.Model}AccessGroupType" minOccurs="0"/&gt;
 *         &lt;element name="Mask" type="{http://schemas.datacontract.org/2004/07/Acidaes.CRMnext.Model}SharingOperation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSharingMember", propOrder = {
    "itemOwnerID",
    "itemOwnerTypeID",
    "mask"
})
public class ItemSharingMember
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ItemOwnerID")
    protected Integer itemOwnerID;
    @XmlElement(name = "ItemOwnerTypeID")
    @XmlSchemaType(name = "string")
    protected AccessGroupType itemOwnerTypeID;
    @XmlElement(name = "Mask")
    @XmlSchemaType(name = "string")
    protected SharingOperation mask;

    /**
     * Gets the value of the itemOwnerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemOwnerID() {
        return itemOwnerID;
    }

    /**
     * Sets the value of the itemOwnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemOwnerID(Integer value) {
        this.itemOwnerID = value;
    }

    /**
     * Gets the value of the itemOwnerTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link AccessGroupType }
     *     
     */
    public AccessGroupType getItemOwnerTypeID() {
        return itemOwnerTypeID;
    }

    /**
     * Sets the value of the itemOwnerTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessGroupType }
     *     
     */
    public void setItemOwnerTypeID(AccessGroupType value) {
        this.itemOwnerTypeID = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link SharingOperation }
     *     
     */
    public SharingOperation getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharingOperation }
     *     
     */
    public void setMask(SharingOperation value) {
        this.mask = value;
    }

}
