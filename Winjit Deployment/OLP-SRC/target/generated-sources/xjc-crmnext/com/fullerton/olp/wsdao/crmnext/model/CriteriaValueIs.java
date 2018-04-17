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
 * <p>Java class for CriteriaValueIs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CriteriaValueIs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ObjectValue"/&gt;
 *     &lt;enumeration value="CRMnextField"/&gt;
 *     &lt;enumeration value="SysDateTime"/&gt;
 *     &lt;enumeration value="ObjectField"/&gt;
 *     &lt;enumeration value="ValidationField"/&gt;
 *     &lt;enumeration value="ProfileField"/&gt;
 *     &lt;enumeration value="QueryString"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CriteriaValueIs")
@XmlEnum
public enum CriteriaValueIs {

    @XmlEnumValue("ObjectValue")
    OBJECT_VALUE("ObjectValue"),
    @XmlEnumValue("CRMnextField")
    CR_MNEXT_FIELD("CRMnextField"),
    @XmlEnumValue("SysDateTime")
    SYS_DATE_TIME("SysDateTime"),
    @XmlEnumValue("ObjectField")
    OBJECT_FIELD("ObjectField"),
    @XmlEnumValue("ValidationField")
    VALIDATION_FIELD("ValidationField"),
    @XmlEnumValue("ProfileField")
    PROFILE_FIELD("ProfileField"),
    @XmlEnumValue("QueryString")
    QUERY_STRING("QueryString");
    private final String value;

    CriteriaValueIs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CriteriaValueIs fromValue(String v) {
        for (CriteriaValueIs c: CriteriaValueIs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
