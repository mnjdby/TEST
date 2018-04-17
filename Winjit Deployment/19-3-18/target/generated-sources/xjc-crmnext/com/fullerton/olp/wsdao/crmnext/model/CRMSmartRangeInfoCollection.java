//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.13 at 04:35:28 PM IST 
//


package com.fullerton.olp.wsdao.crmnext.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRMSmartRangeInfoCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMSmartRangeInfoCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMSmartRangeInfo" type="{http://schemas.datacontract.org/2004/07/Acidaes.CRMnext.Api.Model}CRMSmartRangeInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMSmartRangeInfoCollection", propOrder = {
    "crmSmartRangeInfos"
})
public class CRMSmartRangeInfoCollection
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "CRMSmartRangeInfo", nillable = true)
    protected List<CRMSmartRangeInfo> crmSmartRangeInfos;

    /**
     * Gets the value of the crmSmartRangeInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crmSmartRangeInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRMSmartRangeInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRMSmartRangeInfo }
     * 
     * 
     */
    public List<CRMSmartRangeInfo> getCRMSmartRangeInfos() {
        if (crmSmartRangeInfos == null) {
            crmSmartRangeInfos = new ArrayList<CRMSmartRangeInfo>();
        }
        return this.crmSmartRangeInfos;
    }

}
