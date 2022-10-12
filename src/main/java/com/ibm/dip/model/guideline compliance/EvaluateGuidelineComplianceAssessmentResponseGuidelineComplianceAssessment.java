package com.ibm.dip.model.guideline compliance;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateGuidelineComplianceAssessmentResponseGuidelineComplianceAssessment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:59.203Z[GMT]")

public class EvaluateGuidelineComplianceAssessmentResponseGuidelineComplianceAssessment   {
  @JsonProperty("DocumentReference")
  private Object documentReference;

  @JsonProperty("GuidelineComplianceAssessmentWorkProducts")
  private String guidelineComplianceAssessmentWorkProducts;

  @JsonProperty("GuidelineComplianceAssessmentResult")
  private String guidelineComplianceAssessmentResult;

  public EvaluateGuidelineComplianceAssessmentResponseGuidelineComplianceAssessment documentReference(Object documentReference) {
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

  public EvaluateGuidelineComplianceAssessmentResponseGuidelineComplianceAssessment guidelineComplianceAssessmentWorkProducts(String guidelineComplianceAssessmentWorkProducts) {
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

  public EvaluateGuidelineComplianceAssessmentResponseGuidelineComplianceAssessment guidelineComplianceAssessmentResult(String guidelineComplianceAssessmentResult) {
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
    EvaluateGuidelineComplianceAssessmentResponseGuidelineComplianceAssessment evaluateGuidelineComplianceAssessmentResponseGuidelineComplianceAssessment = (EvaluateGuidelineComplianceAssessmentResponseGuidelineComplianceAssessment) o;
    return Objects.equals(this.documentReference, evaluateGuidelineComplianceAssessmentResponseGuidelineComplianceAssessment.documentReference) &&
        Objects.equals(this.guidelineComplianceAssessmentWorkProducts, evaluateGuidelineComplianceAssessmentResponseGuidelineComplianceAssessment.guidelineComplianceAssessmentWorkProducts) &&
        Objects.equals(this.guidelineComplianceAssessmentResult, evaluateGuidelineComplianceAssessmentResponseGuidelineComplianceAssessment.guidelineComplianceAssessmentResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentReference, guidelineComplianceAssessmentWorkProducts, guidelineComplianceAssessmentResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateGuidelineComplianceAssessmentResponseGuidelineComplianceAssessment {\n");
    
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

