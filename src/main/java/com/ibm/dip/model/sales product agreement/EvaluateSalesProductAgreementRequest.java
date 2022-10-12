package com.ibm.dip.model.sales product agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.sales product agreement.EvaluateSalesProductAgreementRequestSalesProductAgreement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateSalesProductAgreementRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:46.196Z[GMT]")

public class EvaluateSalesProductAgreementRequest   {
  @JsonProperty("SalesProductAgreement")
  private EvaluateSalesProductAgreementRequestSalesProductAgreement salesProductAgreement;

  public EvaluateSalesProductAgreementRequest salesProductAgreement(EvaluateSalesProductAgreementRequestSalesProductAgreement salesProductAgreement) {
    this.salesProductAgreement = salesProductAgreement;
    return this;
  }

  /**
   * Get salesProductAgreement
   * @return salesProductAgreement
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateSalesProductAgreementRequestSalesProductAgreement getSalesProductAgreement() {
    return salesProductAgreement;
  }

  public void setSalesProductAgreement(EvaluateSalesProductAgreementRequestSalesProductAgreement salesProductAgreement) {
    this.salesProductAgreement = salesProductAgreement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateSalesProductAgreementRequest evaluateSalesProductAgreementRequest = (EvaluateSalesProductAgreementRequest) o;
    return Objects.equals(this.salesProductAgreement, evaluateSalesProductAgreementRequest.salesProductAgreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesProductAgreement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateSalesProductAgreementRequest {\n");
    
    sb.append("    salesProductAgreement: ").append(toIndentedString(salesProductAgreement)).append("\n");
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

