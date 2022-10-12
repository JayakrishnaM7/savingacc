package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OutboundWithResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:56.799Z[GMT]")

public class OutboundWithResponse   {
  @JsonProperty("ResponseDueDate")
  private String responseDueDate;

  @JsonProperty("ResponseCorrespondenceReference")
  private Object responseCorrespondenceReference;

  @JsonProperty("ResponseCorrespondenceRecord")
  private String responseCorrespondenceRecord;

  public OutboundWithResponse responseDueDate(String responseDueDate) {
    this.responseDueDate = responseDueDate;
    return this;
  }

  /**
   * Get responseDueDate
   * @return responseDueDate
  */
  @ApiModelProperty(value = "")


  public String getResponseDueDate() {
    return responseDueDate;
  }

  public void setResponseDueDate(String responseDueDate) {
    this.responseDueDate = responseDueDate;
  }

  public OutboundWithResponse responseCorrespondenceReference(Object responseCorrespondenceReference) {
    this.responseCorrespondenceReference = responseCorrespondenceReference;
    return this;
  }

  /**
   * Get responseCorrespondenceReference
   * @return responseCorrespondenceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getResponseCorrespondenceReference() {
    return responseCorrespondenceReference;
  }

  public void setResponseCorrespondenceReference(Object responseCorrespondenceReference) {
    this.responseCorrespondenceReference = responseCorrespondenceReference;
  }

  public OutboundWithResponse responseCorrespondenceRecord(String responseCorrespondenceRecord) {
    this.responseCorrespondenceRecord = responseCorrespondenceRecord;
    return this;
  }

  /**
   * Get responseCorrespondenceRecord
   * @return responseCorrespondenceRecord
  */
  @ApiModelProperty(value = "")


  public String getResponseCorrespondenceRecord() {
    return responseCorrespondenceRecord;
  }

  public void setResponseCorrespondenceRecord(String responseCorrespondenceRecord) {
    this.responseCorrespondenceRecord = responseCorrespondenceRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundWithResponse outboundWithResponse = (OutboundWithResponse) o;
    return Objects.equals(this.responseDueDate, outboundWithResponse.responseDueDate) &&
        Objects.equals(this.responseCorrespondenceReference, outboundWithResponse.responseCorrespondenceReference) &&
        Objects.equals(this.responseCorrespondenceRecord, outboundWithResponse.responseCorrespondenceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseDueDate, responseCorrespondenceReference, responseCorrespondenceRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundWithResponse {\n");
    
    sb.append("    responseDueDate: ").append(toIndentedString(responseDueDate)).append("\n");
    sb.append("    responseCorrespondenceReference: ").append(toIndentedString(responseCorrespondenceReference)).append("\n");
    sb.append("    responseCorrespondenceRecord: ").append(toIndentedString(responseCorrespondenceRecord)).append("\n");
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

