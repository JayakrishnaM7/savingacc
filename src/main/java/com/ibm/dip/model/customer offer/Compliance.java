package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Compliance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class Compliance   {
  @JsonProperty("RegulatoryComplianceCheckType")
  private String regulatoryComplianceCheckType;

  @JsonProperty("RegulatoryComplianceCheckRequirement")
  private String regulatoryComplianceCheckRequirement;

  @JsonProperty("RegulatoryComplianceCheckSubmission")
  private String regulatoryComplianceCheckSubmission;

  @JsonProperty("RegulatoryComplianceAdjustmentRequirement")
  private String regulatoryComplianceAdjustmentRequirement;

  @JsonProperty("RegulatoryComplianceCheckAssessment")
  private String regulatoryComplianceCheckAssessment;

  public Compliance regulatoryComplianceCheckType(String regulatoryComplianceCheckType) {
    this.regulatoryComplianceCheckType = regulatoryComplianceCheckType;
    return this;
  }

  /**
   * Get regulatoryComplianceCheckType
   * @return regulatoryComplianceCheckType
  */
  @ApiModelProperty(value = "")


  public String getRegulatoryComplianceCheckType() {
    return regulatoryComplianceCheckType;
  }

  public void setRegulatoryComplianceCheckType(String regulatoryComplianceCheckType) {
    this.regulatoryComplianceCheckType = regulatoryComplianceCheckType;
  }

  public Compliance regulatoryComplianceCheckRequirement(String regulatoryComplianceCheckRequirement) {
    this.regulatoryComplianceCheckRequirement = regulatoryComplianceCheckRequirement;
    return this;
  }

  /**
   * Get regulatoryComplianceCheckRequirement
   * @return regulatoryComplianceCheckRequirement
  */
  @ApiModelProperty(value = "")


  public String getRegulatoryComplianceCheckRequirement() {
    return regulatoryComplianceCheckRequirement;
  }

  public void setRegulatoryComplianceCheckRequirement(String regulatoryComplianceCheckRequirement) {
    this.regulatoryComplianceCheckRequirement = regulatoryComplianceCheckRequirement;
  }

  public Compliance regulatoryComplianceCheckSubmission(String regulatoryComplianceCheckSubmission) {
    this.regulatoryComplianceCheckSubmission = regulatoryComplianceCheckSubmission;
    return this;
  }

  /**
   * Get regulatoryComplianceCheckSubmission
   * @return regulatoryComplianceCheckSubmission
  */
  @ApiModelProperty(value = "")


  public String getRegulatoryComplianceCheckSubmission() {
    return regulatoryComplianceCheckSubmission;
  }

  public void setRegulatoryComplianceCheckSubmission(String regulatoryComplianceCheckSubmission) {
    this.regulatoryComplianceCheckSubmission = regulatoryComplianceCheckSubmission;
  }

  public Compliance regulatoryComplianceAdjustmentRequirement(String regulatoryComplianceAdjustmentRequirement) {
    this.regulatoryComplianceAdjustmentRequirement = regulatoryComplianceAdjustmentRequirement;
    return this;
  }

  /**
   * Get regulatoryComplianceAdjustmentRequirement
   * @return regulatoryComplianceAdjustmentRequirement
  */
  @ApiModelProperty(value = "")


  public String getRegulatoryComplianceAdjustmentRequirement() {
    return regulatoryComplianceAdjustmentRequirement;
  }

  public void setRegulatoryComplianceAdjustmentRequirement(String regulatoryComplianceAdjustmentRequirement) {
    this.regulatoryComplianceAdjustmentRequirement = regulatoryComplianceAdjustmentRequirement;
  }

  public Compliance regulatoryComplianceCheckAssessment(String regulatoryComplianceCheckAssessment) {
    this.regulatoryComplianceCheckAssessment = regulatoryComplianceCheckAssessment;
    return this;
  }

  /**
   * Get regulatoryComplianceCheckAssessment
   * @return regulatoryComplianceCheckAssessment
  */
  @ApiModelProperty(value = "")


  public String getRegulatoryComplianceCheckAssessment() {
    return regulatoryComplianceCheckAssessment;
  }

  public void setRegulatoryComplianceCheckAssessment(String regulatoryComplianceCheckAssessment) {
    this.regulatoryComplianceCheckAssessment = regulatoryComplianceCheckAssessment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Compliance compliance = (Compliance) o;
    return Objects.equals(this.regulatoryComplianceCheckType, compliance.regulatoryComplianceCheckType) &&
        Objects.equals(this.regulatoryComplianceCheckRequirement, compliance.regulatoryComplianceCheckRequirement) &&
        Objects.equals(this.regulatoryComplianceCheckSubmission, compliance.regulatoryComplianceCheckSubmission) &&
        Objects.equals(this.regulatoryComplianceAdjustmentRequirement, compliance.regulatoryComplianceAdjustmentRequirement) &&
        Objects.equals(this.regulatoryComplianceCheckAssessment, compliance.regulatoryComplianceCheckAssessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatoryComplianceCheckType, regulatoryComplianceCheckRequirement, regulatoryComplianceCheckSubmission, regulatoryComplianceAdjustmentRequirement, regulatoryComplianceCheckAssessment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Compliance {\n");
    
    sb.append("    regulatoryComplianceCheckType: ").append(toIndentedString(regulatoryComplianceCheckType)).append("\n");
    sb.append("    regulatoryComplianceCheckRequirement: ").append(toIndentedString(regulatoryComplianceCheckRequirement)).append("\n");
    sb.append("    regulatoryComplianceCheckSubmission: ").append(toIndentedString(regulatoryComplianceCheckSubmission)).append("\n");
    sb.append("    regulatoryComplianceAdjustmentRequirement: ").append(toIndentedString(regulatoryComplianceAdjustmentRequirement)).append("\n");
    sb.append("    regulatoryComplianceCheckAssessment: ").append(toIndentedString(regulatoryComplianceCheckAssessment)).append("\n");
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

