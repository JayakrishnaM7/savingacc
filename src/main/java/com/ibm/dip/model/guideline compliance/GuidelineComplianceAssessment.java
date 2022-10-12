package com.ibm.dip.model.guideline compliance;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GuidelineComplianceAssessment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:59.203Z[GMT]")

public class GuidelineComplianceAssessment   {
  @JsonProperty("GuidelineComplianceAssessmentType")
  private String guidelineComplianceAssessmentType;

  @JsonProperty("BusinessUnitReference")
  private Object businessUnitReference;

  @JsonProperty("ProductandServiceReference")
  private Object productandServiceReference;

  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("DocumentReference")
  private Object documentReference;

  @JsonProperty("GuidelineComplianceAssessmentWorkProducts")
  private String guidelineComplianceAssessmentWorkProducts;

  @JsonProperty("GuidelineComplianceAssessmentResult")
  private String guidelineComplianceAssessmentResult;

  public GuidelineComplianceAssessment guidelineComplianceAssessmentType(String guidelineComplianceAssessmentType) {
    this.guidelineComplianceAssessmentType = guidelineComplianceAssessmentType;
    return this;
  }

  /**
   * Get guidelineComplianceAssessmentType
   * @return guidelineComplianceAssessmentType
  */
  @ApiModelProperty(value = "")


  public String getGuidelineComplianceAssessmentType() {
    return guidelineComplianceAssessmentType;
  }

  public void setGuidelineComplianceAssessmentType(String guidelineComplianceAssessmentType) {
    this.guidelineComplianceAssessmentType = guidelineComplianceAssessmentType;
  }

  public GuidelineComplianceAssessment businessUnitReference(Object businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
    return this;
  }

  /**
   * Get businessUnitReference
   * @return businessUnitReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(Object businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }

  public GuidelineComplianceAssessment productandServiceReference(Object productandServiceReference) {
    this.productandServiceReference = productandServiceReference;
    return this;
  }

  /**
   * Get productandServiceReference
   * @return productandServiceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductandServiceReference() {
    return productandServiceReference;
  }

  public void setProductandServiceReference(Object productandServiceReference) {
    this.productandServiceReference = productandServiceReference;
  }

  public GuidelineComplianceAssessment customerReference(Object customerReference) {
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

  public GuidelineComplianceAssessment documentReference(Object documentReference) {
    this.documentReference = documentReference;
    return this;
  }

  /**
   * Get documentReference
   * @return documentReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(Object documentReference) {
    this.documentReference = documentReference;
  }

  public GuidelineComplianceAssessment guidelineComplianceAssessmentWorkProducts(String guidelineComplianceAssessmentWorkProducts) {
    this.guidelineComplianceAssessmentWorkProducts = guidelineComplianceAssessmentWorkProducts;
    return this;
  }

  /**
   * Get guidelineComplianceAssessmentWorkProducts
   * @return guidelineComplianceAssessmentWorkProducts
  */
  @ApiModelProperty(value = "")


  public String getGuidelineComplianceAssessmentWorkProducts() {
    return guidelineComplianceAssessmentWorkProducts;
  }

  public void setGuidelineComplianceAssessmentWorkProducts(String guidelineComplianceAssessmentWorkProducts) {
    this.guidelineComplianceAssessmentWorkProducts = guidelineComplianceAssessmentWorkProducts;
  }

  public GuidelineComplianceAssessment guidelineComplianceAssessmentResult(String guidelineComplianceAssessmentResult) {
    this.guidelineComplianceAssessmentResult = guidelineComplianceAssessmentResult;
    return this;
  }

  /**
   * Get guidelineComplianceAssessmentResult
   * @return guidelineComplianceAssessmentResult
  */
  @ApiModelProperty(value = "")


  public String getGuidelineComplianceAssessmentResult() {
    return guidelineComplianceAssessmentResult;
  }

  public void setGuidelineComplianceAssessmentResult(String guidelineComplianceAssessmentResult) {
    this.guidelineComplianceAssessmentResult = guidelineComplianceAssessmentResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuidelineComplianceAssessment guidelineComplianceAssessment = (GuidelineComplianceAssessment) o;
    return Objects.equals(this.guidelineComplianceAssessmentType, guidelineComplianceAssessment.guidelineComplianceAssessmentType) &&
        Objects.equals(this.businessUnitReference, guidelineComplianceAssessment.businessUnitReference) &&
        Objects.equals(this.productandServiceReference, guidelineComplianceAssessment.productandServiceReference) &&
        Objects.equals(this.customerReference, guidelineComplianceAssessment.customerReference) &&
        Objects.equals(this.documentReference, guidelineComplianceAssessment.documentReference) &&
        Objects.equals(this.guidelineComplianceAssessmentWorkProducts, guidelineComplianceAssessment.guidelineComplianceAssessmentWorkProducts) &&
        Objects.equals(this.guidelineComplianceAssessmentResult, guidelineComplianceAssessment.guidelineComplianceAssessmentResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guidelineComplianceAssessmentType, businessUnitReference, productandServiceReference, customerReference, documentReference, guidelineComplianceAssessmentWorkProducts, guidelineComplianceAssessmentResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuidelineComplianceAssessment {\n");
    
    sb.append("    guidelineComplianceAssessmentType: ").append(toIndentedString(guidelineComplianceAssessmentType)).append("\n");
    sb.append("    businessUnitReference: ").append(toIndentedString(businessUnitReference)).append("\n");
    sb.append("    productandServiceReference: ").append(toIndentedString(productandServiceReference)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    documentReference: ").append(toIndentedString(documentReference)).append("\n");
    sb.append("    guidelineComplianceAssessmentWorkProducts: ").append(toIndentedString(guidelineComplianceAssessmentWorkProducts)).append("\n");
    sb.append("    guidelineComplianceAssessmentResult: ").append(toIndentedString(guidelineComplianceAssessmentResult)).append("\n");
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

