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
 * <p>Java class for FeedBack complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedBack"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.crmnext.com/api/}CRMnextObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContentRatingID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://www.crmnext.com/api/}FeedBackCustomFields" minOccurs="0"/&gt;
 *         &lt;element name="FeedBackKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GivenBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GivenByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImpactOnOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImpactOnTrainee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ModuleID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ModuleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RatingID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RelatedToID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RelatedToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelatedToType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RelevanceRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelevanceRatingID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Suggestions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TopicRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TopicRatingID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TrainingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TrainingId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TrainingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedBack", propOrder = {
    "contentRating",
    "contentRatingID",
    "createdOn",
    "custom",
    "feedBackKey",
    "givenBy",
    "givenByName",
    "impactOnOrg",
    "impactOnTrainee",
    "lastModifiedOn",
    "moduleID",
    "moduleName",
    "rating",
    "ratingID",
    "relatedToID",
    "relatedToName",
    "relatedToType",
    "relevanceRating",
    "relevanceRatingID",
    "subject",
    "suggestions",
    "topicRating",
    "topicRatingID",
    "trainingDate",
    "trainingId",
    "trainingName"
})
public class FeedBack
    extends CRMnextObject
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "ContentRating", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contentRating;
    @XmlElement(name = "ContentRatingID")
    protected Integer contentRatingID;
    @XmlElement(name = "CreatedOn", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar createdOn;
    @XmlElementRef(name = "Custom", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<FeedBackCustomFields> custom;
    @XmlElementRef(name = "FeedBackKey", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> feedBackKey;
    @XmlElement(name = "GivenBy")
    protected Integer givenBy;
    @XmlElementRef(name = "GivenByName", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> givenByName;
    @XmlElementRef(name = "ImpactOnOrg", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> impactOnOrg;
    @XmlElementRef(name = "ImpactOnTrainee", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> impactOnTrainee;
    @XmlElement(name = "LastModifiedOn", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastModifiedOn;
    @XmlElement(name = "ModuleID")
    protected Integer moduleID;
    @XmlElementRef(name = "ModuleName", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> moduleName;
    @XmlElementRef(name = "Rating", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rating;
    @XmlElement(name = "RatingID")
    protected Integer ratingID;
    @XmlElement(name = "RelatedToID")
    protected Integer relatedToID;
    @XmlElementRef(name = "RelatedToName", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relatedToName;
    @XmlElement(name = "RelatedToType")
    protected Integer relatedToType;
    @XmlElementRef(name = "RelevanceRating", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relevanceRating;
    @XmlElement(name = "RelevanceRatingID")
    protected Integer relevanceRatingID;
    @XmlElementRef(name = "Subject", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subject;
    @XmlElementRef(name = "Suggestions", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suggestions;
    @XmlElementRef(name = "TopicRating", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> topicRating;
    @XmlElement(name = "TopicRatingID")
    protected Integer topicRatingID;
    @XmlElement(name = "TrainingDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar trainingDate;
    @XmlElement(name = "TrainingId")
    protected Integer trainingId;
    @XmlElementRef(name = "TrainingName", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trainingName;

    /**
     * Gets the value of the contentRating property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContentRating() {
        return contentRating;
    }

    /**
     * Sets the value of the contentRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContentRating(JAXBElement<String> value) {
        this.contentRating = value;
    }

    /**
     * Gets the value of the contentRatingID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContentRatingID() {
        return contentRatingID;
    }

    /**
     * Sets the value of the contentRatingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContentRatingID(Integer value) {
        this.contentRatingID = value;
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
     *     {@link JAXBElement }{@code <}{@link FeedBackCustomFields }{@code >}
     *     
     */
    public JAXBElement<FeedBackCustomFields> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FeedBackCustomFields }{@code >}
     *     
     */
    public void setCustom(JAXBElement<FeedBackCustomFields> value) {
        this.custom = value;
    }

    /**
     * Gets the value of the feedBackKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFeedBackKey() {
        return feedBackKey;
    }

    /**
     * Sets the value of the feedBackKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFeedBackKey(JAXBElement<String> value) {
        this.feedBackKey = value;
    }

    /**
     * Gets the value of the givenBy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGivenBy() {
        return givenBy;
    }

    /**
     * Sets the value of the givenBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGivenBy(Integer value) {
        this.givenBy = value;
    }

    /**
     * Gets the value of the givenByName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGivenByName() {
        return givenByName;
    }

    /**
     * Sets the value of the givenByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGivenByName(JAXBElement<String> value) {
        this.givenByName = value;
    }

    /**
     * Gets the value of the impactOnOrg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImpactOnOrg() {
        return impactOnOrg;
    }

    /**
     * Sets the value of the impactOnOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImpactOnOrg(JAXBElement<String> value) {
        this.impactOnOrg = value;
    }

    /**
     * Gets the value of the impactOnTrainee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImpactOnTrainee() {
        return impactOnTrainee;
    }

    /**
     * Sets the value of the impactOnTrainee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImpactOnTrainee(JAXBElement<String> value) {
        this.impactOnTrainee = value;
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
     * Gets the value of the moduleID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getModuleID() {
        return moduleID;
    }

    /**
     * Sets the value of the moduleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModuleID(Integer value) {
        this.moduleID = value;
    }

    /**
     * Gets the value of the moduleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModuleName() {
        return moduleName;
    }

    /**
     * Sets the value of the moduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModuleName(JAXBElement<String> value) {
        this.moduleName = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRating(JAXBElement<String> value) {
        this.rating = value;
    }

    /**
     * Gets the value of the ratingID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatingID() {
        return ratingID;
    }

    /**
     * Sets the value of the ratingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatingID(Integer value) {
        this.ratingID = value;
    }

    /**
     * Gets the value of the relatedToID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelatedToID() {
        return relatedToID;
    }

    /**
     * Sets the value of the relatedToID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelatedToID(Integer value) {
        this.relatedToID = value;
    }

    /**
     * Gets the value of the relatedToName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelatedToName() {
        return relatedToName;
    }

    /**
     * Sets the value of the relatedToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelatedToName(JAXBElement<String> value) {
        this.relatedToName = value;
    }

    /**
     * Gets the value of the relatedToType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelatedToType() {
        return relatedToType;
    }

    /**
     * Sets the value of the relatedToType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelatedToType(Integer value) {
        this.relatedToType = value;
    }

    /**
     * Gets the value of the relevanceRating property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelevanceRating() {
        return relevanceRating;
    }

    /**
     * Sets the value of the relevanceRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelevanceRating(JAXBElement<String> value) {
        this.relevanceRating = value;
    }

    /**
     * Gets the value of the relevanceRatingID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelevanceRatingID() {
        return relevanceRatingID;
    }

    /**
     * Sets the value of the relevanceRatingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelevanceRatingID(Integer value) {
        this.relevanceRatingID = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubject(JAXBElement<String> value) {
        this.subject = value;
    }

    /**
     * Gets the value of the suggestions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuggestions() {
        return suggestions;
    }

    /**
     * Sets the value of the suggestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuggestions(JAXBElement<String> value) {
        this.suggestions = value;
    }

    /**
     * Gets the value of the topicRating property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTopicRating() {
        return topicRating;
    }

    /**
     * Sets the value of the topicRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTopicRating(JAXBElement<String> value) {
        this.topicRating = value;
    }

    /**
     * Gets the value of the topicRatingID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTopicRatingID() {
        return topicRatingID;
    }

    /**
     * Sets the value of the topicRatingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTopicRatingID(Integer value) {
        this.topicRatingID = value;
    }

    /**
     * Gets the value of the trainingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTrainingDate() {
        return trainingDate;
    }

    /**
     * Sets the value of the trainingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainingDate(Calendar value) {
        this.trainingDate = value;
    }

    /**
     * Gets the value of the trainingId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrainingId() {
        return trainingId;
    }

    /**
     * Sets the value of the trainingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrainingId(Integer value) {
        this.trainingId = value;
    }

    /**
     * Gets the value of the trainingName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrainingName() {
        return trainingName;
    }

    /**
     * Sets the value of the trainingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrainingName(JAXBElement<String> value) {
        this.trainingName = value;
    }

}
