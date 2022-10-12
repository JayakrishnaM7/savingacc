package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Inbound
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:56.799Z[GMT]")

public class Inbound   {
  @JsonProperty("InboundCorrespondenceInstanceReference")
  private Object inboundCorrespondenceInstanceReference;

  @JsonProperty("InboundCorrespondenceRecord")
  private String inboundCorrespondenceRecord;

  @JsonProperty("InboundCorrespondenceType(e.g.unsolicitedmessage,product/servicerelated,complaint)")
  private String inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint;

  @JsonProperty("InboundCorrespondenceContent")
  private String inboundCorrespondenceContent;

  @JsonProperty("InboundCorrespondenceAddressee")
  private String inboundCorrespondenceAddressee;

  @JsonProperty("InboundCorrespondenceCustomerReference")
  private Object inboundCorrespondenceCustomerReference;

  @JsonProperty("InboundCorrespondenceEmployee/BusinessUnitReference")
  private Object inboundCorrespondenceEmployeeBusinessUnitReference;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("Date")
  private String date;

  public Inbound inboundCorrespondenceInstanceReference(Object inboundCorrespondenceInstanceReference) {
    this.inboundCorrespondenceInstanceReference = inboundCorrespondenceInstanceReference;
    return this;
  }

  /**
   * Get inboundCorrespondenceInstanceReference
   * @return inboundCorrespondenceInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInboundCorrespondenceInstanceReference() {
    return inboundCorrespondenceInstanceReference;
  }

  public void setInboundCorrespondenceInstanceReference(Object inboundCorrespondenceInstanceReference) {
    this.inboundCorrespondenceInstanceReference = inboundCorrespondenceInstanceReference;
  }

  public Inbound inboundCorrespondenceRecord(String inboundCorrespondenceRecord) {
    this.inboundCorrespondenceRecord = inboundCorrespondenceRecord;
    return this;
  }

  /**
   * Get inboundCorrespondenceRecord
   * @return inboundCorrespondenceRecord
  */
  @ApiModelProperty(value = "")


  public String getInboundCorrespondenceRecord() {
    return inboundCorrespondenceRecord;
  }

  public void setInboundCorrespondenceRecord(String inboundCorrespondenceRecord) {
    this.inboundCorrespondenceRecord = inboundCorrespondenceRecord;
  }

  public Inbound inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint(String inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint) {
    this.inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint = inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint;
    return this;
  }

  /**
   * Get inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint
   * @return inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint
  */
  @ApiModelProperty(value = "")


  public String getInboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint() {
    return inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint;
  }

  public void setInboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint(String inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint) {
    this.inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint = inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint;
  }

  public Inbound inboundCorrespondenceContent(String inboundCorrespondenceContent) {
    this.inboundCorrespondenceContent = inboundCorrespondenceContent;
    return this;
  }

  /**
   * Get inboundCorrespondenceContent
   * @return inboundCorrespondenceContent
  */
  @ApiModelProperty(value = "")


  public String getInboundCorrespondenceContent() {
    return inboundCorrespondenceContent;
  }

  public void setInboundCorrespondenceContent(String inboundCorrespondenceContent) {
    this.inboundCorrespondenceContent = inboundCorrespondenceContent;
  }

  public Inbound inboundCorrespondenceAddressee(String inboundCorrespondenceAddressee) {
    this.inboundCorrespondenceAddressee = inboundCorrespondenceAddressee;
    return this;
  }

  /**
   * Get inboundCorrespondenceAddressee
   * @return inboundCorrespondenceAddressee
  */
  @ApiModelProperty(value = "")


  public String getInboundCorrespondenceAddressee() {
    return inboundCorrespondenceAddressee;
  }

  public void setInboundCorrespondenceAddressee(String inboundCorrespondenceAddressee) {
    this.inboundCorrespondenceAddressee = inboundCorrespondenceAddressee;
  }

  public Inbound inboundCorrespondenceCustomerReference(Object inboundCorrespondenceCustomerReference) {
    this.inboundCorrespondenceCustomerReference = inboundCorrespondenceCustomerReference;
    return this;
  }

  /**
   * Get inboundCorrespondenceCustomerReference
   * @return inboundCorrespondenceCustomerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInboundCorrespondenceCustomerReference() {
    return inboundCorrespondenceCustomerReference;
  }

  public void setInboundCorrespondenceCustomerReference(Object inboundCorrespondenceCustomerReference) {
    this.inboundCorrespondenceCustomerReference = inboundCorrespondenceCustomerReference;
  }

  public Inbound inboundCorrespondenceEmployeeBusinessUnitReference(Object inboundCorrespondenceEmployeeBusinessUnitReference) {
    this.inboundCorrespondenceEmployeeBusinessUnitReference = inboundCorrespondenceEmployeeBusinessUnitReference;
    return this;
  }

  /**
   * Get inboundCorrespondenceEmployeeBusinessUnitReference
   * @return inboundCorrespondenceEmployeeBusinessUnitReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInboundCorrespondenceEmployeeBusinessUnitReference() {
    return inboundCorrespondenceEmployeeBusinessUnitReference;
  }

  public void setInboundCorrespondenceEmployeeBusinessUnitReference(Object inboundCorrespondenceEmployeeBusinessUnitReference) {
    this.inboundCorrespondenceEmployeeBusinessUnitReference = inboundCorrespondenceEmployeeBusinessUnitReference;
  }

  public Inbound dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")


  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

  public Inbound date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inbound inbound = (Inbound) o;
    return Objects.equals(this.inboundCorrespondenceInstanceReference, inbound.inboundCorrespondenceInstanceReference) &&
        Objects.equals(this.inboundCorrespondenceRecord, inbound.inboundCorrespondenceRecord) &&
        Objects.equals(this.inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint, inbound.inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint) &&
        Objects.equals(this.inboundCorrespondenceContent, inbound.inboundCorrespondenceContent) &&
        Objects.equals(this.inboundCorrespondenceAddressee, inbound.inboundCorrespondenceAddressee) &&
        Objects.equals(this.inboundCorrespondenceCustomerReference, inbound.inboundCorrespondenceCustomerReference) &&
        Objects.equals(this.inboundCorrespondenceEmployeeBusinessUnitReference, inbound.inboundCorrespondenceEmployeeBusinessUnitReference) &&
        Objects.equals(this.dateType, inbound.dateType) &&
        Objects.equals(this.date, inbound.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundCorrespondenceInstanceReference, inboundCorrespondenceRecord, inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint, inboundCorrespondenceContent, inboundCorrespondenceAddressee, inboundCorrespondenceCustomerReference, inboundCorrespondenceEmployeeBusinessUnitReference, dateType, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inbound {\n");
    
    sb.append("    inboundCorrespondenceInstanceReference: ").append(toIndentedString(inboundCorrespondenceInstanceReference)).append("\n");
    sb.append("    inboundCorrespondenceRecord: ").append(toIndentedString(inboundCorrespondenceRecord)).append("\n");
    sb.append("    inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint: ").append(toIndentedString(inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductServicerelatedCommaComplaint)).append("\n");
    sb.append("    inboundCorrespondenceContent: ").append(toIndentedString(inboundCorrespondenceContent)).append("\n");
    sb.append("    inboundCorrespondenceAddressee: ").append(toIndentedString(inboundCorrespondenceAddressee)).append("\n");
    sb.append("    inboundCorrespondenceCustomerReference: ").append(toIndentedString(inboundCorrespondenceCustomerReference)).append("\n");
    sb.append("    inboundCorrespondenceEmployeeBusinessUnitReference: ").append(toIndentedString(inboundCorrespondenceEmployeeBusinessUnitReference)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

