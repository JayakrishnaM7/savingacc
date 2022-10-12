package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Collateral
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class Collateral   {
  @JsonProperty("CollateralRequirement")
  private String collateralRequirement;

  @JsonProperty("CollateralEarmarkReference")
  private Object collateralEarmarkReference;

  @JsonProperty("CollateralAssetReference")
  private Object collateralAssetReference;

  public Collateral collateralRequirement(String collateralRequirement) {
    this.collateralRequirement = collateralRequirement;
    return this;
  }

  /**
   * Get collateralRequirement
   * @return collateralRequirement
  */
  @ApiModelProperty(value = "")


  public String getCollateralRequirement() {
    return collateralRequirement;
  }

  public void setCollateralRequirement(String collateralRequirement) {
    this.collateralRequirement = collateralRequirement;
  }

  public Collateral collateralEarmarkReference(Object collateralEarmarkReference) {
    this.collateralEarmarkReference = collateralEarmarkReference;
    return this;
  }

  /**
   * Get collateralEarmarkReference
   * @return collateralEarmarkReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCollateralEarmarkReference() {
    return collateralEarmarkReference;
  }

  public void setCollateralEarmarkReference(Object collateralEarmarkReference) {
    this.collateralEarmarkReference = collateralEarmarkReference;
  }

  public Collateral collateralAssetReference(Object collateralAssetReference) {
    this.collateralAssetReference = collateralAssetReference;
    return this;
  }

  /**
   * Get collateralAssetReference
   * @return collateralAssetReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCollateralAssetReference() {
    return collateralAssetReference;
  }

  public void setCollateralAssetReference(Object collateralAssetReference) {
    this.collateralAssetReference = collateralAssetReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Collateral collateral = (Collateral) o;
    return Objects.equals(this.collateralRequirement, collateral.collateralRequirement) &&
        Objects.equals(this.collateralEarmarkReference, collateral.collateralEarmarkReference) &&
        Objects.equals(this.collateralAssetReference, collateral.collateralAssetReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collateralRequirement, collateralEarmarkReference, collateralAssetReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Collateral {\n");
    
    sb.append("    collateralRequirement: ").append(toIndentedString(collateralRequirement)).append("\n");
    sb.append("    collateralEarmarkReference: ").append(toIndentedString(collateralEarmarkReference)).append("\n");
    sb.append("    collateralAssetReference: ").append(toIndentedString(collateralAssetReference)).append("\n");
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

