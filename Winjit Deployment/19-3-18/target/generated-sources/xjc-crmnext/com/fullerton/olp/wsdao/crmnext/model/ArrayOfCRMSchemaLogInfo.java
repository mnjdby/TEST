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
 * <p>Java class for ArrayOfCRMSchemaLogInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCRMSchemaLogInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMSchemaLogInfo" type="{http://www.crmnext.com/api/}CRMSchemaLogInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCRMSchemaLogInfo", propOrder = {
    "crmSchemaLogInfos"
})
public class ArrayOfCRMSchemaLogInfo
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "CRMSchemaLogInfo", nillable = true)
    protected List<CRMSchemaLogInfo> crmSchemaLogInfos;

    /**
     * Gets the value of the crmSchemaLogInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crmSchemaLogInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRMSchemaLogInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRMSchemaLogInfo }
     * 
     * 
     */
    public List<CRMSchemaLogInfo> getCRMSchemaLogInfos() {
        if (crmSchemaLogInfos == null) {
            crmSchemaLogInfos = new ArrayList<CRMSchemaLogInfo>();
        }
        return this.crmSchemaLogInfos;
    }

}
