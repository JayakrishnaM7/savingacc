package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerOfferProcedureResponseCustomerOfferProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class InitiateCustomerOfferProcedureResponseCustomerOfferProcedure   {
  @JsonProperty("CustomerOfferProcessingSchedule")
  private String customerOfferProcessingSchedule;

  @JsonProperty("CustomerOfferProcessingTask")
  private String customerOfferProcessingTask;

  @JsonProperty("CustomerOfferProcessingTaskWorkProducts")
  private String customerOfferProcessingTaskWorkProducts;

  @JsonProperty("CustomerOfferProcessingTaskResult")
  private String customerOfferProcessingTaskResult;

  public InitiateCustomerOfferProcedureResponseCustomerOfferProcedure customerOfferProcessingSchedule(String customerOfferProcessingSchedule) {
    this.customerOfferProcessingSchedule = customerOfferProcessingSchedule;
    return this;
  }

  /**
   * Get customerOfferProcessingSchedule
   * @return customerOfferProcessingSchedule
  */
  @ApiModelProperty(value = "")


  public String getCustomerOfferProcessingSchedule() {
    return customerOfferProcessingSchedule;
  }

  public void setCustomerOfferProcessingSchedule(String customerOfferProcessingSchedule) {
    this.customerOfferProcessingSchedule = customerOfferProcessingSchedule;
  }

  public InitiateCustomerOfferProcedureResponseCustomerOfferProcedure customerOfferProcessingTask(String customerOfferProcessingTask) {
    this.customerOfferProcessingTask = customerOfferProcessingTask;
    return this;
  }

  /**
   * Get customerOfferProcessingTask
   * @return customerOfferProcessingTask
  */
  @ApiModelProperty(value = "")


  public String getCustomerOfferProcessingTask() {
    return customerOfferProcessingTask;
  }

  public void setCustomerOfferProcessingTask(String customerOfferProcessingTask) {
    this.customerOfferProcessingTask = customerOfferProcessingTask;
  }

  public InitiateCustomerOfferProcedureResponseCustomerOfferProcedure customerOfferProcessingTaskWorkProducts(String customerOfferProcessingTaskWorkProducts) {
    this.customerOfferProcessingTaskWorkProducts = customerOfferProcessingTaskWorkProducts;
    return this;
  }

  /**
   * Get customerOfferProcessingTaskWorkProducts
   * @return customerOfferProcessingTaskWorkProducts
  */
  @ApiModelProperty(value = "")


  public String getCustomerOfferProcessingTaskWorkProducts() {
    return customerOfferProcessingTaskWorkProducts;
  }

  public void setCustomerOfferProcessingTaskWorkProducts(String customerOfferProcessingTaskWorkProducts) {
    this.customerOfferProcessingTaskWorkProducts = customerOfferProcessingTaskWorkProducts;
  }

  public InitiateCustomerOfferProcedureResponseCustomerOfferProcedure customerOfferProcessingTaskResult(String customerOfferProcessingTaskResult) {
    this.customerOfferProcessingTaskResult = customerOfferProcessingTaskResult;
    return this;
  }

  /**
   * Get customerOfferProcessingTaskResult
   * @return customerOfferProcessingTaskResult
  */
  @ApiModelProperty(value = "")


  public String getCustomerOfferProcessingTaskResult() {
    return customerOfferProcessingTaskResult;
  }

  public void setCustomerOfferProcessingTaskResult(String customerOfferProcessingTaskResult) {
    this.customerOfferProcessingTaskResult = customerOfferProcessingTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCustomerOfferProcedureResponseCustomerOfferProcedure initiateCustomerOfferProcedureResponseCustomerOfferProcedure = (InitiateCustomerOfferProcedureResponseCustomerOfferProcedure) o;
    return Objects.equals(this.customerOfferProcessingSchedule, initiateCustomerOfferProcedureResponseCustomerOfferProcedure.customerOfferProcessingSchedule) &&
        Objects.equals(this.customerOfferProcessingTask, initiateCustomerOfferProcedureResponseCustomerOfferProcedure.customerOfferProcessingTask) &&
        Objects.equals(this.customerOfferProcessingTaskWorkProducts, initiateCustomerOfferProcedureResponseCustomerOfferProcedure.customerOfferProcessingTaskWorkProducts) &&
        Objects.equals(this.customerOfferProcessingTaskResult, initiateCustomerOfferProcedureResponseCustomerOfferProcedure.customerOfferProcessingTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcessingSchedule, customerOfferProcessingTask, customerOfferProcessingTaskWorkProducts, customerOfferProcessingTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerOfferProcedureResponseCustomerOfferProcedure {\n");
    
    sb.append("    customerOfferProcessingSchedule: ").append(toIndentedString(customerOfferProcessingSchedule)).append("\n");
    sb.append("    customerOfferProcessingTask: ").append(toIndentedString(customerOfferProcessingTask)).append("\n");
    sb.append("    customerOfferProcessingTaskWorkProducts: ").append(toIndentedString(customerOfferProcessingTaskWorkProducts)).append("\n");
    sb.append("    customerOfferProcessingTaskResult: ").append(toIndentedString(customerOfferProcessingTaskResult)).append("\n");
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

