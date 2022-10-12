package com.ibm.dip.model.party lifecycle management;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PartyRelationshipProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:32.808Z[GMT]")

public class PartyRelationshipProcedure   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("PartyReference")
  private Object partyReference;

  @JsonProperty("PartyRelationshipType")
  private String partyRelationshipType;

  @JsonProperty("PartyLife-cycleMaintenanceSchedule")
  private String partyLifeCycleMaintenanceSchedule;

  @JsonProperty("PartyLife-cycleMaintenanceTask")
  private String partyLifeCycleMaintenanceTask;

  @JsonProperty("PartyLife-cycleMaintenanceTaskType")
  private String partyLifeCycleMaintenanceTaskType;

  @JsonProperty("PartyLife-cycleMaintenanceWorkProducts")
  private String partyLifeCycleMaintenanceWorkProducts;

  @JsonProperty("PartyLife-cycleMaintenanceTaskResult")
  private String partyLifeCycleMaintenanceTaskResult;

  @JsonProperty("CustomerPrecedentProfileUpdateLog")
  private String customerPrecedentProfileUpdateLog;

  public PartyRelationshipProcedure customerReference(Object customerReference) {
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

  public PartyRelationshipProcedure partyReference(Object partyReference) {
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

  public PartyRelationshipProcedure partyRelationshipType(String partyRelationshipType) {
    this.partyRelationshipType = partyRelationshipType;
    return this;
  }

  /**
   * Get partyRelationshipType
   * @return partyRelationshipType
  */
  @ApiModelProperty(value = "")


  public String getPartyRelationshipType() {
    return partyRelationshipType;
  }

  public void setPartyRelationshipType(String partyRelationshipType) {
    this.partyRelationshipType = partyRelationshipType;
  }

  public PartyRelationshipProcedure partyLifeCycleMaintenanceSchedule(String partyLifeCycleMaintenanceSchedule) {
    this.partyLifeCycleMaintenanceSchedule = partyLifeCycleMaintenanceSchedule;
    return this;
  }

  /**
   * Get partyLifeCycleMaintenanceSchedule
   * @return partyLifeCycleMaintenanceSchedule
  */
  @ApiModelProperty(value = "")


  public String getPartyLifeCycleMaintenanceSchedule() {
    return partyLifeCycleMaintenanceSchedule;
  }

  public void setPartyLifeCycleMaintenanceSchedule(String partyLifeCycleMaintenanceSchedule) {
    this.partyLifeCycleMaintenanceSchedule = partyLifeCycleMaintenanceSchedule;
  }

  public PartyRelationshipProcedure partyLifeCycleMaintenanceTask(String partyLifeCycleMaintenanceTask) {
    this.partyLifeCycleMaintenanceTask = partyLifeCycleMaintenanceTask;
    return this;
  }

  /**
   * Get partyLifeCycleMaintenanceTask
   * @return partyLifeCycleMaintenanceTask
  */
  @ApiModelProperty(value = "")


  public String getPartyLifeCycleMaintenanceTask() {
    return partyLifeCycleMaintenanceTask;
  }

  public void setPartyLifeCycleMaintenanceTask(String partyLifeCycleMaintenanceTask) {
    this.partyLifeCycleMaintenanceTask = partyLifeCycleMaintenanceTask;
  }

  public PartyRelationshipProcedure partyLifeCycleMaintenanceTaskType(String partyLifeCycleMaintenanceTaskType) {
    this.partyLifeCycleMaintenanceTaskType = partyLifeCycleMaintenanceTaskType;
    return this;
  }

  /**
   * Get partyLifeCycleMaintenanceTaskType
   * @return partyLifeCycleMaintenanceTaskType
  */
  @ApiModelProperty(value = "")


  public String getPartyLifeCycleMaintenanceTaskType() {
    return partyLifeCycleMaintenanceTaskType;
  }

  public void setPartyLifeCycleMaintenanceTaskType(String partyLifeCycleMaintenanceTaskType) {
    this.partyLifeCycleMaintenanceTaskType = partyLifeCycleMaintenanceTaskType;
  }

  public PartyRelationshipProcedure partyLifeCycleMaintenanceWorkProducts(String partyLifeCycleMaintenanceWorkProducts) {
    this.partyLifeCycleMaintenanceWorkProducts = partyLifeCycleMaintenanceWorkProducts;
    return this;
  }

  /**
   * Get partyLifeCycleMaintenanceWorkProducts
   * @return partyLifeCycleMaintenanceWorkProducts
  */
  @ApiModelProperty(value = "")


  public String getPartyLifeCycleMaintenanceWorkProducts() {
    return partyLifeCycleMaintenanceWorkProducts;
  }

  public void setPartyLifeCycleMaintenanceWorkProducts(String partyLifeCycleMaintenanceWorkProducts) {
    this.partyLifeCycleMaintenanceWorkProducts = partyLifeCycleMaintenanceWorkProducts;
  }

  public PartyRelationshipProcedure partyLifeCycleMaintenanceTaskResult(String partyLifeCycleMaintenanceTaskResult) {
    this.partyLifeCycleMaintenanceTaskResult = partyLifeCycleMaintenanceTaskResult;
    return this;
  }

  /**
   * Get partyLifeCycleMaintenanceTaskResult
   * @return partyLifeCycleMaintenanceTaskResult
  */
  @ApiModelProperty(value = "")


  public String getPartyLifeCycleMaintenanceTaskResult() {
    return partyLifeCycleMaintenanceTaskResult;
  }

  public void setPartyLifeCycleMaintenanceTaskResult(String partyLifeCycleMaintenanceTaskResult) {
    this.partyLifeCycleMaintenanceTaskResult = partyLifeCycleMaintenanceTaskResult;
  }

  public PartyRelationshipProcedure customerPrecedentProfileUpdateLog(String customerPrecedentProfileUpdateLog) {
    this.customerPrecedentProfileUpdateLog = customerPrecedentProfileUpdateLog;
    return this;
  }

  /**
   * Get customerPrecedentProfileUpdateLog
   * @return customerPrecedentProfileUpdateLog
  */
  @ApiModelProperty(value = "")


  public String getCustomerPrecedentProfileUpdateLog() {
    return customerPrecedentProfileUpdateLog;
  }

  public void setCustomerPrecedentProfileUpdateLog(String customerPrecedentProfileUpdateLog) {
    this.customerPrecedentProfileUpdateLog = customerPrecedentProfileUpdateLog;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyRelationshipProcedure partyRelationshipProcedure = (PartyRelationshipProcedure) o;
    return Objects.equals(this.customerReference, partyRelationshipProcedure.customerReference) &&
        Objects.equals(this.partyReference, partyRelationshipProcedure.partyReference) &&
        Objects.equals(this.partyRelationshipType, partyRelationshipProcedure.partyRelationshipType) &&
        Objects.equals(this.partyLifeCycleMaintenanceSchedule, partyRelationshipProcedure.partyLifeCycleMaintenanceSchedule) &&
        Objects.equals(this.partyLifeCycleMaintenanceTask, partyRelationshipProcedure.partyLifeCycleMaintenanceTask) &&
        Objects.equals(this.partyLifeCycleMaintenanceTaskType, partyRelationshipProcedure.partyLifeCycleMaintenanceTaskType) &&
        Objects.equals(this.partyLifeCycleMaintenanceWorkProducts, partyRelationshipProcedure.partyLifeCycleMaintenanceWorkProducts) &&
        Objects.equals(this.partyLifeCycleMaintenanceTaskResult, partyRelationshipProcedure.partyLifeCycleMaintenanceTaskResult) &&
        Objects.equals(this.customerPrecedentProfileUpdateLog, partyRelationshipProcedure.customerPrecedentProfileUpdateLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, partyReference, partyRelationshipType, partyLifeCycleMaintenanceSchedule, partyLifeCycleMaintenanceTask, partyLifeCycleMaintenanceTaskType, partyLifeCycleMaintenanceWorkProducts, partyLifeCycleMaintenanceTaskResult, customerPrecedentProfileUpdateLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyRelationshipProcedure {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    partyReference: ").append(toIndentedString(partyReference)).append("\n");
    sb.append("    partyRelationshipType: ").append(toIndentedString(partyRelationshipType)).append("\n");
    sb.append("    partyLifeCycleMaintenanceSchedule: ").append(toIndentedString(partyLifeCycleMaintenanceSchedule)).append("\n");
    sb.append("    partyLifeCycleMaintenanceTask: ").append(toIndentedString(partyLifeCycleMaintenanceTask)).append("\n");
    sb.append("    partyLifeCycleMaintenanceTaskType: ").append(toIndentedString(partyLifeCycleMaintenanceTaskType)).append("\n");
    sb.append("    partyLifeCycleMaintenanceWorkProducts: ").append(toIndentedString(partyLifeCycleMaintenanceWorkProducts)).append("\n");
    sb.append("    partyLifeCycleMaintenanceTaskResult: ").append(toIndentedString(partyLifeCycleMaintenanceTaskResult)).append("\n");
    sb.append("    customerPrecedentProfileUpdateLog: ").append(toIndentedString(customerPrecedentProfileUpdateLog)).append("\n");
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

