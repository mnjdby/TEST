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
 *         &lt;element name="userContext" type="{http://www.crmnext.com/api/}UserContext" minOccurs="0"/&gt;
 *         &lt;element name="productList" type="{http://www.crmnext.com/api/}RelatedProduct" minOccurs="0"/&gt;
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
    "productList"
})
@XmlRootElement(name = "SaveRelatedProduct")
public class SaveRelatedProduct
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "userContext", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<UserContext> userContext;
    @XmlElementRef(name = "productList", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<RelatedProduct> productList;

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
     * Gets the value of the productList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelatedProduct }{@code >}
     *     
     */
    public JAXBElement<RelatedProduct> getProductList() {
        return productList;
    }

    /**
     * Sets the value of the productList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelatedProduct }{@code >}
     *     
     */
    public void setProductList(JAXBElement<RelatedProduct> value) {
        this.productList = value;
    }

}
