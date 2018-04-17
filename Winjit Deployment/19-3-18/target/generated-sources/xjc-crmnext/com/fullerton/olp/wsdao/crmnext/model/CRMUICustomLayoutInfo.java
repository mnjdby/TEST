//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.13 at 04:35:28 PM IST 
//


package com.fullerton.olp.wsdao.crmnext.model;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRMUICustomLayoutInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMUICustomLayoutInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.crmnext.com/api/}CRMnextObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsQuickCreateOnPopup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoutType" type="{http://www.crmnext.com/api/}XmlLayoutType" minOccurs="0"/&gt;
 *         &lt;element name="LayoutXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MapToLayoutID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProcessId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProcessInfo" type="{http://www.crmnext.com/api/}CRMProcess" minOccurs="0"/&gt;
 *         &lt;element name="ProcessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductInfoList" type="{http://www.crmnext.com/api/}ArrayOfProduct" minOccurs="0"/&gt;
 *         &lt;element name="RoleID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StatusCodeInfoList" type="{http://www.crmnext.com/api/}ArrayOfCRMnextStatusCodeInfo" minOccurs="0"/&gt;
 *         &lt;element name="ToolTipMode" type="{http://www.crmnext.com/api/}ToolTipMode" minOccurs="0"/&gt;
 *         &lt;element name="UniqueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMUICustomLayoutInfo", propOrder = {
    "categoryID",
    "isQuickCreateOnPopup",
    "layoutType",
    "layoutXML",
    "mapToLayoutID",
    "name",
    "processId",
    "processInfo",
    "processName",
    "productInfoList",
    "roleID",
    "statusCodeInfoList",
    "toolTipMode",
    "uniqueID"
})
public class CRMUICustomLayoutInfo
    extends CRMnextObject
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "CategoryID")
    protected Integer categoryID;
    @XmlElement(name = "IsQuickCreateOnPopup")
    protected Boolean isQuickCreateOnPopup;
    @XmlElement(name = "LayoutType")
    @XmlSchemaType(name = "string")
    protected XmlLayoutType layoutType;
    @XmlElementRef(name = "LayoutXML", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> layoutXML;
    @XmlElement(name = "MapToLayoutID")
    protected Integer mapToLayoutID;
    @XmlElementRef(name = "Name", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "ProcessId")
    protected Integer processId;
    @XmlElementRef(name = "ProcessInfo", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<CRMProcess> processInfo;
    @XmlElementRef(name = "ProcessName", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> processName;
    @XmlElementRef(name = "ProductInfoList", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProduct> productInfoList;
    @XmlElement(name = "RoleID")
    protected Integer roleID;
    @XmlElementRef(name = "StatusCodeInfoList", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCRMnextStatusCodeInfo> statusCodeInfoList;
    @XmlElement(name = "ToolTipMode")
    @XmlSchemaType(name = "string")
    protected ToolTipMode toolTipMode;
    @XmlElementRef(name = "UniqueID", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uniqueID;

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryID(Integer value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the isQuickCreateOnPopup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQuickCreateOnPopup() {
        return isQuickCreateOnPopup;
    }

    /**
     * Sets the value of the isQuickCreateOnPopup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQuickCreateOnPopup(Boolean value) {
        this.isQuickCreateOnPopup = value;
    }

    /**
     * Gets the value of the layoutType property.
     * 
     * @return
     *     possible object is
     *     {@link XmlLayoutType }
     *     
     */
    public XmlLayoutType getLayoutType() {
        return layoutType;
    }

    /**
     * Sets the value of the layoutType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlLayoutType }
     *     
     */
    public void setLayoutType(XmlLayoutType value) {
        this.layoutType = value;
    }

    /**
     * Gets the value of the layoutXML property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLayoutXML() {
        return layoutXML;
    }

    /**
     * Sets the value of the layoutXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLayoutXML(JAXBElement<String> value) {
        this.layoutXML = value;
    }

    /**
     * Gets the value of the mapToLayoutID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMapToLayoutID() {
        return mapToLayoutID;
    }

    /**
     * Sets the value of the mapToLayoutID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMapToLayoutID(Integer value) {
        this.mapToLayoutID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the processId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcessId() {
        return processId;
    }

    /**
     * Sets the value of the processId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcessId(Integer value) {
        this.processId = value;
    }

    /**
     * Gets the value of the processInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRMProcess }{@code >}
     *     
     */
    public JAXBElement<CRMProcess> getProcessInfo() {
        return processInfo;
    }

    /**
     * Sets the value of the processInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRMProcess }{@code >}
     *     
     */
    public void setProcessInfo(JAXBElement<CRMProcess> value) {
        this.processInfo = value;
    }

    /**
     * Gets the value of the processName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcessName() {
        return processName;
    }

    /**
     * Sets the value of the processName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcessName(JAXBElement<String> value) {
        this.processName = value;
    }

    /**
     * Gets the value of the productInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProduct> getProductInfoList() {
        return productInfoList;
    }

    /**
     * Sets the value of the productInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}
     *     
     */
    public void setProductInfoList(JAXBElement<ArrayOfProduct> value) {
        this.productInfoList = value;
    }

    /**
     * Gets the value of the roleID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoleID() {
        return roleID;
    }

    /**
     * Sets the value of the roleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoleID(Integer value) {
        this.roleID = value;
    }

    /**
     * Gets the value of the statusCodeInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCRMnextStatusCodeInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCRMnextStatusCodeInfo> getStatusCodeInfoList() {
        return statusCodeInfoList;
    }

    /**
     * Sets the value of the statusCodeInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCRMnextStatusCodeInfo }{@code >}
     *     
     */
    public void setStatusCodeInfoList(JAXBElement<ArrayOfCRMnextStatusCodeInfo> value) {
        this.statusCodeInfoList = value;
    }

    /**
     * Gets the value of the toolTipMode property.
     * 
     * @return
     *     possible object is
     *     {@link ToolTipMode }
     *     
     */
    public ToolTipMode getToolTipMode() {
        return toolTipMode;
    }

    /**
     * Sets the value of the toolTipMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolTipMode }
     *     
     */
    public void setToolTipMode(ToolTipMode value) {
        this.toolTipMode = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUniqueID(JAXBElement<String> value) {
        this.uniqueID = value;
    }

}
