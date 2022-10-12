package com.ibm.dip.model.party reference data directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecutePartyReferenceDataDirectoryEntryRequestDemographics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:30.500Z[GMT]")

public class ExecutePartyReferenceDataDirectoryEntryRequestDemographics   {
  @JsonProperty("Socio-EconomicClassification")
  private String socioEconomicClassification;

  @JsonProperty("EthnicityOrReligion")
  private String ethnicityOrReligion;

  @JsonProperty("Employment")
  private String employment;

  @JsonProperty("EmploymentHistory")
  private String employmentHistory;

  @JsonProperty("EducationHistory")
  private String educationHistory;

  @JsonProperty("ServicingConstraints")
  private String servicingConstraints;

  public ExecutePartyReferenceDataDirectoryEntryRequestDemographics socioEconomicClassification(String socioEconomicClassification) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestDemographics ethnicityOrReligion(String ethnicityOrReligion) {
    this.ethnicityOrReligion = ethnicityOrReligion;
    return this;
  }

  /**
   * Get ethnicityOrReligion
   * @return ethnicityOrReligion
  */
  @ApiModelProperty(value = "")


  public String getEthnicityOrReligion() {
    return ethnicityOrReligion;
  }

  public void setEthnicityOrReligion(String ethnicityOrReligion) {
    this.ethnicityOrReligion = ethnicityOrReligion;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestDemographics employment(String employment) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestDemographics employmentHistory(String employmentHistory) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestDemographics educationHistory(String educationHistory) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestDemographics servicingConstraints(String servicingConstraints) {
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
    ExecutePartyReferenceDataDirectoryEntryRequestDemographics executePartyReferenceDataDirectoryEntryRequestDemographics = (ExecutePartyReferenceDataDirectoryEntryRequestDemographics) o;
    return Objects.equals(this.socioEconomicClassification, executePartyReferenceDataDirectoryEntryRequestDemographics.socioEconomicClassification) &&
        Objects.equals(this.ethnicityOrReligion, executePartyReferenceDataDirectoryEntryRequestDemographics.ethnicityOrReligion) &&
        Objects.equals(this.employment, executePartyReferenceDataDirectoryEntryRequestDemographics.employment) &&
        Objects.equals(this.employmentHistory, executePartyReferenceDataDirectoryEntryRequestDemographics.employmentHistory) &&
        Objects.equals(this.educationHistory, executePartyReferenceDataDirectoryEntryRequestDemographics.educationHistory) &&
        Objects.equals(this.servicingConstraints, executePartyReferenceDataDirectoryEntryRequestDemographics.servicingConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socioEconomicClassification, ethnicityOrReligion, employment, employmentHistory, educationHistory, servicingConstraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutePartyReferenceDataDirectoryEntryRequestDemographics {\n");
    
    sb.append("    socioEconomicClassification: ").append(toIndentedString(socioEconomicClassification)).append("\n");
    sb.append("    ethnicityOrReligion: ").append(toIndentedString(ethnicityOrReligion)).append("\n");
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

