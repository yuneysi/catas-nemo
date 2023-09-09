package com.sii.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sii.api.model.EquipmentFamily;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Accessories
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-10T01:02:30.956333+02:00[Europe/Berlin]")
public class Accessories {

  private String id;

  @Valid
  private List<@Valid EquipmentFamily> families;

  public Accessories id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "color-type:uni", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Accessories families(List<@Valid EquipmentFamily> families) {
    this.families = families;
    return this;
  }

  public Accessories addFamiliesItem(EquipmentFamily familiesItem) {
    if (this.families == null) {
      this.families = new ArrayList<>();
    }
    this.families.add(familiesItem);
    return this;
  }

  /**
   * Get families
   * @return families
  */
  @Valid 
  @Schema(name = "families", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("families")
  public List<@Valid EquipmentFamily> getFamilies() {
    return families;
  }

  public void setFamilies(List<@Valid EquipmentFamily> families) {
    this.families = families;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Accessories accessories = (Accessories) o;
    return Objects.equals(this.id, accessories.id) &&
        Objects.equals(this.families, accessories.families);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, families);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Accessories {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    families: ").append(toIndentedString(families)).append("\n");
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

