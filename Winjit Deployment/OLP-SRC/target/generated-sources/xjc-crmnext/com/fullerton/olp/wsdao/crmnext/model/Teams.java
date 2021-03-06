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
 * <p>Java class for Teams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Teams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Branches" type="{http://www.crmnext.com/api/}ArrayOfTeamBranches" minOccurs="0"/&gt;
 *         &lt;element name="Products" type="{http://www.crmnext.com/api/}ArrayOfTeamProducts" minOccurs="0"/&gt;
 *         &lt;element name="ReportToFieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportToFieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TeamKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TeamMode" type="{http://www.crmnext.com/api/}Mode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Teams", propOrder = {
    "branches",
    "products",
    "reportToFieldName",
    "reportToFieldValue",
    "teamKey",
    "teamMode"
})
public class Teams
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "Branches", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTeamBranches> branches;
    @XmlElementRef(name = "Products", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTeamProducts> products;
    @XmlElementRef(name = "ReportToFieldName", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportToFieldName;
    @XmlElementRef(name = "ReportToFieldValue", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportToFieldValue;
    @XmlElementRef(name = "TeamKey", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> teamKey;
    @XmlElement(name = "TeamMode")
    @XmlSchemaType(name = "string")
    protected Mode teamMode;

    /**
     * Gets the value of the branches property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTeamBranches }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTeamBranches> getBranches() {
        return branches;
    }

    /**
     * Sets the value of the branches property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTeamBranches }{@code >}
     *     
     */
    public void setBranches(JAXBElement<ArrayOfTeamBranches> value) {
        this.branches = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTeamProducts }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTeamProducts> getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTeamProducts }{@code >}
     *     
     */
    public void setProducts(JAXBElement<ArrayOfTeamProducts> value) {
        this.products = value;
    }

    /**
     * Gets the value of the reportToFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportToFieldName() {
        return reportToFieldName;
    }

    /**
     * Sets the value of the reportToFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportToFieldName(JAXBElement<String> value) {
        this.reportToFieldName = value;
    }

    /**
     * Gets the value of the reportToFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportToFieldValue() {
        return reportToFieldValue;
    }

    /**
     * Sets the value of the reportToFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportToFieldValue(JAXBElement<String> value) {
        this.reportToFieldValue = value;
    }

    /**
     * Gets the value of the teamKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTeamKey() {
        return teamKey;
    }

    /**
     * Sets the value of the teamKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTeamKey(JAXBElement<String> value) {
        this.teamKey = value;
    }

    /**
     * Gets the value of the teamMode property.
     * 
     * @return
     *     possible object is
     *     {@link Mode }
     *     
     */
    public Mode getTeamMode() {
        return teamMode;
    }

    /**
     * Sets the value of the teamMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mode }
     *     
     */
    public void setTeamMode(Mode value) {
        this.teamMode = value;
    }

}
