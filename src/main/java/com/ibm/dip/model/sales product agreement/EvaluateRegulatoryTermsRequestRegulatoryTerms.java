package com.ibm.dip.model.sales product agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateRegulatoryTermsRequestRegulatoryTerms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:46.196Z[GMT]")

public class EvaluateRegulatoryTermsRequestRegulatoryTerms   {
  @JsonProperty("RegulatoryAuthority")
  private String regulatoryAuthority;

  @JsonProperty("ApplicableRegulationReference")
  private Object applicableRegulationReference;

  public EvaluateRegulatoryTermsRequestRegulatoryTerms regulatoryAuthority(String regulatoryAuthority) {
    this.regulatoryAuthority = regulatoryAuthority;
    return this;
  }

  /**
   * Get regulatoryAuthority
   * @return regulatoryAuthority
  */
  @ApiModelProperty(value = "")


  public String getRegulatoryAuthority() {
    return regulatoryAuthority;
  }

  public void setRegulatoryAuthority(String regulatoryAuthority) {
    this.regulatoryAuthority = regulatoryAuthority;
  }

  public EvaluateRegulatoryTermsRequestRegulatoryTerms applicableRegulationReference(Object applicableRegulationReference) {
    this.applicableRegulationReference = applicableRegulationReference;
    return this;
  }

  /**
   * Get applicableRegulationReference
   * @return applicableRegulationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getApplicableRegulationReference() {
    return applicableRegulationReference;
  }

  public void setApplicableRegulationReference(Object applicableRegulationReference) {
    this.applicableRegulationReference = applicableRegulationReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateRegulatoryTermsRequestRegulatoryTerms evaluateRegulatoryTermsRequestRegulatoryTerms = (EvaluateRegulatoryTermsRequestRegulatoryTerms) o;
    return Objects.equals(this.regulatoryAuthority, evaluateRegulatoryTermsRequestRegulatoryTerms.regulatoryAuthority) &&
        Objects.equals(this.applicableRegulationReference, evaluateRegulatoryTermsRequestRegulatoryTerms.applicableRegulationReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatoryAuthority, applicableRegulationReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateRegulatoryTermsRequestRegulatoryTerms {\n");
    
    sb.append("    regulatoryAuthority: ").append(toIndentedString(regulatoryAuthority)).append("\n");
    sb.append("    applicableRegulationReference: ").append(toIndentedString(applicableRegulationReference)).append("\n");
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

