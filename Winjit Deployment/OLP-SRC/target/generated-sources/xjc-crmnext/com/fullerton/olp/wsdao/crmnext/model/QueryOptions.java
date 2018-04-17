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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdvanceFilterExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BatchSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OrderByFieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VisibilityOption" type="{http://www.crmnext.com/api/}VisibilityOption" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryOptions", propOrder = {
    "advanceFilterExpression",
    "batchSize",
    "orderByFieldName",
    "visibilityOption"
})
public class QueryOptions
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "AdvanceFilterExpression", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> advanceFilterExpression;
    @XmlElement(name = "BatchSize")
    protected Integer batchSize;
    @XmlElementRef(name = "OrderByFieldName", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderByFieldName;
    @XmlElement(name = "VisibilityOption")
    @XmlSchemaType(name = "string")
    protected VisibilityOption visibilityOption;

    /**
     * Gets the value of the advanceFilterExpression property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdvanceFilterExpression() {
        return advanceFilterExpression;
    }

    /**
     * Sets the value of the advanceFilterExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdvanceFilterExpression(JAXBElement<String> value) {
        this.advanceFilterExpression = value;
    }

    /**
     * Gets the value of the batchSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Sets the value of the batchSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBatchSize(Integer value) {
        this.batchSize = value;
    }

    /**
     * Gets the value of the orderByFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderByFieldName() {
        return orderByFieldName;
    }

    /**
     * Sets the value of the orderByFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderByFieldName(JAXBElement<String> value) {
        this.orderByFieldName = value;
    }

    /**
     * Gets the value of the visibilityOption property.
     * 
     * @return
     *     possible object is
     *     {@link VisibilityOption }
     *     
     */
    public VisibilityOption getVisibilityOption() {
        return visibilityOption;
    }

    /**
     * Sets the value of the visibilityOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisibilityOption }
     *     
     */
    public void setVisibilityOption(VisibilityOption value) {
        this.visibilityOption = value;
    }

}
