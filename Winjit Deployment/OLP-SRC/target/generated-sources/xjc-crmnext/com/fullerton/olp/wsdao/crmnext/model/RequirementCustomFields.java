//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.19 at 07:02:40 PM IST 
//


package com.fullerton.olp.wsdao.crmnext.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequirementCustomFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequirementCustomFields"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="r_LAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="r_DisbursedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="r_BenificiaryName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="r_BenificiaryName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="r_ChequeNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="r_ChequeDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="r_BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="r_Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="r_BranchCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="r_IFSC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="r_MICR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="r_DeductionIHO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="r_DeductionInsurance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="r_DeductionClub" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="r_DeductionDocs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="a_DisbursementDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="a_DisbursementMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FieldID_671" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="l_IFSC_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequirementCustomFields", propOrder = {
    "rlan",
    "rDisbursedAmount",
    "rBenificiaryName1",
    "rBenificiaryName2",
    "rChequeNo",
    "rChequeDT",
    "rBankName",
    "rLocation",
    "rBranchCode",
    "rifsc",
    "rmicr",
    "rDeductionIHO",
    "rDeductionInsurance",
    "rDeductionClub",
    "rDeductionDocs",
    "aDisbursementDt",
    "aDisbursementMode",
    "fieldID671",
    "lifsc1"
})
public class RequirementCustomFields
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "r_LAN", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rlan;
    @XmlElementRef(name = "r_DisbursedAmount", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rDisbursedAmount;
    @XmlElementRef(name = "r_BenificiaryName1", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rBenificiaryName1;
    @XmlElementRef(name = "r_BenificiaryName2", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rBenificiaryName2;
    @XmlElementRef(name = "r_ChequeNo", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rChequeNo;
    @XmlElementRef(name = "r_ChequeDT", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rChequeDT;
    @XmlElementRef(name = "r_BankName", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rBankName;
    @XmlElementRef(name = "r_Location", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rLocation;
    @XmlElementRef(name = "r_BranchCode", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rBranchCode;
    @XmlElementRef(name = "r_IFSC", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rifsc;
    @XmlElementRef(name = "r_MICR", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rmicr;
    @XmlElementRef(name = "r_DeductionIHO", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rDeductionIHO;
    @XmlElementRef(name = "r_DeductionInsurance", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rDeductionInsurance;
    @XmlElementRef(name = "r_DeductionClub", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rDeductionClub;
    @XmlElementRef(name = "r_DeductionDocs", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rDeductionDocs;
    @XmlElementRef(name = "a_DisbursementDt", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aDisbursementDt;
    @XmlElementRef(name = "a_DisbursementMode", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aDisbursementMode;
    @XmlElementRef(name = "FieldID_671", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldID671;
    @XmlElementRef(name = "l_IFSC_1", namespace = "http://www.crmnext.com/api/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lifsc1;

    /**
     * Gets the value of the rlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRLAN() {
        return rlan;
    }

    /**
     * Sets the value of the rlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRLAN(JAXBElement<String> value) {
        this.rlan = value;
    }

    /**
     * Gets the value of the rDisbursedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRDisbursedAmount() {
        return rDisbursedAmount;
    }

    /**
     * Sets the value of the rDisbursedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRDisbursedAmount(JAXBElement<BigDecimal> value) {
        this.rDisbursedAmount = value;
    }

    /**
     * Gets the value of the rBenificiaryName1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRBenificiaryName1() {
        return rBenificiaryName1;
    }

    /**
     * Sets the value of the rBenificiaryName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRBenificiaryName1(JAXBElement<String> value) {
        this.rBenificiaryName1 = value;
    }

    /**
     * Gets the value of the rBenificiaryName2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRBenificiaryName2() {
        return rBenificiaryName2;
    }

    /**
     * Sets the value of the rBenificiaryName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRBenificiaryName2(JAXBElement<String> value) {
        this.rBenificiaryName2 = value;
    }

    /**
     * Gets the value of the rChequeNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRChequeNo() {
        return rChequeNo;
    }

    /**
     * Sets the value of the rChequeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRChequeNo(JAXBElement<Integer> value) {
        this.rChequeNo = value;
    }

    /**
     * Gets the value of the rChequeDT property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRChequeDT() {
        return rChequeDT;
    }

    /**
     * Sets the value of the rChequeDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRChequeDT(JAXBElement<String> value) {
        this.rChequeDT = value;
    }

    /**
     * Gets the value of the rBankName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRBankName() {
        return rBankName;
    }

    /**
     * Sets the value of the rBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRBankName(JAXBElement<String> value) {
        this.rBankName = value;
    }

    /**
     * Gets the value of the rLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRLocation() {
        return rLocation;
    }

    /**
     * Sets the value of the rLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRLocation(JAXBElement<String> value) {
        this.rLocation = value;
    }

    /**
     * Gets the value of the rBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRBranchCode() {
        return rBranchCode;
    }

    /**
     * Sets the value of the rBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRBranchCode(JAXBElement<Integer> value) {
        this.rBranchCode = value;
    }

    /**
     * Gets the value of the rifsc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRIFSC() {
        return rifsc;
    }

    /**
     * Sets the value of the rifsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRIFSC(JAXBElement<Integer> value) {
        this.rifsc = value;
    }

    /**
     * Gets the value of the rmicr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRMICR() {
        return rmicr;
    }

    /**
     * Sets the value of the rmicr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRMICR(JAXBElement<Integer> value) {
        this.rmicr = value;
    }

    /**
     * Gets the value of the rDeductionIHO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRDeductionIHO() {
        return rDeductionIHO;
    }

    /**
     * Sets the value of the rDeductionIHO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRDeductionIHO(JAXBElement<BigDecimal> value) {
        this.rDeductionIHO = value;
    }

    /**
     * Gets the value of the rDeductionInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRDeductionInsurance() {
        return rDeductionInsurance;
    }

    /**
     * Sets the value of the rDeductionInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRDeductionInsurance(JAXBElement<BigDecimal> value) {
        this.rDeductionInsurance = value;
    }

    /**
     * Gets the value of the rDeductionClub property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRDeductionClub() {
        return rDeductionClub;
    }

    /**
     * Sets the value of the rDeductionClub property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRDeductionClub(JAXBElement<BigDecimal> value) {
        this.rDeductionClub = value;
    }

    /**
     * Gets the value of the rDeductionDocs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRDeductionDocs() {
        return rDeductionDocs;
    }

    /**
     * Sets the value of the rDeductionDocs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRDeductionDocs(JAXBElement<BigDecimal> value) {
        this.rDeductionDocs = value;
    }

    /**
     * Gets the value of the aDisbursementDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getADisbursementDt() {
        return aDisbursementDt;
    }

    /**
     * Sets the value of the aDisbursementDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setADisbursementDt(JAXBElement<String> value) {
        this.aDisbursementDt = value;
    }

    /**
     * Gets the value of the aDisbursementMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getADisbursementMode() {
        return aDisbursementMode;
    }

    /**
     * Sets the value of the aDisbursementMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setADisbursementMode(JAXBElement<String> value) {
        this.aDisbursementMode = value;
    }

    /**
     * Gets the value of the fieldID671 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldID671() {
        return fieldID671;
    }

    /**
     * Sets the value of the fieldID671 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldID671(JAXBElement<String> value) {
        this.fieldID671 = value;
    }

    /**
     * Gets the value of the lifsc1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLIFSC1() {
        return lifsc1;
    }

    /**
     * Sets the value of the lifsc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLIFSC1(JAXBElement<String> value) {
        this.lifsc1 = value;
    }

}
