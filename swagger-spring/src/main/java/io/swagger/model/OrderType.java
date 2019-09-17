package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ShipInfoType;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-17T11:11:04.278Z")

public class OrderType   {
  @JsonProperty("customerID")
  private String customerID = null;

  @JsonProperty("employeeID")
  private String employeeID = null;

  @JsonProperty("orderDate")
  private LocalDate orderDate = null;

  @JsonProperty("requiredDate")
  private LocalDate requiredDate = null;

  @JsonProperty("shipInfo")
  private ShipInfoType shipInfo = null;

  public OrderType customerID(String customerID) {
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

  public OrderType employeeID(String employeeID) {
    this.employeeID = employeeID;
    return this;
  }

  /**
   * Get employeeID
   * @return employeeID
  **/
  @ApiModelProperty(example = "helloworld", value = "")


  public String getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(String employeeID) {
    this.employeeID = employeeID;
  }

  public OrderType orderDate(LocalDate orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  /**
   * Get orderDate
   * @return orderDate
  **/
  @ApiModelProperty(example = "12252019", value = "")

  @Valid

  public LocalDate getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(LocalDate orderDate) {
    this.orderDate = orderDate;
  }

  public OrderType requiredDate(LocalDate requiredDate) {
    this.requiredDate = requiredDate;
    return this;
  }

  /**
   * Get requiredDate
   * @return requiredDate
  **/
  @ApiModelProperty(example = "12252019", value = "")

  @Valid

  public LocalDate getRequiredDate() {
    return requiredDate;
  }

  public void setRequiredDate(LocalDate requiredDate) {
    this.requiredDate = requiredDate;
  }

  public OrderType shipInfo(ShipInfoType shipInfo) {
    this.shipInfo = shipInfo;
    return this;
  }

  /**
   * Get shipInfo
   * @return shipInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ShipInfoType getShipInfo() {
    return shipInfo;
  }

  public void setShipInfo(ShipInfoType shipInfo) {
    this.shipInfo = shipInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderType orderType = (OrderType) o;
    return Objects.equals(this.customerID, orderType.customerID) &&
        Objects.equals(this.employeeID, orderType.employeeID) &&
        Objects.equals(this.orderDate, orderType.orderDate) &&
        Objects.equals(this.requiredDate, orderType.requiredDate) &&
        Objects.equals(this.shipInfo, orderType.shipInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerID, employeeID, orderDate, requiredDate, shipInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderType {\n");
    
    sb.append("    customerID: ").append(toIndentedString(customerID)).append("\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    requiredDate: ").append(toIndentedString(requiredDate)).append("\n");
    sb.append("    shipInfo: ").append(toIndentedString(shipInfo)).append("\n");
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

