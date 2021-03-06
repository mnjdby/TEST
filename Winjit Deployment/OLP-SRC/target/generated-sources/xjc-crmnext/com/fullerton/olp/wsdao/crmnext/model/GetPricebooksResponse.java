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
 *         &lt;element name="GetPricebooksResult" type="{http://www.crmnext.com/api/}Result" minOccurs="0"/&gt;
 *         &lt;element name="pricebooks" type="{http://www.crmnext.com/api/}ArrayOfCRMPriceBookInfo" minOccurs="0"/&gt;
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
    "getPricebooksResult",
    "pricebooks"
})
@XmlRootElement(name = "GetPricebooksResponse")
public class GetPricebooksResponse
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "GetPricebooksResult", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> getPricebooksResult;
    @XmlElementRef(name = "pricebooks", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCRMPriceBookInfo> pricebooks;

    /**
     * Gets the value of the getPricebooksResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public JAXBElement<Result> getGetPricebooksResult() {
        return getPricebooksResult;
    }

    /**
     * Sets the value of the getPricebooksResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public void setGetPricebooksResult(JAXBElement<Result> value) {
        this.getPricebooksResult = value;
    }

    /**
     * Gets the value of the pricebooks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCRMPriceBookInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCRMPriceBookInfo> getPricebooks() {
        return pricebooks;
    }

    /**
     * Sets the value of the pricebooks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCRMPriceBookInfo }{@code >}
     *     
     */
    public void setPricebooks(JAXBElement<ArrayOfCRMPriceBookInfo> value) {
        this.pricebooks = value;
    }

}
