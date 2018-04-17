//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.13 at 04:35:28 PM IST 
//


package com.fullerton.olp.wsdao.crmnext.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for UserContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserContext"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.crmnext.com/api/}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientTimeOffSet" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ExpiresOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsUTC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LongDateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LongDateTimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserContext", propOrder = {
    "clientTimeOffSet",
    "expiresOn",
    "isUTC",
    "longDateFormat",
    "longDateTimeFormat",
    "token"
})
public class UserContext
    extends Result
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ClientTimeOffSet")
    protected Double clientTimeOffSet;
    @XmlElement(name = "ExpiresOn", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar expiresOn;
    @XmlElement(name = "IsUTC")
    protected Boolean isUTC;
    @XmlElementRef(name = "LongDateFormat", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> longDateFormat;
    @XmlElementRef(name = "LongDateTimeFormat", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> longDateTimeFormat;
    @XmlElementRef(name = "Token", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> token;

    /**
     * Gets the value of the clientTimeOffSet property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClientTimeOffSet() {
        return clientTimeOffSet;
    }

    /**
     * Sets the value of the clientTimeOffSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClientTimeOffSet(Double value) {
        this.clientTimeOffSet = value;
    }

    /**
     * Gets the value of the expiresOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getExpiresOn() {
        return expiresOn;
    }

    /**
     * Sets the value of the expiresOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiresOn(Calendar value) {
        this.expiresOn = value;
    }

    /**
     * Gets the value of the isUTC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUTC() {
        return isUTC;
    }

    /**
     * Sets the value of the isUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUTC(Boolean value) {
        this.isUTC = value;
    }

    /**
     * Gets the value of the longDateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongDateFormat() {
        return longDateFormat;
    }

    /**
     * Sets the value of the longDateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongDateFormat(JAXBElement<String> value) {
        this.longDateFormat = value;
    }

    /**
     * Gets the value of the longDateTimeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongDateTimeFormat() {
        return longDateTimeFormat;
    }

    /**
     * Sets the value of the longDateTimeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongDateTimeFormat(JAXBElement<String> value) {
        this.longDateTimeFormat = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToken(JAXBElement<String> value) {
        this.token = value;
    }

}
