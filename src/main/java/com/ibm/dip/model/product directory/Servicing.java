package com.ibm.dip.model.product directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Servicing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:44.300Z[GMT]")

public class Servicing   {
  @JsonProperty("ProductandServiceFeature")
  private String productandServiceFeature;

  @JsonProperty("ProductandServiceFeatureGuideline")
  private String productandServiceFeatureGuideline;

  @JsonProperty("ProductandServiceFeatureProblemDiagnosis")
  private String productandServiceFeatureProblemDiagnosis;

  @JsonProperty("ProductandServiceFeatureProblemResolution")
  private String productandServiceFeatureProblemResolution;

  public Servicing productandServiceFeature(String productandServiceFeature) {
    this.productandServiceFeature = productandServiceFeature;
    return this;
  }

  /**
   * Get productandServiceFeature
   * @return productandServiceFeature
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceFeature() {
    return productandServiceFeature;
  }

  public void setProductandServiceFeature(String productandServiceFeature) {
    this.productandServiceFeature = productandServiceFeature;
  }

  public Servicing productandServiceFeatureGuideline(String productandServiceFeatureGuideline) {
    this.productandServiceFeatureGuideline = productandServiceFeatureGuideline;
    return this;
  }

  /**
   * Get productandServiceFeatureGuideline
   * @return productandServiceFeatureGuideline
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceFeatureGuideline() {
    return productandServiceFeatureGuideline;
  }

  public void setProductandServiceFeatureGuideline(String productandServiceFeatureGuideline) {
    this.productandServiceFeatureGuideline = productandServiceFeatureGuideline;
  }

  public Servicing productandServiceFeatureProblemDiagnosis(String productandServiceFeatureProblemDiagnosis) {
    this.productandServiceFeatureProblemDiagnosis = productandServiceFeatureProblemDiagnosis;
    return this;
  }

  /**
   * Get productandServiceFeatureProblemDiagnosis
   * @return productandServiceFeatureProblemDiagnosis
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceFeatureProblemDiagnosis() {
    return productandServiceFeatureProblemDiagnosis;
  }

  public void setProductandServiceFeatureProblemDiagnosis(String productandServiceFeatureProblemDiagnosis) {
    this.productandServiceFeatureProblemDiagnosis = productandServiceFeatureProblemDiagnosis;
  }

  public Servicing productandServiceFeatureProblemResolution(String productandServiceFeatureProblemResolution) {
    this.productandServiceFeatureProblemResolution = productandServiceFeatureProblemResolution;
    return this;
  }

  /**
   * Get productandServiceFeatureProblemResolution
   * @return productandServiceFeatureProblemResolution
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceFeatureProblemResolution() {
    return productandServiceFeatureProblemResolution;
  }

  public void setProductandServiceFeatureProblemResolution(String productandServiceFeatureProblemResolution) {
    this.productandServiceFeatureProblemResolution = productandServiceFeatureProblemResolution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Servicing servicing = (Servicing) o;
    return Objects.equals(this.productandServiceFeature, servicing.productandServiceFeature) &&
        Objects.equals(this.productandServiceFeatureGuideline, servicing.productandServiceFeatureGuideline) &&
        Objects.equals(this.productandServiceFeatureProblemDiagnosis, servicing.productandServiceFeatureProblemDiagnosis) &&
        Objects.equals(this.productandServiceFeatureProblemResolution, servicing.productandServiceFeatureProblemResolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productandServiceFeature, productandServiceFeatureGuideline, productandServiceFeatureProblemDiagnosis, productandServiceFeatureProblemResolution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Servicing {\n");
    
    sb.append("    productandServiceFeature: ").append(toIndentedString(productandServiceFeature)).append("\n");
    sb.append("    productandServiceFeatureGuideline: ").append(toIndentedString(productandServiceFeatureGuideline)).append("\n");
    sb.append("    productandServiceFeatureProblemDiagnosis: ").append(toIndentedString(productandServiceFeatureProblemDiagnosis)).append("\n");
    sb.append("    productandServiceFeatureProblemResolution: ").append(toIndentedString(productandServiceFeatureProblemResolution)).append("\n");
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

