package com.ibm.dip.model.party lifecycle management;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Authentication
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:32.808Z[GMT]")

public class Authentication   {
  @JsonProperty("AuthenticationType")
  private String authenticationType;

  @JsonProperty("PublicDirectoryReference")
  private Object publicDirectoryReference;

  @JsonProperty("SpecialistAgencyServiceReference")
  private Object specialistAgencyServiceReference;

  @JsonProperty("AuthenticationTaskRecord")
  private String authenticationTaskRecord;

  @JsonProperty("AuthenticationTaskDescription")
  private String authenticationTaskDescription;

  @JsonProperty("SpecialistAgencyServiceRequestResult")
  private String specialistAgencyServiceRequestResult;

  @JsonProperty("DocumentDirectoryEntryInstanceReference")
  private Object documentDirectoryEntryInstanceReference;

  @JsonProperty("AuthenticationTaskWorkProducts")
  private String authenticationTaskWorkProducts;

  @JsonProperty("AuthenticationTaskResult")
  private String authenticationTaskResult;

  public Authentication authenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

  /**
   * Get authenticationType
   * @return authenticationType
  */
  @ApiModelProperty(value = "")


  public String getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }

  public Authentication publicDirectoryReference(Object publicDirectoryReference) {
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

  public Authentication specialistAgencyServiceReference(Object specialistAgencyServiceReference) {
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

  public Authentication authenticationTaskRecord(String authenticationTaskRecord) {
    this.authenticationTaskRecord = authenticationTaskRecord;
    return this;
  }

  /**
   * Get authenticationTaskRecord
   * @return authenticationTaskRecord
  */
  @ApiModelProperty(value = "")


  public String getAuthenticationTaskRecord() {
    return authenticationTaskRecord;
  }

  public void setAuthenticationTaskRecord(String authenticationTaskRecord) {
    this.authenticationTaskRecord = authenticationTaskRecord;
  }

  public Authentication authenticationTaskDescription(String authenticationTaskDescription) {
    this.authenticationTaskDescription = authenticationTaskDescription;
    return this;
  }

  /**
   * Get authenticationTaskDescription
   * @return authenticationTaskDescription
  */
  @ApiModelProperty(value = "")


  public String getAuthenticationTaskDescription() {
    return authenticationTaskDescription;
  }

  public void setAuthenticationTaskDescription(String authenticationTaskDescription) {
    this.authenticationTaskDescription = authenticationTaskDescription;
  }

  public Authentication specialistAgencyServiceRequestResult(String specialistAgencyServiceRequestResult) {
    this.specialistAgencyServiceRequestResult = specialistAgencyServiceRequestResult;
    return this;
  }

  /**
   * Get specialistAgencyServiceRequestResult
   * @return specialistAgencyServiceRequestResult
  */
  @ApiModelProperty(value = "")


  public String getSpecialistAgencyServiceRequestResult() {
    return specialistAgencyServiceRequestResult;
  }

  public void setSpecialistAgencyServiceRequestResult(String specialistAgencyServiceRequestResult) {
    this.specialistAgencyServiceRequestResult = specialistAgencyServiceRequestResult;
  }

  public Authentication documentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
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

  public Authentication authenticationTaskWorkProducts(String authenticationTaskWorkProducts) {
    this.authenticationTaskWorkProducts = authenticationTaskWorkProducts;
    return this;
  }

  /**
   * Get authenticationTaskWorkProducts
   * @return authenticationTaskWorkProducts
  */
  @ApiModelProperty(value = "")


  public String getAuthenticationTaskWorkProducts() {
    return authenticationTaskWorkProducts;
  }

  public void setAuthenticationTaskWorkProducts(String authenticationTaskWorkProducts) {
    this.authenticationTaskWorkProducts = authenticationTaskWorkProducts;
  }

  public Authentication authenticationTaskResult(String authenticationTaskResult) {
    this.authenticationTaskResult = authenticationTaskResult;
    return this;
  }

  /**
   * Get authenticationTaskResult
   * @return authenticationTaskResult
  */
  @ApiModelProperty(value = "")


  public String getAuthenticationTaskResult() {
    return authenticationTaskResult;
  }

  public void setAuthenticationTaskResult(String authenticationTaskResult) {
    this.authenticationTaskResult = authenticationTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authentication authentication = (Authentication) o;
    return Objects.equals(this.authenticationType, authentication.authenticationType) &&
        Objects.equals(this.publicDirectoryReference, authentication.publicDirectoryReference) &&
        Objects.equals(this.specialistAgencyServiceReference, authentication.specialistAgencyServiceReference) &&
        Objects.equals(this.authenticationTaskRecord, authentication.authenticationTaskRecord) &&
        Objects.equals(this.authenticationTaskDescription, authentication.authenticationTaskDescription) &&
        Objects.equals(this.specialistAgencyServiceRequestResult, authentication.specialistAgencyServiceRequestResult) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, authentication.documentDirectoryEntryInstanceReference) &&
        Objects.equals(this.authenticationTaskWorkProducts, authentication.authenticationTaskWorkProducts) &&
        Objects.equals(this.authenticationTaskResult, authentication.authenticationTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationType, publicDirectoryReference, specialistAgencyServiceReference, authenticationTaskRecord, authenticationTaskDescription, specialistAgencyServiceRequestResult, documentDirectoryEntryInstanceReference, authenticationTaskWorkProducts, authenticationTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authentication {\n");
    
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    publicDirectoryReference: ").append(toIndentedString(publicDirectoryReference)).append("\n");
    sb.append("    specialistAgencyServiceReference: ").append(toIndentedString(specialistAgencyServiceReference)).append("\n");
    sb.append("    authenticationTaskRecord: ").append(toIndentedString(authenticationTaskRecord)).append("\n");
    sb.append("    authenticationTaskDescription: ").append(toIndentedString(authenticationTaskDescription)).append("\n");
    sb.append("    specialistAgencyServiceRequestResult: ").append(toIndentedString(specialistAgencyServiceRequestResult)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
    sb.append("    authenticationTaskWorkProducts: ").append(toIndentedString(authenticationTaskWorkProducts)).append("\n");
    sb.append("    authenticationTaskResult: ").append(toIndentedString(authenticationTaskResult)).append("\n");
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

