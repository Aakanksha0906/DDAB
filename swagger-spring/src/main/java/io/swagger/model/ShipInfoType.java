package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ShipInfoType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-17T11:11:04.278Z")

public class ShipInfoType   {
  @JsonProperty("shipVia")
  private Integer shipVia = null;

  @JsonProperty("freight")
  private BigDecimal freight = null;

  @JsonProperty("shipName")
  private String shipName = null;

  @JsonProperty("shipAddress")
  private String shipAddress = null;

  @JsonProperty("shipCity")
  private String shipCity = null;

  @JsonProperty("shipRegion")
  private String shipRegion = null;

  @JsonProperty("shipPostalCode")
  private String shipPostalCode = null;

  @JsonProperty("shipCountry")
  private String shipCountry = null;

  @JsonProperty("shippedDate")
  private LocalDate shippedDate = null;

  public ShipInfoType shipVia(Integer shipVia) {
    this.shipVia = shipVia;
    return this;
  }

  /**
   * Get shipVia
   * @return shipVia
  **/
  @ApiModelProperty(example = "6598741", value = "")


  public Integer getShipVia() {
    return shipVia;
  }

  public void setShipVia(Integer shipVia) {
    this.shipVia = shipVia;
  }

  public ShipInfoType freight(BigDecimal freight) {
    this.freight = freight;
    return this;
  }

  /**
   * Get freight
   * @return freight
  **/
  @ApiModelProperty(example = "655498.5456", value = "")

  @Valid

  public BigDecimal getFreight() {
    return freight;
  }

  public void setFreight(BigDecimal freight) {
    this.freight = freight;
  }

  public ShipInfoType shipName(String shipName) {
    this.shipName = shipName;
    return this;
  }

  /**
   * Get shipName
   * @return shipName
  **/
  @ApiModelProperty(example = "helloworld", value = "")


  public String getShipName() {
    return shipName;
  }

  public void setShipName(String shipName) {
    this.shipName = shipName;
  }

  public ShipInfoType shipAddress(String shipAddress) {
    this.shipAddress = shipAddress;
    return this;
  }

  /**
   * Get shipAddress
   * @return shipAddress
  **/
  @ApiModelProperty(example = "helloworld", value = "")


  public String getShipAddress() {
    return shipAddress;
  }

  public void setShipAddress(String shipAddress) {
    this.shipAddress = shipAddress;
  }

  public ShipInfoType shipCity(String shipCity) {
    this.shipCity = shipCity;
    return this;
  }

  /**
   * Get shipCity
   * @return shipCity
  **/
  @ApiModelProperty(example = "helloworld", value = "")


  public String getShipCity() {
    return shipCity;
  }

  public void setShipCity(String shipCity) {
    this.shipCity = shipCity;
  }

  public ShipInfoType shipRegion(String shipRegion) {
    this.shipRegion = shipRegion;
    return this;
  }

  /**
   * Get shipRegion
   * @return shipRegion
  **/
  @ApiModelProperty(example = "helloworld", value = "")


  public String getShipRegion() {
    return shipRegion;
  }

  public void setShipRegion(String shipRegion) {
    this.shipRegion = shipRegion;
  }

  public ShipInfoType shipPostalCode(String shipPostalCode) {
    this.shipPostalCode = shipPostalCode;
    return this;
  }

  /**
   * Get shipPostalCode
   * @return shipPostalCode
  **/
  @ApiModelProperty(example = "helloworld", value = "")


  public String getShipPostalCode() {
    return shipPostalCode;
  }

  public void setShipPostalCode(String shipPostalCode) {
    this.shipPostalCode = shipPostalCode;
  }

  public ShipInfoType shipCountry(String shipCountry) {
    this.shipCountry = shipCountry;
    return this;
  }

  /**
   * Get shipCountry
   * @return shipCountry
  **/
  @ApiModelProperty(example = "helloworld", value = "")


  public String getShipCountry() {
    return shipCountry;
  }

  public void setShipCountry(String shipCountry) {
    this.shipCountry = shipCountry;
  }

  public ShipInfoType shippedDate(LocalDate shippedDate) {
    this.shippedDate = shippedDate;
    return this;
  }

  /**
   * Get shippedDate
   * @return shippedDate
  **/
  @ApiModelProperty(example = "12252019", value = "")

  @Valid

  public LocalDate getShippedDate() {
    return shippedDate;
  }

  public void setShippedDate(LocalDate shippedDate) {
    this.shippedDate = shippedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipInfoType shipInfoType = (ShipInfoType) o;
    return Objects.equals(this.shipVia, shipInfoType.shipVia) &&
        Objects.equals(this.freight, shipInfoType.freight) &&
        Objects.equals(this.shipName, shipInfoType.shipName) &&
        Objects.equals(this.shipAddress, shipInfoType.shipAddress) &&
        Objects.equals(this.shipCity, shipInfoType.shipCity) &&
        Objects.equals(this.shipRegion, shipInfoType.shipRegion) &&
        Objects.equals(this.shipPostalCode, shipInfoType.shipPostalCode) &&
        Objects.equals(this.shipCountry, shipInfoType.shipCountry) &&
        Objects.equals(this.shippedDate, shipInfoType.shippedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipVia, freight, shipName, shipAddress, shipCity, shipRegion, shipPostalCode, shipCountry, shippedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipInfoType {\n");
    
    sb.append("    shipVia: ").append(toIndentedString(shipVia)).append("\n");
    sb.append("    freight: ").append(toIndentedString(freight)).append("\n");
    sb.append("    shipName: ").append(toIndentedString(shipName)).append("\n");
    sb.append("    shipAddress: ").append(toIndentedString(shipAddress)).append("\n");
    sb.append("    shipCity: ").append(toIndentedString(shipCity)).append("\n");
    sb.append("    shipRegion: ").append(toIndentedString(shipRegion)).append("\n");
    sb.append("    shipPostalCode: ").append(toIndentedString(shipPostalCode)).append("\n");
    sb.append("    shipCountry: ").append(toIndentedString(shipCountry)).append("\n");
    sb.append("    shippedDate: ").append(toIndentedString(shippedDate)).append("\n");
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

