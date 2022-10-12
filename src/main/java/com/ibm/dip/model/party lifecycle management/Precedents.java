package com.ibm.dip.model.party lifecycle management;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Precedents
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:32.808Z[GMT]")

public class Precedents   {
  @JsonProperty("PrecedentType")
  private String precedentType;

  @JsonProperty("CustomerPrecedentReference")
  private Object customerPrecedentReference;

  @JsonProperty("CustomerPrecedentValue")
  private String customerPrecedentValue;

  @JsonProperty("CustomerPrecedentValueDate")
  private String customerPrecedentValueDate;

  public Precedents precedentType(String precedentType) {
    this.precedentType = precedentType;
    return this;
  }

  /**
   * Get precedentType
   * @return precedentType
  */
  @ApiModelProperty(value = "")


  public String getPrecedentType() {
    return precedentType;
  }

  public void setPrecedentType(String precedentType) {
    this.precedentType = precedentType;
  }

  public Precedents customerPrecedentReference(Object customerPrecedentReference) {
    this.customerPrecedentReference = customerPrecedentReference;
    return this;
  }

  /**
   * Get customerPrecedentReference
   * @return customerPrecedentReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerPrecedentReference() {
    return customerPrecedentReference;
  }

  public void setCustomerPrecedentReference(Object customerPrecedentReference) {
    this.customerPrecedentReference = customerPrecedentReference;
  }

  public Precedents customerPrecedentValue(String customerPrecedentValue) {
    this.customerPrecedentValue = customerPrecedentValue;
    return this;
  }

  /**
   * Get customerPrecedentValue
   * @return customerPrecedentValue
  */
  @ApiModelProperty(value = "")


  public String getCustomerPrecedentValue() {
    return customerPrecedentValue;
  }

  public void setCustomerPrecedentValue(String customerPrecedentValue) {
    this.customerPrecedentValue = customerPrecedentValue;
  }

  public Precedents customerPrecedentValueDate(String customerPrecedentValueDate) {
    this.customerPrecedentValueDate = customerPrecedentValueDate;
    return this;
  }

  /**
   * Get customerPrecedentValueDate
   * @return customerPrecedentValueDate
  */
  @ApiModelProperty(value = "")


  public String getCustomerPrecedentValueDate() {
    return customerPrecedentValueDate;
  }

  public void setCustomerPrecedentValueDate(String customerPrecedentValueDate) {
    this.customerPrecedentValueDate = customerPrecedentValueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Precedents precedents = (Precedents) o;
    return Objects.equals(this.precedentType, precedents.precedentType) &&
        Objects.equals(this.customerPrecedentReference, precedents.customerPrecedentReference) &&
        Objects.equals(this.customerPrecedentValue, precedents.customerPrecedentValue) &&
        Objects.equals(this.customerPrecedentValueDate, precedents.customerPrecedentValueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(precedentType, customerPrecedentReference, customerPrecedentValue, customerPrecedentValueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Precedents {\n");
    
    sb.append("    precedentType: ").append(toIndentedString(precedentType)).append("\n");
    sb.append("    customerPrecedentReference: ").append(toIndentedString(customerPrecedentReference)).append("\n");
    sb.append("    customerPrecedentValue: ").append(toIndentedString(customerPrecedentValue)).append("\n");
    sb.append("    customerPrecedentValueDate: ").append(toIndentedString(customerPrecedentValueDate)).append("\n");
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

