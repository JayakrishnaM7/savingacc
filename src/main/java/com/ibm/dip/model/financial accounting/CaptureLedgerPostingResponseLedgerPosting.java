package com.ibm.dip.model.financial accounting;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaptureLedgerPostingResponseLedgerPosting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:42:00.295Z[GMT]")

public class CaptureLedgerPostingResponseLedgerPosting   {
  @JsonProperty("PostingResult")
  private String postingResult;

  public CaptureLedgerPostingResponseLedgerPosting postingResult(String postingResult) {
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
    CaptureLedgerPostingResponseLedgerPosting captureLedgerPostingResponseLedgerPosting = (CaptureLedgerPostingResponseLedgerPosting) o;
    return Objects.equals(this.postingResult, captureLedgerPostingResponseLedgerPosting.postingResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postingResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptureLedgerPostingResponseLedgerPosting {\n");
    
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

