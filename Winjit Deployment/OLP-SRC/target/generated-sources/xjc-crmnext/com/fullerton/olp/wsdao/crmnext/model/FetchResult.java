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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FetchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FetchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.crmnext.com/api/}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMnextObject" type="{http://www.crmnext.com/api/}CRMnextObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FetchResult", propOrder = {
    "crMnextObject"
})
public class FetchResult
    extends Result
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "CRMnextObject", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<CRMnextObject> crMnextObject;

    /**
     * Gets the value of the crMnextObject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRMnextObject }{@code >}
     *     
     */
    public JAXBElement<CRMnextObject> getCRMnextObject() {
        return crMnextObject;
    }

    /**
     * Sets the value of the crMnextObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRMnextObject }{@code >}
     *     
     */
    public void setCRMnextObject(JAXBElement<CRMnextObject> value) {
        this.crMnextObject = value;
    }

}
