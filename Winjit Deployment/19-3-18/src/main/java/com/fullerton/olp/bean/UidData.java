//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.26 at 07:52:23 PM IST 
//


package com.fullerton.olp.bean;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for UidDataType complex type.
 * 
 */
@XmlRootElement(name="UidData")
public class UidData extends BaseBean {

    protected String poi;
    protected PoaType poa;

    /**
     * Gets the value of the poi property.
     * 
     * @return
     *     possible object is
     *     {@link PoiType }
     *     
     */
    public String getPoi() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoiType }
     *     
     */
    public void setPoi(String value) {
        this.poi = value;
    }

    /**
     * Gets the value of the poa property.
     * 
     * @return
     *     possible object is
     *     {@link PoaType }
     *     
     */
    public PoaType getPoa() {
        return poa;
    }

    /**
     * Sets the value of the poa property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoaType }
     *     
     */
    public void setPoa(PoaType value) {
        this.poa = value;
    }


}
