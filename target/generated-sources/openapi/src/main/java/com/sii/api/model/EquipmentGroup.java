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
 * EquipmentGroup
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-10T01:47:17.270867+02:00[Europe/Berlin]")
public class EquipmentGroup {

  private String id;

  private String name;

  @Valid
  private List<@Valid EquipmentFamily> equipmentFamilies;

  public EquipmentGroup id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "infotainment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EquipmentGroup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the mbv lasche
   * @return name
  */
  
  @Schema(name = "name", example = "Infotainment/Technology", description = "Name of the mbv lasche", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EquipmentGroup equipmentFamilies(List<@Valid EquipmentFamily> equipmentFamilies) {
    this.equipmentFamilies = equipmentFamilies;
    return this;
  }

  public EquipmentGroup addEquipmentFamiliesItem(EquipmentFamily equipmentFamiliesItem) {
    if (this.equipmentFamilies == null) {
      this.equipmentFamilies = new ArrayList<>();
    }
    this.equipmentFamilies.add(equipmentFamiliesItem);
    return this;
  }

  /**
   * Get equipmentFamilies
   * @return equipmentFamilies
  */
  @Valid 
  @Schema(name = "equipmentFamilies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("equipmentFamilies")
  public List<@Valid EquipmentFamily> getEquipmentFamilies() {
    return equipmentFamilies;
  }

  public void setEquipmentFamilies(List<@Valid EquipmentFamily> equipmentFamilies) {
    this.equipmentFamilies = equipmentFamilies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquipmentGroup equipmentGroup = (EquipmentGroup) o;
    return Objects.equals(this.id, equipmentGroup.id) &&
        Objects.equals(this.name, equipmentGroup.name) &&
        Objects.equals(this.equipmentFamilies, equipmentGroup.equipmentFamilies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, equipmentFamilies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquipmentGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    equipmentFamilies: ").append(toIndentedString(equipmentFamilies)).append("\n");
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

