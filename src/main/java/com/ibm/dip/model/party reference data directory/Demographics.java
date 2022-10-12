package com.ibm.dip.model.party reference data directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Demographics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:30.500Z[GMT]")

public class Demographics   {
  @JsonProperty("Socio-EconomicClassification")
  private String socioEconomicClassification;

  @JsonProperty("Ethnicity/Religion")
  private String ethnicityReligion;

  @JsonProperty("Employment")
  private String employment;

  @JsonProperty("EmploymentHistory")
  private String employmentHistory;

  @JsonProperty("EducationHistory")
  private String educationHistory;

  @JsonProperty("ServicingConstraints")
  private String servicingConstraints;

  public Demographics socioEconomicClassification(String socioEconomicClassification) {
    this.socioEconomicClassification = socioEconomicClassification;
    return this;
  }

  /**
   * Get socioEconomicClassification
   * @return socioEconomicClassification
  */
  @ApiModelProperty(value = "")


  public String getSocioEconomicClassification() {
    return socioEconomicClassification;
  }

  public void setSocioEconomicClassification(String socioEconomicClassification) {
    this.socioEconomicClassification = socioEconomicClassification;
  }

  public Demographics ethnicityReligion(String ethnicityReligion) {
    this.ethnicityReligion = ethnicityReligion;
    return this;
  }

  /**
   * Get ethnicityReligion
   * @return ethnicityReligion
  */
  @ApiModelProperty(value = "")


  public String getEthnicityReligion() {
    return ethnicityReligion;
  }

  public void setEthnicityReligion(String ethnicityReligion) {
    this.ethnicityReligion = ethnicityReligion;
  }

  public Demographics employment(String employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
  */
  @ApiModelProperty(value = "")


  public String getEmployment() {
    return employment;
  }

  public void setEmployment(String employment) {
    this.employment = employment;
  }

  public Demographics employmentHistory(String employmentHistory) {
    this.employmentHistory = employmentHistory;
    return this;
  }

  /**
   * Get employmentHistory
   * @return employmentHistory
  */
  @ApiModelProperty(value = "")


  public String getEmploymentHistory() {
    return employmentHistory;
  }

  public void setEmploymentHistory(String employmentHistory) {
    this.employmentHistory = employmentHistory;
  }

  public Demographics educationHistory(String educationHistory) {
    this.educationHistory = educationHistory;
    return this;
  }

  /**
   * Get educationHistory
   * @return educationHistory
  */
  @ApiModelProperty(value = "")


  public String getEducationHistory() {
    return educationHistory;
  }

  public void setEducationHistory(String educationHistory) {
    this.educationHistory = educationHistory;
  }

  public Demographics servicingConstraints(String servicingConstraints) {
    this.servicingConstraints = servicingConstraints;
    return this;
  }

  /**
   * Get servicingConstraints
   * @return servicingConstraints
  */
  @ApiModelProperty(value = "")


  public String getServicingConstraints() {
    return servicingConstraints;
  }

  public void setServicingConstraints(String servicingConstraints) {
    this.servicingConstraints = servicingConstraints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Demographics demographics = (Demographics) o;
    return Objects.equals(this.socioEconomicClassification, demographics.socioEconomicClassification) &&
        Objects.equals(this.ethnicityReligion, demographics.ethnicityReligion) &&
        Objects.equals(this.employment, demographics.employment) &&
        Objects.equals(this.employmentHistory, demographics.employmentHistory) &&
        Objects.equals(this.educationHistory, demographics.educationHistory) &&
        Objects.equals(this.servicingConstraints, demographics.servicingConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socioEconomicClassification, ethnicityReligion, employment, employmentHistory, educationHistory, servicingConstraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Demographics {\n");
    
    sb.append("    socioEconomicClassification: ").append(toIndentedString(socioEconomicClassification)).append("\n");
    sb.append("    ethnicityReligion: ").append(toIndentedString(ethnicityReligion)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    employmentHistory: ").append(toIndentedString(employmentHistory)).append("\n");
    sb.append("    educationHistory: ").append(toIndentedString(educationHistory)).append("\n");
    sb.append("    servicingConstraints: ").append(toIndentedString(servicingConstraints)).append("\n");
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

