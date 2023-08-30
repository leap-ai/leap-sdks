package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.InferenceImageEntity;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InferenceEntity
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-29T22:41:42.165-07:00[America/Los_Angeles]")
public class InferenceEntity {

  @JsonProperty("id")
  private String id;

  @JsonProperty("createdAt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("prompt")
  private String prompt;

  @JsonProperty("negativePrompt")
  private String negativePrompt;

  @JsonProperty("seed")
  private BigDecimal seed;

  @JsonProperty("width")
  private BigDecimal width;

  @JsonProperty("height")
  private BigDecimal height;

  @JsonProperty("promptStrength")
  private BigDecimal promptStrength;

  @JsonProperty("numberOfImages")
  private BigDecimal numberOfImages;

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

  @JsonProperty("steps")
  private BigDecimal steps;

  @JsonProperty("images")
  @Valid
  private List<InferenceImageEntity> images = new ArrayList<>();

  @JsonProperty("modelId")
  @Valid
  private List<String> modelId = new ArrayList<>();

  /**
   * Gets or Sets upscalingOption
   */
  public enum UpscalingOptionEnum {
    X1("x1"),
    
    X2("x2"),
    
    X4("x4");

    private String value;

    UpscalingOptionEnum(String value) {
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
    public static UpscalingOptionEnum fromValue(String value) {
      for (UpscalingOptionEnum b : UpscalingOptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("upscalingOption")
  private UpscalingOptionEnum upscalingOption;

  public InferenceEntity id(String id) {
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

  public InferenceEntity createdAt(OffsetDateTime createdAt) {
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

  public InferenceEntity prompt(String prompt) {
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

  public InferenceEntity negativePrompt(String negativePrompt) {
    this.negativePrompt = negativePrompt;
    return this;
  }

  /**
   * Get negativePrompt
   * @return negativePrompt
  */
  @NotNull 
  @Schema(name = "negativePrompt", required = true)
  public String getNegativePrompt() {
    return negativePrompt;
  }

  public void setNegativePrompt(String negativePrompt) {
    this.negativePrompt = negativePrompt;
  }

  public InferenceEntity seed(BigDecimal seed) {
    this.seed = seed;
    return this;
  }

  /**
   * Get seed
   * @return seed
  */
  @NotNull @Valid 
  @Schema(name = "seed", required = true)
  public BigDecimal getSeed() {
    return seed;
  }

  public void setSeed(BigDecimal seed) {
    this.seed = seed;
  }

  public InferenceEntity width(BigDecimal width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
  */
  @NotNull @Valid 
  @Schema(name = "width", required = true)
  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public InferenceEntity height(BigDecimal height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  */
  @NotNull @Valid 
  @Schema(name = "height", required = true)
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public InferenceEntity promptStrength(BigDecimal promptStrength) {
    this.promptStrength = promptStrength;
    return this;
  }

  /**
   * Get promptStrength
   * @return promptStrength
  */
  @NotNull @Valid 
  @Schema(name = "promptStrength", required = true)
  public BigDecimal getPromptStrength() {
    return promptStrength;
  }

  public void setPromptStrength(BigDecimal promptStrength) {
    this.promptStrength = promptStrength;
  }

  public InferenceEntity numberOfImages(BigDecimal numberOfImages) {
    this.numberOfImages = numberOfImages;
    return this;
  }

  /**
   * Get numberOfImages
   * @return numberOfImages
  */
  @NotNull @Valid 
  @Schema(name = "numberOfImages", required = true)
  public BigDecimal getNumberOfImages() {
    return numberOfImages;
  }

  public void setNumberOfImages(BigDecimal numberOfImages) {
    this.numberOfImages = numberOfImages;
  }

  public InferenceEntity state(StateEnum state) {
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

  public InferenceEntity steps(BigDecimal steps) {
    this.steps = steps;
    return this;
  }

  /**
   * Get steps
   * @return steps
  */
  @NotNull @Valid 
  @Schema(name = "steps", required = true)
  public BigDecimal getSteps() {
    return steps;
  }

  public void setSteps(BigDecimal steps) {
    this.steps = steps;
  }

  public InferenceEntity images(List<InferenceImageEntity> images) {
    this.images = images;
    return this;
  }

  public InferenceEntity addImagesItem(InferenceImageEntity imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  */
  @NotNull @Valid 
  @Schema(name = "images", required = true)
  public List<InferenceImageEntity> getImages() {
    return images;
  }

  public void setImages(List<InferenceImageEntity> images) {
    this.images = images;
  }

  public InferenceEntity modelId(List<String> modelId) {
    this.modelId = modelId;
    return this;
  }

  public InferenceEntity addModelIdItem(String modelIdItem) {
    this.modelId.add(modelIdItem);
    return this;
  }

  /**
   * Get modelId
   * @return modelId
  */
  @NotNull 
  @Schema(name = "modelId", required = true)
  public List<String> getModelId() {
    return modelId;
  }

  public void setModelId(List<String> modelId) {
    this.modelId = modelId;
  }

  public InferenceEntity upscalingOption(UpscalingOptionEnum upscalingOption) {
    this.upscalingOption = upscalingOption;
    return this;
  }

  /**
   * Get upscalingOption
   * @return upscalingOption
  */
  @NotNull 
  @Schema(name = "upscalingOption", required = true)
  public UpscalingOptionEnum getUpscalingOption() {
    return upscalingOption;
  }

  public void setUpscalingOption(UpscalingOptionEnum upscalingOption) {
    this.upscalingOption = upscalingOption;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InferenceEntity inferenceEntity = (InferenceEntity) o;
    return Objects.equals(this.id, inferenceEntity.id) &&
        Objects.equals(this.createdAt, inferenceEntity.createdAt) &&
        Objects.equals(this.prompt, inferenceEntity.prompt) &&
        Objects.equals(this.negativePrompt, inferenceEntity.negativePrompt) &&
        Objects.equals(this.seed, inferenceEntity.seed) &&
        Objects.equals(this.width, inferenceEntity.width) &&
        Objects.equals(this.height, inferenceEntity.height) &&
        Objects.equals(this.promptStrength, inferenceEntity.promptStrength) &&
        Objects.equals(this.numberOfImages, inferenceEntity.numberOfImages) &&
        Objects.equals(this.state, inferenceEntity.state) &&
        Objects.equals(this.steps, inferenceEntity.steps) &&
        Objects.equals(this.images, inferenceEntity.images) &&
        Objects.equals(this.modelId, inferenceEntity.modelId) &&
        Objects.equals(this.upscalingOption, inferenceEntity.upscalingOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, prompt, negativePrompt, seed, width, height, promptStrength, numberOfImages, state, steps, images, modelId, upscalingOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InferenceEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    negativePrompt: ").append(toIndentedString(negativePrompt)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    promptStrength: ").append(toIndentedString(promptStrength)).append("\n");
    sb.append("    numberOfImages: ").append(toIndentedString(numberOfImages)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    upscalingOption: ").append(toIndentedString(upscalingOption)).append("\n");
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

