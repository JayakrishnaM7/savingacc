package com.ibm.dip.model.customer product and service eligibility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NextBest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:34.796Z[GMT]")

public class NextBest   {
  @JsonProperty("RequestedProductandServiceProperties")
  private String requestedProductandServiceProperties;

  @JsonProperty("ProductServiceType")
  private String productServiceType;

  @JsonProperty("CustomerProductandServiceNextBestAssessmentResult")
  private String customerProductandServiceNextBestAssessmentResult;

  public NextBest requestedProductandServiceProperties(String requestedProductandServiceProperties) {
    this.requestedProductandServiceProperties = requestedProductandServiceProperties;
    return this;
  }

  /**
   * Get requestedProductandServiceProperties
   * @return requestedProductandServiceProperties
  */
  @ApiModelProperty(value = "")


  public String getRequestedProductandServiceProperties() {
    return requestedProductandServiceProperties;
  }

  public void setRequestedProductandServiceProperties(String requestedProductandServiceProperties) {
    this.requestedProductandServiceProperties = requestedProductandServiceProperties;
  }

  public NextBest productServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
    return this;
  }

  /**
   * Get productServiceType
   * @return productServiceType
  */
  @ApiModelProperty(value = "")


  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }

  public NextBest customerProductandServiceNextBestAssessmentResult(String customerProductandServiceNextBestAssessmentResult) {
    this.customerProductandServiceNextBestAssessmentResult = customerProductandServiceNextBestAssessmentResult;
    return this;
  }

  /**
   * Get customerProductandServiceNextBestAssessmentResult
   * @return customerProductandServiceNextBestAssessmentResult
  */
  @ApiModelProperty(value = "")


  public String getCustomerProductandServiceNextBestAssessmentResult() {
    return customerProductandServiceNextBestAssessmentResult;
  }

  public void setCustomerProductandServiceNextBestAssessmentResult(String customerProductandServiceNextBestAssessmentResult) {
    this.customerProductandServiceNextBestAssessmentResult = customerProductandServiceNextBestAssessmentResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NextBest nextBest = (NextBest) o;
    return Objects.equals(this.requestedProductandServiceProperties, nextBest.requestedProductandServiceProperties) &&
        Objects.equals(this.productServiceType, nextBest.productServiceType) &&
        Objects.equals(this.customerProductandServiceNextBestAssessmentResult, nextBest.customerProductandServiceNextBestAssessmentResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedProductandServiceProperties, productServiceType, customerProductandServiceNextBestAssessmentResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextBest {\n");
    
    sb.append("    requestedProductandServiceProperties: ").append(toIndentedString(requestedProductandServiceProperties)).append("\n");
    sb.append("    productServiceType: ").append(toIndentedString(productServiceType)).append("\n");
    sb.append("    customerProductandServiceNextBestAssessmentResult: ").append(toIndentedString(customerProductandServiceNextBestAssessmentResult)).append("\n");
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

