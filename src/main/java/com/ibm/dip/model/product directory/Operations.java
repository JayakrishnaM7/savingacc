package com.ibm.dip.model.product directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Operations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:44.300Z[GMT]")

public class Operations   {
  @JsonProperty("ProductandServiceOperatingSchedule")
  private String productandServiceOperatingSchedule;

  @JsonProperty("ProductandServiceConfigurationParameterType")
  private String productandServiceConfigurationParameterType;

  @JsonProperty("ProductandServiceConfigurationParameterDescription")
  private String productandServiceConfigurationParameterDescription;

  @JsonProperty("ProductandServiceConfigurationParameterSetting")
  private String productandServiceConfigurationParameterSetting;

  public Operations productandServiceOperatingSchedule(String productandServiceOperatingSchedule) {
    this.productandServiceOperatingSchedule = productandServiceOperatingSchedule;
    return this;
  }

  /**
   * Get productandServiceOperatingSchedule
   * @return productandServiceOperatingSchedule
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceOperatingSchedule() {
    return productandServiceOperatingSchedule;
  }

  public void setProductandServiceOperatingSchedule(String productandServiceOperatingSchedule) {
    this.productandServiceOperatingSchedule = productandServiceOperatingSchedule;
  }

  public Operations productandServiceConfigurationParameterType(String productandServiceConfigurationParameterType) {
    this.productandServiceConfigurationParameterType = productandServiceConfigurationParameterType;
    return this;
  }

  /**
   * Get productandServiceConfigurationParameterType
   * @return productandServiceConfigurationParameterType
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceConfigurationParameterType() {
    return productandServiceConfigurationParameterType;
  }

  public void setProductandServiceConfigurationParameterType(String productandServiceConfigurationParameterType) {
    this.productandServiceConfigurationParameterType = productandServiceConfigurationParameterType;
  }

  public Operations productandServiceConfigurationParameterDescription(String productandServiceConfigurationParameterDescription) {
    this.productandServiceConfigurationParameterDescription = productandServiceConfigurationParameterDescription;
    return this;
  }

  /**
   * Get productandServiceConfigurationParameterDescription
   * @return productandServiceConfigurationParameterDescription
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceConfigurationParameterDescription() {
    return productandServiceConfigurationParameterDescription;
  }

  public void setProductandServiceConfigurationParameterDescription(String productandServiceConfigurationParameterDescription) {
    this.productandServiceConfigurationParameterDescription = productandServiceConfigurationParameterDescription;
  }

  public Operations productandServiceConfigurationParameterSetting(String productandServiceConfigurationParameterSetting) {
    this.productandServiceConfigurationParameterSetting = productandServiceConfigurationParameterSetting;
    return this;
  }

  /**
   * Get productandServiceConfigurationParameterSetting
   * @return productandServiceConfigurationParameterSetting
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceConfigurationParameterSetting() {
    return productandServiceConfigurationParameterSetting;
  }

  public void setProductandServiceConfigurationParameterSetting(String productandServiceConfigurationParameterSetting) {
    this.productandServiceConfigurationParameterSetting = productandServiceConfigurationParameterSetting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operations operations = (Operations) o;
    return Objects.equals(this.productandServiceOperatingSchedule, operations.productandServiceOperatingSchedule) &&
        Objects.equals(this.productandServiceConfigurationParameterType, operations.productandServiceConfigurationParameterType) &&
        Objects.equals(this.productandServiceConfigurationParameterDescription, operations.productandServiceConfigurationParameterDescription) &&
        Objects.equals(this.productandServiceConfigurationParameterSetting, operations.productandServiceConfigurationParameterSetting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productandServiceOperatingSchedule, productandServiceConfigurationParameterType, productandServiceConfigurationParameterDescription, productandServiceConfigurationParameterSetting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operations {\n");
    
    sb.append("    productandServiceOperatingSchedule: ").append(toIndentedString(productandServiceOperatingSchedule)).append("\n");
    sb.append("    productandServiceConfigurationParameterType: ").append(toIndentedString(productandServiceConfigurationParameterType)).append("\n");
    sb.append("    productandServiceConfigurationParameterDescription: ").append(toIndentedString(productandServiceConfigurationParameterDescription)).append("\n");
    sb.append("    productandServiceConfigurationParameterSetting: ").append(toIndentedString(productandServiceConfigurationParameterSetting)).append("\n");
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

