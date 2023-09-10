package com.sii.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.sii.api.model.EquipmentType;
import com.sii.api.model.PackageContent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Equipment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-10T01:47:17.270867+02:00[Europe/Berlin]")
public class Equipment {

  private String id;

  private String mbvId;

  private String renderCode;

  private String name;

  private EquipmentType equipmentType;

  private Boolean isVisible;

  private Boolean marginable;

  private BigDecimal price;

  @Valid
  private List<Map<String, String>> texts;

  @Valid
  private List<Map<String, String>> media;

  @Valid
  private Map<String, String> attributes = new HashMap<>();

  @Valid
  private List<@Valid PackageContent> content;

  /**
   * Default constructor
   * @deprecated Use {@link Equipment#Equipment(String, String, EquipmentType)}
   */
  @Deprecated
  public Equipment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Equipment(String id, String name, EquipmentType equipmentType) {
    this.id = id;
    this.name = name;
    this.equipmentType = equipmentType;
  }

  public Equipment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The eva key. Display id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "C2D", description = "The eva key. Display id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Equipment mbvId(String mbvId) {
    this.mbvId = mbvId;
    return this;
  }

  /**
   * The mbv id. Internal id
   * @return mbvId
  */
  
  @Schema(name = "mbvId", example = "MRADC2D", description = "The mbv id. Internal id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mbvId")
  public String getMbvId() {
    return mbvId;
  }

  public void setMbvId(String mbvId) {
    this.mbvId = mbvId;
  }

  public Equipment renderCode(String renderCode) {
    this.renderCode = renderCode;
    return this;
  }

  /**
   * The render code.
   * @return renderCode
  */
  
  @Schema(name = "renderCode", example = "MRADC2D", description = "The render code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("renderCode")
  public String getRenderCode() {
    return renderCode;
  }

  public void setRenderCode(String renderCode) {
    this.renderCode = renderCode;
  }

  public Equipment name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Räder, 10-Speichen, 6,5Jx16, Reifen 195/55 R16", description = "The name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Equipment equipmentType(EquipmentType equipmentType) {
    this.equipmentType = equipmentType;
    return this;
  }

  /**
   * Get equipmentType
   * @return equipmentType
  */
  @NotNull @Valid 
  @Schema(name = "equipmentType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("equipmentType")
  public EquipmentType getEquipmentType() {
    return equipmentType;
  }

  public void setEquipmentType(EquipmentType equipmentType) {
    this.equipmentType = equipmentType;
  }

  public Equipment isVisible(Boolean isVisible) {
    this.isVisible = isVisible;
    return this;
  }

  /**
   * The okapi is visible flag. Not used in nemo but in newDcc
   * @return isVisible
  */
  
  @Schema(name = "isVisible", example = "true", description = "The okapi is visible flag. Not used in nemo but in newDcc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isVisible")
  public Boolean getIsVisible() {
    return isVisible;
  }

  public void setIsVisible(Boolean isVisible) {
    this.isVisible = isVisible;
  }

  public Equipment marginable(Boolean marginable) {
    this.marginable = marginable;
    return this;
  }

  /**
   * Not used in nemo but in newDcc
   * @return marginable
  */
  
  @Schema(name = "marginable", description = "Not used in nemo but in newDcc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marginable")
  public Boolean getMarginable() {
    return marginable;
  }

  public void setMarginable(Boolean marginable) {
    this.marginable = marginable;
  }

  public Equipment price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * The mbv list price. Standards never have prices
   * @return price
  */
  @Valid 
  @Schema(name = "price", example = "0.0", description = "The mbv list price. Standards never have prices", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Equipment texts(List<Map<String, String>> texts) {
    this.texts = texts;
    return this;
  }

  public Equipment addTextsItem(Map<String, String> textsItem) {
    if (this.texts == null) {
      this.texts = new ArrayList<>();
    }
    this.texts.add(textsItem);
    return this;
  }

  /**
   * Get texts
   * @return texts
  */
  @Valid 
  @Schema(name = "texts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("texts")
  public List<Map<String, String>> getTexts() {
    return texts;
  }

  public void setTexts(List<Map<String, String>> texts) {
    this.texts = texts;
  }

  public Equipment media(List<Map<String, String>> media) {
    this.media = media;
    return this;
  }

  public Equipment addMediaItem(Map<String, String> mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<>();
    }
    this.media.add(mediaItem);
    return this;
  }

  /**
   * Get media
   * @return media
  */
  @Valid 
  @Schema(name = "media", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media")
  public List<Map<String, String>> getMedia() {
    return media;
  }

  public void setMedia(List<Map<String, String>> media) {
    this.media = media;
  }

  public Equipment attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Equipment putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  public Equipment content(List<@Valid PackageContent> content) {
    this.content = content;
    return this;
  }

  public Equipment addContentItem(PackageContent contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * The content of the package. 
   * @return content
  */
  @Valid 
  @Schema(name = "content", description = "The content of the package. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public List<@Valid PackageContent> getContent() {
    return content;
  }

  public void setContent(List<@Valid PackageContent> content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Equipment equipment = (Equipment) o;
    return Objects.equals(this.id, equipment.id) &&
        Objects.equals(this.mbvId, equipment.mbvId) &&
        Objects.equals(this.renderCode, equipment.renderCode) &&
        Objects.equals(this.name, equipment.name) &&
        Objects.equals(this.equipmentType, equipment.equipmentType) &&
        Objects.equals(this.isVisible, equipment.isVisible) &&
        Objects.equals(this.marginable, equipment.marginable) &&
        Objects.equals(this.price, equipment.price) &&
        Objects.equals(this.texts, equipment.texts) &&
        Objects.equals(this.media, equipment.media) &&
        Objects.equals(this.attributes, equipment.attributes) &&
        Objects.equals(this.content, equipment.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mbvId, renderCode, name, equipmentType, isVisible, marginable, price, texts, media, attributes, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Equipment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mbvId: ").append(toIndentedString(mbvId)).append("\n");
    sb.append("    renderCode: ").append(toIndentedString(renderCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    equipmentType: ").append(toIndentedString(equipmentType)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    marginable: ").append(toIndentedString(marginable)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    texts: ").append(toIndentedString(texts)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

