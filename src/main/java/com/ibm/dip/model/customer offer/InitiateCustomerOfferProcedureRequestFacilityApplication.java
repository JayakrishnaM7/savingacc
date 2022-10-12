package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerOfferProcedureRequestFacilityApplication
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class InitiateCustomerOfferProcedureRequestFacilityApplication   {
  @JsonProperty("FacilityOptionSetting")
  private String facilityOptionSetting;

  public InitiateCustomerOfferProcedureRequestFacilityApplication facilityOptionSetting(String facilityOptionSetting) {
    this.facilityOptionSetting = facilityOptionSetting;
    return this;
  }

  /**
   * Get facilityOptionSetting
   * @return facilityOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getFacilityOptionSetting() {
    return facilityOptionSetting;
  }

  public void setFacilityOptionSetting(String facilityOptionSetting) {
    this.facilityOptionSetting = facilityOptionSetting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCustomerOfferProcedureRequestFacilityApplication initiateCustomerOfferProcedureRequestFacilityApplication = (InitiateCustomerOfferProcedureRequestFacilityApplication) o;
    return Objects.equals(this.facilityOptionSetting, initiateCustomerOfferProcedureRequestFacilityApplication.facilityOptionSetting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facilityOptionSetting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerOfferProcedureRequestFacilityApplication {\n");
    
    sb.append("    facilityOptionSetting: ").append(toIndentedString(facilityOptionSetting)).append("\n");
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

