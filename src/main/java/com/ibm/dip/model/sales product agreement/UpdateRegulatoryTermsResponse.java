package com.ibm.dip.model.sales product agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.sales product agreement.EvaluateRegulatoryTermsRequestRegulatoryTerms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateRegulatoryTermsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:46.196Z[GMT]")

public class UpdateRegulatoryTermsResponse   {
  @JsonProperty("RegulatoryTerms")
  private EvaluateRegulatoryTermsRequestRegulatoryTerms regulatoryTerms;

  public UpdateRegulatoryTermsResponse regulatoryTerms(EvaluateRegulatoryTermsRequestRegulatoryTerms regulatoryTerms) {
    this.regulatoryTerms = regulatoryTerms;
    return this;
  }

  /**
   * Get regulatoryTerms
   * @return regulatoryTerms
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateRegulatoryTermsRequestRegulatoryTerms getRegulatoryTerms() {
    return regulatoryTerms;
  }

  public void setRegulatoryTerms(EvaluateRegulatoryTermsRequestRegulatoryTerms regulatoryTerms) {
    this.regulatoryTerms = regulatoryTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRegulatoryTermsResponse updateRegulatoryTermsResponse = (UpdateRegulatoryTermsResponse) o;
    return Objects.equals(this.regulatoryTerms, updateRegulatoryTermsResponse.regulatoryTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatoryTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRegulatoryTermsResponse {\n");
    
    sb.append("    regulatoryTerms: ").append(toIndentedString(regulatoryTerms)).append("\n");
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

