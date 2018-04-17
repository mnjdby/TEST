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
 * <p>Java class for ItemCreationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemCreationMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Range"/&gt;
 *     &lt;enumeration value="Quantity"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemCreationMode", namespace = "http://schemas.datacontract.org/2004/07/Acidaes.CRMnext.Api.Model")
@XmlEnum
public enum ItemCreationMode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Range")
    RANGE("Range"),
    @XmlEnumValue("Quantity")
    QUANTITY("Quantity");
    private final String value;

    ItemCreationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemCreationMode fromValue(String v) {
        for (ItemCreationMode c: ItemCreationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}