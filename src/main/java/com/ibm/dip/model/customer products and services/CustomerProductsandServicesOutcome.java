package com.ibm.dip.model.customer products and services;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerProductsandServicesOutcome
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:27.999Z[GMT]")

public class CustomerProductsandServicesOutcome   {
  @JsonProperty("CustomerProductsandServicesEntry")
  private String customerProductsandServicesEntry;

  @JsonProperty("CustomerProductsandServicesWorkProduct")
  private Object customerProductsandServicesWorkProduct;

  public CustomerProductsandServicesOutcome customerProductsandServicesEntry(String customerProductsandServicesEntry) {
    this.customerProductsandServicesEntry = customerProductsandServicesEntry;
    return this;
  }

  /**
   * Get customerProductsandServicesEntry
   * @return customerProductsandServicesEntry
  */
  @ApiModelProperty(value = "")


  public String getCustomerProductsandServicesEntry() {
    return customerProductsandServicesEntry;
  }

  public void setCustomerProductsandServicesEntry(String customerProductsandServicesEntry) {
    this.customerProductsandServicesEntry = customerProductsandServicesEntry;
  }

  public CustomerProductsandServicesOutcome customerProductsandServicesWorkProduct(Object customerProductsandServicesWorkProduct) {
    this.customerProductsandServicesWorkProduct = customerProductsandServicesWorkProduct;
    return this;
  }

  /**
   * Get customerProductsandServicesWorkProduct
   * @return customerProductsandServicesWorkProduct
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerProductsandServicesWorkProduct() {
    return customerProductsandServicesWorkProduct;
  }

  public void setCustomerProductsandServicesWorkProduct(Object customerProductsandServicesWorkProduct) {
    this.customerProductsandServicesWorkProduct = customerProductsandServicesWorkProduct;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerProductsandServicesOutcome customerProductsandServicesOutcome = (CustomerProductsandServicesOutcome) o;
    return Objects.equals(this.customerProductsandServicesEntry, customerProductsandServicesOutcome.customerProductsandServicesEntry) &&
        Objects.equals(this.customerProductsandServicesWorkProduct, customerProductsandServicesOutcome.customerProductsandServicesWorkProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerProductsandServicesEntry, customerProductsandServicesWorkProduct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerProductsandServicesOutcome {\n");
    
    sb.append("    customerProductsandServicesEntry: ").append(toIndentedString(customerProductsandServicesEntry)).append("\n");
    sb.append("    customerProductsandServicesWorkProduct: ").append(toIndentedString(customerProductsandServicesWorkProduct)).append("\n");
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

