package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ModelV2Entity
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-29T22:41:42.165-07:00[America/Los_Angeles]")
public class ModelV2Entity {

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("createdAt")
  private String createdAt;

  @JsonProperty("subjectKeyword")
  private String subjectKeyword;

  @JsonProperty("subjectType")
  private String subjectType;

  @JsonProperty("status")
  private String status;

  @JsonProperty("imageSamples")
  @Valid
  private List<String> imageSamples = new ArrayList<>();

  public ModelV2Entity id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", required = true)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ModelV2Entity name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ModelV2Entity createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @NotNull 
  @Schema(name = "createdAt", required = true)
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ModelV2Entity subjectKeyword(String subjectKeyword) {
    this.subjectKeyword = subjectKeyword;
    return this;
  }

  /**
   * Get subjectKeyword
   * @return subjectKeyword
  */
  @NotNull 
  @Schema(name = "subjectKeyword", required = true)
  public String getSubjectKeyword() {
    return subjectKeyword;
  }

  public void setSubjectKeyword(String subjectKeyword) {
    this.subjectKeyword = subjectKeyword;
  }

  public ModelV2Entity subjectType(String subjectType) {
    this.subjectType = subjectType;
    return this;
  }

  /**
   * Get subjectType
   * @return subjectType
  */
  @NotNull 
  @Schema(name = "subjectType", required = true)
  public String getSubjectType() {
    return subjectType;
  }

  public void setSubjectType(String subjectType) {
    this.subjectType = subjectType;
  }

  public ModelV2Entity status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull 
  @Schema(name = "status", required = true)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ModelV2Entity imageSamples(List<String> imageSamples) {
    this.imageSamples = imageSamples;
    return this;
  }

  public ModelV2Entity addImageSamplesItem(String imageSamplesItem) {
    this.imageSamples.add(imageSamplesItem);
    return this;
  }

  /**
   * Get imageSamples
   * @return imageSamples
  */
  @NotNull 
  @Schema(name = "imageSamples", required = true)
  public List<String> getImageSamples() {
    return imageSamples;
  }

  public void setImageSamples(List<String> imageSamples) {
    this.imageSamples = imageSamples;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelV2Entity modelV2Entity = (ModelV2Entity) o;
    return Objects.equals(this.id, modelV2Entity.id) &&
        Objects.equals(this.name, modelV2Entity.name) &&
        Objects.equals(this.createdAt, modelV2Entity.createdAt) &&
        Objects.equals(this.subjectKeyword, modelV2Entity.subjectKeyword) &&
        Objects.equals(this.subjectType, modelV2Entity.subjectType) &&
        Objects.equals(this.status, modelV2Entity.status) &&
        Objects.equals(this.imageSamples, modelV2Entity.imageSamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdAt, subjectKeyword, subjectType, status, imageSamples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelV2Entity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    subjectKeyword: ").append(toIndentedString(subjectKeyword)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    imageSamples: ").append(toIndentedString(imageSamples)).append("\n");
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

