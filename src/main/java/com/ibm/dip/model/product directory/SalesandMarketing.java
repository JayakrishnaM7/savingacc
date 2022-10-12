package com.ibm.dip.model.product directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SalesandMarketing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:44.300Z[GMT]")

public class SalesandMarketing   {
  @JsonProperty("ProductandServiceSalesMaterial")
  private String productandServiceSalesMaterial;

  @JsonProperty("ProductandServicesFeaturesAndOptions")
  private String productandServicesFeaturesAndOptions;

  @JsonProperty("ProductandServicePricingTable")
  private String productandServicePricingTable;

  @JsonProperty("ProductandServiceFees/PenaltiesTable")
  private String productandServiceFeesPenaltiesTable;

  @JsonProperty("ProductSuitabilityGuide")
  private String productSuitabilityGuide;

  @JsonProperty("ProductandServiceEligibilityType")
  private String productandServiceEligibilityType;

  @JsonProperty("ProductandServiceEligibilityDescription")
  private String productandServiceEligibilityDescription;

  @JsonProperty("ProductandServiceOfferProcessingRequirements")
  private String productandServiceOfferProcessingRequirements;

  public SalesandMarketing productandServiceSalesMaterial(String productandServiceSalesMaterial) {
    this.productandServiceSalesMaterial = productandServiceSalesMaterial;
    return this;
  }

  /**
   * Get productandServiceSalesMaterial
   * @return productandServiceSalesMaterial
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceSalesMaterial() {
    return productandServiceSalesMaterial;
  }

  public void setProductandServiceSalesMaterial(String productandServiceSalesMaterial) {
    this.productandServiceSalesMaterial = productandServiceSalesMaterial;
  }

  public SalesandMarketing productandServicesFeaturesAndOptions(String productandServicesFeaturesAndOptions) {
    this.productandServicesFeaturesAndOptions = productandServicesFeaturesAndOptions;
    return this;
  }

  /**
   * Get productandServicesFeaturesAndOptions
   * @return productandServicesFeaturesAndOptions
  */
  @ApiModelProperty(value = "")


  public String getProductandServicesFeaturesAndOptions() {
    return productandServicesFeaturesAndOptions;
  }

  public void setProductandServicesFeaturesAndOptions(String productandServicesFeaturesAndOptions) {
    this.productandServicesFeaturesAndOptions = productandServicesFeaturesAndOptions;
  }

  public SalesandMarketing productandServicePricingTable(String productandServicePricingTable) {
    this.productandServicePricingTable = productandServicePricingTable;
    return this;
  }

  /**
   * Get productandServicePricingTable
   * @return productandServicePricingTable
  */
  @ApiModelProperty(value = "")


  public String getProductandServicePricingTable() {
    return productandServicePricingTable;
  }

  public void setProductandServicePricingTable(String productandServicePricingTable) {
    this.productandServicePricingTable = productandServicePricingTable;
  }

  public SalesandMarketing productandServiceFeesPenaltiesTable(String productandServiceFeesPenaltiesTable) {
    this.productandServiceFeesPenaltiesTable = productandServiceFeesPenaltiesTable;
    return this;
  }

  /**
   * Get productandServiceFeesPenaltiesTable
   * @return productandServiceFeesPenaltiesTable
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceFeesPenaltiesTable() {
    return productandServiceFeesPenaltiesTable;
  }

  public void setProductandServiceFeesPenaltiesTable(String productandServiceFeesPenaltiesTable) {
    this.productandServiceFeesPenaltiesTable = productandServiceFeesPenaltiesTable;
  }

  public SalesandMarketing productSuitabilityGuide(String productSuitabilityGuide) {
    this.productSuitabilityGuide = productSuitabilityGuide;
    return this;
  }

  /**
   * Get productSuitabilityGuide
   * @return productSuitabilityGuide
  */
  @ApiModelProperty(value = "")


  public String getProductSuitabilityGuide() {
    return productSuitabilityGuide;
  }

  public void setProductSuitabilityGuide(String productSuitabilityGuide) {
    this.productSuitabilityGuide = productSuitabilityGuide;
  }

  public SalesandMarketing productandServiceEligibilityType(String productandServiceEligibilityType) {
    this.productandServiceEligibilityType = productandServiceEligibilityType;
    return this;
  }

  /**
   * Get productandServiceEligibilityType
   * @return productandServiceEligibilityType
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceEligibilityType() {
    return productandServiceEligibilityType;
  }

  public void setProductandServiceEligibilityType(String productandServiceEligibilityType) {
    this.productandServiceEligibilityType = productandServiceEligibilityType;
  }

  public SalesandMarketing productandServiceEligibilityDescription(String productandServiceEligibilityDescription) {
    this.productandServiceEligibilityDescription = productandServiceEligibilityDescription;
    return this;
  }

  /**
   * Get productandServiceEligibilityDescription
   * @return productandServiceEligibilityDescription
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceEligibilityDescription() {
    return productandServiceEligibilityDescription;
  }

  public void setProductandServiceEligibilityDescription(String productandServiceEligibilityDescription) {
    this.productandServiceEligibilityDescription = productandServiceEligibilityDescription;
  }

  public SalesandMarketing productandServiceOfferProcessingRequirements(String productandServiceOfferProcessingRequirements) {
    this.productandServiceOfferProcessingRequirements = productandServiceOfferProcessingRequirements;
    return this;
  }

  /**
   * Get productandServiceOfferProcessingRequirements
   * @return productandServiceOfferProcessingRequirements
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceOfferProcessingRequirements() {
    return productandServiceOfferProcessingRequirements;
  }

  public void setProductandServiceOfferProcessingRequirements(String productandServiceOfferProcessingRequirements) {
    this.productandServiceOfferProcessingRequirements = productandServiceOfferProcessingRequirements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesandMarketing salesandMarketing = (SalesandMarketing) o;
    return Objects.equals(this.productandServiceSalesMaterial, salesandMarketing.productandServiceSalesMaterial) &&
        Objects.equals(this.productandServicesFeaturesAndOptions, salesandMarketing.productandServicesFeaturesAndOptions) &&
        Objects.equals(this.productandServicePricingTable, salesandMarketing.productandServicePricingTable) &&
        Objects.equals(this.productandServiceFeesPenaltiesTable, salesandMarketing.productandServiceFeesPenaltiesTable) &&
        Objects.equals(this.productSuitabilityGuide, salesandMarketing.productSuitabilityGuide) &&
        Objects.equals(this.productandServiceEligibilityType, salesandMarketing.productandServiceEligibilityType) &&
        Objects.equals(this.productandServiceEligibilityDescription, salesandMarketing.productandServiceEligibilityDescription) &&
        Objects.equals(this.productandServiceOfferProcessingRequirements, salesandMarketing.productandServiceOfferProcessingRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productandServiceSalesMaterial, productandServicesFeaturesAndOptions, productandServicePricingTable, productandServiceFeesPenaltiesTable, productSuitabilityGuide, productandServiceEligibilityType, productandServiceEligibilityDescription, productandServiceOfferProcessingRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesandMarketing {\n");
    
    sb.append("    productandServiceSalesMaterial: ").append(toIndentedString(productandServiceSalesMaterial)).append("\n");
    sb.append("    productandServicesFeaturesAndOptions: ").append(toIndentedString(productandServicesFeaturesAndOptions)).append("\n");
    sb.append("    productandServicePricingTable: ").append(toIndentedString(productandServicePricingTable)).append("\n");
    sb.append("    productandServiceFeesPenaltiesTable: ").append(toIndentedString(productandServiceFeesPenaltiesTable)).append("\n");
    sb.append("    productSuitabilityGuide: ").append(toIndentedString(productSuitabilityGuide)).append("\n");
    sb.append("    productandServiceEligibilityType: ").append(toIndentedString(productandServiceEligibilityType)).append("\n");
    sb.append("    productandServiceEligibilityDescription: ").append(toIndentedString(productandServiceEligibilityDescription)).append("\n");
    sb.append("    productandServiceOfferProcessingRequirements: ").append(toIndentedString(productandServiceOfferProcessingRequirements)).append("\n");
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

