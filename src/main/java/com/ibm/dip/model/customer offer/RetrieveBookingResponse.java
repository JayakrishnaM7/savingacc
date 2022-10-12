package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer offer.InitiateCustomerOfferProcedureRequestBooking;
import com.ibm.dip.model.customer offer.RetrieveFacilityApplicationResponseCustomerOfferProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveBookingResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class RetrieveBookingResponse   {
  @JsonProperty("CustomerOfferProcedure")
  private RetrieveFacilityApplicationResponseCustomerOfferProcedure customerOfferProcedure;

  @JsonProperty("Booking")
  private InitiateCustomerOfferProcedureRequestBooking booking;

  public RetrieveBookingResponse customerOfferProcedure(RetrieveFacilityApplicationResponseCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
    return this;
  }

  /**
   * Get customerOfferProcedure
   * @return customerOfferProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveFacilityApplicationResponseCustomerOfferProcedure getCustomerOfferProcedure() {
    return customerOfferProcedure;
  }

  public void setCustomerOfferProcedure(RetrieveFacilityApplicationResponseCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
  }

  public RetrieveBookingResponse booking(InitiateCustomerOfferProcedureRequestBooking booking) {
    this.booking = booking;
    return this;
  }

  /**
   * Get booking
   * @return booking
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCustomerOfferProcedureRequestBooking getBooking() {
    return booking;
  }

  public void setBooking(InitiateCustomerOfferProcedureRequestBooking booking) {
    this.booking = booking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveBookingResponse retrieveBookingResponse = (RetrieveBookingResponse) o;
    return Objects.equals(this.customerOfferProcedure, retrieveBookingResponse.customerOfferProcedure) &&
        Objects.equals(this.booking, retrieveBookingResponse.booking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedure, booking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveBookingResponse {\n");
    
    sb.append("    customerOfferProcedure: ").append(toIndentedString(customerOfferProcedure)).append("\n");
    sb.append("    booking: ").append(toIndentedString(booking)).append("\n");
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

