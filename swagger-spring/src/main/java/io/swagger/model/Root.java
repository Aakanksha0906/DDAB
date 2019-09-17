package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Customers;
import io.swagger.model.Orders;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Root
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-17T11:11:04.278Z")

public class Root   {
  @JsonProperty("customers")
  private Customers customers = null;

  @JsonProperty("orders")
  private Orders orders = null;

  public Root customers(Customers customers) {
    this.customers = customers;
    return this;
  }

  /**
   * Get customers
   * @return customers
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Customers getCustomers() {
    return customers;
  }

  public void setCustomers(Customers customers) {
    this.customers = customers;
  }

  public Root orders(Orders orders) {
    this.orders = orders;
    return this;
  }

  /**
   * Get orders
   * @return orders
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Orders getOrders() {
    return orders;
  }

  public void setOrders(Orders orders) {
    this.orders = orders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Root root = (Root) o;
    return Objects.equals(this.customers, root.customers) &&
        Objects.equals(this.orders, root.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customers, orders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Root {\n");
    
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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

