package com.ibm.dip.model.customer product and service eligibility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:34.796Z[GMT]")

public class EvaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("CustomerProductandServiceProfile")
  private String customerProductandServiceProfile;

  @JsonProperty("ProductandServiceType")
  private String productandServiceType;

  @JsonProperty("Date")
  private String date;

  public EvaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public EvaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment customerProductandServiceProfile(String customerProductandServiceProfile) {
    this.customerProductandServiceProfile = customerProductandServiceProfile;
    return this;
  }

  /**
   * Get customerProductandServiceProfile
   * @return customerProductandServiceProfile
  */
  @ApiModelProperty(value = "")


  public String getCustomerProductandServiceProfile() {
    return customerProductandServiceProfile;
  }

  public void setCustomerProductandServiceProfile(String customerProductandServiceProfile) {
    this.customerProductandServiceProfile = customerProductandServiceProfile;
  }

  public EvaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment productandServiceType(String productandServiceType) {
    this.productandServiceType = productandServiceType;
    return this;
  }

  /**
   * Get productandServiceType
   * @return productandServiceType
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceType() {
    return productandServiceType;
  }

  public void setProductandServiceType(String productandServiceType) {
    this.productandServiceType = productandServiceType;
  }

  public EvaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment evaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment = (EvaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment) o;
    return Objects.equals(this.customerReference, evaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment.customerReference) &&
        Objects.equals(this.customerProductandServiceProfile, evaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment.customerProductandServiceProfile) &&
        Objects.equals(this.productandServiceType, evaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment.productandServiceType) &&
        Objects.equals(this.date, evaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, customerProductandServiceProfile, productandServiceType, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    customerProductandServiceProfile: ").append(toIndentedString(customerProductandServiceProfile)).append("\n");
    sb.append("    productandServiceType: ").append(toIndentedString(productandServiceType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

