package com.ibm.dip.model.customer product and service eligibility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerEligibilityAssessment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:34.796Z[GMT]")

public class CustomerEligibilityAssessment   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("CustomerProductandServiceProfile")
  private String customerProductandServiceProfile;

  @JsonProperty("ProductandServiceType")
  private String productandServiceType;

  @JsonProperty("CustomerProductandServiceTypeEligibility")
  private String customerProductandServiceTypeEligibility;

  @JsonProperty("CustomerProductandServiceTypeUsage")
  private String customerProductandServiceTypeUsage;

  @JsonProperty("Date")
  private String date;

  public CustomerEligibilityAssessment customerReference(Object customerReference) {
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

  public CustomerEligibilityAssessment customerProductandServiceProfile(String customerProductandServiceProfile) {
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

  public CustomerEligibilityAssessment productandServiceType(String productandServiceType) {
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

  public CustomerEligibilityAssessment customerProductandServiceTypeEligibility(String customerProductandServiceTypeEligibility) {
    this.customerProductandServiceTypeEligibility = customerProductandServiceTypeEligibility;
    return this;
  }

  /**
   * Get customerProductandServiceTypeEligibility
   * @return customerProductandServiceTypeEligibility
  */
  @ApiModelProperty(value = "")


  public String getCustomerProductandServiceTypeEligibility() {
    return customerProductandServiceTypeEligibility;
  }

  public void setCustomerProductandServiceTypeEligibility(String customerProductandServiceTypeEligibility) {
    this.customerProductandServiceTypeEligibility = customerProductandServiceTypeEligibility;
  }

  public CustomerEligibilityAssessment customerProductandServiceTypeUsage(String customerProductandServiceTypeUsage) {
    this.customerProductandServiceTypeUsage = customerProductandServiceTypeUsage;
    return this;
  }

  /**
   * Get customerProductandServiceTypeUsage
   * @return customerProductandServiceTypeUsage
  */
  @ApiModelProperty(value = "")


  public String getCustomerProductandServiceTypeUsage() {
    return customerProductandServiceTypeUsage;
  }

  public void setCustomerProductandServiceTypeUsage(String customerProductandServiceTypeUsage) {
    this.customerProductandServiceTypeUsage = customerProductandServiceTypeUsage;
  }

  public CustomerEligibilityAssessment date(String date) {
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
    CustomerEligibilityAssessment customerEligibilityAssessment = (CustomerEligibilityAssessment) o;
    return Objects.equals(this.customerReference, customerEligibilityAssessment.customerReference) &&
        Objects.equals(this.customerProductandServiceProfile, customerEligibilityAssessment.customerProductandServiceProfile) &&
        Objects.equals(this.productandServiceType, customerEligibilityAssessment.productandServiceType) &&
        Objects.equals(this.customerProductandServiceTypeEligibility, customerEligibilityAssessment.customerProductandServiceTypeEligibility) &&
        Objects.equals(this.customerProductandServiceTypeUsage, customerEligibilityAssessment.customerProductandServiceTypeUsage) &&
        Objects.equals(this.date, customerEligibilityAssessment.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, customerProductandServiceProfile, productandServiceType, customerProductandServiceTypeEligibility, customerProductandServiceTypeUsage, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerEligibilityAssessment {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    customerProductandServiceProfile: ").append(toIndentedString(customerProductandServiceProfile)).append("\n");
    sb.append("    productandServiceType: ").append(toIndentedString(productandServiceType)).append("\n");
    sb.append("    customerProductandServiceTypeEligibility: ").append(toIndentedString(customerProductandServiceTypeEligibility)).append("\n");
    sb.append("    customerProductandServiceTypeUsage: ").append(toIndentedString(customerProductandServiceTypeUsage)).append("\n");
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

