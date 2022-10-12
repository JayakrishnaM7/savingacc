package com.ibm.dip.model.product directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductDirectoryEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:44.300Z[GMT]")

public class ProductDirectoryEntry   {
  @JsonProperty("ProductVersion")
  private String productVersion;

  @JsonProperty("ProductDirectoryEntryConfiguration")
  private String productDirectoryEntryConfiguration;

  public ProductDirectoryEntry productVersion(String productVersion) {
    this.productVersion = productVersion;
    return this;
  }

  /**
   * Get productVersion
   * @return productVersion
  */
  @ApiModelProperty(value = "")


  public String getProductVersion() {
    return productVersion;
  }

  public void setProductVersion(String productVersion) {
    this.productVersion = productVersion;
  }

  public ProductDirectoryEntry productDirectoryEntryConfiguration(String productDirectoryEntryConfiguration) {
    this.productDirectoryEntryConfiguration = productDirectoryEntryConfiguration;
    return this;
  }

  /**
   * Get productDirectoryEntryConfiguration
   * @return productDirectoryEntryConfiguration
  */
  @ApiModelProperty(value = "")


  public String getProductDirectoryEntryConfiguration() {
    return productDirectoryEntryConfiguration;
  }

  public void setProductDirectoryEntryConfiguration(String productDirectoryEntryConfiguration) {
    this.productDirectoryEntryConfiguration = productDirectoryEntryConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDirectoryEntry productDirectoryEntry = (ProductDirectoryEntry) o;
    return Objects.equals(this.productVersion, productDirectoryEntry.productVersion) &&
        Objects.equals(this.productDirectoryEntryConfiguration, productDirectoryEntry.productDirectoryEntryConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVersion, productDirectoryEntryConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDirectoryEntry {\n");
    
    sb.append("    productVersion: ").append(toIndentedString(productVersion)).append("\n");
    sb.append("    productDirectoryEntryConfiguration: ").append(toIndentedString(productDirectoryEntryConfiguration)).append("\n");
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

