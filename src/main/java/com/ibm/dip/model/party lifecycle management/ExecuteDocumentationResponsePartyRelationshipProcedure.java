package com.ibm.dip.model.party lifecycle management;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteDocumentationResponsePartyRelationshipProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:32.808Z[GMT]")

public class ExecuteDocumentationResponsePartyRelationshipProcedure   {
  @JsonProperty("PartyLife-cycleMaintenanceSchedule")
  private String partyLifeCycleMaintenanceSchedule;

  @JsonProperty("PartyLife-cycleMaintenanceTask")
  private String partyLifeCycleMaintenanceTask;

  @JsonProperty("PartyLife-cycleMaintenanceWorkProducts")
  private String partyLifeCycleMaintenanceWorkProducts;

  @JsonProperty("PartyLife-cycleMaintenanceTaskResult")
  private String partyLifeCycleMaintenanceTaskResult;

  @JsonProperty("CustomerPrecedentProfileUpdateLog")
  private String customerPrecedentProfileUpdateLog;

  public ExecuteDocumentationResponsePartyRelationshipProcedure partyLifeCycleMaintenanceSchedule(String partyLifeCycleMaintenanceSchedule) {
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

  public ExecuteDocumentationResponsePartyRelationshipProcedure partyLifeCycleMaintenanceTask(String partyLifeCycleMaintenanceTask) {
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

  public ExecuteDocumentationResponsePartyRelationshipProcedure partyLifeCycleMaintenanceWorkProducts(String partyLifeCycleMaintenanceWorkProducts) {
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

  public ExecuteDocumentationResponsePartyRelationshipProcedure partyLifeCycleMaintenanceTaskResult(String partyLifeCycleMaintenanceTaskResult) {
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

  public ExecuteDocumentationResponsePartyRelationshipProcedure customerPrecedentProfileUpdateLog(String customerPrecedentProfileUpdateLog) {
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
    ExecuteDocumentationResponsePartyRelationshipProcedure executeDocumentationResponsePartyRelationshipProcedure = (ExecuteDocumentationResponsePartyRelationshipProcedure) o;
    return Objects.equals(this.partyLifeCycleMaintenanceSchedule, executeDocumentationResponsePartyRelationshipProcedure.partyLifeCycleMaintenanceSchedule) &&
        Objects.equals(this.partyLifeCycleMaintenanceTask, executeDocumentationResponsePartyRelationshipProcedure.partyLifeCycleMaintenanceTask) &&
        Objects.equals(this.partyLifeCycleMaintenanceWorkProducts, executeDocumentationResponsePartyRelationshipProcedure.partyLifeCycleMaintenanceWorkProducts) &&
        Objects.equals(this.partyLifeCycleMaintenanceTaskResult, executeDocumentationResponsePartyRelationshipProcedure.partyLifeCycleMaintenanceTaskResult) &&
        Objects.equals(this.customerPrecedentProfileUpdateLog, executeDocumentationResponsePartyRelationshipProcedure.customerPrecedentProfileUpdateLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyLifeCycleMaintenanceSchedule, partyLifeCycleMaintenanceTask, partyLifeCycleMaintenanceWorkProducts, partyLifeCycleMaintenanceTaskResult, customerPrecedentProfileUpdateLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteDocumentationResponsePartyRelationshipProcedure {\n");
    
    sb.append("    partyLifeCycleMaintenanceSchedule: ").append(toIndentedString(partyLifeCycleMaintenanceSchedule)).append("\n");
    sb.append("    partyLifeCycleMaintenanceTask: ").append(toIndentedString(partyLifeCycleMaintenanceTask)).append("\n");
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

