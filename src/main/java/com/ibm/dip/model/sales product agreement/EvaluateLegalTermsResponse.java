package com.ibm.dip.model.sales product agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.sales product agreement.EvaluateLegalTermsResponseLegalTerms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateLegalTermsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:46.196Z[GMT]")

public class EvaluateLegalTermsResponse   {
  @JsonProperty("LegalTerms")
  private EvaluateLegalTermsResponseLegalTerms legalTerms;

  public EvaluateLegalTermsResponse legalTerms(EvaluateLegalTermsResponseLegalTerms legalTerms) {
    this.legalTerms = legalTerms;
    return this;
  }

  /**
   * Get legalTerms
   * @return legalTerms
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateLegalTermsResponseLegalTerms getLegalTerms() {
    return legalTerms;
  }

  public void setLegalTerms(EvaluateLegalTermsResponseLegalTerms legalTerms) {
    this.legalTerms = legalTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateLegalTermsResponse evaluateLegalTermsResponse = (EvaluateLegalTermsResponse) o;
    return Objects.equals(this.legalTerms, evaluateLegalTermsResponse.legalTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateLegalTermsResponse {\n");
    
    sb.append("    legalTerms: ").append(toIndentedString(legalTerms)).append("\n");
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

