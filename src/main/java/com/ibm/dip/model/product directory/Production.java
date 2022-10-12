package com.ibm.dip.model.product directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Production
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:44.300Z[GMT]")

public class Production   {
  @JsonProperty("ProductandServiceLocationAvailability")
  private String productandServiceLocationAvailability;

  @JsonProperty("ProductandServiceTimeAvailability")
  private String productandServiceTimeAvailability;

  @JsonProperty("ProductandServiceAccessAvailability")
  private String productandServiceAccessAvailability;

  public Production productandServiceLocationAvailability(String productandServiceLocationAvailability) {
    this.productandServiceLocationAvailability = productandServiceLocationAvailability;
    return this;
  }

  /**
   * Get productandServiceLocationAvailability
   * @return productandServiceLocationAvailability
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceLocationAvailability() {
    return productandServiceLocationAvailability;
  }

  public void setProductandServiceLocationAvailability(String productandServiceLocationAvailability) {
    this.productandServiceLocationAvailability = productandServiceLocationAvailability;
  }

  public Production productandServiceTimeAvailability(String productandServiceTimeAvailability) {
    this.productandServiceTimeAvailability = productandServiceTimeAvailability;
    return this;
  }

  /**
   * Get productandServiceTimeAvailability
   * @return productandServiceTimeAvailability
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceTimeAvailability() {
    return productandServiceTimeAvailability;
  }

  public void setProductandServiceTimeAvailability(String productandServiceTimeAvailability) {
    this.productandServiceTimeAvailability = productandServiceTimeAvailability;
  }

  public Production productandServiceAccessAvailability(String productandServiceAccessAvailability) {
    this.productandServiceAccessAvailability = productandServiceAccessAvailability;
    return this;
  }

  /**
   * Get productandServiceAccessAvailability
   * @return productandServiceAccessAvailability
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceAccessAvailability() {
    return productandServiceAccessAvailability;
  }

  public void setProductandServiceAccessAvailability(String productandServiceAccessAvailability) {
    this.productandServiceAccessAvailability = productandServiceAccessAvailability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Production production = (Production) o;
    return Objects.equals(this.productandServiceLocationAvailability, production.productandServiceLocationAvailability) &&
        Objects.equals(this.productandServiceTimeAvailability, production.productandServiceTimeAvailability) &&
        Objects.equals(this.productandServiceAccessAvailability, production.productandServiceAccessAvailability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productandServiceLocationAvailability, productandServiceTimeAvailability, productandServiceAccessAvailability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Production {\n");
    
    sb.append("    productandServiceLocationAvailability: ").append(toIndentedString(productandServiceLocationAvailability)).append("\n");
    sb.append("    productandServiceTimeAvailability: ").append(toIndentedString(productandServiceTimeAvailability)).append("\n");
    sb.append("    productandServiceAccessAvailability: ").append(toIndentedString(productandServiceAccessAvailability)).append("\n");
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

