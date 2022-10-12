package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer offer.UpdateAuditRequestAudit;
import com.ibm.dip.model.customer offer.UpdateFacilityApplicationRequestCustomerOfferProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateAuditRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class UpdateAuditRequest   {
  @JsonProperty("CustomerOfferProcedure")
  private UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure;

  @JsonProperty("Audit")
  private UpdateAuditRequestAudit audit;

  public UpdateAuditRequest customerOfferProcedure(UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
    return this;
  }

  /**
   * Get customerOfferProcedure
   * @return customerOfferProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateFacilityApplicationRequestCustomerOfferProcedure getCustomerOfferProcedure() {
    return customerOfferProcedure;
  }

  public void setCustomerOfferProcedure(UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
  }

  public UpdateAuditRequest audit(UpdateAuditRequestAudit audit) {
    this.audit = audit;
    return this;
  }

  /**
   * Get audit
   * @return audit
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateAuditRequestAudit getAudit() {
    return audit;
  }

  public void setAudit(UpdateAuditRequestAudit audit) {
    this.audit = audit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAuditRequest updateAuditRequest = (UpdateAuditRequest) o;
    return Objects.equals(this.customerOfferProcedure, updateAuditRequest.customerOfferProcedure) &&
        Objects.equals(this.audit, updateAuditRequest.audit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedure, audit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAuditRequest {\n");
    
    sb.append("    customerOfferProcedure: ").append(toIndentedString(customerOfferProcedure)).append("\n");
    sb.append("    audit: ").append(toIndentedString(audit)).append("\n");
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

