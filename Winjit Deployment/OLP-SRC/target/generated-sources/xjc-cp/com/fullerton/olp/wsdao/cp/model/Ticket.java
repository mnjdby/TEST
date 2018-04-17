//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.19 at 07:02:33 PM IST 
//


package com.fullerton.olp.wsdao.cp.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ticket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ticket"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTimeRequestReceived" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TicketNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ticket", propOrder = {
    "dateTimeRequestReceived",
    "ticketNumber"
})
public class Ticket
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "DateTimeRequestReceived")
    protected String dateTimeRequestReceived;
    @XmlElement(name = "TicketNumber", required = true)
    protected BigInteger ticketNumber;

    /**
     * Gets the value of the dateTimeRequestReceived property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeRequestReceived() {
        return dateTimeRequestReceived;
    }

    /**
     * Sets the value of the dateTimeRequestReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeRequestReceived(String value) {
        this.dateTimeRequestReceived = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTicketNumber(BigInteger value) {
        this.ticketNumber = value;
    }

}
