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
 * InteriorTiles
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-10T01:34:03.888610+02:00[Europe/Berlin]")
public class InteriorTiles {

  private String id;

  private String familyName;

  @Valid
  private List<@Valid Equipment> equipmentList;

  public InteriorTiles id(String id) {
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

  public InteriorTiles familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Get familyName
   * @return familyName
  */
  
  @Schema(name = "familyName", example = "Uni-Lacke", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("familyName")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public InteriorTiles equipmentList(List<@Valid Equipment> equipmentList) {
    this.equipmentList = equipmentList;
    return this;
  }

  public InteriorTiles addEquipmentListItem(Equipment equipmentListItem) {
    if (this.equipmentList == null) {
      this.equipmentList = new ArrayList<>();
    }
    this.equipmentList.add(equipmentListItem);
    return this;
  }

  /**
   * Get equipmentList
   * @return equipmentList
  */
  @Valid 
  @Schema(name = "equipmentList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("equipmentList")
  public List<@Valid Equipment> getEquipmentList() {
    return equipmentList;
  }

  public void setEquipmentList(List<@Valid Equipment> equipmentList) {
    this.equipmentList = equipmentList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteriorTiles interiorTiles = (InteriorTiles) o;
    return Objects.equals(this.id, interiorTiles.id) &&
        Objects.equals(this.familyName, interiorTiles.familyName) &&
        Objects.equals(this.equipmentList, interiorTiles.equipmentList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, familyName, equipmentList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteriorTiles {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    equipmentList: ").append(toIndentedString(equipmentList)).append("\n");
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

