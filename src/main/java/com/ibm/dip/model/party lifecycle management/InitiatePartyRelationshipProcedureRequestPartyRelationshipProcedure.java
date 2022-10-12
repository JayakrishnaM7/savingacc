package com.ibm.dip.model.party lifecycle management;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePartyRelationshipProcedureRequestPartyRelationshipProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:32.808Z[GMT]")

public class InitiatePartyRelationshipProcedureRequestPartyRelationshipProcedure   {
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

  public InitiatePartyRelationshipProcedureRequestPartyRelationshipProcedure customerReference(Object customerReference) {
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

  public InitiatePartyRelationshipProcedureRequestPartyRelationshipProcedure partyReference(Object partyReference) {
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

  public InitiatePartyRelationshipProcedureRequestPartyRelationshipProcedure partyRelationshipType(String partyRelationshipType) {
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

  public InitiatePartyRelationshipProcedureRequestPartyRelationshipProcedure partyLifeCycleMaintenanceSchedule(String partyLifeCycleMaintenanceSchedule) {
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

  public InitiatePartyRelationshipProcedureRequestPartyRelationshipProcedure partyLifeCycleMaintenanceTask(String partyLifeCycleMaintenanceTask) {
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

  public InitiatePartyRelationshipProcedureRequestPartyRelationshipProcedure partyLifeCycleMaintenanceTaskType(String partyLifeCycleMaintenanceTaskType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePartyRelationshipProcedureRequestPartyRelationshipProcedure initiatePartyRelationshipProcedureRequestPartyRelationshipProcedure = (InitiatePartyRelationshipProcedureRequestPartyRelationshipProcedure) o;
    return Objects.equals(this.customerReference, initiatePartyRelationshipProcedureRequestPartyRelationshipProcedure.customerReference) &&
        Objects.equals(this.partyReference, initiatePartyRelationshipProcedureRequestPartyRelationshipProcedure.partyReference) &&
        Objects.equals(this.partyRelationshipType, initiatePartyRelationshipProcedureRequestPartyRelationshipProcedure.partyRelationshipType) &&
        Objects.equals(this.partyLifeCycleMaintenanceSchedule, initiatePartyRelationshipProcedureRequestPartyRelationshipProcedure.partyLifeCycleMaintenanceSchedule) &&
        Objects.equals(this.partyLifeCycleMaintenanceTask, initiatePartyRelationshipProcedureRequestPartyRelationshipProcedure.partyLifeCycleMaintenanceTask) &&
        Objects.equals(this.partyLifeCycleMaintenanceTaskType, initiatePartyRelationshipProcedureRequestPartyRelationshipProcedure.partyLifeCycleMaintenanceTaskType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, partyReference, partyRelationshipType, partyLifeCycleMaintenanceSchedule, partyLifeCycleMaintenanceTask, partyLifeCycleMaintenanceTaskType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePartyRelationshipProcedureRequestPartyRelationshipProcedure {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    partyReference: ").append(toIndentedString(partyReference)).append("\n");
    sb.append("    partyRelationshipType: ").append(toIndentedString(partyRelationshipType)).append("\n");
    sb.append("    partyLifeCycleMaintenanceSchedule: ").append(toIndentedString(partyLifeCycleMaintenanceSchedule)).append("\n");
    sb.append("    partyLifeCycleMaintenanceTask: ").append(toIndentedString(partyLifeCycleMaintenanceTask)).append("\n");
    sb.append("    partyLifeCycleMaintenanceTaskType: ").append(toIndentedString(partyLifeCycleMaintenanceTaskType)).append("\n");
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

