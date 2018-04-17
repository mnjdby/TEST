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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRMLookupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMLookupInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExternalSLA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HelpTemplateID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HelpTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsEditable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsParent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LookUpId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MailMergeTemplateID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MailMergeTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ParentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TargetSLA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TemplateID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TopParentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TopParentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMLookupInfo", namespace = "http://schemas.datacontract.org/2004/07/Acidaes.CRMnext.Api.Model", propOrder = {
    "currentStatus",
    "displayOrder",
    "externalSLA",
    "fileName",
    "groupKey",
    "helpTemplateID",
    "helpTemplateName",
    "isEditable",
    "isParent",
    "itemCount",
    "lookUpId",
    "mailMergeTemplateID",
    "mailMergeTemplateName",
    "name",
    "parentID",
    "parentName",
    "tag",
    "targetSLA",
    "templateID",
    "templateName",
    "topParentID",
    "topParentName"
})
public class CRMLookupInfo
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "CurrentStatus")
    protected Boolean currentStatus;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "ExternalSLA")
    protected Integer externalSLA;
    @XmlElementRef(name = "FileName", namespace = "http://schemas.datacontract.org/2004/07/Acidaes.CRMnext.Api.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileName;
    @XmlElement(name = "GroupKey")
    protected Integer groupKey;
    @XmlElement(name = "HelpTemplateID")
    protected Integer helpTemplateID;
    @XmlElementRef(name = "HelpTemplateName", namespace = "http://schemas.datacontract.org/2004/07/Acidaes.CRMnext.Api.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> helpTemplateName;
    @XmlElement(name = "IsEditable")
    protected Boolean isEditable;
    @XmlElement(name = "IsParent")
    protected Boolean isParent;
    @XmlElement(name = "ItemCount")
    protected Integer itemCount;
    @XmlElement(name = "LookUpId")
    protected Integer lookUpId;
    @XmlElement(name = "MailMergeTemplateID")
    protected Integer mailMergeTemplateID;
    @XmlElementRef(name = "MailMergeTemplateName", namespace = "http://schemas.datacontract.org/2004/07/Acidaes.CRMnext.Api.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailMergeTemplateName;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/Acidaes.CRMnext.Api.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "ParentID")
    protected Integer parentID;
    @XmlElementRef(name = "ParentName", namespace = "http://schemas.datacontract.org/2004/07/Acidaes.CRMnext.Api.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentName;
    @XmlElementRef(name = "Tag", namespace = "http://schemas.datacontract.org/2004/07/Acidaes.CRMnext.Api.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tag;
    @XmlElement(name = "TargetSLA")
    protected Integer targetSLA;
    @XmlElement(name = "TemplateID")
    protected Integer templateID;
    @XmlElementRef(name = "TemplateName", namespace = "http://schemas.datacontract.org/2004/07/Acidaes.CRMnext.Api.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> templateName;
    @XmlElement(name = "TopParentID")
    protected Integer topParentID;
    @XmlElementRef(name = "TopParentName", namespace = "http://schemas.datacontract.org/2004/07/Acidaes.CRMnext.Api.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> topParentName;

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentStatus(Boolean value) {
        this.currentStatus = value;
    }

    /**
     * Gets the value of the displayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the externalSLA property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExternalSLA() {
        return externalSLA;
    }

    /**
     * Sets the value of the externalSLA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExternalSLA(Integer value) {
        this.externalSLA = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileName(JAXBElement<String> value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the groupKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupKey() {
        return groupKey;
    }

    /**
     * Sets the value of the groupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupKey(Integer value) {
        this.groupKey = value;
    }

    /**
     * Gets the value of the helpTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHelpTemplateID() {
        return helpTemplateID;
    }

    /**
     * Sets the value of the helpTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHelpTemplateID(Integer value) {
        this.helpTemplateID = value;
    }

    /**
     * Gets the value of the helpTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHelpTemplateName() {
        return helpTemplateName;
    }

    /**
     * Sets the value of the helpTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHelpTemplateName(JAXBElement<String> value) {
        this.helpTemplateName = value;
    }

    /**
     * Gets the value of the isEditable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEditable() {
        return isEditable;
    }

    /**
     * Sets the value of the isEditable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEditable(Boolean value) {
        this.isEditable = value;
    }

    /**
     * Gets the value of the isParent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsParent() {
        return isParent;
    }

    /**
     * Sets the value of the isParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsParent(Boolean value) {
        this.isParent = value;
    }

    /**
     * Gets the value of the itemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemCount() {
        return itemCount;
    }

    /**
     * Sets the value of the itemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemCount(Integer value) {
        this.itemCount = value;
    }

    /**
     * Gets the value of the lookUpId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLookUpId() {
        return lookUpId;
    }

    /**
     * Sets the value of the lookUpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLookUpId(Integer value) {
        this.lookUpId = value;
    }

    /**
     * Gets the value of the mailMergeTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMailMergeTemplateID() {
        return mailMergeTemplateID;
    }

    /**
     * Sets the value of the mailMergeTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMailMergeTemplateID(Integer value) {
        this.mailMergeTemplateID = value;
    }

    /**
     * Gets the value of the mailMergeTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailMergeTemplateName() {
        return mailMergeTemplateName;
    }

    /**
     * Sets the value of the mailMergeTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailMergeTemplateName(JAXBElement<String> value) {
        this.mailMergeTemplateName = value;
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
     * Gets the value of the parentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentID() {
        return parentID;
    }

    /**
     * Sets the value of the parentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentID(Integer value) {
        this.parentID = value;
    }

    /**
     * Gets the value of the parentName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentName() {
        return parentName;
    }

    /**
     * Sets the value of the parentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentName(JAXBElement<String> value) {
        this.parentName = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTag(JAXBElement<String> value) {
        this.tag = value;
    }

    /**
     * Gets the value of the targetSLA property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTargetSLA() {
        return targetSLA;
    }

    /**
     * Sets the value of the targetSLA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTargetSLA(Integer value) {
        this.targetSLA = value;
    }

    /**
     * Gets the value of the templateID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemplateID() {
        return templateID;
    }

    /**
     * Sets the value of the templateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemplateID(Integer value) {
        this.templateID = value;
    }

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTemplateName(JAXBElement<String> value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the topParentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTopParentID() {
        return topParentID;
    }

    /**
     * Sets the value of the topParentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTopParentID(Integer value) {
        this.topParentID = value;
    }

    /**
     * Gets the value of the topParentName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTopParentName() {
        return topParentName;
    }

    /**
     * Sets the value of the topParentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTopParentName(JAXBElement<String> value) {
        this.topParentName = value;
    }

}