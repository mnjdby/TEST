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
 * <p>Java class for AlertMemberType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertMemberType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="User"/&gt;
 *     &lt;enumeration value="Team"/&gt;
 *     &lt;enumeration value="Role"/&gt;
 *     &lt;enumeration value="Queue"/&gt;
 *     &lt;enumeration value="Participants"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AlertMemberType")
@XmlEnum
public enum AlertMemberType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Team")
    TEAM("Team"),
    @XmlEnumValue("Role")
    ROLE("Role"),
    @XmlEnumValue("Queue")
    QUEUE("Queue"),
    @XmlEnumValue("Participants")
    PARTICIPANTS("Participants");
    private final String value;

    AlertMemberType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlertMemberType fromValue(String v) {
        for (AlertMemberType c: AlertMemberType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
