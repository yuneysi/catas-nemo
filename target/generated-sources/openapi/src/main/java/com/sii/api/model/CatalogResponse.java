package com.sii.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sii.api.model.Equipment;
import com.sii.api.model.EquipmentGroup;
import com.sii.api.model.ExteriorColor;
import com.sii.api.model.InteriorTiles;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CatalogResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-10T01:02:30.956333+02:00[Europe/Berlin]")
public class CatalogResponse {

  private String carlineId;

  @Valid
  private List<@Valid EquipmentGroup> groups;

  @Valid
  private List<@Valid ExteriorColor> extColors;

  @Valid
  private List<@Valid InteriorTiles> interiorTiles;

  @Valid
  private List<@Valid EquipmentGroup> specialGroups;

  @Valid
  private List<@Valid Equipment> bodyColors;

  @Valid
  private List<@Valid Equipment> roofColors;

  @Valid
  private List<@Valid Equipment> stealthItems;

  @Valid
  private List<@Valid Equipment> accesories;

  public CatalogResponse carlineId(String carlineId) {
    this.carlineId = carlineId;
    return this;
  }

  /**
   * Get carlineId
   * @return carlineId
  */
  
  @Schema(name = "carlineId", example = "a1sb", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carlineId")
  public String getCarlineId() {
    return carlineId;
  }

  public void setCarlineId(String carlineId) {
    this.carlineId = carlineId;
  }

  public CatalogResponse groups(List<@Valid EquipmentGroup> groups) {
    this.groups = groups;
    return this;
  }

  public CatalogResponse addGroupsItem(EquipmentGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
  */
  @Valid 
  @Schema(name = "groups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groups")
  public List<@Valid EquipmentGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<@Valid EquipmentGroup> groups) {
    this.groups = groups;
  }

  public CatalogResponse extColors(List<@Valid ExteriorColor> extColors) {
    this.extColors = extColors;
    return this;
  }

  public CatalogResponse addExtColorsItem(ExteriorColor extColorsItem) {
    if (this.extColors == null) {
      this.extColors = new ArrayList<>();
    }
    this.extColors.add(extColorsItem);
    return this;
  }

  /**
   * Get extColors
   * @return extColors
  */
  @Valid 
  @Schema(name = "extColors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extColors")
  public List<@Valid ExteriorColor> getExtColors() {
    return extColors;
  }

  public void setExtColors(List<@Valid ExteriorColor> extColors) {
    this.extColors = extColors;
  }

  public CatalogResponse interiorTiles(List<@Valid InteriorTiles> interiorTiles) {
    this.interiorTiles = interiorTiles;
    return this;
  }

  public CatalogResponse addInteriorTilesItem(InteriorTiles interiorTilesItem) {
    if (this.interiorTiles == null) {
      this.interiorTiles = new ArrayList<>();
    }
    this.interiorTiles.add(interiorTilesItem);
    return this;
  }

  /**
   * Get interiorTiles
   * @return interiorTiles
  */
  @Valid 
  @Schema(name = "interiorTiles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("interiorTiles")
  public List<@Valid InteriorTiles> getInteriorTiles() {
    return interiorTiles;
  }

  public void setInteriorTiles(List<@Valid InteriorTiles> interiorTiles) {
    this.interiorTiles = interiorTiles;
  }

  public CatalogResponse specialGroups(List<@Valid EquipmentGroup> specialGroups) {
    this.specialGroups = specialGroups;
    return this;
  }

  public CatalogResponse addSpecialGroupsItem(EquipmentGroup specialGroupsItem) {
    if (this.specialGroups == null) {
      this.specialGroups = new ArrayList<>();
    }
    this.specialGroups.add(specialGroupsItem);
    return this;
  }

  /**
   * Get specialGroups
   * @return specialGroups
  */
  @Valid 
  @Schema(name = "specialGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("specialGroups")
  public List<@Valid EquipmentGroup> getSpecialGroups() {
    return specialGroups;
  }

  public void setSpecialGroups(List<@Valid EquipmentGroup> specialGroups) {
    this.specialGroups = specialGroups;
  }

  public CatalogResponse bodyColors(List<@Valid Equipment> bodyColors) {
    this.bodyColors = bodyColors;
    return this;
  }

  public CatalogResponse addBodyColorsItem(Equipment bodyColorsItem) {
    if (this.bodyColors == null) {
      this.bodyColors = new ArrayList<>();
    }
    this.bodyColors.add(bodyColorsItem);
    return this;
  }

  /**
   * Get bodyColors
   * @return bodyColors
  */
  @Valid 
  @Schema(name = "bodyColors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bodyColors")
  public List<@Valid Equipment> getBodyColors() {
    return bodyColors;
  }

  public void setBodyColors(List<@Valid Equipment> bodyColors) {
    this.bodyColors = bodyColors;
  }

  public CatalogResponse roofColors(List<@Valid Equipment> roofColors) {
    this.roofColors = roofColors;
    return this;
  }

  public CatalogResponse addRoofColorsItem(Equipment roofColorsItem) {
    if (this.roofColors == null) {
      this.roofColors = new ArrayList<>();
    }
    this.roofColors.add(roofColorsItem);
    return this;
  }

  /**
   * Get roofColors
   * @return roofColors
  */
  @Valid 
  @Schema(name = "roofColors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roofColors")
  public List<@Valid Equipment> getRoofColors() {
    return roofColors;
  }

  public void setRoofColors(List<@Valid Equipment> roofColors) {
    this.roofColors = roofColors;
  }

  public CatalogResponse stealthItems(List<@Valid Equipment> stealthItems) {
    this.stealthItems = stealthItems;
    return this;
  }

  public CatalogResponse addStealthItemsItem(Equipment stealthItemsItem) {
    if (this.stealthItems == null) {
      this.stealthItems = new ArrayList<>();
    }
    this.stealthItems.add(stealthItemsItem);
    return this;
  }

  /**
   * Get stealthItems
   * @return stealthItems
  */
  @Valid 
  @Schema(name = "stealthItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stealthItems")
  public List<@Valid Equipment> getStealthItems() {
    return stealthItems;
  }

  public void setStealthItems(List<@Valid Equipment> stealthItems) {
    this.stealthItems = stealthItems;
  }

  public CatalogResponse accesories(List<@Valid Equipment> accesories) {
    this.accesories = accesories;
    return this;
  }

  public CatalogResponse addAccesoriesItem(Equipment accesoriesItem) {
    if (this.accesories == null) {
      this.accesories = new ArrayList<>();
    }
    this.accesories.add(accesoriesItem);
    return this;
  }

  /**
   * Get accesories
   * @return accesories
  */
  @Valid 
  @Schema(name = "accesories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accesories")
  public List<@Valid Equipment> getAccesories() {
    return accesories;
  }

  public void setAccesories(List<@Valid Equipment> accesories) {
    this.accesories = accesories;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogResponse catalogResponse = (CatalogResponse) o;
    return Objects.equals(this.carlineId, catalogResponse.carlineId) &&
        Objects.equals(this.groups, catalogResponse.groups) &&
        Objects.equals(this.extColors, catalogResponse.extColors) &&
        Objects.equals(this.interiorTiles, catalogResponse.interiorTiles) &&
        Objects.equals(this.specialGroups, catalogResponse.specialGroups) &&
        Objects.equals(this.bodyColors, catalogResponse.bodyColors) &&
        Objects.equals(this.roofColors, catalogResponse.roofColors) &&
        Objects.equals(this.stealthItems, catalogResponse.stealthItems) &&
        Objects.equals(this.accesories, catalogResponse.accesories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carlineId, groups, extColors, interiorTiles, specialGroups, bodyColors, roofColors, stealthItems, accesories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogResponse {\n");
    sb.append("    carlineId: ").append(toIndentedString(carlineId)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    extColors: ").append(toIndentedString(extColors)).append("\n");
    sb.append("    interiorTiles: ").append(toIndentedString(interiorTiles)).append("\n");
    sb.append("    specialGroups: ").append(toIndentedString(specialGroups)).append("\n");
    sb.append("    bodyColors: ").append(toIndentedString(bodyColors)).append("\n");
    sb.append("    roofColors: ").append(toIndentedString(roofColors)).append("\n");
    sb.append("    stealthItems: ").append(toIndentedString(stealthItems)).append("\n");
    sb.append("    accesories: ").append(toIndentedString(accesories)).append("\n");
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

