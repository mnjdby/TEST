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
 * <p>Java class for GroupKey.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupKey"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Salutation"/&gt;
 *     &lt;enumeration value="Designation"/&gt;
 *     &lt;enumeration value="Language"/&gt;
 *     &lt;enumeration value="Industry"/&gt;
 *     &lt;enumeration value="EmployeeStrength"/&gt;
 *     &lt;enumeration value="LeadSource"/&gt;
 *     &lt;enumeration value="LeadRating"/&gt;
 *     &lt;enumeration value="TimeZone"/&gt;
 *     &lt;enumeration value="OppurtunityType"/&gt;
 *     &lt;enumeration value="AccountType"/&gt;
 *     &lt;enumeration value="ActivityStatus"/&gt;
 *     &lt;enumeration value="TaskPriority"/&gt;
 *     &lt;enumeration value="AccountRating"/&gt;
 *     &lt;enumeration value="TaskTimeGrouping"/&gt;
 *     &lt;enumeration value="TaskType"/&gt;
 *     &lt;enumeration value="EventTimeGrouping"/&gt;
 *     &lt;enumeration value="EventPriority"/&gt;
 *     &lt;enumeration value="IssueStatus"/&gt;
 *     &lt;enumeration value="IssueCategory"/&gt;
 *     &lt;enumeration value="IssuePriority"/&gt;
 *     &lt;enumeration value="IssueTimeGrouping"/&gt;
 *     &lt;enumeration value="SurveyType"/&gt;
 *     &lt;enumeration value="SurveyResultOptions"/&gt;
 *     &lt;enumeration value="NotesPriority"/&gt;
 *     &lt;enumeration value="CaseStatus"/&gt;
 *     &lt;enumeration value="CasePriority"/&gt;
 *     &lt;enumeration value="CaseType"/&gt;
 *     &lt;enumeration value="CaseOrigin"/&gt;
 *     &lt;enumeration value="CaseReason"/&gt;
 *     &lt;enumeration value="CaseSolutionCategory"/&gt;
 *     &lt;enumeration value="CommunicationMode"/&gt;
 *     &lt;enumeration value="TurnOver"/&gt;
 *     &lt;enumeration value="RelatedTo"/&gt;
 *     &lt;enumeration value="Country"/&gt;
 *     &lt;enumeration value="LeadDisqualify"/&gt;
 *     &lt;enumeration value="CampaignStatus"/&gt;
 *     &lt;enumeration value="CampaignType"/&gt;
 *     &lt;enumeration value="CampaignGoal"/&gt;
 *     &lt;enumeration value="CampaignCategory"/&gt;
 *     &lt;enumeration value="CampaignFocusArea"/&gt;
 *     &lt;enumeration value="TemplateCategory"/&gt;
 *     &lt;enumeration value="LongDateFormat"/&gt;
 *     &lt;enumeration value="ShortDateFormat"/&gt;
 *     &lt;enumeration value="CompetitorCategory"/&gt;
 *     &lt;enumeration value="CompetitorRating"/&gt;
 *     &lt;enumeration value="OpportunityPartnerRole"/&gt;
 *     &lt;enumeration value="SolutionStatus"/&gt;
 *     &lt;enumeration value="OpportunityContactRole"/&gt;
 *     &lt;enumeration value="OpportunityLostReason"/&gt;
 *     &lt;enumeration value="OpportunityStatus"/&gt;
 *     &lt;enumeration value="LocaleSetting"/&gt;
 *     &lt;enumeration value="EmailEncoding"/&gt;
 *     &lt;enumeration value="RequirementStatus"/&gt;
 *     &lt;enumeration value="RequirementCategory"/&gt;
 *     &lt;enumeration value="ContractStatus"/&gt;
 *     &lt;enumeration value="LeadStage"/&gt;
 *     &lt;enumeration value="PriceBookStatus"/&gt;
 *     &lt;enumeration value="CustomViewCategory"/&gt;
 *     &lt;enumeration value="QuoteStatus"/&gt;
 *     &lt;enumeration value="AssetStatus"/&gt;
 *     &lt;enumeration value="ContactStatus"/&gt;
 *     &lt;enumeration value="PreferredChannel"/&gt;
 *     &lt;enumeration value="CRMnextUserType"/&gt;
 *     &lt;enumeration value="Severity"/&gt;
 *     &lt;enumeration value="TerritoryCategory"/&gt;
 *     &lt;enumeration value="OfferStage"/&gt;
 *     &lt;enumeration value="CreateLayout"/&gt;
 *     &lt;enumeration value="AccountStatus"/&gt;
 *     &lt;enumeration value="TrackHistory"/&gt;
 *     &lt;enumeration value="AssignmentType"/&gt;
 *     &lt;enumeration value="CustomActionButtonType"/&gt;
 *     &lt;enumeration value="FileExtension"/&gt;
 *     &lt;enumeration value="LocationStatus"/&gt;
 *     &lt;enumeration value="LocationType"/&gt;
 *     &lt;enumeration value="TrainingCategory"/&gt;
 *     &lt;enumeration value="TrainingType"/&gt;
 *     &lt;enumeration value="TrainingStatus"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GroupKey")
@XmlEnum
public enum GroupKey {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Salutation")
    SALUTATION("Salutation"),
    @XmlEnumValue("Designation")
    DESIGNATION("Designation"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("Industry")
    INDUSTRY("Industry"),
    @XmlEnumValue("EmployeeStrength")
    EMPLOYEE_STRENGTH("EmployeeStrength"),
    @XmlEnumValue("LeadSource")
    LEAD_SOURCE("LeadSource"),
    @XmlEnumValue("LeadRating")
    LEAD_RATING("LeadRating"),
    @XmlEnumValue("TimeZone")
    TIME_ZONE("TimeZone"),
    @XmlEnumValue("OppurtunityType")
    OPPURTUNITY_TYPE("OppurtunityType"),
    @XmlEnumValue("AccountType")
    ACCOUNT_TYPE("AccountType"),
    @XmlEnumValue("ActivityStatus")
    ACTIVITY_STATUS("ActivityStatus"),
    @XmlEnumValue("TaskPriority")
    TASK_PRIORITY("TaskPriority"),
    @XmlEnumValue("AccountRating")
    ACCOUNT_RATING("AccountRating"),
    @XmlEnumValue("TaskTimeGrouping")
    TASK_TIME_GROUPING("TaskTimeGrouping"),
    @XmlEnumValue("TaskType")
    TASK_TYPE("TaskType"),
    @XmlEnumValue("EventTimeGrouping")
    EVENT_TIME_GROUPING("EventTimeGrouping"),
    @XmlEnumValue("EventPriority")
    EVENT_PRIORITY("EventPriority"),
    @XmlEnumValue("IssueStatus")
    ISSUE_STATUS("IssueStatus"),
    @XmlEnumValue("IssueCategory")
    ISSUE_CATEGORY("IssueCategory"),
    @XmlEnumValue("IssuePriority")
    ISSUE_PRIORITY("IssuePriority"),
    @XmlEnumValue("IssueTimeGrouping")
    ISSUE_TIME_GROUPING("IssueTimeGrouping"),
    @XmlEnumValue("SurveyType")
    SURVEY_TYPE("SurveyType"),
    @XmlEnumValue("SurveyResultOptions")
    SURVEY_RESULT_OPTIONS("SurveyResultOptions"),
    @XmlEnumValue("NotesPriority")
    NOTES_PRIORITY("NotesPriority"),
    @XmlEnumValue("CaseStatus")
    CASE_STATUS("CaseStatus"),
    @XmlEnumValue("CasePriority")
    CASE_PRIORITY("CasePriority"),
    @XmlEnumValue("CaseType")
    CASE_TYPE("CaseType"),
    @XmlEnumValue("CaseOrigin")
    CASE_ORIGIN("CaseOrigin"),
    @XmlEnumValue("CaseReason")
    CASE_REASON("CaseReason"),
    @XmlEnumValue("CaseSolutionCategory")
    CASE_SOLUTION_CATEGORY("CaseSolutionCategory"),
    @XmlEnumValue("CommunicationMode")
    COMMUNICATION_MODE("CommunicationMode"),
    @XmlEnumValue("TurnOver")
    TURN_OVER("TurnOver"),
    @XmlEnumValue("RelatedTo")
    RELATED_TO("RelatedTo"),
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("LeadDisqualify")
    LEAD_DISQUALIFY("LeadDisqualify"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("CampaignType")
    CAMPAIGN_TYPE("CampaignType"),
    @XmlEnumValue("CampaignGoal")
    CAMPAIGN_GOAL("CampaignGoal"),
    @XmlEnumValue("CampaignCategory")
    CAMPAIGN_CATEGORY("CampaignCategory"),
    @XmlEnumValue("CampaignFocusArea")
    CAMPAIGN_FOCUS_AREA("CampaignFocusArea"),
    @XmlEnumValue("TemplateCategory")
    TEMPLATE_CATEGORY("TemplateCategory"),
    @XmlEnumValue("LongDateFormat")
    LONG_DATE_FORMAT("LongDateFormat"),
    @XmlEnumValue("ShortDateFormat")
    SHORT_DATE_FORMAT("ShortDateFormat"),
    @XmlEnumValue("CompetitorCategory")
    COMPETITOR_CATEGORY("CompetitorCategory"),
    @XmlEnumValue("CompetitorRating")
    COMPETITOR_RATING("CompetitorRating"),
    @XmlEnumValue("OpportunityPartnerRole")
    OPPORTUNITY_PARTNER_ROLE("OpportunityPartnerRole"),
    @XmlEnumValue("SolutionStatus")
    SOLUTION_STATUS("SolutionStatus"),
    @XmlEnumValue("OpportunityContactRole")
    OPPORTUNITY_CONTACT_ROLE("OpportunityContactRole"),
    @XmlEnumValue("OpportunityLostReason")
    OPPORTUNITY_LOST_REASON("OpportunityLostReason"),
    @XmlEnumValue("OpportunityStatus")
    OPPORTUNITY_STATUS("OpportunityStatus"),
    @XmlEnumValue("LocaleSetting")
    LOCALE_SETTING("LocaleSetting"),
    @XmlEnumValue("EmailEncoding")
    EMAIL_ENCODING("EmailEncoding"),
    @XmlEnumValue("RequirementStatus")
    REQUIREMENT_STATUS("RequirementStatus"),
    @XmlEnumValue("RequirementCategory")
    REQUIREMENT_CATEGORY("RequirementCategory"),
    @XmlEnumValue("ContractStatus")
    CONTRACT_STATUS("ContractStatus"),
    @XmlEnumValue("LeadStage")
    LEAD_STAGE("LeadStage"),
    @XmlEnumValue("PriceBookStatus")
    PRICE_BOOK_STATUS("PriceBookStatus"),
    @XmlEnumValue("CustomViewCategory")
    CUSTOM_VIEW_CATEGORY("CustomViewCategory"),
    @XmlEnumValue("QuoteStatus")
    QUOTE_STATUS("QuoteStatus"),
    @XmlEnumValue("AssetStatus")
    ASSET_STATUS("AssetStatus"),
    @XmlEnumValue("ContactStatus")
    CONTACT_STATUS("ContactStatus"),
    @XmlEnumValue("PreferredChannel")
    PREFERRED_CHANNEL("PreferredChannel"),
    @XmlEnumValue("CRMnextUserType")
    CR_MNEXT_USER_TYPE("CRMnextUserType"),
    @XmlEnumValue("Severity")
    SEVERITY("Severity"),
    @XmlEnumValue("TerritoryCategory")
    TERRITORY_CATEGORY("TerritoryCategory"),
    @XmlEnumValue("OfferStage")
    OFFER_STAGE("OfferStage"),
    @XmlEnumValue("CreateLayout")
    CREATE_LAYOUT("CreateLayout"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("TrackHistory")
    TRACK_HISTORY("TrackHistory"),
    @XmlEnumValue("AssignmentType")
    ASSIGNMENT_TYPE("AssignmentType"),
    @XmlEnumValue("CustomActionButtonType")
    CUSTOM_ACTION_BUTTON_TYPE("CustomActionButtonType"),
    @XmlEnumValue("FileExtension")
    FILE_EXTENSION("FileExtension"),
    @XmlEnumValue("LocationStatus")
    LOCATION_STATUS("LocationStatus"),
    @XmlEnumValue("LocationType")
    LOCATION_TYPE("LocationType"),
    @XmlEnumValue("TrainingCategory")
    TRAINING_CATEGORY("TrainingCategory"),
    @XmlEnumValue("TrainingType")
    TRAINING_TYPE("TrainingType"),
    @XmlEnumValue("TrainingStatus")
    TRAINING_STATUS("TrainingStatus");
    private final String value;

    GroupKey(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupKey fromValue(String v) {
        for (GroupKey c: GroupKey.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
