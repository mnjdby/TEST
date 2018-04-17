//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.19 at 07:02:40 PM IST 
//


package com.fullerton.olp.wsdao.crmnext.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Solution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Solution"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.crmnext.com/api/}CRMnextObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssignedTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssignedToCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssignedToID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://www.crmnext.com/api/}SolutionCustomFields" minOccurs="0"/&gt;
 *         &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EscalatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="HasAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsEscalated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsPublished" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsStatusCodeChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastActionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PreviousAssigned" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PreviousAssignedTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PreviousAssignedToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousStatusCodeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PublishedImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShowInTop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SolutionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SolutionOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SolutionOwnerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SolutionOwnerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SolutionOwnerType" type="{http://www.crmnext.com/api/}AssignedToType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusCodeChangedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="StatusCodeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StatusID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalRelatedCases" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="_EscalatedCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="_OpenEscalatedCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Solution", propOrder = {
    "assignedTo",
    "assignedToCode",
    "assignedToID",
    "category",
    "categoryID",
    "createdOn",
    "custom",
    "details",
    "escalatedOn",
    "hasAttachments",
    "isEscalated",
    "isPrivate",
    "isPublished",
    "isStatusCodeChanged",
    "keywords",
    "lastActionID",
    "lastModifiedOn",
    "previousAssigned",
    "previousAssignedTo",
    "previousAssignedToName",
    "previousStatusCode",
    "previousStatusCodeID",
    "publishedImageURL",
    "showInTop",
    "solutionKey",
    "solutionOwner",
    "solutionOwnerCode",
    "solutionOwnerID",
    "solutionOwnerType",
    "status",
    "statusCode",
    "statusCodeChangedOn",
    "statusCodeID",
    "statusID",
    "title",
    "totalRelatedCases",
    "escalatedCount",
    "openEscalatedCount"
})
public class Solution
    extends CRMnextObject
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "AssignedTo", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assignedTo;
    @XmlElementRef(name = "AssignedToCode", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assignedToCode;
    @XmlElement(name = "AssignedToID")
    protected Integer assignedToID;
    @XmlElementRef(name = "Category", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> category;
    @XmlElement(name = "CategoryID")
    protected Integer categoryID;
    @XmlElement(name = "CreatedOn", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar createdOn;
    @XmlElementRef(name = "Custom", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<SolutionCustomFields> custom;
    @XmlElementRef(name = "Details", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> details;
    @XmlElement(name = "EscalatedOn", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar escalatedOn;
    @XmlElement(name = "HasAttachments")
    protected Boolean hasAttachments;
    @XmlElement(name = "IsEscalated")
    protected Boolean isEscalated;
    @XmlElement(name = "IsPrivate")
    protected Boolean isPrivate;
    @XmlElement(name = "IsPublished")
    protected Boolean isPublished;
    @XmlElement(name = "IsStatusCodeChanged")
    protected Boolean isStatusCodeChanged;
    @XmlElementRef(name = "Keywords", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> keywords;
    @XmlElement(name = "LastActionID")
    protected Integer lastActionID;
    @XmlElement(name = "LastModifiedOn", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastModifiedOn;
    @XmlElement(name = "PreviousAssigned")
    protected Integer previousAssigned;
    @XmlElement(name = "PreviousAssignedTo")
    protected Integer previousAssignedTo;
    @XmlElementRef(name = "PreviousAssignedToName", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousAssignedToName;
    @XmlElementRef(name = "PreviousStatusCode", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousStatusCode;
    @XmlElement(name = "PreviousStatusCodeID")
    protected Integer previousStatusCodeID;
    @XmlElementRef(name = "PublishedImageURL", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> publishedImageURL;
    @XmlElement(name = "ShowInTop")
    protected Boolean showInTop;
    @XmlElementRef(name = "SolutionKey", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> solutionKey;
    @XmlElementRef(name = "SolutionOwner", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> solutionOwner;
    @XmlElementRef(name = "SolutionOwnerCode", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> solutionOwnerCode;
    @XmlElement(name = "SolutionOwnerID")
    protected Integer solutionOwnerID;
    @XmlElement(name = "SolutionOwnerType")
    @XmlSchemaType(name = "string")
    protected AssignedToType solutionOwnerType;
    @XmlElementRef(name = "Status", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "StatusCode", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusCode;
    @XmlElement(name = "StatusCodeChangedOn", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar statusCodeChangedOn;
    @XmlElement(name = "StatusCodeID")
    protected Integer statusCodeID;
    @XmlElement(name = "StatusID")
    protected Integer statusID;
    @XmlElementRef(name = "Title", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElement(name = "TotalRelatedCases")
    protected Integer totalRelatedCases;
    @XmlElement(name = "_EscalatedCount")
    protected Integer escalatedCount;
    @XmlElement(name = "_OpenEscalatedCount")
    protected Integer openEscalatedCount;

    /**
     * Gets the value of the assignedTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssignedTo() {
        return assignedTo;
    }

    /**
     * Sets the value of the assignedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssignedTo(JAXBElement<String> value) {
        this.assignedTo = value;
    }

    /**
     * Gets the value of the assignedToCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssignedToCode() {
        return assignedToCode;
    }

    /**
     * Sets the value of the assignedToCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssignedToCode(JAXBElement<String> value) {
        this.assignedToCode = value;
    }

    /**
     * Gets the value of the assignedToID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssignedToID() {
        return assignedToID;
    }

    /**
     * Sets the value of the assignedToID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssignedToID(Integer value) {
        this.assignedToID = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategory(JAXBElement<String> value) {
        this.category = value;
    }

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
     * Gets the value of the createdOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the value of the createdOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedOn(Calendar value) {
        this.createdOn = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SolutionCustomFields }{@code >}
     *     
     */
    public JAXBElement<SolutionCustomFields> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SolutionCustomFields }{@code >}
     *     
     */
    public void setCustom(JAXBElement<SolutionCustomFields> value) {
        this.custom = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetails(JAXBElement<String> value) {
        this.details = value;
    }

    /**
     * Gets the value of the escalatedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEscalatedOn() {
        return escalatedOn;
    }

    /**
     * Sets the value of the escalatedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalatedOn(Calendar value) {
        this.escalatedOn = value;
    }

    /**
     * Gets the value of the hasAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAttachments() {
        return hasAttachments;
    }

    /**
     * Sets the value of the hasAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAttachments(Boolean value) {
        this.hasAttachments = value;
    }

    /**
     * Gets the value of the isEscalated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEscalated() {
        return isEscalated;
    }

    /**
     * Sets the value of the isEscalated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEscalated(Boolean value) {
        this.isEscalated = value;
    }

    /**
     * Gets the value of the isPrivate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * Sets the value of the isPrivate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrivate(Boolean value) {
        this.isPrivate = value;
    }

    /**
     * Gets the value of the isPublished property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPublished() {
        return isPublished;
    }

    /**
     * Sets the value of the isPublished property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPublished(Boolean value) {
        this.isPublished = value;
    }

    /**
     * Gets the value of the isStatusCodeChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStatusCodeChanged() {
        return isStatusCodeChanged;
    }

    /**
     * Sets the value of the isStatusCodeChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStatusCodeChanged(Boolean value) {
        this.isStatusCodeChanged = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeywords(JAXBElement<String> value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the lastActionID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastActionID() {
        return lastActionID;
    }

    /**
     * Sets the value of the lastActionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastActionID(Integer value) {
        this.lastActionID = value;
    }

    /**
     * Gets the value of the lastModifiedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastModifiedOn() {
        return lastModifiedOn;
    }

    /**
     * Sets the value of the lastModifiedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedOn(Calendar value) {
        this.lastModifiedOn = value;
    }

    /**
     * Gets the value of the previousAssigned property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreviousAssigned() {
        return previousAssigned;
    }

    /**
     * Sets the value of the previousAssigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreviousAssigned(Integer value) {
        this.previousAssigned = value;
    }

    /**
     * Gets the value of the previousAssignedTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreviousAssignedTo() {
        return previousAssignedTo;
    }

    /**
     * Sets the value of the previousAssignedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreviousAssignedTo(Integer value) {
        this.previousAssignedTo = value;
    }

    /**
     * Gets the value of the previousAssignedToName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousAssignedToName() {
        return previousAssignedToName;
    }

    /**
     * Sets the value of the previousAssignedToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousAssignedToName(JAXBElement<String> value) {
        this.previousAssignedToName = value;
    }

    /**
     * Gets the value of the previousStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousStatusCode() {
        return previousStatusCode;
    }

    /**
     * Sets the value of the previousStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousStatusCode(JAXBElement<String> value) {
        this.previousStatusCode = value;
    }

    /**
     * Gets the value of the previousStatusCodeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreviousStatusCodeID() {
        return previousStatusCodeID;
    }

    /**
     * Sets the value of the previousStatusCodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreviousStatusCodeID(Integer value) {
        this.previousStatusCodeID = value;
    }

    /**
     * Gets the value of the publishedImageURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPublishedImageURL() {
        return publishedImageURL;
    }

    /**
     * Sets the value of the publishedImageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPublishedImageURL(JAXBElement<String> value) {
        this.publishedImageURL = value;
    }

    /**
     * Gets the value of the showInTop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowInTop() {
        return showInTop;
    }

    /**
     * Sets the value of the showInTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowInTop(Boolean value) {
        this.showInTop = value;
    }

    /**
     * Gets the value of the solutionKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSolutionKey() {
        return solutionKey;
    }

    /**
     * Sets the value of the solutionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSolutionKey(JAXBElement<String> value) {
        this.solutionKey = value;
    }

    /**
     * Gets the value of the solutionOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSolutionOwner() {
        return solutionOwner;
    }

    /**
     * Sets the value of the solutionOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSolutionOwner(JAXBElement<String> value) {
        this.solutionOwner = value;
    }

    /**
     * Gets the value of the solutionOwnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSolutionOwnerCode() {
        return solutionOwnerCode;
    }

    /**
     * Sets the value of the solutionOwnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSolutionOwnerCode(JAXBElement<String> value) {
        this.solutionOwnerCode = value;
    }

    /**
     * Gets the value of the solutionOwnerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSolutionOwnerID() {
        return solutionOwnerID;
    }

    /**
     * Sets the value of the solutionOwnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSolutionOwnerID(Integer value) {
        this.solutionOwnerID = value;
    }

    /**
     * Gets the value of the solutionOwnerType property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedToType }
     *     
     */
    public AssignedToType getSolutionOwnerType() {
        return solutionOwnerType;
    }

    /**
     * Sets the value of the solutionOwnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedToType }
     *     
     */
    public void setSolutionOwnerType(AssignedToType value) {
        this.solutionOwnerType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusCode(JAXBElement<String> value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusCodeChangedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStatusCodeChangedOn() {
        return statusCodeChangedOn;
    }

    /**
     * Sets the value of the statusCodeChangedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCodeChangedOn(Calendar value) {
        this.statusCodeChangedOn = value;
    }

    /**
     * Gets the value of the statusCodeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusCodeID() {
        return statusCodeID;
    }

    /**
     * Sets the value of the statusCodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusCodeID(Integer value) {
        this.statusCodeID = value;
    }

    /**
     * Gets the value of the statusID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusID() {
        return statusID;
    }

    /**
     * Sets the value of the statusID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusID(Integer value) {
        this.statusID = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the totalRelatedCases property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRelatedCases() {
        return totalRelatedCases;
    }

    /**
     * Sets the value of the totalRelatedCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRelatedCases(Integer value) {
        this.totalRelatedCases = value;
    }

    /**
     * Gets the value of the escalatedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEscalatedCount() {
        return escalatedCount;
    }

    /**
     * Sets the value of the escalatedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEscalatedCount(Integer value) {
        this.escalatedCount = value;
    }

    /**
     * Gets the value of the openEscalatedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOpenEscalatedCount() {
        return openEscalatedCount;
    }

    /**
     * Sets the value of the openEscalatedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOpenEscalatedCount(Integer value) {
        this.openEscalatedCount = value;
    }

}