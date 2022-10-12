package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerOfferProcedureRequestCustomerOfferProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class InitiateCustomerOfferProcedureRequestCustomerOfferProcedure   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("PartyReference")
  private Object partyReference;

  @JsonProperty("ProductandServiceType")
  private String productandServiceType;

  @JsonProperty("CustomerOfferProcessingSchedule")
  private String customerOfferProcessingSchedule;

  @JsonProperty("CustomerOfferProcessingTask")
  private String customerOfferProcessingTask;

  @JsonProperty("CustomerOfferProcessingTaskType")
  private String customerOfferProcessingTaskType;

  @JsonProperty("EmployeeOrBusinessUnitReference")
  private Object employeeOrBusinessUnitReference;

  public InitiateCustomerOfferProcedureRequestCustomerOfferProcedure customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public InitiateCustomerOfferProcedureRequestCustomerOfferProcedure partyReference(Object partyReference) {
    this.partyReference = partyReference;
    return this;
  }

  /**
   * Get partyReference
   * @return partyReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(Object partyReference) {
    this.partyReference = partyReference;
  }

  public InitiateCustomerOfferProcedureRequestCustomerOfferProcedure productandServiceType(String productandServiceType) {
    this.productandServiceType = productandServiceType;
    return this;
  }

  /**
   * Get productandServiceType
   * @return productandServiceType
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceType() {
    return productandServiceType;
  }

  public void setProductandServiceType(String productandServiceType) {
    this.productandServiceType = productandServiceType;
  }

  public InitiateCustomerOfferProcedureRequestCustomerOfferProcedure customerOfferProcessingSchedule(String customerOfferProcessingSchedule) {
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

  public InitiateCustomerOfferProcedureRequestCustomerOfferProcedure customerOfferProcessingTask(String customerOfferProcessingTask) {
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

  public InitiateCustomerOfferProcedureRequestCustomerOfferProcedure customerOfferProcessingTaskType(String customerOfferProcessingTaskType) {
    this.customerOfferProcessingTaskType = customerOfferProcessingTaskType;
    return this;
  }

  /**
   * Get customerOfferProcessingTaskType
   * @return customerOfferProcessingTaskType
  */
  @ApiModelProperty(value = "")


  public String getCustomerOfferProcessingTaskType() {
    return customerOfferProcessingTaskType;
  }

  public void setCustomerOfferProcessingTaskType(String customerOfferProcessingTaskType) {
    this.customerOfferProcessingTaskType = customerOfferProcessingTaskType;
  }

  public InitiateCustomerOfferProcedureRequestCustomerOfferProcedure employeeOrBusinessUnitReference(Object employeeOrBusinessUnitReference) {
    this.employeeOrBusinessUnitReference = employeeOrBusinessUnitReference;
    return this;
  }

  /**
   * Get employeeOrBusinessUnitReference
   * @return employeeOrBusinessUnitReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeeOrBusinessUnitReference() {
    return employeeOrBusinessUnitReference;
  }

  public void setEmployeeOrBusinessUnitReference(Object employeeOrBusinessUnitReference) {
    this.employeeOrBusinessUnitReference = employeeOrBusinessUnitReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCustomerOfferProcedureRequestCustomerOfferProcedure initiateCustomerOfferProcedureRequestCustomerOfferProcedure = (InitiateCustomerOfferProcedureRequestCustomerOfferProcedure) o;
    return Objects.equals(this.customerReference, initiateCustomerOfferProcedureRequestCustomerOfferProcedure.customerReference) &&
        Objects.equals(this.partyReference, initiateCustomerOfferProcedureRequestCustomerOfferProcedure.partyReference) &&
        Objects.equals(this.productandServiceType, initiateCustomerOfferProcedureRequestCustomerOfferProcedure.productandServiceType) &&
        Objects.equals(this.customerOfferProcessingSchedule, initiateCustomerOfferProcedureRequestCustomerOfferProcedure.customerOfferProcessingSchedule) &&
        Objects.equals(this.customerOfferProcessingTask, initiateCustomerOfferProcedureRequestCustomerOfferProcedure.customerOfferProcessingTask) &&
        Objects.equals(this.customerOfferProcessingTaskType, initiateCustomerOfferProcedureRequestCustomerOfferProcedure.customerOfferProcessingTaskType) &&
        Objects.equals(this.employeeOrBusinessUnitReference, initiateCustomerOfferProcedureRequestCustomerOfferProcedure.employeeOrBusinessUnitReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, partyReference, productandServiceType, customerOfferProcessingSchedule, customerOfferProcessingTask, customerOfferProcessingTaskType, employeeOrBusinessUnitReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerOfferProcedureRequestCustomerOfferProcedure {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    partyReference: ").append(toIndentedString(partyReference)).append("\n");
    sb.append("    productandServiceType: ").append(toIndentedString(productandServiceType)).append("\n");
    sb.append("    customerOfferProcessingSchedule: ").append(toIndentedString(customerOfferProcessingSchedule)).append("\n");
    sb.append("    customerOfferProcessingTask: ").append(toIndentedString(customerOfferProcessingTask)).append("\n");
    sb.append("    customerOfferProcessingTaskType: ").append(toIndentedString(customerOfferProcessingTaskType)).append("\n");
    sb.append("    employeeOrBusinessUnitReference: ").append(toIndentedString(employeeOrBusinessUnitReference)).append("\n");
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

