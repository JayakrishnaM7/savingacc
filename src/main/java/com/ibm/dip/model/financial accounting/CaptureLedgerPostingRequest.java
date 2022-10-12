package com.ibm.dip.model.financial accounting;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.financial accounting.CaptureLedgerPostingRequestLedgerPosting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaptureLedgerPostingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:42:00.295Z[GMT]")

public class CaptureLedgerPostingRequest   {
  @JsonProperty("LedgerPosting")
  private CaptureLedgerPostingRequestLedgerPosting ledgerPosting;

  public CaptureLedgerPostingRequest ledgerPosting(CaptureLedgerPostingRequestLedgerPosting ledgerPosting) {
    this.ledgerPosting = ledgerPosting;
    return this;
  }

  /**
   * Get ledgerPosting
   * @return ledgerPosting
  */
  @ApiModelProperty(value = "")

  @Valid

  public CaptureLedgerPostingRequestLedgerPosting getLedgerPosting() {
    return ledgerPosting;
  }

  public void setLedgerPosting(CaptureLedgerPostingRequestLedgerPosting ledgerPosting) {
    this.ledgerPosting = ledgerPosting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptureLedgerPostingRequest captureLedgerPostingRequest = (CaptureLedgerPostingRequest) o;
    return Objects.equals(this.ledgerPosting, captureLedgerPostingRequest.ledgerPosting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ledgerPosting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptureLedgerPostingRequest {\n");
    
    sb.append("    ledgerPosting: ").append(toIndentedString(ledgerPosting)).append("\n");
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

