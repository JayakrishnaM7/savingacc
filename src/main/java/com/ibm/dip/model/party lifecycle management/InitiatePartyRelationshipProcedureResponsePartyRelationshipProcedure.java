package com.ibm.dip.model.party lifecycle management;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePartyRelationshipProcedureResponsePartyRelationshipProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:32.808Z[GMT]")

public class InitiatePartyRelationshipProcedureResponsePartyRelationshipProcedure   {
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

  public InitiatePartyRelationshipProcedureResponsePartyRelationshipProcedure partyLifeCycleMaintenanceSchedule(String partyLifeCycleMaintenanceSchedule) {
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

  public InitiatePartyRelationshipProcedureResponsePartyRelationshipProcedure partyLifeCycleMaintenanceTask(String partyLifeCycleMaintenanceTask) {
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

  public InitiatePartyRelationshipProcedureResponsePartyRelationshipProcedure partyLifeCycleMaintenanceTaskType(String partyLifeCycleMaintenanceTaskType) {
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

  public InitiatePartyRelationshipProcedureResponsePartyRelationshipProcedure partyLifeCycleMaintenanceWorkProducts(String partyLifeCycleMaintenanceWorkProducts) {
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

  public InitiatePartyRelationshipProcedureResponsePartyRelationshipProcedure partyLifeCycleMaintenanceTaskResult(String partyLifeCycleMaintenanceTaskResult) {
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

  public InitiatePartyRelationshipProcedureResponsePartyRelationshipProcedure customerPrecedentProfileUpdateLog(String customerPrecedentProfileUpdateLog) {
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
    InitiatePartyRelationshipProcedureResponsePartyRelationshipProcedure initiatePartyRelationshipProcedureResponsePartyRelationshipProcedure = (InitiatePartyRelationshipProcedureResponsePartyRelationshipProcedure) o;
    return Objects.equals(this.partyLifeCycleMaintenanceSchedule, initiatePartyRelationshipProcedureResponsePartyRelationshipProcedure.partyLifeCycleMaintenanceSchedule) &&
        Objects.equals(this.partyLifeCycleMaintenanceTask, initiatePartyRelationshipProcedureResponsePartyRelationshipProcedure.partyLifeCycleMaintenanceTask) &&
        Objects.equals(this.partyLifeCycleMaintenanceTaskType, initiatePartyRelationshipProcedureResponsePartyRelationshipProcedure.partyLifeCycleMaintenanceTaskType) &&
        Objects.equals(this.partyLifeCycleMaintenanceWorkProducts, initiatePartyRelationshipProcedureResponsePartyRelationshipProcedure.partyLifeCycleMaintenanceWorkProducts) &&
        Objects.equals(this.partyLifeCycleMaintenanceTaskResult, initiatePartyRelationshipProcedureResponsePartyRelationshipProcedure.partyLifeCycleMaintenanceTaskResult) &&
        Objects.equals(this.customerPrecedentProfileUpdateLog, initiatePartyRelationshipProcedureResponsePartyRelationshipProcedure.customerPrecedentProfileUpdateLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyLifeCycleMaintenanceSchedule, partyLifeCycleMaintenanceTask, partyLifeCycleMaintenanceTaskType, partyLifeCycleMaintenanceWorkProducts, partyLifeCycleMaintenanceTaskResult, customerPrecedentProfileUpdateLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePartyRelationshipProcedureResponsePartyRelationshipProcedure {\n");
    
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

