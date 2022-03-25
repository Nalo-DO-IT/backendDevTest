package com.example.demo.infrastructure.http.external.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Product detail
 */
@ApiModel(description = "Product detail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-25T17:09:46.940004500+01:00[Europe/Madrid]")
public class ProductDetail   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("availability")
  private Boolean availability;

  public ProductDetail id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min = 1) 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min = 1) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductDetail price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public ProductDetail availability(Boolean availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean getAvailability() {
    return availability;
  }

  public void setAvailability(Boolean availability) {
    this.availability = availability;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetail productDetail = (ProductDetail) o;
    return Objects.equals(this.id, productDetail.id) &&
        Objects.equals(this.name, productDetail.name) &&
        Objects.equals(this.price, productDetail.price) &&
        Objects.equals(this.availability, productDetail.availability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price, availability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

