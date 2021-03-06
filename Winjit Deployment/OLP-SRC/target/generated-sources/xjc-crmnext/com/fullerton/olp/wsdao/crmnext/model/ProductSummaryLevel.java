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
 * <p>Java class for ProductSummaryLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductSummaryLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Reserved"/&gt;
 *     &lt;enumeration value="ProductDetail"/&gt;
 *     &lt;enumeration value="CustomerSummary"/&gt;
 *     &lt;enumeration value="GroupSummary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProductSummaryLevel")
@XmlEnum
public enum ProductSummaryLevel {

    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),
    @XmlEnumValue("ProductDetail")
    PRODUCT_DETAIL("ProductDetail"),
    @XmlEnumValue("CustomerSummary")
    CUSTOMER_SUMMARY("CustomerSummary"),
    @XmlEnumValue("GroupSummary")
    GROUP_SUMMARY("GroupSummary");
    private final String value;

    ProductSummaryLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductSummaryLevel fromValue(String v) {
        for (ProductSummaryLevel c: ProductSummaryLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
