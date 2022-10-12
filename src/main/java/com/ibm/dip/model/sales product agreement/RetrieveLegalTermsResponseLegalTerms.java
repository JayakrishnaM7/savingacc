package com.ibm.dip.model.sales product agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveLegalTermsResponseLegalTerms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:46.196Z[GMT]")

public class RetrieveLegalTermsResponseLegalTerms   {
  @JsonProperty("ApplicableLawReference")
  private Object applicableLawReference;

  @JsonProperty("ApplicableLawInterpretation")
  private String applicableLawInterpretation;

  public RetrieveLegalTermsResponseLegalTerms applicableLawReference(Object applicableLawReference) {
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

  public RetrieveLegalTermsResponseLegalTerms applicableLawInterpretation(String applicableLawInterpretation) {
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
    RetrieveLegalTermsResponseLegalTerms retrieveLegalTermsResponseLegalTerms = (RetrieveLegalTermsResponseLegalTerms) o;
    return Objects.equals(this.applicableLawReference, retrieveLegalTermsResponseLegalTerms.applicableLawReference) &&
        Objects.equals(this.applicableLawInterpretation, retrieveLegalTermsResponseLegalTerms.applicableLawInterpretation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicableLawReference, applicableLawInterpretation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveLegalTermsResponseLegalTerms {\n");
    
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

