package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer offer.UpdateCorrespondenceandDocumentsRequestCorrespondenceandDocuments;
import com.ibm.dip.model.customer offer.UpdateFacilityApplicationRequestCustomerOfferProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateCorrespondenceandDocumentsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class UpdateCorrespondenceandDocumentsResponse   {
  @JsonProperty("CustomerOfferProcedure")
  private UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure;

  @JsonProperty("CorrespondenceandDocuments")
  private UpdateCorrespondenceandDocumentsRequestCorrespondenceandDocuments correspondenceandDocuments;

  public UpdateCorrespondenceandDocumentsResponse customerOfferProcedure(UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
    return this;
  }

  /**
   * Get customerOfferProcedure
   * @return customerOfferProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateFacilityApplicationRequestCustomerOfferProcedure getCustomerOfferProcedure() {
    return customerOfferProcedure;
  }

  public void setCustomerOfferProcedure(UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
  }

  public UpdateCorrespondenceandDocumentsResponse correspondenceandDocuments(UpdateCorrespondenceandDocumentsRequestCorrespondenceandDocuments correspondenceandDocuments) {
    this.correspondenceandDocuments = correspondenceandDocuments;
    return this;
  }

  /**
   * Get correspondenceandDocuments
   * @return correspondenceandDocuments
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateCorrespondenceandDocumentsRequestCorrespondenceandDocuments getCorrespondenceandDocuments() {
    return correspondenceandDocuments;
  }

  public void setCorrespondenceandDocuments(UpdateCorrespondenceandDocumentsRequestCorrespondenceandDocuments correspondenceandDocuments) {
    this.correspondenceandDocuments = correspondenceandDocuments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCorrespondenceandDocumentsResponse updateCorrespondenceandDocumentsResponse = (UpdateCorrespondenceandDocumentsResponse) o;
    return Objects.equals(this.customerOfferProcedure, updateCorrespondenceandDocumentsResponse.customerOfferProcedure) &&
        Objects.equals(this.correspondenceandDocuments, updateCorrespondenceandDocumentsResponse.correspondenceandDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedure, correspondenceandDocuments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCorrespondenceandDocumentsResponse {\n");
    
    sb.append("    customerOfferProcedure: ").append(toIndentedString(customerOfferProcedure)).append("\n");
    sb.append("    correspondenceandDocuments: ").append(toIndentedString(correspondenceandDocuments)).append("\n");
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

