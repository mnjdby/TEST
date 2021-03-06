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
 * <p>Java class for XmlLayoutType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="XmlLayoutType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="New"/&gt;
 *     &lt;enumeration value="Details"/&gt;
 *     &lt;enumeration value="Search"/&gt;
 *     &lt;enumeration value="History"/&gt;
 *     &lt;enumeration value="Navigation"/&gt;
 *     &lt;enumeration value="SSPNew"/&gt;
 *     &lt;enumeration value="SSPDetails"/&gt;
 *     &lt;enumeration value="PrinterFriendly"/&gt;
 *     &lt;enumeration value="QuickCreate"/&gt;
 *     &lt;enumeration value="HomePage"/&gt;
 *     &lt;enumeration value="MobileNew"/&gt;
 *     &lt;enumeration value="MobileDetails"/&gt;
 *     &lt;enumeration value="QuickDetail"/&gt;
 *     &lt;enumeration value="Invalid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "XmlLayoutType")
@XmlEnum
public enum XmlLayoutType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Details")
    DETAILS("Details"),
    @XmlEnumValue("Search")
    SEARCH("Search"),
    @XmlEnumValue("History")
    HISTORY("History"),
    @XmlEnumValue("Navigation")
    NAVIGATION("Navigation"),
    @XmlEnumValue("SSPNew")
    SSP_NEW("SSPNew"),
    @XmlEnumValue("SSPDetails")
    SSP_DETAILS("SSPDetails"),
    @XmlEnumValue("PrinterFriendly")
    PRINTER_FRIENDLY("PrinterFriendly"),
    @XmlEnumValue("QuickCreate")
    QUICK_CREATE("QuickCreate"),
    @XmlEnumValue("HomePage")
    HOME_PAGE("HomePage"),
    @XmlEnumValue("MobileNew")
    MOBILE_NEW("MobileNew"),
    @XmlEnumValue("MobileDetails")
    MOBILE_DETAILS("MobileDetails"),
    @XmlEnumValue("QuickDetail")
    QUICK_DETAIL("QuickDetail"),
    @XmlEnumValue("Invalid")
    INVALID("Invalid");
    private final String value;

    XmlLayoutType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XmlLayoutType fromValue(String v) {
        for (XmlLayoutType c: XmlLayoutType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
