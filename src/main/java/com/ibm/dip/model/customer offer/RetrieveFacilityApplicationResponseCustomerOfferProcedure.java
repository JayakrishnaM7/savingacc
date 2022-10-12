package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveFacilityApplicationResponseCustomerOfferProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class RetrieveFacilityApplicationResponseCustomerOfferProcedure   {
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

  @JsonProperty("CustomerOfferProcessingTaskWorkProducts")
  private String customerOfferProcessingTaskWorkProducts;

  @JsonProperty("CustomerOfferProcessingTaskResult")
  private String customerOfferProcessingTaskResult;

  public RetrieveFacilityApplicationResponseCustomerOfferProcedure customerReference(Object customerReference) {
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

  public RetrieveFacilityApplicationResponseCustomerOfferProcedure partyReference(Object partyReference) {
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

  public RetrieveFacilityApplicationResponseCustomerOfferProcedure productandServiceType(String productandServiceType) {
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

  public RetrieveFacilityApplicationResponseCustomerOfferProcedure customerOfferProcessingSchedule(String customerOfferProcessingSchedule) {
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

  public RetrieveFacilityApplicationResponseCustomerOfferProcedure customerOfferProcessingTask(String customerOfferProcessingTask) {
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

  public RetrieveFacilityApplicationResponseCustomerOfferProcedure customerOfferProcessingTaskType(String customerOfferProcessingTaskType) {
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

  public RetrieveFacilityApplicationResponseCustomerOfferProcedure employeeOrBusinessUnitReference(Object employeeOrBusinessUnitReference) {
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

  public RetrieveFacilityApplicationResponseCustomerOfferProcedure customerOfferProcessingTaskWorkProducts(String customerOfferProcessingTaskWorkProducts) {
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

  public RetrieveFacilityApplicationResponseCustomerOfferProcedure customerOfferProcessingTaskResult(String customerOfferProcessingTaskResult) {
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
    RetrieveFacilityApplicationResponseCustomerOfferProcedure retrieveFacilityApplicationResponseCustomerOfferProcedure = (RetrieveFacilityApplicationResponseCustomerOfferProcedure) o;
    return Objects.equals(this.customerReference, retrieveFacilityApplicationResponseCustomerOfferProcedure.customerReference) &&
        Objects.equals(this.partyReference, retrieveFacilityApplicationResponseCustomerOfferProcedure.partyReference) &&
        Objects.equals(this.productandServiceType, retrieveFacilityApplicationResponseCustomerOfferProcedure.productandServiceType) &&
        Objects.equals(this.customerOfferProcessingSchedule, retrieveFacilityApplicationResponseCustomerOfferProcedure.customerOfferProcessingSchedule) &&
        Objects.equals(this.customerOfferProcessingTask, retrieveFacilityApplicationResponseCustomerOfferProcedure.customerOfferProcessingTask) &&
        Objects.equals(this.customerOfferProcessingTaskType, retrieveFacilityApplicationResponseCustomerOfferProcedure.customerOfferProcessingTaskType) &&
        Objects.equals(this.employeeOrBusinessUnitReference, retrieveFacilityApplicationResponseCustomerOfferProcedure.employeeOrBusinessUnitReference) &&
        Objects.equals(this.customerOfferProcessingTaskWorkProducts, retrieveFacilityApplicationResponseCustomerOfferProcedure.customerOfferProcessingTaskWorkProducts) &&
        Objects.equals(this.customerOfferProcessingTaskResult, retrieveFacilityApplicationResponseCustomerOfferProcedure.customerOfferProcessingTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, partyReference, productandServiceType, customerOfferProcessingSchedule, customerOfferProcessingTask, customerOfferProcessingTaskType, employeeOrBusinessUnitReference, customerOfferProcessingTaskWorkProducts, customerOfferProcessingTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveFacilityApplicationResponseCustomerOfferProcedure {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    partyReference: ").append(toIndentedString(partyReference)).append("\n");
    sb.append("    productandServiceType: ").append(toIndentedString(productandServiceType)).append("\n");
    sb.append("    customerOfferProcessingSchedule: ").append(toIndentedString(customerOfferProcessingSchedule)).append("\n");
    sb.append("    customerOfferProcessingTask: ").append(toIndentedString(customerOfferProcessingTask)).append("\n");
    sb.append("    customerOfferProcessingTaskType: ").append(toIndentedString(customerOfferProcessingTaskType)).append("\n");
    sb.append("    employeeOrBusinessUnitReference: ").append(toIndentedString(employeeOrBusinessUnitReference)).append("\n");
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

