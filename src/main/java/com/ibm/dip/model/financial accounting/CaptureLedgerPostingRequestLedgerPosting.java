package com.ibm.dip.model.financial accounting;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaptureLedgerPostingRequestLedgerPosting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:42:00.295Z[GMT]")

public class CaptureLedgerPostingRequestLedgerPosting   {
  @JsonProperty("PostingDirection")
  private String postingDirection;

  @JsonProperty("PostingAmount(creditOrdebitpair)")
  private BigDecimal postingAmountCreditOrdebitpair;

  @JsonProperty("PostingValueDate")
  private String postingValueDate;

  public CaptureLedgerPostingRequestLedgerPosting postingDirection(String postingDirection) {
    this.postingDirection = postingDirection;
    return this;
  }

  /**
   * Get postingDirection
   * @return postingDirection
  */
  @ApiModelProperty(value = "")


  public String getPostingDirection() {
    return postingDirection;
  }

  public void setPostingDirection(String postingDirection) {
    this.postingDirection = postingDirection;
  }

  public CaptureLedgerPostingRequestLedgerPosting postingAmountCreditOrdebitpair(BigDecimal postingAmountCreditOrdebitpair) {
    this.postingAmountCreditOrdebitpair = postingAmountCreditOrdebitpair;
    return this;
  }

  /**
   * Get postingAmountCreditOrdebitpair
   * @return postingAmountCreditOrdebitpair
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPostingAmountCreditOrdebitpair() {
    return postingAmountCreditOrdebitpair;
  }

  public void setPostingAmountCreditOrdebitpair(BigDecimal postingAmountCreditOrdebitpair) {
    this.postingAmountCreditOrdebitpair = postingAmountCreditOrdebitpair;
  }

  public CaptureLedgerPostingRequestLedgerPosting postingValueDate(String postingValueDate) {
    this.postingValueDate = postingValueDate;
    return this;
  }

  /**
   * Get postingValueDate
   * @return postingValueDate
  */
  @ApiModelProperty(value = "")


  public String getPostingValueDate() {
    return postingValueDate;
  }

  public void setPostingValueDate(String postingValueDate) {
    this.postingValueDate = postingValueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptureLedgerPostingRequestLedgerPosting captureLedgerPostingRequestLedgerPosting = (CaptureLedgerPostingRequestLedgerPosting) o;
    return Objects.equals(this.postingDirection, captureLedgerPostingRequestLedgerPosting.postingDirection) &&
        Objects.equals(this.postingAmountCreditOrdebitpair, captureLedgerPostingRequestLedgerPosting.postingAmountCreditOrdebitpair) &&
        Objects.equals(this.postingValueDate, captureLedgerPostingRequestLedgerPosting.postingValueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postingDirection, postingAmountCreditOrdebitpair, postingValueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptureLedgerPostingRequestLedgerPosting {\n");
    
    sb.append("    postingDirection: ").append(toIndentedString(postingDirection)).append("\n");
    sb.append("    postingAmountCreditOrdebitpair: ").append(toIndentedString(postingAmountCreditOrdebitpair)).append("\n");
    sb.append("    postingValueDate: ").append(toIndentedString(postingValueDate)).append("\n");
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

