package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer offer.InitiateCustomerOfferProcedureRequestAgreement;
import com.ibm.dip.model.customer offer.InitiateCustomerOfferProcedureRequestAudit;
import com.ibm.dip.model.customer offer.InitiateCustomerOfferProcedureRequestBooking;
import com.ibm.dip.model.customer offer.InitiateCustomerOfferProcedureRequestCompliance;
import com.ibm.dip.model.customer offer.InitiateCustomerOfferProcedureRequestCorrespondenceandDocuments;
import com.ibm.dip.model.customer offer.InitiateCustomerOfferProcedureRequestCredit;
import com.ibm.dip.model.customer offer.InitiateCustomerOfferProcedureRequestCustomerOfferProcedure;
import com.ibm.dip.model.customer offer.InitiateCustomerOfferProcedureRequestFacilityApplication;
import com.ibm.dip.model.customer offer.InitiateCustomerOfferProcedureRequestUnderwriting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerOfferProcedureRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class InitiateCustomerOfferProcedureRequest   {
  @JsonProperty("CustomerOfferProcedure")
  private InitiateCustomerOfferProcedureRequestCustomerOfferProcedure customerOfferProcedure;

  @JsonProperty("FacilityApplication")
  private InitiateCustomerOfferProcedureRequestFacilityApplication facilityApplication;

  @JsonProperty("Credit")
  private InitiateCustomerOfferProcedureRequestCredit credit;

  @JsonProperty("Underwriting")
  private InitiateCustomerOfferProcedureRequestUnderwriting underwriting;

  @JsonProperty("Compliance")
  private InitiateCustomerOfferProcedureRequestCompliance compliance;

  @JsonProperty("Audit")
  private InitiateCustomerOfferProcedureRequestAudit audit;

  @JsonProperty("Booking")
  private InitiateCustomerOfferProcedureRequestBooking booking;

  @JsonProperty("CorrespondenceandDocuments")
  private InitiateCustomerOfferProcedureRequestCorrespondenceandDocuments correspondenceandDocuments;

  @JsonProperty("Agreement")
  private InitiateCustomerOfferProcedureRequestAgreement agreement;

  public InitiateCustomerOfferProcedureRequest customerOfferProcedure(InitiateCustomerOfferProcedureRequestCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
    return this;
  }

  /**
   * Get customerOfferProcedure
   * @return customerOfferProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCustomerOfferProcedureRequestCustomerOfferProcedure getCustomerOfferProcedure() {
    return customerOfferProcedure;
  }

  public void setCustomerOfferProcedure(InitiateCustomerOfferProcedureRequestCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
  }

  public InitiateCustomerOfferProcedureRequest facilityApplication(InitiateCustomerOfferProcedureRequestFacilityApplication facilityApplication) {
    this.facilityApplication = facilityApplication;
    return this;
  }

  /**
   * Get facilityApplication
   * @return facilityApplication
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCustomerOfferProcedureRequestFacilityApplication getFacilityApplication() {
    return facilityApplication;
  }

  public void setFacilityApplication(InitiateCustomerOfferProcedureRequestFacilityApplication facilityApplication) {
    this.facilityApplication = facilityApplication;
  }

  public InitiateCustomerOfferProcedureRequest credit(InitiateCustomerOfferProcedureRequestCredit credit) {
    this.credit = credit;
    return this;
  }

  /**
   * Get credit
   * @return credit
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCustomerOfferProcedureRequestCredit getCredit() {
    return credit;
  }

  public void setCredit(InitiateCustomerOfferProcedureRequestCredit credit) {
    this.credit = credit;
  }

  public InitiateCustomerOfferProcedureRequest underwriting(InitiateCustomerOfferProcedureRequestUnderwriting underwriting) {
    this.underwriting = underwriting;
    return this;
  }

  /**
   * Get underwriting
   * @return underwriting
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCustomerOfferProcedureRequestUnderwriting getUnderwriting() {
    return underwriting;
  }

  public void setUnderwriting(InitiateCustomerOfferProcedureRequestUnderwriting underwriting) {
    this.underwriting = underwriting;
  }

  public InitiateCustomerOfferProcedureRequest compliance(InitiateCustomerOfferProcedureRequestCompliance compliance) {
    this.compliance = compliance;
    return this;
  }

  /**
   * Get compliance
   * @return compliance
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCustomerOfferProcedureRequestCompliance getCompliance() {
    return compliance;
  }

  public void setCompliance(InitiateCustomerOfferProcedureRequestCompliance compliance) {
    this.compliance = compliance;
  }

  public InitiateCustomerOfferProcedureRequest audit(InitiateCustomerOfferProcedureRequestAudit audit) {
    this.audit = audit;
    return this;
  }

  /**
   * Get audit
   * @return audit
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCustomerOfferProcedureRequestAudit getAudit() {
    return audit;
  }

  public void setAudit(InitiateCustomerOfferProcedureRequestAudit audit) {
    this.audit = audit;
  }

  public InitiateCustomerOfferProcedureRequest booking(InitiateCustomerOfferProcedureRequestBooking booking) {
    this.booking = booking;
    return this;
  }

  /**
   * Get booking
   * @return booking
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCustomerOfferProcedureRequestBooking getBooking() {
    return booking;
  }

  public void setBooking(InitiateCustomerOfferProcedureRequestBooking booking) {
    this.booking = booking;
  }

  public InitiateCustomerOfferProcedureRequest correspondenceandDocuments(InitiateCustomerOfferProcedureRequestCorrespondenceandDocuments correspondenceandDocuments) {
    this.correspondenceandDocuments = correspondenceandDocuments;
    return this;
  }

  /**
   * Get correspondenceandDocuments
   * @return correspondenceandDocuments
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCustomerOfferProcedureRequestCorrespondenceandDocuments getCorrespondenceandDocuments() {
    return correspondenceandDocuments;
  }

  public void setCorrespondenceandDocuments(InitiateCustomerOfferProcedureRequestCorrespondenceandDocuments correspondenceandDocuments) {
    this.correspondenceandDocuments = correspondenceandDocuments;
  }

  public InitiateCustomerOfferProcedureRequest agreement(InitiateCustomerOfferProcedureRequestAgreement agreement) {
    this.agreement = agreement;
    return this;
  }

  /**
   * Get agreement
   * @return agreement
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCustomerOfferProcedureRequestAgreement getAgreement() {
    return agreement;
  }

  public void setAgreement(InitiateCustomerOfferProcedureRequestAgreement agreement) {
    this.agreement = agreement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCustomerOfferProcedureRequest initiateCustomerOfferProcedureRequest = (InitiateCustomerOfferProcedureRequest) o;
    return Objects.equals(this.customerOfferProcedure, initiateCustomerOfferProcedureRequest.customerOfferProcedure) &&
        Objects.equals(this.facilityApplication, initiateCustomerOfferProcedureRequest.facilityApplication) &&
        Objects.equals(this.credit, initiateCustomerOfferProcedureRequest.credit) &&
        Objects.equals(this.underwriting, initiateCustomerOfferProcedureRequest.underwriting) &&
        Objects.equals(this.compliance, initiateCustomerOfferProcedureRequest.compliance) &&
        Objects.equals(this.audit, initiateCustomerOfferProcedureRequest.audit) &&
        Objects.equals(this.booking, initiateCustomerOfferProcedureRequest.booking) &&
        Objects.equals(this.correspondenceandDocuments, initiateCustomerOfferProcedureRequest.correspondenceandDocuments) &&
        Objects.equals(this.agreement, initiateCustomerOfferProcedureRequest.agreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedure, facilityApplication, credit, underwriting, compliance, audit, booking, correspondenceandDocuments, agreement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerOfferProcedureRequest {\n");
    
    sb.append("    customerOfferProcedure: ").append(toIndentedString(customerOfferProcedure)).append("\n");
    sb.append("    facilityApplication: ").append(toIndentedString(facilityApplication)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    underwriting: ").append(toIndentedString(underwriting)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
    sb.append("    audit: ").append(toIndentedString(audit)).append("\n");
    sb.append("    booking: ").append(toIndentedString(booking)).append("\n");
    sb.append("    correspondenceandDocuments: ").append(toIndentedString(correspondenceandDocuments)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

