package com.ibm.dip.model.sales product agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateLegalTermsRequestLegalTerms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:46.196Z[GMT]")

public class UpdateLegalTermsRequestLegalTerms   {
  @JsonProperty("Jurisdiction")
  private String jurisdiction;

  @JsonProperty("ApplicableLawReference")
  private Object applicableLawReference;

  public UpdateLegalTermsRequestLegalTerms jurisdiction(String jurisdiction) {
    this.jurisdiction = jurisdiction;
    return this;
  }

  /**
   * Get jurisdiction
   * @return jurisdiction
  */
  @ApiModelProperty(value = "")


  public String getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(String jurisdiction) {
    this.jurisdiction = jurisdiction;
  }

  public UpdateLegalTermsRequestLegalTerms applicableLawReference(Object applicableLawReference) {
    this.applicableLawReference = applicableLawReference;
    return this;
  }

  /**
   * Get applicableLawReference
   * @return applicableLawReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getApplicableLawReference() {
    return applicableLawReference;
  }

  public void setApplicableLawReference(Object applicableLawReference) {
    this.applicableLawReference = applicableLawReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLegalTermsRequestLegalTerms updateLegalTermsRequestLegalTerms = (UpdateLegalTermsRequestLegalTerms) o;
    return Objects.equals(this.jurisdiction, updateLegalTermsRequestLegalTerms.jurisdiction) &&
        Objects.equals(this.applicableLawReference, updateLegalTermsRequestLegalTerms.applicableLawReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jurisdiction, applicableLawReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLegalTermsRequestLegalTerms {\n");
    
    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
    sb.append("    applicableLawReference: ").append(toIndentedString(applicableLawReference)).append("\n");
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

