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
 * <p>Java class for LeadStage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LeadStage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Qualified"/&gt;
 *     &lt;enumeration value="Disqualified"/&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *     &lt;enumeration value="ReAssign"/&gt;
 *     &lt;enumeration value="Closed"/&gt;
 *     &lt;enumeration value="New"/&gt;
 *     &lt;enumeration value="Won"/&gt;
 *     &lt;enumeration value="Lost"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LeadStage")
@XmlEnum
public enum LeadStage {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Qualified")
    QUALIFIED("Qualified"),
    @XmlEnumValue("Disqualified")
    DISQUALIFIED("Disqualified"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("ReAssign")
    RE_ASSIGN("ReAssign"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Won")
    WON("Won"),
    @XmlEnumValue("Lost")
    LOST("Lost");
    private final String value;

    LeadStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LeadStage fromValue(String v) {
        for (LeadStage c: LeadStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
