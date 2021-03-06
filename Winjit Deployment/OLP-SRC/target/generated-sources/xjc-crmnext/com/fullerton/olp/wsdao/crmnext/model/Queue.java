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
 * <p>Java class for Queue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Queue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.crmnext.com/api/}CRMnextObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefaultOwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QueueKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QueueTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Queue", propOrder = {
    "defaultOwnerName",
    "queueKey",
    "queueTypeName"
})
public class Queue
    extends CRMnextObject
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "DefaultOwnerName", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultOwnerName;
    @XmlElementRef(name = "QueueKey", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> queueKey;
    @XmlElementRef(name = "QueueTypeName", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> queueTypeName;

    /**
     * Gets the value of the defaultOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultOwnerName() {
        return defaultOwnerName;
    }

    /**
     * Sets the value of the defaultOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultOwnerName(JAXBElement<String> value) {
        this.defaultOwnerName = value;
    }

    /**
     * Gets the value of the queueKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQueueKey() {
        return queueKey;
    }

    /**
     * Sets the value of the queueKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQueueKey(JAXBElement<String> value) {
        this.queueKey = value;
    }

    /**
     * Gets the value of the queueTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQueueTypeName() {
        return queueTypeName;
    }

    /**
     * Sets the value of the queueTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQueueTypeName(JAXBElement<String> value) {
        this.queueTypeName = value;
    }

}
