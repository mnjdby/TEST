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
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="GetCompanyDefaultLayoutsResult" type="{http://www.crmnext.com/api/}Result" minOccurs="0"/&gt;
 *         &lt;element name="layouts" type="{http://www.crmnext.com/api/}ArrayOfCRMUICustomLayoutInfo" minOccurs="0"/&gt;
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
    "getCompanyDefaultLayoutsResult",
    "layouts"
})
@XmlRootElement(name = "GetCompanyDefaultLayoutsResponse")
public class GetCompanyDefaultLayoutsResponse
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "GetCompanyDefaultLayoutsResult", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> getCompanyDefaultLayoutsResult;
    @XmlElementRef(name = "layouts", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCRMUICustomLayoutInfo> layouts;

    /**
     * Gets the value of the getCompanyDefaultLayoutsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public JAXBElement<Result> getGetCompanyDefaultLayoutsResult() {
        return getCompanyDefaultLayoutsResult;
    }

    /**
     * Sets the value of the getCompanyDefaultLayoutsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public void setGetCompanyDefaultLayoutsResult(JAXBElement<Result> value) {
        this.getCompanyDefaultLayoutsResult = value;
    }

    /**
     * Gets the value of the layouts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCRMUICustomLayoutInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCRMUICustomLayoutInfo> getLayouts() {
        return layouts;
    }

    /**
     * Sets the value of the layouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCRMUICustomLayoutInfo }{@code >}
     *     
     */
    public void setLayouts(JAXBElement<ArrayOfCRMUICustomLayoutInfo> value) {
        this.layouts = value;
    }

}