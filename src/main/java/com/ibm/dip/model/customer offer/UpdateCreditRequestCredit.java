package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateCreditRequestCredit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class UpdateCreditRequestCredit   {
  @JsonProperty("CustomerCreditRating")
  private String customerCreditRating;

  @JsonProperty("CreditAuthorizationDecisionReference")
  private Object creditAuthorizationDecisionReference;

  public UpdateCreditRequestCredit customerCreditRating(String customerCreditRating) {
    this.customerCreditRating = customerCreditRating;
    return this;
  }

  /**
   * Get customerCreditRating
   * @return customerCreditRating
  */
  @ApiModelProperty(value = "")


  public String getCustomerCreditRating() {
    return customerCreditRating;
  }

  public void setCustomerCreditRating(String customerCreditRating) {
    this.customerCreditRating = customerCreditRating;
  }

  public UpdateCreditRequestCredit creditAuthorizationDecisionReference(Object creditAuthorizationDecisionReference) {
    this.creditAuthorizationDecisionReference = creditAuthorizationDecisionReference;
    return this;
  }

  /**
   * Get creditAuthorizationDecisionReference
   * @return creditAuthorizationDecisionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCreditAuthorizationDecisionReference() {
    return creditAuthorizationDecisionReference;
  }

  public void setCreditAuthorizationDecisionReference(Object creditAuthorizationDecisionReference) {
    this.creditAuthorizationDecisionReference = creditAuthorizationDecisionReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCreditRequestCredit updateCreditRequestCredit = (UpdateCreditRequestCredit) o;
    return Objects.equals(this.customerCreditRating, updateCreditRequestCredit.customerCreditRating) &&
        Objects.equals(this.creditAuthorizationDecisionReference, updateCreditRequestCredit.creditAuthorizationDecisionReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCreditRating, creditAuthorizationDecisionReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCreditRequestCredit {\n");
    
    sb.append("    customerCreditRating: ").append(toIndentedString(customerCreditRating)).append("\n");
    sb.append("    creditAuthorizationDecisionReference: ").append(toIndentedString(creditAuthorizationDecisionReference)).append("\n");
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

