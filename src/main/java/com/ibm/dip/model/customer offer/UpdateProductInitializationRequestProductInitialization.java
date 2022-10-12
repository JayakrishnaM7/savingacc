package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateProductInitializationRequestProductInitialization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class UpdateProductInitializationRequestProductInitialization   {
  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  public UpdateProductInitializationRequestProductInitialization productInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

  /**
   * Get productInstanceReference
   * @return productInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateProductInitializationRequestProductInitialization updateProductInitializationRequestProductInitialization = (UpdateProductInitializationRequestProductInitialization) o;
    return Objects.equals(this.productInstanceReference, updateProductInitializationRequestProductInitialization.productInstanceReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProductInitializationRequestProductInitialization {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
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

