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
 *         &lt;element name="GetObjectTerritoryResult" type="{http://www.crmnext.com/api/}Result" minOccurs="0"/&gt;
 *         &lt;element name="listTerritory" type="{http://www.crmnext.com/api/}ArrayOfCRMRegionInfo" minOccurs="0"/&gt;
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
    "getObjectTerritoryResult",
    "listTerritory"
})
@XmlRootElement(name = "GetObjectTerritoryResponse")
public class GetObjectTerritoryResponse
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "GetObjectTerritoryResult", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> getObjectTerritoryResult;
    @XmlElementRef(name = "listTerritory", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCRMRegionInfo> listTerritory;

    /**
     * Gets the value of the getObjectTerritoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public JAXBElement<Result> getGetObjectTerritoryResult() {
        return getObjectTerritoryResult;
    }

    /**
     * Sets the value of the getObjectTerritoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public void setGetObjectTerritoryResult(JAXBElement<Result> value) {
        this.getObjectTerritoryResult = value;
    }

    /**
     * Gets the value of the listTerritory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCRMRegionInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCRMRegionInfo> getListTerritory() {
        return listTerritory;
    }

    /**
     * Sets the value of the listTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCRMRegionInfo }{@code >}
     *     
     */
    public void setListTerritory(JAXBElement<ArrayOfCRMRegionInfo> value) {
        this.listTerritory = value;
    }

}
