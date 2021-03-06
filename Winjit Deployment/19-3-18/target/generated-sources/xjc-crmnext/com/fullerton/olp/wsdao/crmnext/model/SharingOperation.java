//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.13 at 04:35:28 PM IST 
//


package com.fullerton.olp.wsdao.crmnext.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharingOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SharingOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotDefined"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Read"/&gt;
 *     &lt;enumeration value="Edit"/&gt;
 *     &lt;enumeration value="ReadDecendent"/&gt;
 *     &lt;enumeration value="EditDecendent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SharingOperation", namespace = "http://schemas.datacontract.org/2004/07/Acidaes.CRMnext.Model")
@XmlEnum
public enum SharingOperation {

    @XmlEnumValue("NotDefined")
    NOT_DEFINED("NotDefined"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Edit")
    EDIT("Edit"),
    @XmlEnumValue("ReadDecendent")
    READ_DECENDENT("ReadDecendent"),
    @XmlEnumValue("EditDecendent")
    EDIT_DECENDENT("EditDecendent");
    private final String value;

    SharingOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SharingOperation fromValue(String v) {
        for (SharingOperation c: SharingOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
