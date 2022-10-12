package com.ibm.dip.model.party lifecycle management;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Qualification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:32.808Z[GMT]")

public class Qualification   {
  @JsonProperty("QualificationType")
  private String qualificationType;

  @JsonProperty("PublicDirectoryReference")
  private Object publicDirectoryReference;

  @JsonProperty("SpecialistAgencyServiceReference")
  private Object specialistAgencyServiceReference;

  @JsonProperty("QualificationTaskRecord")
  private String qualificationTaskRecord;

  @JsonProperty("QualificationTaskDescription")
  private String qualificationTaskDescription;

  @JsonProperty("SpecialistAgency/RegulatorServiceRequestResult")
  private String specialistAgencyRegulatorServiceRequestResult;

  @JsonProperty("DocumentDirectoryEntryInstanceReference")
  private Object documentDirectoryEntryInstanceReference;

  @JsonProperty("QualificationTaskWorkProducts")
  private String qualificationTaskWorkProducts;

  @JsonProperty("QualificationTaskResult")
  private String qualificationTaskResult;

  public Qualification qualificationType(String qualificationType) {
    this.qualificationType = qualificationType;
    return this;
  }

  /**
   * Get qualificationType
   * @return qualificationType
  */
  @ApiModelProperty(value = "")


  public String getQualificationType() {
    return qualificationType;
  }

  public void setQualificationType(String qualificationType) {
    this.qualificationType = qualificationType;
  }

  public Qualification publicDirectoryReference(Object publicDirectoryReference) {
    this.publicDirectoryReference = publicDirectoryReference;
    return this;
  }

  /**
   * Get publicDirectoryReference
   * @return publicDirectoryReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPublicDirectoryReference() {
    return publicDirectoryReference;
  }

  public void setPublicDirectoryReference(Object publicDirectoryReference) {
    this.publicDirectoryReference = publicDirectoryReference;
  }

  public Qualification specialistAgencyServiceReference(Object specialistAgencyServiceReference) {
    this.specialistAgencyServiceReference = specialistAgencyServiceReference;
    return this;
  }

  /**
   * Get specialistAgencyServiceReference
   * @return specialistAgencyServiceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSpecialistAgencyServiceReference() {
    return specialistAgencyServiceReference;
  }

  public void setSpecialistAgencyServiceReference(Object specialistAgencyServiceReference) {
    this.specialistAgencyServiceReference = specialistAgencyServiceReference;
  }

  public Qualification qualificationTaskRecord(String qualificationTaskRecord) {
    this.qualificationTaskRecord = qualificationTaskRecord;
    return this;
  }

  /**
   * Get qualificationTaskRecord
   * @return qualificationTaskRecord
  */
  @ApiModelProperty(value = "")


  public String getQualificationTaskRecord() {
    return qualificationTaskRecord;
  }

  public void setQualificationTaskRecord(String qualificationTaskRecord) {
    this.qualificationTaskRecord = qualificationTaskRecord;
  }

  public Qualification qualificationTaskDescription(String qualificationTaskDescription) {
    this.qualificationTaskDescription = qualificationTaskDescription;
    return this;
  }

  /**
   * Get qualificationTaskDescription
   * @return qualificationTaskDescription
  */
  @ApiModelProperty(value = "")


  public String getQualificationTaskDescription() {
    return qualificationTaskDescription;
  }

  public void setQualificationTaskDescription(String qualificationTaskDescription) {
    this.qualificationTaskDescription = qualificationTaskDescription;
  }

  public Qualification specialistAgencyRegulatorServiceRequestResult(String specialistAgencyRegulatorServiceRequestResult) {
    this.specialistAgencyRegulatorServiceRequestResult = specialistAgencyRegulatorServiceRequestResult;
    return this;
  }

  /**
   * Get specialistAgencyRegulatorServiceRequestResult
   * @return specialistAgencyRegulatorServiceRequestResult
  */
  @ApiModelProperty(value = "")


  public String getSpecialistAgencyRegulatorServiceRequestResult() {
    return specialistAgencyRegulatorServiceRequestResult;
  }

  public void setSpecialistAgencyRegulatorServiceRequestResult(String specialistAgencyRegulatorServiceRequestResult) {
    this.specialistAgencyRegulatorServiceRequestResult = specialistAgencyRegulatorServiceRequestResult;
  }

  public Qualification documentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    return this;
  }

  /**
   * Get documentDirectoryEntryInstanceReference
   * @return documentDirectoryEntryInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }

  public Qualification qualificationTaskWorkProducts(String qualificationTaskWorkProducts) {
    this.qualificationTaskWorkProducts = qualificationTaskWorkProducts;
    return this;
  }

  /**
   * Get qualificationTaskWorkProducts
   * @return qualificationTaskWorkProducts
  */
  @ApiModelProperty(value = "")


  public String getQualificationTaskWorkProducts() {
    return qualificationTaskWorkProducts;
  }

  public void setQualificationTaskWorkProducts(String qualificationTaskWorkProducts) {
    this.qualificationTaskWorkProducts = qualificationTaskWorkProducts;
  }

  public Qualification qualificationTaskResult(String qualificationTaskResult) {
    this.qualificationTaskResult = qualificationTaskResult;
    return this;
  }

  /**
   * Get qualificationTaskResult
   * @return qualificationTaskResult
  */
  @ApiModelProperty(value = "")


  public String getQualificationTaskResult() {
    return qualificationTaskResult;
  }

  public void setQualificationTaskResult(String qualificationTaskResult) {
    this.qualificationTaskResult = qualificationTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Qualification qualification = (Qualification) o;
    return Objects.equals(this.qualificationType, qualification.qualificationType) &&
        Objects.equals(this.publicDirectoryReference, qualification.publicDirectoryReference) &&
        Objects.equals(this.specialistAgencyServiceReference, qualification.specialistAgencyServiceReference) &&
        Objects.equals(this.qualificationTaskRecord, qualification.qualificationTaskRecord) &&
        Objects.equals(this.qualificationTaskDescription, qualification.qualificationTaskDescription) &&
        Objects.equals(this.specialistAgencyRegulatorServiceRequestResult, qualification.specialistAgencyRegulatorServiceRequestResult) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, qualification.documentDirectoryEntryInstanceReference) &&
        Objects.equals(this.qualificationTaskWorkProducts, qualification.qualificationTaskWorkProducts) &&
        Objects.equals(this.qualificationTaskResult, qualification.qualificationTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualificationType, publicDirectoryReference, specialistAgencyServiceReference, qualificationTaskRecord, qualificationTaskDescription, specialistAgencyRegulatorServiceRequestResult, documentDirectoryEntryInstanceReference, qualificationTaskWorkProducts, qualificationTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qualification {\n");
    
    sb.append("    qualificationType: ").append(toIndentedString(qualificationType)).append("\n");
    sb.append("    publicDirectoryReference: ").append(toIndentedString(publicDirectoryReference)).append("\n");
    sb.append("    specialistAgencyServiceReference: ").append(toIndentedString(specialistAgencyServiceReference)).append("\n");
    sb.append("    qualificationTaskRecord: ").append(toIndentedString(qualificationTaskRecord)).append("\n");
    sb.append("    qualificationTaskDescription: ").append(toIndentedString(qualificationTaskDescription)).append("\n");
    sb.append("    specialistAgencyRegulatorServiceRequestResult: ").append(toIndentedString(specialistAgencyRegulatorServiceRequestResult)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
    sb.append("    qualificationTaskWorkProducts: ").append(toIndentedString(qualificationTaskWorkProducts)).append("\n");
    sb.append("    qualificationTaskResult: ").append(toIndentedString(qualificationTaskResult)).append("\n");
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

