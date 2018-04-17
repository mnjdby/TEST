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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserCustomFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserCustomFields"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="u_User_Territory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="u_PANNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="u_TANNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="u_Constitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="u_Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="u_OfficePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="u_Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="u_OwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FieldID_983" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserCustomFields", propOrder = {
    "uUserTerritory",
    "upanNo",
    "utanNo",
    "uConstitution",
    "uWebsite",
    "uOfficePhone",
    "uChannel",
    "uOwnerName",
    "fieldID983"
})
public class UserCustomFields
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "u_User_Territory", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uUserTerritory;
    @XmlElementRef(name = "u_PANNo", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> upanNo;
    @XmlElementRef(name = "u_TANNo", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> utanNo;
    @XmlElementRef(name = "u_Constitution", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uConstitution;
    @XmlElementRef(name = "u_Website", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uWebsite;
    @XmlElementRef(name = "u_OfficePhone", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uOfficePhone;
    @XmlElementRef(name = "u_Channel", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uChannel;
    @XmlElementRef(name = "u_OwnerName", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uOwnerName;
    @XmlElementRef(name = "FieldID_983", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldID983;

    /**
     * Gets the value of the uUserTerritory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUUserTerritory() {
        return uUserTerritory;
    }

    /**
     * Sets the value of the uUserTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUUserTerritory(JAXBElement<String> value) {
        this.uUserTerritory = value;
    }

    /**
     * Gets the value of the upanNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUPANNo() {
        return upanNo;
    }

    /**
     * Sets the value of the upanNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUPANNo(JAXBElement<String> value) {
        this.upanNo = value;
    }

    /**
     * Gets the value of the utanNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUTANNo() {
        return utanNo;
    }

    /**
     * Sets the value of the utanNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUTANNo(JAXBElement<String> value) {
        this.utanNo = value;
    }

    /**
     * Gets the value of the uConstitution property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUConstitution() {
        return uConstitution;
    }

    /**
     * Sets the value of the uConstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUConstitution(JAXBElement<String> value) {
        this.uConstitution = value;
    }

    /**
     * Gets the value of the uWebsite property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUWebsite() {
        return uWebsite;
    }

    /**
     * Sets the value of the uWebsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUWebsite(JAXBElement<String> value) {
        this.uWebsite = value;
    }

    /**
     * Gets the value of the uOfficePhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUOfficePhone() {
        return uOfficePhone;
    }

    /**
     * Sets the value of the uOfficePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUOfficePhone(JAXBElement<String> value) {
        this.uOfficePhone = value;
    }

    /**
     * Gets the value of the uChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUChannel() {
        return uChannel;
    }

    /**
     * Sets the value of the uChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUChannel(JAXBElement<String> value) {
        this.uChannel = value;
    }

    /**
     * Gets the value of the uOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUOwnerName() {
        return uOwnerName;
    }

    /**
     * Sets the value of the uOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUOwnerName(JAXBElement<String> value) {
        this.uOwnerName = value;
    }

    /**
     * Gets the value of the fieldID983 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldID983() {
        return fieldID983;
    }

    /**
     * Sets the value of the fieldID983 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldID983(JAXBElement<String> value) {
        this.fieldID983 = value;
    }

}
