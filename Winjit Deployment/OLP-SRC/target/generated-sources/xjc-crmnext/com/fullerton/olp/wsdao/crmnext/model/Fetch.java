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
 *         &lt;element name="objectType" type="{http://www.crmnext.com/api/}CRMnextObjectType" minOccurs="0"/&gt;
 *         &lt;element name="objectids" type="{http://www.crmnext.com/api/}ArrayOfCRMnextObjectKey" minOccurs="0"/&gt;
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
    "objectType",
    "objectids"
})
@XmlRootElement(name = "Fetch")
public class Fetch
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "userContext", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<UserContext> userContext;
    @XmlSchemaType(name = "string")
    protected CRMnextObjectType objectType;
    @XmlElementRef(name = "objectids", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCRMnextObjectKey> objectids;

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
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link CRMnextObjectType }
     *     
     */
    public CRMnextObjectType getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMnextObjectType }
     *     
     */
    public void setObjectType(CRMnextObjectType value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the objectids property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCRMnextObjectKey }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCRMnextObjectKey> getObjectids() {
        return objectids;
    }

    /**
     * Sets the value of the objectids property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCRMnextObjectKey }{@code >}
     *     
     */
    public void setObjectids(JAXBElement<ArrayOfCRMnextObjectKey> value) {
        this.objectids = value;
    }

}
