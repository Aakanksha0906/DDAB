package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AddressType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-17T11:11:04.278Z")

public class CustomerType   {
  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("contactName")
  private String contactName = null;

  @JsonProperty("contactTitle")
  private String contactTitle = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("fax")
  private String fax = null;

  @JsonProperty("fullAddress")
  private AddressType fullAddress = null;

  @JsonProperty("customerID")
  private String customerID = null;

  public CustomerType companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(example = "helloworld", value = "")


  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public CustomerType contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

  /**
   * Get contactName
   * @return contactName
  **/
  @ApiModelProperty(example = "helloworld", value = "")


  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public CustomerType contactTitle(String contactTitle) {
    this.contactTitle = contactTitle;
    return this;
  }

  /**
   * Get contactTitle
   * @return contactTitle
  **/
  @ApiModelProperty(example = "helloworld", value = "")


  public String getContactTitle() {
    return contactTitle;
  }

  public void setContactTitle(String contactTitle) {
    this.contactTitle = contactTitle;
  }

  public CustomerType phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "helloworld", value = "")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CustomerType fax(String fax) {
    this.fax = fax;
    return this;
  }

  /**
   * Get fax
   * @return fax
  **/
  @ApiModelProperty(example = "helloworld", value = "")


  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public CustomerType fullAddress(AddressType fullAddress) {
    this.fullAddress = fullAddress;
    return this;
  }

  /**
   * Get fullAddress
   * @return fullAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AddressType getFullAddress() {
    return fullAddress;
  }

  public void setFullAddress(AddressType fullAddress) {
    this.fullAddress = fullAddress;
  }

  public CustomerType customerID(String customerID) {
    this.customerID = customerID;
    return this;
  }

  /**
   * Get customerID
   * @return customerID
  **/
  @ApiModelProperty(example = "helloworld", value = "")


  public String getCustomerID() {
    return customerID;
  }

  public void setCustomerID(String customerID) {
    this.customerID = customerID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerType customerType = (CustomerType) o;
    return Objects.equals(this.companyName, customerType.companyName) &&
        Objects.equals(this.contactName, customerType.contactName) &&
        Objects.equals(this.contactTitle, customerType.contactTitle) &&
        Objects.equals(this.phone, customerType.phone) &&
        Objects.equals(this.fax, customerType.fax) &&
        Objects.equals(this.fullAddress, customerType.fullAddress) &&
        Objects.equals(this.customerID, customerType.customerID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, contactName, contactTitle, phone, fax, fullAddress, customerID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerType {\n");
    
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    contactTitle: ").append(toIndentedString(contactTitle)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    fullAddress: ").append(toIndentedString(fullAddress)).append("\n");
    sb.append("    customerID: ").append(toIndentedString(customerID)).append("\n");
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

