package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ModelV2Entity;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListModelsV2Response
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-29T22:41:42.165-07:00[America/Los_Angeles]")
public class ListModelsV2Response {

  @JsonProperty("models")
  @Valid
  private List<ModelV2Entity> models = new ArrayList<>();

  public ListModelsV2Response models(List<ModelV2Entity> models) {
    this.models = models;
    return this;
  }

  public ListModelsV2Response addModelsItem(ModelV2Entity modelsItem) {
    this.models.add(modelsItem);
    return this;
  }

  /**
   * Get models
   * @return models
  */
  @NotNull @Valid 
  @Schema(name = "models", required = true)
  public List<ModelV2Entity> getModels() {
    return models;
  }

  public void setModels(List<ModelV2Entity> models) {
    this.models = models;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListModelsV2Response listModelsV2Response = (ListModelsV2Response) o;
    return Objects.equals(this.models, listModelsV2Response.models);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListModelsV2Response {\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
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

