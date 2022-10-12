package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Credit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class Credit   {
  @JsonProperty("CustomerCreditRating")
  private String customerCreditRating;

  @JsonProperty("CreditAuthorizationDecisionReference")
  private Object creditAuthorizationDecisionReference;

  @JsonProperty("CreditAuthorizationDecision")
  private String creditAuthorizationDecision;

  public Credit customerCreditRating(String customerCreditRating) {
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

  public Credit creditAuthorizationDecisionReference(Object creditAuthorizationDecisionReference) {
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

  public Credit creditAuthorizationDecision(String creditAuthorizationDecision) {
    this.creditAuthorizationDecision = creditAuthorizationDecision;
    return this;
  }

  /**
   * Get creditAuthorizationDecision
   * @return creditAuthorizationDecision
  */
  @ApiModelProperty(value = "")


  public String getCreditAuthorizationDecision() {
    return creditAuthorizationDecision;
  }

  public void setCreditAuthorizationDecision(String creditAuthorizationDecision) {
    this.creditAuthorizationDecision = creditAuthorizationDecision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credit credit = (Credit) o;
    return Objects.equals(this.customerCreditRating, credit.customerCreditRating) &&
        Objects.equals(this.creditAuthorizationDecisionReference, credit.creditAuthorizationDecisionReference) &&
        Objects.equals(this.creditAuthorizationDecision, credit.creditAuthorizationDecision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCreditRating, creditAuthorizationDecisionReference, creditAuthorizationDecision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credit {\n");
    
    sb.append("    customerCreditRating: ").append(toIndentedString(customerCreditRating)).append("\n");
    sb.append("    creditAuthorizationDecisionReference: ").append(toIndentedString(creditAuthorizationDecisionReference)).append("\n");
    sb.append("    creditAuthorizationDecision: ").append(toIndentedString(creditAuthorizationDecision)).append("\n");
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

