package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:56.799Z[GMT]")

public class ExecuteCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession   {
  @JsonProperty("CorrespondenceServiceSessionDate")
  private String correspondenceServiceSessionDate;

  public ExecuteCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession correspondenceServiceSessionDate(String correspondenceServiceSessionDate) {
    this.correspondenceServiceSessionDate = correspondenceServiceSessionDate;
    return this;
  }

  /**
   * Get correspondenceServiceSessionDate
   * @return correspondenceServiceSessionDate
  */
  @ApiModelProperty(value = "")


  public String getCorrespondenceServiceSessionDate() {
    return correspondenceServiceSessionDate;
  }

  public void setCorrespondenceServiceSessionDate(String correspondenceServiceSessionDate) {
    this.correspondenceServiceSessionDate = correspondenceServiceSessionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession executeCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession = (ExecuteCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession) o;
    return Objects.equals(this.correspondenceServiceSessionDate, executeCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession.correspondenceServiceSessionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondenceServiceSessionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession {\n");
    
    sb.append("    correspondenceServiceSessionDate: ").append(toIndentedString(correspondenceServiceSessionDate)).append("\n");
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

