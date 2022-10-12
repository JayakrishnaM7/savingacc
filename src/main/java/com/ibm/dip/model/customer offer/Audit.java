package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Audit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class Audit   {
  @JsonProperty("GuidelineComplianceCheckType")
  private String guidelineComplianceCheckType;

  @JsonProperty("GuidelineComplianceCheckRequirement")
  private String guidelineComplianceCheckRequirement;

  @JsonProperty("GuidelineComplianceCheckSubmission")
  private String guidelineComplianceCheckSubmission;

  @JsonProperty("GuidelineComplianceAdjustmentRequirement")
  private String guidelineComplianceAdjustmentRequirement;

  @JsonProperty("GuidelineComplianceCheckAssessment")
  private String guidelineComplianceCheckAssessment;

  public Audit guidelineComplianceCheckType(String guidelineComplianceCheckType) {
    this.guidelineComplianceCheckType = guidelineComplianceCheckType;
    return this;
  }

  /**
   * Get guidelineComplianceCheckType
   * @return guidelineComplianceCheckType
  */
  @ApiModelProperty(value = "")


  public String getGuidelineComplianceCheckType() {
    return guidelineComplianceCheckType;
  }

  public void setGuidelineComplianceCheckType(String guidelineComplianceCheckType) {
    this.guidelineComplianceCheckType = guidelineComplianceCheckType;
  }

  public Audit guidelineComplianceCheckRequirement(String guidelineComplianceCheckRequirement) {
    this.guidelineComplianceCheckRequirement = guidelineComplianceCheckRequirement;
    return this;
  }

  /**
   * Get guidelineComplianceCheckRequirement
   * @return guidelineComplianceCheckRequirement
  */
  @ApiModelProperty(value = "")


  public String getGuidelineComplianceCheckRequirement() {
    return guidelineComplianceCheckRequirement;
  }

  public void setGuidelineComplianceCheckRequirement(String guidelineComplianceCheckRequirement) {
    this.guidelineComplianceCheckRequirement = guidelineComplianceCheckRequirement;
  }

  public Audit guidelineComplianceCheckSubmission(String guidelineComplianceCheckSubmission) {
    this.guidelineComplianceCheckSubmission = guidelineComplianceCheckSubmission;
    return this;
  }

  /**
   * Get guidelineComplianceCheckSubmission
   * @return guidelineComplianceCheckSubmission
  */
  @ApiModelProperty(value = "")


  public String getGuidelineComplianceCheckSubmission() {
    return guidelineComplianceCheckSubmission;
  }

  public void setGuidelineComplianceCheckSubmission(String guidelineComplianceCheckSubmission) {
    this.guidelineComplianceCheckSubmission = guidelineComplianceCheckSubmission;
  }

  public Audit guidelineComplianceAdjustmentRequirement(String guidelineComplianceAdjustmentRequirement) {
    this.guidelineComplianceAdjustmentRequirement = guidelineComplianceAdjustmentRequirement;
    return this;
  }

  /**
   * Get guidelineComplianceAdjustmentRequirement
   * @return guidelineComplianceAdjustmentRequirement
  */
  @ApiModelProperty(value = "")


  public String getGuidelineComplianceAdjustmentRequirement() {
    return guidelineComplianceAdjustmentRequirement;
  }

  public void setGuidelineComplianceAdjustmentRequirement(String guidelineComplianceAdjustmentRequirement) {
    this.guidelineComplianceAdjustmentRequirement = guidelineComplianceAdjustmentRequirement;
  }

  public Audit guidelineComplianceCheckAssessment(String guidelineComplianceCheckAssessment) {
    this.guidelineComplianceCheckAssessment = guidelineComplianceCheckAssessment;
    return this;
  }

  /**
   * Get guidelineComplianceCheckAssessment
   * @return guidelineComplianceCheckAssessment
  */
  @ApiModelProperty(value = "")


  public String getGuidelineComplianceCheckAssessment() {
    return guidelineComplianceCheckAssessment;
  }

  public void setGuidelineComplianceCheckAssessment(String guidelineComplianceCheckAssessment) {
    this.guidelineComplianceCheckAssessment = guidelineComplianceCheckAssessment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Audit audit = (Audit) o;
    return Objects.equals(this.guidelineComplianceCheckType, audit.guidelineComplianceCheckType) &&
        Objects.equals(this.guidelineComplianceCheckRequirement, audit.guidelineComplianceCheckRequirement) &&
        Objects.equals(this.guidelineComplianceCheckSubmission, audit.guidelineComplianceCheckSubmission) &&
        Objects.equals(this.guidelineComplianceAdjustmentRequirement, audit.guidelineComplianceAdjustmentRequirement) &&
        Objects.equals(this.guidelineComplianceCheckAssessment, audit.guidelineComplianceCheckAssessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guidelineComplianceCheckType, guidelineComplianceCheckRequirement, guidelineComplianceCheckSubmission, guidelineComplianceAdjustmentRequirement, guidelineComplianceCheckAssessment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Audit {\n");
    
    sb.append("    guidelineComplianceCheckType: ").append(toIndentedString(guidelineComplianceCheckType)).append("\n");
    sb.append("    guidelineComplianceCheckRequirement: ").append(toIndentedString(guidelineComplianceCheckRequirement)).append("\n");
    sb.append("    guidelineComplianceCheckSubmission: ").append(toIndentedString(guidelineComplianceCheckSubmission)).append("\n");
    sb.append("    guidelineComplianceAdjustmentRequirement: ").append(toIndentedString(guidelineComplianceAdjustmentRequirement)).append("\n");
    sb.append("    guidelineComplianceCheckAssessment: ").append(toIndentedString(guidelineComplianceCheckAssessment)).append("\n");
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

