//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.19 at 07:02:40 PM IST 
//


package com.fullerton.olp.wsdao.crmnext.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldInputType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FieldInputType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="InpuptParameter"/&gt;
 *     &lt;enumeration value="CustomInputField"/&gt;
 *     &lt;enumeration value="Caption"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FieldInputType")
@XmlEnum
public enum FieldInputType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("InpuptParameter")
    INPUPT_PARAMETER("InpuptParameter"),
    @XmlEnumValue("CustomInputField")
    CUSTOM_INPUT_FIELD("CustomInputField"),
    @XmlEnumValue("Caption")
    CAPTION("Caption");
    private final String value;

    FieldInputType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldInputType fromValue(String v) {
        for (FieldInputType c: FieldInputType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
