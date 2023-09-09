package com.sii.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sii.api.model.Equipment;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EquipmentFamily
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-10T01:34:03.888610+02:00[Europe/Berlin]")
public class EquipmentFamily {

  private String id;

  private String name;

  @Valid
  private List<@Valid Equipment> equipments;

  public EquipmentFamily id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "exterior.exterior", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EquipmentFamily name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", example = "Exterior", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EquipmentFamily equipments(List<@Valid Equipment> equipments) {
    this.equipments = equipments;
    return this;
  }

  public EquipmentFamily addEquipmentsItem(Equipment equipmentsItem) {
    if (this.equipments == null) {
      this.equipments = new ArrayList<>();
    }
    this.equipments.add(equipmentsItem);
    return this;
  }

  /**
   * Get equipments
   * @return equipments
  */
  @Valid 
  @Schema(name = "equipments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("equipments")
  public List<@Valid Equipment> getEquipments() {
    return equipments;
  }

  public void setEquipments(List<@Valid Equipment> equipments) {
    this.equipments = equipments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquipmentFamily equipmentFamily = (EquipmentFamily) o;
    return Objects.equals(this.id, equipmentFamily.id) &&
        Objects.equals(this.name, equipmentFamily.name) &&
        Objects.equals(this.equipments, equipmentFamily.equipments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, equipments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquipmentFamily {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    equipments: ").append(toIndentedString(equipments)).append("\n");
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

