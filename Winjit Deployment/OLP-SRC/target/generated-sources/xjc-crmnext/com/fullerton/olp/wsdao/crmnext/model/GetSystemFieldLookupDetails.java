//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.19 at 07:02:40 PM IST 
//


package com.fullerton.olp.wsdao.crmnext.model;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userContext" type="{http://www.crmnext.com/api/}UserContext" minOccurs="0"/&gt;
 *         &lt;element name="crmnextObjectType" type="{http://www.crmnext.com/api/}CRMnextObjectType" minOccurs="0"/&gt;
 *         &lt;element name="groupKeyId" type="{http://www.crmnext.com/api/}GroupKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userContext",
    "crmnextObjectType",
    "groupKeyId"
})
@XmlRootElement(name = "GetSystemFieldLookupDetails")
public class GetSystemFieldLookupDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "userContext", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<UserContext> userContext;
    @XmlSchemaType(name = "string")
    protected CRMnextObjectType crmnextObjectType;
    @XmlSchemaType(name = "string")
    protected GroupKey groupKeyId;

    /**
     * Gets the value of the userContext property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserContext }{@code >}
     *     
     */
    public JAXBElement<UserContext> getUserContext() {
        return userContext;
    }

    /**
     * Sets the value of the userContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserContext }{@code >}
     *     
     */
    public void setUserContext(JAXBElement<UserContext> value) {
        this.userContext = value;
    }

    /**
     * Gets the value of the crmnextObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link CRMnextObjectType }
     *     
     */
    public CRMnextObjectType getCrmnextObjectType() {
        return crmnextObjectType;
    }

    /**
     * Sets the value of the crmnextObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMnextObjectType }
     *     
     */
    public void setCrmnextObjectType(CRMnextObjectType value) {
        this.crmnextObjectType = value;
    }

    /**
     * Gets the value of the groupKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link GroupKey }
     *     
     */
    public GroupKey getGroupKeyId() {
        return groupKeyId;
    }

    /**
     * Sets the value of the groupKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupKey }
     *     
     */
    public void setGroupKeyId(GroupKey value) {
        this.groupKeyId = value;
    }

}
