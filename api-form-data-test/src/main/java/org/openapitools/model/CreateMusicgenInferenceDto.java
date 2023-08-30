package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateMusicgenInferenceDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-29T22:41:42.165-07:00[America/Los_Angeles]")
public class CreateMusicgenInferenceDto {

  @JsonProperty("prompt")
  private String prompt = "An electronic music soundtrack with a trumpet solo";

  /**
   * Select a mode, each option generates different results. Melody is best for melody, music is best for full songs
   */
  public enum ModeEnum {
    MELODY("melody"),
    
    MUSIC("music");

    private String value;

    ModeEnum(String value) {
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
    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("mode")
  private ModeEnum mode = ModeEnum.MELODY;

  @JsonProperty("duration")
  private BigDecimal duration = new BigDecimal("28");

  public CreateMusicgenInferenceDto prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

  /**
   * A description of the music you want to generate.
   * @return prompt
  */
  @NotNull 
  @Schema(name = "prompt", example = "An electronic music soundtrack with a trumpet solo", description = "A description of the music you want to generate.", required = true)
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  public CreateMusicgenInferenceDto mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Select a mode, each option generates different results. Melody is best for melody, music is best for full songs
   * @return mode
  */
  @NotNull 
  @Schema(name = "mode", description = "Select a mode, each option generates different results. Melody is best for melody, music is best for full songs", required = true)
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public CreateMusicgenInferenceDto duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration of the generated audio in seconds. Max 30 seconds.
   * @return duration
  */
  @NotNull @Valid 
  @Schema(name = "duration", description = "Duration of the generated audio in seconds. Max 30 seconds.", required = true)
  public BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMusicgenInferenceDto createMusicgenInferenceDto = (CreateMusicgenInferenceDto) o;
    return Objects.equals(this.prompt, createMusicgenInferenceDto.prompt) &&
        Objects.equals(this.mode, createMusicgenInferenceDto.mode) &&
        Objects.equals(this.duration, createMusicgenInferenceDto.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prompt, mode, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMusicgenInferenceDto {\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

