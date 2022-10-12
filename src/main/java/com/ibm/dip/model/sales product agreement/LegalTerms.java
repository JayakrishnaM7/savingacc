package com.ibm.dip.model.sales product agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LegalTerms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:46.196Z[GMT]")

public class LegalTerms   {
  @JsonProperty("Jurisdiction")
  private String jurisdiction;

  @JsonProperty("ApplicableLawReference")
  private Object applicableLawReference;

  @JsonProperty("ApplicableLawInterpretation")
  private String applicableLawInterpretation;

  public LegalTerms jurisdiction(String jurisdiction) {
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

  public LegalTerms applicableLawReference(Object applicableLawReference) {
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

  public LegalTerms applicableLawInterpretation(String applicableLawInterpretation) {
    this.applicableLawInterpretation = applicableLawInterpretation;
    return this;
  }

  /**
   * Get applicableLawInterpretation
   * @return applicableLawInterpretation
  */
  @ApiModelProperty(value = "")


  public String getApplicableLawInterpretation() {
    return applicableLawInterpretation;
  }

  public void setApplicableLawInterpretation(String applicableLawInterpretation) {
    this.applicableLawInterpretation = applicableLawInterpretation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalTerms legalTerms = (LegalTerms) o;
    return Objects.equals(this.jurisdiction, legalTerms.jurisdiction) &&
        Objects.equals(this.applicableLawReference, legalTerms.applicableLawReference) &&
        Objects.equals(this.applicableLawInterpretation, legalTerms.applicableLawInterpretation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jurisdiction, applicableLawReference, applicableLawInterpretation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalTerms {\n");
    
    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
    sb.append("    applicableLawReference: ").append(toIndentedString(applicableLawReference)).append("\n");
    sb.append("    applicableLawInterpretation: ").append(toIndentedString(applicableLawInterpretation)).append("\n");
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

