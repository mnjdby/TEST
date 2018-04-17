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
 * <p>Java class for ImpUniqueKeyOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImpUniqueKeyOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="NewAndUpdate"/&gt;
 *     &lt;enumeration value="NewAndSkip"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImpUniqueKeyOption", namespace = "http://schemas.datacontract.org/2004/07/Acidaes.CRMnext.Model")
@XmlEnum
public enum ImpUniqueKeyOption {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("NewAndUpdate")
    NEW_AND_UPDATE("NewAndUpdate"),
    @XmlEnumValue("NewAndSkip")
    NEW_AND_SKIP("NewAndSkip");
    private final String value;

    ImpUniqueKeyOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImpUniqueKeyOption fromValue(String v) {
        for (ImpUniqueKeyOption c: ImpUniqueKeyOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}