//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.13 at 04:35:20 PM IST 
//


package com.fullerton.olp.wsdao.cp.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fullerton.olp.wsdao.cp.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FetchInputNewApplicationXML_QNAME = new QName("http://defs.webservices.experian.com", "fetchInputNewApplicationXML");
    private final static QName _OutputNewApplicationXML_QNAME = new QName("http://defs.webservices.experian.com", "OutputNewApplicationXML");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fullerton.olp.wsdao.cp.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FetchOutputNewApplicationXML }
     * 
     */
    public FetchOutputNewApplicationXML createFetchOutputNewApplicationXML() {
        return new FetchOutputNewApplicationXML();
    }

    /**
     * Create an instance of {@link FetchOutputNewApplicationXML.RawData }
     * 
     */
    public FetchOutputNewApplicationXML.RawData createFetchOutputNewApplicationXMLRawData() {
        return new FetchOutputNewApplicationXML.RawData();
    }

    /**
     * Create an instance of {@link FetchOutputNewApplicationXML.RawData.Applicant }
     * 
     */
    public FetchOutputNewApplicationXML.RawData.Applicant createFetchOutputNewApplicationXMLRawDataApplicant() {
        return new FetchOutputNewApplicationXML.RawData.Applicant();
    }

    /**
     * Create an instance of {@link FetchOutputNewApplicationXML.RawData.Applicant.Segment }
     * 
     */
    public FetchOutputNewApplicationXML.RawData.Applicant.Segment createFetchOutputNewApplicationXMLRawDataApplicantSegment() {
        return new FetchOutputNewApplicationXML.RawData.Applicant.Segment();
    }

    /**
     * Create an instance of {@link FetchOutputNewApplicationXML.RawData.Applicant.Segment.Block }
     * 
     */
    public FetchOutputNewApplicationXML.RawData.Applicant.Segment.Block createFetchOutputNewApplicationXMLRawDataApplicantSegmentBlock() {
        return new FetchOutputNewApplicationXML.RawData.Applicant.Segment.Block();
    }

    /**
     * Create an instance of {@link InputNewApplicationXML }
     * 
     */
    public InputNewApplicationXML createInputNewApplicationXML() {
        return new InputNewApplicationXML();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link FetchOutputNewApplicationXML.TransactData }
     * 
     */
    public FetchOutputNewApplicationXML.TransactData createFetchOutputNewApplicationXMLTransactData() {
        return new FetchOutputNewApplicationXML.TransactData();
    }

    /**
     * Create an instance of {@link NewApplicationXMLFault }
     * 
     */
    public NewApplicationXMLFault createNewApplicationXMLFault() {
        return new NewApplicationXMLFault();
    }

    /**
     * Create an instance of {@link FetchOutputNewApplicationXML.RawData.Applicant.Segment.Block.Field }
     * 
     */
    public FetchOutputNewApplicationXML.RawData.Applicant.Segment.Block.Field createFetchOutputNewApplicationXMLRawDataApplicantSegmentBlockField() {
        return new FetchOutputNewApplicationXML.RawData.Applicant.Segment.Block.Field();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ticket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://defs.webservices.experian.com", name = "fetchInputNewApplicationXML")
    public JAXBElement<Ticket> createFetchInputNewApplicationXML(Ticket value) {
        return new JAXBElement<Ticket>(_FetchInputNewApplicationXML_QNAME, Ticket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ticket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://defs.webservices.experian.com", name = "OutputNewApplicationXML")
    public JAXBElement<Ticket> createOutputNewApplicationXML(Ticket value) {
        return new JAXBElement<Ticket>(_OutputNewApplicationXML_QNAME, Ticket.class, null, value);
    }

}