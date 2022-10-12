package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateInboundRequestInbound
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:56.799Z[GMT]")

public class InitiateInboundRequestInbound   {
  @JsonProperty("InboundCorrespondenceInstanceReference")
  private Object inboundCorrespondenceInstanceReference;

  @JsonProperty("InboundCorrespondenceRecord")
  private String inboundCorrespondenceRecord;

  @JsonProperty("InboundCorrespondenceType(e.g.unsolicitedmessage,productOrservicerelated,complaint)")
  private String inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint;

  @JsonProperty("InboundCorrespondenceContent")
  private String inboundCorrespondenceContent;

  @JsonProperty("InboundCorrespondenceAddressee")
  private String inboundCorrespondenceAddressee;

  @JsonProperty("InboundCorrespondenceCustomerReference")
  private Object inboundCorrespondenceCustomerReference;

  @JsonProperty("InboundCorrespondenceEmployeeOrBusinessUnitReference")
  private Object inboundCorrespondenceEmployeeOrBusinessUnitReference;

  @JsonProperty("DateType")
  private String dateType;

  public InitiateInboundRequestInbound inboundCorrespondenceInstanceReference(Object inboundCorrespondenceInstanceReference) {
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

  public InitiateInboundRequestInbound inboundCorrespondenceRecord(String inboundCorrespondenceRecord) {
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

  public InitiateInboundRequestInbound inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint(String inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint) {
    this.inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint = inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint;
    return this;
  }

  /**
   * Get inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint
   * @return inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint
  */
  @ApiModelProperty(value = "")


  public String getInboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint() {
    return inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint;
  }

  public void setInboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint(String inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint) {
    this.inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint = inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint;
  }

  public InitiateInboundRequestInbound inboundCorrespondenceContent(String inboundCorrespondenceContent) {
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

  public InitiateInboundRequestInbound inboundCorrespondenceAddressee(String inboundCorrespondenceAddressee) {
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

  public InitiateInboundRequestInbound inboundCorrespondenceCustomerReference(Object inboundCorrespondenceCustomerReference) {
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

  public InitiateInboundRequestInbound inboundCorrespondenceEmployeeOrBusinessUnitReference(Object inboundCorrespondenceEmployeeOrBusinessUnitReference) {
    this.inboundCorrespondenceEmployeeOrBusinessUnitReference = inboundCorrespondenceEmployeeOrBusinessUnitReference;
    return this;
  }

  /**
   * Get inboundCorrespondenceEmployeeOrBusinessUnitReference
   * @return inboundCorrespondenceEmployeeOrBusinessUnitReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInboundCorrespondenceEmployeeOrBusinessUnitReference() {
    return inboundCorrespondenceEmployeeOrBusinessUnitReference;
  }

  public void setInboundCorrespondenceEmployeeOrBusinessUnitReference(Object inboundCorrespondenceEmployeeOrBusinessUnitReference) {
    this.inboundCorrespondenceEmployeeOrBusinessUnitReference = inboundCorrespondenceEmployeeOrBusinessUnitReference;
  }

  public InitiateInboundRequestInbound dateType(String dateType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateInboundRequestInbound initiateInboundRequestInbound = (InitiateInboundRequestInbound) o;
    return Objects.equals(this.inboundCorrespondenceInstanceReference, initiateInboundRequestInbound.inboundCorrespondenceInstanceReference) &&
        Objects.equals(this.inboundCorrespondenceRecord, initiateInboundRequestInbound.inboundCorrespondenceRecord) &&
        Objects.equals(this.inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint, initiateInboundRequestInbound.inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint) &&
        Objects.equals(this.inboundCorrespondenceContent, initiateInboundRequestInbound.inboundCorrespondenceContent) &&
        Objects.equals(this.inboundCorrespondenceAddressee, initiateInboundRequestInbound.inboundCorrespondenceAddressee) &&
        Objects.equals(this.inboundCorrespondenceCustomerReference, initiateInboundRequestInbound.inboundCorrespondenceCustomerReference) &&
        Objects.equals(this.inboundCorrespondenceEmployeeOrBusinessUnitReference, initiateInboundRequestInbound.inboundCorrespondenceEmployeeOrBusinessUnitReference) &&
        Objects.equals(this.dateType, initiateInboundRequestInbound.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundCorrespondenceInstanceReference, inboundCorrespondenceRecord, inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint, inboundCorrespondenceContent, inboundCorrespondenceAddressee, inboundCorrespondenceCustomerReference, inboundCorrespondenceEmployeeOrBusinessUnitReference, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateInboundRequestInbound {\n");
    
    sb.append("    inboundCorrespondenceInstanceReference: ").append(toIndentedString(inboundCorrespondenceInstanceReference)).append("\n");
    sb.append("    inboundCorrespondenceRecord: ").append(toIndentedString(inboundCorrespondenceRecord)).append("\n");
    sb.append("    inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint: ").append(toIndentedString(inboundCorrespondenceTypeEGUnsolicitedmessageCommaProductOrservicerelatedCommaComplaint)).append("\n");
    sb.append("    inboundCorrespondenceContent: ").append(toIndentedString(inboundCorrespondenceContent)).append("\n");
    sb.append("    inboundCorrespondenceAddressee: ").append(toIndentedString(inboundCorrespondenceAddressee)).append("\n");
    sb.append("    inboundCorrespondenceCustomerReference: ").append(toIndentedString(inboundCorrespondenceCustomerReference)).append("\n");
    sb.append("    inboundCorrespondenceEmployeeOrBusinessUnitReference: ").append(toIndentedString(inboundCorrespondenceEmployeeOrBusinessUnitReference)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
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

