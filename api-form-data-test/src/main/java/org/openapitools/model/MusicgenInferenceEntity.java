package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MusicgenInferenceEntity
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-29T22:41:42.165-07:00[America/Los_Angeles]")
public class MusicgenInferenceEntity {

  @JsonProperty("id")
  private String id;

  @JsonProperty("createdAt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("prompt")
  private String prompt;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    FAILED("failed"),
    
    FINISHED("finished"),
    
    PROCESSING("processing"),
    
    QUEUED("queued");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("state")
  private StateEnum state;

  @JsonProperty("media_uri")
  private String mediaUri;

  public MusicgenInferenceEntity id(String id) {
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

  public MusicgenInferenceEntity createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @NotNull @Valid 
  @Schema(name = "createdAt", required = true)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public MusicgenInferenceEntity prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

  /**
   * Get prompt
   * @return prompt
  */
  @NotNull 
  @Schema(name = "prompt", required = true)
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  public MusicgenInferenceEntity state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @NotNull 
  @Schema(name = "state", required = true)
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public MusicgenInferenceEntity mediaUri(String mediaUri) {
    this.mediaUri = mediaUri;
    return this;
  }

  /**
   * Get mediaUri
   * @return mediaUri
  */
  
  @Schema(name = "media_uri", required = false)
  public String getMediaUri() {
    return mediaUri;
  }

  public void setMediaUri(String mediaUri) {
    this.mediaUri = mediaUri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MusicgenInferenceEntity musicgenInferenceEntity = (MusicgenInferenceEntity) o;
    return Objects.equals(this.id, musicgenInferenceEntity.id) &&
        Objects.equals(this.createdAt, musicgenInferenceEntity.createdAt) &&
        Objects.equals(this.prompt, musicgenInferenceEntity.prompt) &&
        Objects.equals(this.state, musicgenInferenceEntity.state) &&
        Objects.equals(this.mediaUri, musicgenInferenceEntity.mediaUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, prompt, state, mediaUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MusicgenInferenceEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    mediaUri: ").append(toIndentedString(mediaUri)).append("\n");
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

