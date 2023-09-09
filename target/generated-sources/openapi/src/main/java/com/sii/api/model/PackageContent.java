package com.sii.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PackageContent
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-10T01:02:30.956333+02:00[Europe/Berlin]")
public class PackageContent {

  private String name;

  private String id;

  private String mbvId;

  private String evaKey;

  /**
   * Default constructor
   * @deprecated Use {@link PackageContent#PackageContent(String, String, String)}
   */
  @Deprecated
  public PackageContent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PackageContent(String name, String id, String mbvId) {
    this.name = name;
    this.id = id;
    this.mbvId = mbvId;
  }

  public PackageContent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "tbd", description = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PackageContent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "tbd", description = "The id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PackageContent mbvId(String mbvId) {
    this.mbvId = mbvId;
    return this;
  }

  /**
   * the mbv id
   * @return mbvId
  */
  @NotNull 
  @Schema(name = "mbvId", example = "tbd", description = "the mbv id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mbvId")
  public String getMbvId() {
    return mbvId;
  }

  public void setMbvId(String mbvId) {
    this.mbvId = mbvId;
  }

  public PackageContent evaKey(String evaKey) {
    this.evaKey = evaKey;
    return this;
  }

  /**
   * Get evaKey
   * @return evaKey
  */
  
  @Schema(name = "evaKey", example = "KK1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("evaKey")
  public String getEvaKey() {
    return evaKey;
  }

  public void setEvaKey(String evaKey) {
    this.evaKey = evaKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageContent packageContent = (PackageContent) o;
    return Objects.equals(this.name, packageContent.name) &&
        Objects.equals(this.id, packageContent.id) &&
        Objects.equals(this.mbvId, packageContent.mbvId) &&
        Objects.equals(this.evaKey, packageContent.evaKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, mbvId, evaKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageContent {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mbvId: ").append(toIndentedString(mbvId)).append("\n");
    sb.append("    evaKey: ").append(toIndentedString(evaKey)).append("\n");
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

