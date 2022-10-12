package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveCorrespondenceOperatingSessionResponseOutbound
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:56.799Z[GMT]")

public class RetrieveCorrespondenceOperatingSessionResponseOutbound   {
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

  @JsonProperty("CorrespondenceMediaOrChannel")
  private String correspondenceMediaOrChannel;

  @JsonProperty("CorrespondenceAddressee")
  private String correspondenceAddressee;

  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("ChannelAccessPreferenceReference")
  private Object channelAccessPreferenceReference;

  @JsonProperty("ChannelAccessPreferenceProfile")
  private String channelAccessPreferenceProfile;

  @JsonProperty("ChannelAccessChannelOrDeviceType")
  private String channelAccessChannelOrDeviceType;

  @JsonProperty("ChannelAccessChannelOrDeviceTypePreference")
  private String channelAccessChannelOrDeviceTypePreference;

  @JsonProperty("ProductandServiceType")
  private String productandServiceType;

  @JsonProperty("EmployeeOrBusinessUnitReference")
  private Object employeeOrBusinessUnitReference;

  @JsonProperty("DateType")
  private String dateType;

  public RetrieveCorrespondenceOperatingSessionResponseOutbound correspondenceSourceReference(Object correspondenceSourceReference) {
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

  public RetrieveCorrespondenceOperatingSessionResponseOutbound correspondenceRecord(String correspondenceRecord) {
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

  public RetrieveCorrespondenceOperatingSessionResponseOutbound correspondenceType(String correspondenceType) {
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

  public RetrieveCorrespondenceOperatingSessionResponseOutbound correspondenceTemplateReference(Object correspondenceTemplateReference) {
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

  public RetrieveCorrespondenceOperatingSessionResponseOutbound correspondenceTemplateRecord(String correspondenceTemplateRecord) {
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

  public RetrieveCorrespondenceOperatingSessionResponseOutbound correspondenceContent(String correspondenceContent) {
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

  public RetrieveCorrespondenceOperatingSessionResponseOutbound correspondenceMediaOrChannel(String correspondenceMediaOrChannel) {
    this.correspondenceMediaOrChannel = correspondenceMediaOrChannel;
    return this;
  }

  /**
   * Get correspondenceMediaOrChannel
   * @return correspondenceMediaOrChannel
  */
  @ApiModelProperty(value = "")


  public String getCorrespondenceMediaOrChannel() {
    return correspondenceMediaOrChannel;
  }

  public void setCorrespondenceMediaOrChannel(String correspondenceMediaOrChannel) {
    this.correspondenceMediaOrChannel = correspondenceMediaOrChannel;
  }

  public RetrieveCorrespondenceOperatingSessionResponseOutbound correspondenceAddressee(String correspondenceAddressee) {
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

  public RetrieveCorrespondenceOperatingSessionResponseOutbound customerReference(Object customerReference) {
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

  public RetrieveCorrespondenceOperatingSessionResponseOutbound channelAccessPreferenceReference(Object channelAccessPreferenceReference) {
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

  public RetrieveCorrespondenceOperatingSessionResponseOutbound channelAccessPreferenceProfile(String channelAccessPreferenceProfile) {
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

  public RetrieveCorrespondenceOperatingSessionResponseOutbound channelAccessChannelOrDeviceType(String channelAccessChannelOrDeviceType) {
    this.channelAccessChannelOrDeviceType = channelAccessChannelOrDeviceType;
    return this;
  }

  /**
   * Get channelAccessChannelOrDeviceType
   * @return channelAccessChannelOrDeviceType
  */
  @ApiModelProperty(value = "")


  public String getChannelAccessChannelOrDeviceType() {
    return channelAccessChannelOrDeviceType;
  }

  public void setChannelAccessChannelOrDeviceType(String channelAccessChannelOrDeviceType) {
    this.channelAccessChannelOrDeviceType = channelAccessChannelOrDeviceType;
  }

  public RetrieveCorrespondenceOperatingSessionResponseOutbound channelAccessChannelOrDeviceTypePreference(String channelAccessChannelOrDeviceTypePreference) {
    this.channelAccessChannelOrDeviceTypePreference = channelAccessChannelOrDeviceTypePreference;
    return this;
  }

  /**
   * Get channelAccessChannelOrDeviceTypePreference
   * @return channelAccessChannelOrDeviceTypePreference
  */
  @ApiModelProperty(value = "")


  public String getChannelAccessChannelOrDeviceTypePreference() {
    return channelAccessChannelOrDeviceTypePreference;
  }

  public void setChannelAccessChannelOrDeviceTypePreference(String channelAccessChannelOrDeviceTypePreference) {
    this.channelAccessChannelOrDeviceTypePreference = channelAccessChannelOrDeviceTypePreference;
  }

  public RetrieveCorrespondenceOperatingSessionResponseOutbound productandServiceType(String productandServiceType) {
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

  public RetrieveCorrespondenceOperatingSessionResponseOutbound employeeOrBusinessUnitReference(Object employeeOrBusinessUnitReference) {
    this.employeeOrBusinessUnitReference = employeeOrBusinessUnitReference;
    return this;
  }

  /**
   * Get employeeOrBusinessUnitReference
   * @return employeeOrBusinessUnitReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeeOrBusinessUnitReference() {
    return employeeOrBusinessUnitReference;
  }

  public void setEmployeeOrBusinessUnitReference(Object employeeOrBusinessUnitReference) {
    this.employeeOrBusinessUnitReference = employeeOrBusinessUnitReference;
  }

  public RetrieveCorrespondenceOperatingSessionResponseOutbound dateType(String dateType) {
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
    RetrieveCorrespondenceOperatingSessionResponseOutbound retrieveCorrespondenceOperatingSessionResponseOutbound = (RetrieveCorrespondenceOperatingSessionResponseOutbound) o;
    return Objects.equals(this.correspondenceSourceReference, retrieveCorrespondenceOperatingSessionResponseOutbound.correspondenceSourceReference) &&
        Objects.equals(this.correspondenceRecord, retrieveCorrespondenceOperatingSessionResponseOutbound.correspondenceRecord) &&
        Objects.equals(this.correspondenceType, retrieveCorrespondenceOperatingSessionResponseOutbound.correspondenceType) &&
        Objects.equals(this.correspondenceTemplateReference, retrieveCorrespondenceOperatingSessionResponseOutbound.correspondenceTemplateReference) &&
        Objects.equals(this.correspondenceTemplateRecord, retrieveCorrespondenceOperatingSessionResponseOutbound.correspondenceTemplateRecord) &&
        Objects.equals(this.correspondenceContent, retrieveCorrespondenceOperatingSessionResponseOutbound.correspondenceContent) &&
        Objects.equals(this.correspondenceMediaOrChannel, retrieveCorrespondenceOperatingSessionResponseOutbound.correspondenceMediaOrChannel) &&
        Objects.equals(this.correspondenceAddressee, retrieveCorrespondenceOperatingSessionResponseOutbound.correspondenceAddressee) &&
        Objects.equals(this.customerReference, retrieveCorrespondenceOperatingSessionResponseOutbound.customerReference) &&
        Objects.equals(this.channelAccessPreferenceReference, retrieveCorrespondenceOperatingSessionResponseOutbound.channelAccessPreferenceReference) &&
        Objects.equals(this.channelAccessPreferenceProfile, retrieveCorrespondenceOperatingSessionResponseOutbound.channelAccessPreferenceProfile) &&
        Objects.equals(this.channelAccessChannelOrDeviceType, retrieveCorrespondenceOperatingSessionResponseOutbound.channelAccessChannelOrDeviceType) &&
        Objects.equals(this.channelAccessChannelOrDeviceTypePreference, retrieveCorrespondenceOperatingSessionResponseOutbound.channelAccessChannelOrDeviceTypePreference) &&
        Objects.equals(this.productandServiceType, retrieveCorrespondenceOperatingSessionResponseOutbound.productandServiceType) &&
        Objects.equals(this.employeeOrBusinessUnitReference, retrieveCorrespondenceOperatingSessionResponseOutbound.employeeOrBusinessUnitReference) &&
        Objects.equals(this.dateType, retrieveCorrespondenceOperatingSessionResponseOutbound.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondenceSourceReference, correspondenceRecord, correspondenceType, correspondenceTemplateReference, correspondenceTemplateRecord, correspondenceContent, correspondenceMediaOrChannel, correspondenceAddressee, customerReference, channelAccessPreferenceReference, channelAccessPreferenceProfile, channelAccessChannelOrDeviceType, channelAccessChannelOrDeviceTypePreference, productandServiceType, employeeOrBusinessUnitReference, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveCorrespondenceOperatingSessionResponseOutbound {\n");
    
    sb.append("    correspondenceSourceReference: ").append(toIndentedString(correspondenceSourceReference)).append("\n");
    sb.append("    correspondenceRecord: ").append(toIndentedString(correspondenceRecord)).append("\n");
    sb.append("    correspondenceType: ").append(toIndentedString(correspondenceType)).append("\n");
    sb.append("    correspondenceTemplateReference: ").append(toIndentedString(correspondenceTemplateReference)).append("\n");
    sb.append("    correspondenceTemplateRecord: ").append(toIndentedString(correspondenceTemplateRecord)).append("\n");
    sb.append("    correspondenceContent: ").append(toIndentedString(correspondenceContent)).append("\n");
    sb.append("    correspondenceMediaOrChannel: ").append(toIndentedString(correspondenceMediaOrChannel)).append("\n");
    sb.append("    correspondenceAddressee: ").append(toIndentedString(correspondenceAddressee)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    channelAccessPreferenceReference: ").append(toIndentedString(channelAccessPreferenceReference)).append("\n");
    sb.append("    channelAccessPreferenceProfile: ").append(toIndentedString(channelAccessPreferenceProfile)).append("\n");
    sb.append("    channelAccessChannelOrDeviceType: ").append(toIndentedString(channelAccessChannelOrDeviceType)).append("\n");
    sb.append("    channelAccessChannelOrDeviceTypePreference: ").append(toIndentedString(channelAccessChannelOrDeviceTypePreference)).append("\n");
    sb.append("    productandServiceType: ").append(toIndentedString(productandServiceType)).append("\n");
    sb.append("    employeeOrBusinessUnitReference: ").append(toIndentedString(employeeOrBusinessUnitReference)).append("\n");
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

