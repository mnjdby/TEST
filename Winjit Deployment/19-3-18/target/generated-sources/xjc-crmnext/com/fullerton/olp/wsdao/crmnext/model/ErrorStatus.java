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
 * <p>Java class for ErrorStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotInitialized"/&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="SaveFailure"/&gt;
 *     &lt;enumeration value="InsertFailure"/&gt;
 *     &lt;enumeration value="DeleteFailure"/&gt;
 *     &lt;enumeration value="SelectFailure"/&gt;
 *     &lt;enumeration value="RecordNotFound"/&gt;
 *     &lt;enumeration value="RecordListNotFound"/&gt;
 *     &lt;enumeration value="DatabaseNotAvailable"/&gt;
 *     &lt;enumeration value="AuthorizationFailure"/&gt;
 *     &lt;enumeration value="InvalidData"/&gt;
 *     &lt;enumeration value="QuotaExceeded"/&gt;
 *     &lt;enumeration value="BusinessRuleFailure"/&gt;
 *     &lt;enumeration value="UpdateFailure"/&gt;
 *     &lt;enumeration value="UpdateReadStatusFailure"/&gt;
 *     &lt;enumeration value="InvalidCampaign"/&gt;
 *     &lt;enumeration value="InvalidOpportunity"/&gt;
 *     &lt;enumeration value="InvalidLead"/&gt;
 *     &lt;enumeration value="InvalidCase"/&gt;
 *     &lt;enumeration value="InvalidAccount"/&gt;
 *     &lt;enumeration value="InvalidParentAccount"/&gt;
 *     &lt;enumeration value="InvalidContact"/&gt;
 *     &lt;enumeration value="InvalidReportTo"/&gt;
 *     &lt;enumeration value="InvalidTeamTerritoryProduct"/&gt;
 *     &lt;enumeration value="CheckTeamTerritoryProductFailure"/&gt;
 *     &lt;enumeration value="SelectProductQtyFailure"/&gt;
 *     &lt;enumeration value="SendEmailFailure"/&gt;
 *     &lt;enumeration value="EscalationActionNotFound"/&gt;
 *     &lt;enumeration value="AlertFailure"/&gt;
 *     &lt;enumeration value="InvalidDate"/&gt;
 *     &lt;enumeration value="InvalidRenewalDays"/&gt;
 *     &lt;enumeration value="DependencyExist"/&gt;
 *     &lt;enumeration value="InvalidAssignedTo"/&gt;
 *     &lt;enumeration value="NotificationFailure"/&gt;
 *     &lt;enumeration value="LicenseFileError"/&gt;
 *     &lt;enumeration value="DuplicateRecord"/&gt;
 *     &lt;enumeration value="IntegrationMappingNotSpecified"/&gt;
 *     &lt;enumeration value="OpportunityProductMissMatch"/&gt;
 *     &lt;enumeration value="InsertPermissionDenied"/&gt;
 *     &lt;enumeration value="DeletePermissionDenied"/&gt;
 *     &lt;enumeration value="EditPermissionDenied"/&gt;
 *     &lt;enumeration value="ViewPermissiondenied"/&gt;
 *     &lt;enumeration value="EnforcementIsValid"/&gt;
 *     &lt;enumeration value="ItemNotInScope"/&gt;
 *     &lt;enumeration value="CustomFieldNotSaved"/&gt;
 *     &lt;enumeration value="ListPermissionDenied"/&gt;
 *     &lt;enumeration value="ConfirmFailed"/&gt;
 *     &lt;enumeration value="UndoFailed"/&gt;
 *     &lt;enumeration value="InValidBranchCode"/&gt;
 *     &lt;enumeration value="NeedConfirmation"/&gt;
 *     &lt;enumeration value="SendSmsFailure"/&gt;
 *     &lt;enumeration value="InvalidExpression"/&gt;
 *     &lt;enumeration value="ItemNotShared"/&gt;
 *     &lt;enumeration value="EditPermissionGranted"/&gt;
 *     &lt;enumeration value="ScheduledEventExist"/&gt;
 *     &lt;enumeration value="InSuficientData"/&gt;
 *     &lt;enumeration value="InvalidProduct"/&gt;
 *     &lt;enumeration value="InvalidTeamTerrCombination"/&gt;
 *     &lt;enumeration value="ImportFailure"/&gt;
 *     &lt;enumeration value="EnforceItemSharingRule"/&gt;
 *     &lt;enumeration value="ContactAccountNotMatching"/&gt;
 *     &lt;enumeration value="AccountEmpty"/&gt;
 *     &lt;enumeration value="DeletePermissionDeniedByAdmin"/&gt;
 *     &lt;enumeration value="UpdatePermissionDeniedByAdmin"/&gt;
 *     &lt;enumeration value="ViewPermissionDeniedByAdmin"/&gt;
 *     &lt;enumeration value="InsertPermissionDeniedByAdmin"/&gt;
 *     &lt;enumeration value="InsertOrUpdateFailedByBlockedRule"/&gt;
 *     &lt;enumeration value="DedupeItemsFound"/&gt;
 *     &lt;enumeration value="OffertoLeadConversionSucces"/&gt;
 *     &lt;enumeration value="OffertoLeadConversionFailure"/&gt;
 *     &lt;enumeration value="SomeItemsNotDeleted"/&gt;
 *     &lt;enumeration value="FailedToLoadCustomAction"/&gt;
 *     &lt;enumeration value="ActiveQuoteExists"/&gt;
 *     &lt;enumeration value="InvalidUser"/&gt;
 *     &lt;enumeration value="RoleAssignmentDeleteFailed"/&gt;
 *     &lt;enumeration value="AttemptToChangeOnlyAvailableAdminRole"/&gt;
 *     &lt;enumeration value="InvalidButton"/&gt;
 *     &lt;enumeration value="InvalidQueryString"/&gt;
 *     &lt;enumeration value="InvalidLinkValue"/&gt;
 *     &lt;enumeration value="InvalidLinkField"/&gt;
 *     &lt;enumeration value="NoDynamicFilterSpecified"/&gt;
 *     &lt;enumeration value="InvalidContinueStage"/&gt;
 *     &lt;enumeration value="NoTeamTerritorySpecified"/&gt;
 *     &lt;enumeration value="DuplicateRepeat"/&gt;
 *     &lt;enumeration value="RangeCollapsed"/&gt;
 *     &lt;enumeration value="DmsNotEnoughFileSpace"/&gt;
 *     &lt;enumeration value="DmsDuplicateFile"/&gt;
 *     &lt;enumeration value="DmsUserNameInvalid"/&gt;
 *     &lt;enumeration value="DmsResetAvailabilityError"/&gt;
 *     &lt;enumeration value="DmsExceedPathLength"/&gt;
 *     &lt;enumeration value="CatSubCatMisMatch"/&gt;
 *     &lt;enumeration value="SubCatSubSubCatMismatch"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErrorStatus")
@XmlEnum
public enum ErrorStatus {

    @XmlEnumValue("NotInitialized")
    NOT_INITIALIZED("NotInitialized"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("SaveFailure")
    SAVE_FAILURE("SaveFailure"),
    @XmlEnumValue("InsertFailure")
    INSERT_FAILURE("InsertFailure"),
    @XmlEnumValue("DeleteFailure")
    DELETE_FAILURE("DeleteFailure"),
    @XmlEnumValue("SelectFailure")
    SELECT_FAILURE("SelectFailure"),
    @XmlEnumValue("RecordNotFound")
    RECORD_NOT_FOUND("RecordNotFound"),
    @XmlEnumValue("RecordListNotFound")
    RECORD_LIST_NOT_FOUND("RecordListNotFound"),
    @XmlEnumValue("DatabaseNotAvailable")
    DATABASE_NOT_AVAILABLE("DatabaseNotAvailable"),
    @XmlEnumValue("AuthorizationFailure")
    AUTHORIZATION_FAILURE("AuthorizationFailure"),
    @XmlEnumValue("InvalidData")
    INVALID_DATA("InvalidData"),
    @XmlEnumValue("QuotaExceeded")
    QUOTA_EXCEEDED("QuotaExceeded"),
    @XmlEnumValue("BusinessRuleFailure")
    BUSINESS_RULE_FAILURE("BusinessRuleFailure"),
    @XmlEnumValue("UpdateFailure")
    UPDATE_FAILURE("UpdateFailure"),
    @XmlEnumValue("UpdateReadStatusFailure")
    UPDATE_READ_STATUS_FAILURE("UpdateReadStatusFailure"),
    @XmlEnumValue("InvalidCampaign")
    INVALID_CAMPAIGN("InvalidCampaign"),
    @XmlEnumValue("InvalidOpportunity")
    INVALID_OPPORTUNITY("InvalidOpportunity"),
    @XmlEnumValue("InvalidLead")
    INVALID_LEAD("InvalidLead"),
    @XmlEnumValue("InvalidCase")
    INVALID_CASE("InvalidCase"),
    @XmlEnumValue("InvalidAccount")
    INVALID_ACCOUNT("InvalidAccount"),
    @XmlEnumValue("InvalidParentAccount")
    INVALID_PARENT_ACCOUNT("InvalidParentAccount"),
    @XmlEnumValue("InvalidContact")
    INVALID_CONTACT("InvalidContact"),
    @XmlEnumValue("InvalidReportTo")
    INVALID_REPORT_TO("InvalidReportTo"),
    @XmlEnumValue("InvalidTeamTerritoryProduct")
    INVALID_TEAM_TERRITORY_PRODUCT("InvalidTeamTerritoryProduct"),
    @XmlEnumValue("CheckTeamTerritoryProductFailure")
    CHECK_TEAM_TERRITORY_PRODUCT_FAILURE("CheckTeamTerritoryProductFailure"),
    @XmlEnumValue("SelectProductQtyFailure")
    SELECT_PRODUCT_QTY_FAILURE("SelectProductQtyFailure"),
    @XmlEnumValue("SendEmailFailure")
    SEND_EMAIL_FAILURE("SendEmailFailure"),
    @XmlEnumValue("EscalationActionNotFound")
    ESCALATION_ACTION_NOT_FOUND("EscalationActionNotFound"),
    @XmlEnumValue("AlertFailure")
    ALERT_FAILURE("AlertFailure"),
    @XmlEnumValue("InvalidDate")
    INVALID_DATE("InvalidDate"),
    @XmlEnumValue("InvalidRenewalDays")
    INVALID_RENEWAL_DAYS("InvalidRenewalDays"),
    @XmlEnumValue("DependencyExist")
    DEPENDENCY_EXIST("DependencyExist"),
    @XmlEnumValue("InvalidAssignedTo")
    INVALID_ASSIGNED_TO("InvalidAssignedTo"),
    @XmlEnumValue("NotificationFailure")
    NOTIFICATION_FAILURE("NotificationFailure"),
    @XmlEnumValue("LicenseFileError")
    LICENSE_FILE_ERROR("LicenseFileError"),
    @XmlEnumValue("DuplicateRecord")
    DUPLICATE_RECORD("DuplicateRecord"),
    @XmlEnumValue("IntegrationMappingNotSpecified")
    INTEGRATION_MAPPING_NOT_SPECIFIED("IntegrationMappingNotSpecified"),
    @XmlEnumValue("OpportunityProductMissMatch")
    OPPORTUNITY_PRODUCT_MISS_MATCH("OpportunityProductMissMatch"),
    @XmlEnumValue("InsertPermissionDenied")
    INSERT_PERMISSION_DENIED("InsertPermissionDenied"),
    @XmlEnumValue("DeletePermissionDenied")
    DELETE_PERMISSION_DENIED("DeletePermissionDenied"),
    @XmlEnumValue("EditPermissionDenied")
    EDIT_PERMISSION_DENIED("EditPermissionDenied"),
    @XmlEnumValue("ViewPermissiondenied")
    VIEW_PERMISSIONDENIED("ViewPermissiondenied"),
    @XmlEnumValue("EnforcementIsValid")
    ENFORCEMENT_IS_VALID("EnforcementIsValid"),
    @XmlEnumValue("ItemNotInScope")
    ITEM_NOT_IN_SCOPE("ItemNotInScope"),
    @XmlEnumValue("CustomFieldNotSaved")
    CUSTOM_FIELD_NOT_SAVED("CustomFieldNotSaved"),
    @XmlEnumValue("ListPermissionDenied")
    LIST_PERMISSION_DENIED("ListPermissionDenied"),
    @XmlEnumValue("ConfirmFailed")
    CONFIRM_FAILED("ConfirmFailed"),
    @XmlEnumValue("UndoFailed")
    UNDO_FAILED("UndoFailed"),
    @XmlEnumValue("InValidBranchCode")
    IN_VALID_BRANCH_CODE("InValidBranchCode"),
    @XmlEnumValue("NeedConfirmation")
    NEED_CONFIRMATION("NeedConfirmation"),
    @XmlEnumValue("SendSmsFailure")
    SEND_SMS_FAILURE("SendSmsFailure"),
    @XmlEnumValue("InvalidExpression")
    INVALID_EXPRESSION("InvalidExpression"),
    @XmlEnumValue("ItemNotShared")
    ITEM_NOT_SHARED("ItemNotShared"),
    @XmlEnumValue("EditPermissionGranted")
    EDIT_PERMISSION_GRANTED("EditPermissionGranted"),
    @XmlEnumValue("ScheduledEventExist")
    SCHEDULED_EVENT_EXIST("ScheduledEventExist"),
    @XmlEnumValue("InSuficientData")
    IN_SUFICIENT_DATA("InSuficientData"),
    @XmlEnumValue("InvalidProduct")
    INVALID_PRODUCT("InvalidProduct"),
    @XmlEnumValue("InvalidTeamTerrCombination")
    INVALID_TEAM_TERR_COMBINATION("InvalidTeamTerrCombination"),
    @XmlEnumValue("ImportFailure")
    IMPORT_FAILURE("ImportFailure"),
    @XmlEnumValue("EnforceItemSharingRule")
    ENFORCE_ITEM_SHARING_RULE("EnforceItemSharingRule"),
    @XmlEnumValue("ContactAccountNotMatching")
    CONTACT_ACCOUNT_NOT_MATCHING("ContactAccountNotMatching"),
    @XmlEnumValue("AccountEmpty")
    ACCOUNT_EMPTY("AccountEmpty"),
    @XmlEnumValue("DeletePermissionDeniedByAdmin")
    DELETE_PERMISSION_DENIED_BY_ADMIN("DeletePermissionDeniedByAdmin"),
    @XmlEnumValue("UpdatePermissionDeniedByAdmin")
    UPDATE_PERMISSION_DENIED_BY_ADMIN("UpdatePermissionDeniedByAdmin"),
    @XmlEnumValue("ViewPermissionDeniedByAdmin")
    VIEW_PERMISSION_DENIED_BY_ADMIN("ViewPermissionDeniedByAdmin"),
    @XmlEnumValue("InsertPermissionDeniedByAdmin")
    INSERT_PERMISSION_DENIED_BY_ADMIN("InsertPermissionDeniedByAdmin"),
    @XmlEnumValue("InsertOrUpdateFailedByBlockedRule")
    INSERT_OR_UPDATE_FAILED_BY_BLOCKED_RULE("InsertOrUpdateFailedByBlockedRule"),
    @XmlEnumValue("DedupeItemsFound")
    DEDUPE_ITEMS_FOUND("DedupeItemsFound"),
    @XmlEnumValue("OffertoLeadConversionSucces")
    OFFERTO_LEAD_CONVERSION_SUCCES("OffertoLeadConversionSucces"),
    @XmlEnumValue("OffertoLeadConversionFailure")
    OFFERTO_LEAD_CONVERSION_FAILURE("OffertoLeadConversionFailure"),
    @XmlEnumValue("SomeItemsNotDeleted")
    SOME_ITEMS_NOT_DELETED("SomeItemsNotDeleted"),
    @XmlEnumValue("FailedToLoadCustomAction")
    FAILED_TO_LOAD_CUSTOM_ACTION("FailedToLoadCustomAction"),
    @XmlEnumValue("ActiveQuoteExists")
    ACTIVE_QUOTE_EXISTS("ActiveQuoteExists"),
    @XmlEnumValue("InvalidUser")
    INVALID_USER("InvalidUser"),
    @XmlEnumValue("RoleAssignmentDeleteFailed")
    ROLE_ASSIGNMENT_DELETE_FAILED("RoleAssignmentDeleteFailed"),
    @XmlEnumValue("AttemptToChangeOnlyAvailableAdminRole")
    ATTEMPT_TO_CHANGE_ONLY_AVAILABLE_ADMIN_ROLE("AttemptToChangeOnlyAvailableAdminRole"),
    @XmlEnumValue("InvalidButton")
    INVALID_BUTTON("InvalidButton"),
    @XmlEnumValue("InvalidQueryString")
    INVALID_QUERY_STRING("InvalidQueryString"),
    @XmlEnumValue("InvalidLinkValue")
    INVALID_LINK_VALUE("InvalidLinkValue"),
    @XmlEnumValue("InvalidLinkField")
    INVALID_LINK_FIELD("InvalidLinkField"),
    @XmlEnumValue("NoDynamicFilterSpecified")
    NO_DYNAMIC_FILTER_SPECIFIED("NoDynamicFilterSpecified"),
    @XmlEnumValue("InvalidContinueStage")
    INVALID_CONTINUE_STAGE("InvalidContinueStage"),
    @XmlEnumValue("NoTeamTerritorySpecified")
    NO_TEAM_TERRITORY_SPECIFIED("NoTeamTerritorySpecified"),
    @XmlEnumValue("DuplicateRepeat")
    DUPLICATE_REPEAT("DuplicateRepeat"),
    @XmlEnumValue("RangeCollapsed")
    RANGE_COLLAPSED("RangeCollapsed"),
    @XmlEnumValue("DmsNotEnoughFileSpace")
    DMS_NOT_ENOUGH_FILE_SPACE("DmsNotEnoughFileSpace"),
    @XmlEnumValue("DmsDuplicateFile")
    DMS_DUPLICATE_FILE("DmsDuplicateFile"),
    @XmlEnumValue("DmsUserNameInvalid")
    DMS_USER_NAME_INVALID("DmsUserNameInvalid"),
    @XmlEnumValue("DmsResetAvailabilityError")
    DMS_RESET_AVAILABILITY_ERROR("DmsResetAvailabilityError"),
    @XmlEnumValue("DmsExceedPathLength")
    DMS_EXCEED_PATH_LENGTH("DmsExceedPathLength"),
    @XmlEnumValue("CatSubCatMisMatch")
    CAT_SUB_CAT_MIS_MATCH("CatSubCatMisMatch"),
    @XmlEnumValue("SubCatSubSubCatMismatch")
    SUB_CAT_SUB_SUB_CAT_MISMATCH("SubCatSubSubCatMismatch");
    private final String value;

    ErrorStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorStatus fromValue(String v) {
        for (ErrorStatus c: ErrorStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
