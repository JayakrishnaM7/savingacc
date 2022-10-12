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
 * LedgerPosting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:42:00.295Z[GMT]")

public class LedgerPosting   {
  @JsonProperty("PostingDirection")
  private String postingDirection;

  @JsonProperty("PostingAmount(credit/debitpair)")
  private BigDecimal postingAmountCreditDebitpair;

  @JsonProperty("PostingValueDate")
  private String postingValueDate;

  @JsonProperty("PostingResult")
  private String postingResult;

  public LedgerPosting postingDirection(String postingDirection) {
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

  public LedgerPosting postingAmountCreditDebitpair(BigDecimal postingAmountCreditDebitpair) {
    this.postingAmountCreditDebitpair = postingAmountCreditDebitpair;
    return this;
  }

  /**
   * Get postingAmountCreditDebitpair
   * @return postingAmountCreditDebitpair
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPostingAmountCreditDebitpair() {
    return postingAmountCreditDebitpair;
  }

  public void setPostingAmountCreditDebitpair(BigDecimal postingAmountCreditDebitpair) {
    this.postingAmountCreditDebitpair = postingAmountCreditDebitpair;
  }

  public LedgerPosting postingValueDate(String postingValueDate) {
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

  public LedgerPosting postingResult(String postingResult) {
    this.postingResult = postingResult;
    return this;
  }

  /**
   * Get postingResult
   * @return postingResult
  */
  @ApiModelProperty(value = "")


  public String getPostingResult() {
    return postingResult;
  }

  public void setPostingResult(String postingResult) {
    this.postingResult = postingResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LedgerPosting ledgerPosting = (LedgerPosting) o;
    return Objects.equals(this.postingDirection, ledgerPosting.postingDirection) &&
        Objects.equals(this.postingAmountCreditDebitpair, ledgerPosting.postingAmountCreditDebitpair) &&
        Objects.equals(this.postingValueDate, ledgerPosting.postingValueDate) &&
        Objects.equals(this.postingResult, ledgerPosting.postingResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postingDirection, postingAmountCreditDebitpair, postingValueDate, postingResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LedgerPosting {\n");
    
    sb.append("    postingDirection: ").append(toIndentedString(postingDirection)).append("\n");
    sb.append("    postingAmountCreditDebitpair: ").append(toIndentedString(postingAmountCreditDebitpair)).append("\n");
    sb.append("    postingValueDate: ").append(toIndentedString(postingValueDate)).append("\n");
    sb.append("    postingResult: ").append(toIndentedString(postingResult)).append("\n");
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

