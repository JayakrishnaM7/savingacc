package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Outbound
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:56.799Z[GMT]")

public class Outbound   {
  @JsonProperty("CorrespondenceSourceReference")
  private Object correspondenceSourceReference;

  @JsonProperty("CorrespondenceRecord")
  private String correspondenceRecord;

  @JsonProperty("CorrespondenceType")
  private String correspondenceType;

  @JsonProperty("CorrespondenceTemplateReference")
  private Object correspondenceTemplateReference;

  @JsonProperty("CorrespondenceTemplateRecord")
  private String correspondenceTemplateRecord;

  @JsonProperty("CorrespondenceContent")
  private String correspondenceContent;

  @JsonProperty("CorrespondenceMedia/Channel")
  private String correspondenceMediaChannel;

  @JsonProperty("CorrespondenceAddressee")
  private String correspondenceAddressee;

  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("ChannelAccessPreferenceReference")
  private Object channelAccessPreferenceReference;

  @JsonProperty("ChannelAccessPreferenceProfile")
  private String channelAccessPreferenceProfile;

  @JsonProperty("ChannelAccessChannel/DeviceType")
  private String channelAccessChannelDeviceType;

  @JsonProperty("ChannelAccessChannel/DeviceTypePreference")
  private String channelAccessChannelDeviceTypePreference;

  @JsonProperty("ProductandServiceType")
  private String productandServiceType;

  @JsonProperty("Employee/BusinessUnitReference")
  private Object employeeBusinessUnitReference;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("Date")
  private String date;

  public Outbound correspondenceSourceReference(Object correspondenceSourceReference) {
    this.correspondenceSourceReference = correspondenceSourceReference;
    return this;
  }

  /**
   * Get correspondenceSourceReference
   * @return correspondenceSourceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCorrespondenceSourceReference() {
    return correspondenceSourceReference;
  }

  public void setCorrespondenceSourceReference(Object correspondenceSourceReference) {
    this.correspondenceSourceReference = correspondenceSourceReference;
  }

  public Outbound correspondenceRecord(String correspondenceRecord) {
    this.correspondenceRecord = correspondenceRecord;
    return this;
  }

  /**
   * Get correspondenceRecord
   * @return correspondenceRecord
  */
  @ApiModelProperty(value = "")


  public String getCorrespondenceRecord() {
    return correspondenceRecord;
  }

  public void setCorrespondenceRecord(String correspondenceRecord) {
    this.correspondenceRecord = correspondenceRecord;
  }

  public Outbound correspondenceType(String correspondenceType) {
    this.correspondenceType = correspondenceType;
    return this;
  }

  /**
   * Get correspondenceType
   * @return correspondenceType
  */
  @ApiModelProperty(value = "")


  public String getCorrespondenceType() {
    return correspondenceType;
  }

  public void setCorrespondenceType(String correspondenceType) {
    this.correspondenceType = correspondenceType;
  }

  public Outbound correspondenceTemplateReference(Object correspondenceTemplateReference) {
    this.correspondenceTemplateReference = correspondenceTemplateReference;
    return this;
  }

  /**
   * Get correspondenceTemplateReference
   * @return correspondenceTemplateReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCorrespondenceTemplateReference() {
    return correspondenceTemplateReference;
  }

  public void setCorrespondenceTemplateReference(Object correspondenceTemplateReference) {
    this.correspondenceTemplateReference = correspondenceTemplateReference;
  }

  public Outbound correspondenceTemplateRecord(String correspondenceTemplateRecord) {
    this.correspondenceTemplateRecord = correspondenceTemplateRecord;
    return this;
  }

  /**
   * Get correspondenceTemplateRecord
   * @return correspondenceTemplateRecord
  */
  @ApiModelProperty(value = "")


  public String getCorrespondenceTemplateRecord() {
    return correspondenceTemplateRecord;
  }

  public void setCorrespondenceTemplateRecord(String correspondenceTemplateRecord) {
    this.correspondenceTemplateRecord = correspondenceTemplateRecord;
  }

  public Outbound correspondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
    return this;
  }

  /**
   * Get correspondenceContent
   * @return correspondenceContent
  */
  @ApiModelProperty(value = "")


  public String getCorrespondenceContent() {
    return correspondenceContent;
  }

  public void setCorrespondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
  }

  public Outbound correspondenceMediaChannel(String correspondenceMediaChannel) {
    this.correspondenceMediaChannel = correspondenceMediaChannel;
    return this;
  }

  /**
   * Get correspondenceMediaChannel
   * @return correspondenceMediaChannel
  */
  @ApiModelProperty(value = "")


  public String getCorrespondenceMediaChannel() {
    return correspondenceMediaChannel;
  }

  public void setCorrespondenceMediaChannel(String correspondenceMediaChannel) {
    this.correspondenceMediaChannel = correspondenceMediaChannel;
  }

  public Outbound correspondenceAddressee(String correspondenceAddressee) {
    this.correspondenceAddressee = correspondenceAddressee;
    return this;
  }

  /**
   * Get correspondenceAddressee
   * @return correspondenceAddressee
  */
  @ApiModelProperty(value = "")


  public String getCorrespondenceAddressee() {
    return correspondenceAddressee;
  }

  public void setCorrespondenceAddressee(String correspondenceAddressee) {
    this.correspondenceAddressee = correspondenceAddressee;
  }

  public Outbound customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public Outbound channelAccessPreferenceReference(Object channelAccessPreferenceReference) {
    this.channelAccessPreferenceReference = channelAccessPreferenceReference;
    return this;
  }

  /**
   * Get channelAccessPreferenceReference
   * @return channelAccessPreferenceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getChannelAccessPreferenceReference() {
    return channelAccessPreferenceReference;
  }

  public void setChannelAccessPreferenceReference(Object channelAccessPreferenceReference) {
    this.channelAccessPreferenceReference = channelAccessPreferenceReference;
  }

  public Outbound channelAccessPreferenceProfile(String channelAccessPreferenceProfile) {
    this.channelAccessPreferenceProfile = channelAccessPreferenceProfile;
    return this;
  }

  /**
   * Get channelAccessPreferenceProfile
   * @return channelAccessPreferenceProfile
  */
  @ApiModelProperty(value = "")


  public String getChannelAccessPreferenceProfile() {
    return channelAccessPreferenceProfile;
  }

  public void setChannelAccessPreferenceProfile(String channelAccessPreferenceProfile) {
    this.channelAccessPreferenceProfile = channelAccessPreferenceProfile;
  }

  public Outbound channelAccessChannelDeviceType(String channelAccessChannelDeviceType) {
    this.channelAccessChannelDeviceType = channelAccessChannelDeviceType;
    return this;
  }

  /**
   * Get channelAccessChannelDeviceType
   * @return channelAccessChannelDeviceType
  */
  @ApiModelProperty(value = "")


  public String getChannelAccessChannelDeviceType() {
    return channelAccessChannelDeviceType;
  }

  public void setChannelAccessChannelDeviceType(String channelAccessChannelDeviceType) {
    this.channelAccessChannelDeviceType = channelAccessChannelDeviceType;
  }

  public Outbound channelAccessChannelDeviceTypePreference(String channelAccessChannelDeviceTypePreference) {
    this.channelAccessChannelDeviceTypePreference = channelAccessChannelDeviceTypePreference;
    return this;
  }

  /**
   * Get channelAccessChannelDeviceTypePreference
   * @return channelAccessChannelDeviceTypePreference
  */
  @ApiModelProperty(value = "")


  public String getChannelAccessChannelDeviceTypePreference() {
    return channelAccessChannelDeviceTypePreference;
  }

  public void setChannelAccessChannelDeviceTypePreference(String channelAccessChannelDeviceTypePreference) {
    this.channelAccessChannelDeviceTypePreference = channelAccessChannelDeviceTypePreference;
  }

  public Outbound productandServiceType(String productandServiceType) {
    this.productandServiceType = productandServiceType;
    return this;
  }

  /**
   * Get productandServiceType
   * @return productandServiceType
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceType() {
    return productandServiceType;
  }

  public void setProductandServiceType(String productandServiceType) {
    this.productandServiceType = productandServiceType;
  }

  public Outbound employeeBusinessUnitReference(Object employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    return this;
  }

  /**
   * Get employeeBusinessUnitReference
   * @return employeeBusinessUnitReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(Object employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }

  public Outbound dateType(String dateType) {
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

  public Outbound date(String date) {
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
    Outbound outbound = (Outbound) o;
    return Objects.equals(this.correspondenceSourceReference, outbound.correspondenceSourceReference) &&
        Objects.equals(this.correspondenceRecord, outbound.correspondenceRecord) &&
        Objects.equals(this.correspondenceType, outbound.correspondenceType) &&
        Objects.equals(this.correspondenceTemplateReference, outbound.correspondenceTemplateReference) &&
        Objects.equals(this.correspondenceTemplateRecord, outbound.correspondenceTemplateRecord) &&
        Objects.equals(this.correspondenceContent, outbound.correspondenceContent) &&
        Objects.equals(this.correspondenceMediaChannel, outbound.correspondenceMediaChannel) &&
        Objects.equals(this.correspondenceAddressee, outbound.correspondenceAddressee) &&
        Objects.equals(this.customerReference, outbound.customerReference) &&
        Objects.equals(this.channelAccessPreferenceReference, outbound.channelAccessPreferenceReference) &&
        Objects.equals(this.channelAccessPreferenceProfile, outbound.channelAccessPreferenceProfile) &&
        Objects.equals(this.channelAccessChannelDeviceType, outbound.channelAccessChannelDeviceType) &&
        Objects.equals(this.channelAccessChannelDeviceTypePreference, outbound.channelAccessChannelDeviceTypePreference) &&
        Objects.equals(this.productandServiceType, outbound.productandServiceType) &&
        Objects.equals(this.employeeBusinessUnitReference, outbound.employeeBusinessUnitReference) &&
        Objects.equals(this.dateType, outbound.dateType) &&
        Objects.equals(this.date, outbound.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondenceSourceReference, correspondenceRecord, correspondenceType, correspondenceTemplateReference, correspondenceTemplateRecord, correspondenceContent, correspondenceMediaChannel, correspondenceAddressee, customerReference, channelAccessPreferenceReference, channelAccessPreferenceProfile, channelAccessChannelDeviceType, channelAccessChannelDeviceTypePreference, productandServiceType, employeeBusinessUnitReference, dateType, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outbound {\n");
    
    sb.append("    correspondenceSourceReference: ").append(toIndentedString(correspondenceSourceReference)).append("\n");
    sb.append("    correspondenceRecord: ").append(toIndentedString(correspondenceRecord)).append("\n");
    sb.append("    correspondenceType: ").append(toIndentedString(correspondenceType)).append("\n");
    sb.append("    correspondenceTemplateReference: ").append(toIndentedString(correspondenceTemplateReference)).append("\n");
    sb.append("    correspondenceTemplateRecord: ").append(toIndentedString(correspondenceTemplateRecord)).append("\n");
    sb.append("    correspondenceContent: ").append(toIndentedString(correspondenceContent)).append("\n");
    sb.append("    correspondenceMediaChannel: ").append(toIndentedString(correspondenceMediaChannel)).append("\n");
    sb.append("    correspondenceAddressee: ").append(toIndentedString(correspondenceAddressee)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    channelAccessPreferenceReference: ").append(toIndentedString(channelAccessPreferenceReference)).append("\n");
    sb.append("    channelAccessPreferenceProfile: ").append(toIndentedString(channelAccessPreferenceProfile)).append("\n");
    sb.append("    channelAccessChannelDeviceType: ").append(toIndentedString(channelAccessChannelDeviceType)).append("\n");
    sb.append("    channelAccessChannelDeviceTypePreference: ").append(toIndentedString(channelAccessChannelDeviceTypePreference)).append("\n");
    sb.append("    productandServiceType: ").append(toIndentedString(productandServiceType)).append("\n");
    sb.append("    employeeBusinessUnitReference: ").append(toIndentedString(employeeBusinessUnitReference)).append("\n");
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

