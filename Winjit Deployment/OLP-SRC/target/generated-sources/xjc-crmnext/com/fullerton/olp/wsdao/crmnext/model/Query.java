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
 *         &lt;element name="condition" type="{http://www.crmnext.com/api/}ArrayOfSearchCondition" minOccurs="0"/&gt;
 *         &lt;element name="commaSeperatedSelectfields" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="queryOptions" type="{http://www.crmnext.com/api/}QueryOptions" minOccurs="0"/&gt;
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
    "condition",
    "commaSeperatedSelectfields",
    "queryOptions"
})
@XmlRootElement(name = "Query")
public class Query
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "userContext", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<UserContext> userContext;
    @XmlSchemaType(name = "string")
    protected CRMnextObjectType objectType;
    @XmlElementRef(name = "condition", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSearchCondition> condition;
    @XmlElementRef(name = "commaSeperatedSelectfields", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commaSeperatedSelectfields;
    @XmlElementRef(name = "queryOptions", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryOptions> queryOptions;

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
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSearchCondition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSearchCondition> getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSearchCondition }{@code >}
     *     
     */
    public void setCondition(JAXBElement<ArrayOfSearchCondition> value) {
        this.condition = value;
    }

    /**
     * Gets the value of the commaSeperatedSelectfields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommaSeperatedSelectfields() {
        return commaSeperatedSelectfields;
    }

    /**
     * Sets the value of the commaSeperatedSelectfields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommaSeperatedSelectfields(JAXBElement<String> value) {
        this.commaSeperatedSelectfields = value;
    }

    /**
     * Gets the value of the queryOptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryOptions }{@code >}
     *     
     */
    public JAXBElement<QueryOptions> getQueryOptions() {
        return queryOptions;
    }

    /**
     * Sets the value of the queryOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryOptions }{@code >}
     *     
     */
    public void setQueryOptions(JAXBElement<QueryOptions> value) {
        this.queryOptions = value;
    }

}
