package com.ibm.dip.model.savings account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.savings account.InitiateIssuedDeviceRequestIssuedDevice;
import com.ibm.dip.model.savings account.InitiateIssuedDeviceRequestSavingsAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateIssuedDeviceRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:38.895Z[GMT]")

public class InitiateIssuedDeviceRequest   {
  @JsonProperty("SavingsAccountFacility")
  private InitiateIssuedDeviceRequestSavingsAccountFacility savingsAccountFacility;

  @JsonProperty("IssuedDevice")
  private InitiateIssuedDeviceRequestIssuedDevice issuedDevice;

  public InitiateIssuedDeviceRequest savingsAccountFacility(InitiateIssuedDeviceRequestSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
    return this;
  }

  /**
   * Get savingsAccountFacility
   * @return savingsAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateIssuedDeviceRequestSavingsAccountFacility getSavingsAccountFacility() {
    return savingsAccountFacility;
  }

  public void setSavingsAccountFacility(InitiateIssuedDeviceRequestSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
  }

  public InitiateIssuedDeviceRequest issuedDevice(InitiateIssuedDeviceRequestIssuedDevice issuedDevice) {
    this.issuedDevice = issuedDevice;
    return this;
  }

  /**
   * Get issuedDevice
   * @return issuedDevice
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateIssuedDeviceRequestIssuedDevice getIssuedDevice() {
    return issuedDevice;
  }

  public void setIssuedDevice(InitiateIssuedDeviceRequestIssuedDevice issuedDevice) {
    this.issuedDevice = issuedDevice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateIssuedDeviceRequest initiateIssuedDeviceRequest = (InitiateIssuedDeviceRequest) o;
    return Objects.equals(this.savingsAccountFacility, initiateIssuedDeviceRequest.savingsAccountFacility) &&
        Objects.equals(this.issuedDevice, initiateIssuedDeviceRequest.issuedDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savingsAccountFacility, issuedDevice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateIssuedDeviceRequest {\n");
    
    sb.append("    savingsAccountFacility: ").append(toIndentedString(savingsAccountFacility)).append("\n");
    sb.append("    issuedDevice: ").append(toIndentedString(issuedDevice)).append("\n");
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

