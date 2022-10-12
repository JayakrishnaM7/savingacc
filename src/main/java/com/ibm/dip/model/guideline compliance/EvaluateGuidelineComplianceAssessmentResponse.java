package com.ibm.dip.model.guideline compliance;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.guideline compliance.EvaluateGuidelineComplianceAssessmentResponseGuidelineComplianceAssessment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateGuidelineComplianceAssessmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:59.203Z[GMT]")

public class EvaluateGuidelineComplianceAssessmentResponse   {
  @JsonProperty("GuidelineComplianceAssessment")
  private EvaluateGuidelineComplianceAssessmentResponseGuidelineComplianceAssessment guidelineComplianceAssessment;

  public EvaluateGuidelineComplianceAssessmentResponse guidelineComplianceAssessment(EvaluateGuidelineComplianceAssessmentResponseGuidelineComplianceAssessment guidelineComplianceAssessment) {
    this.guidelineComplianceAssessment = guidelineComplianceAssessment;
    return this;
  }

  /**
   * Get guidelineComplianceAssessment
   * @return guidelineComplianceAssessment
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateGuidelineComplianceAssessmentResponseGuidelineComplianceAssessment getGuidelineComplianceAssessment() {
    return guidelineComplianceAssessment;
  }

  public void setGuidelineComplianceAssessment(EvaluateGuidelineComplianceAssessmentResponseGuidelineComplianceAssessment guidelineComplianceAssessment) {
    this.guidelineComplianceAssessment = guidelineComplianceAssessment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateGuidelineComplianceAssessmentResponse evaluateGuidelineComplianceAssessmentResponse = (EvaluateGuidelineComplianceAssessmentResponse) o;
    return Objects.equals(this.guidelineComplianceAssessment, evaluateGuidelineComplianceAssessmentResponse.guidelineComplianceAssessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guidelineComplianceAssessment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateGuidelineComplianceAssessmentResponse {\n");
    
    sb.append("    guidelineComplianceAssessment: ").append(toIndentedString(guidelineComplianceAssessment)).append("\n");
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

