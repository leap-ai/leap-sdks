package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateInferenceDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-29T22:41:42.165-07:00[America/Los_Angeles]")
public class CreateInferenceDto {

  @JsonProperty("prompt")
  private String prompt = "A photo of an astronaut riding a horse";

  @JsonProperty("negativePrompt")
  private String negativePrompt = "asymmetric, watermarks";

  @JsonProperty("steps")
  private BigDecimal steps = new BigDecimal("50");

  @JsonProperty("width")
  private BigDecimal width = new BigDecimal("1024");

  @JsonProperty("height")
  private BigDecimal height = new BigDecimal("1024");

  @JsonProperty("numberOfImages")
  private BigDecimal numberOfImages = new BigDecimal("1");

  @JsonProperty("promptStrength")
  private BigDecimal promptStrength = new BigDecimal("7");

  @JsonProperty("seed")
  private BigDecimal seed = new BigDecimal("4523184");

  @JsonProperty("webhookUrl")
  private String webhookUrl;

  public CreateInferenceDto prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

  /**
   * A text description of the image you what you want to generate.
   * @return prompt
  */
  @NotNull 
  @Schema(name = "prompt", example = "A photo of an astronaut riding a horse", description = "A text description of the image you what you want to generate.", required = true)
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  public CreateInferenceDto negativePrompt(String negativePrompt) {
    this.negativePrompt = negativePrompt;
    return this;
  }

  /**
   * A text description of what the image should try to avoid generating.
   * @return negativePrompt
  */
  
  @Schema(name = "negativePrompt", example = "asymmetric, bad hands, bad hair", description = "A text description of what the image should try to avoid generating.", required = false)
  public String getNegativePrompt() {
    return negativePrompt;
  }

  public void setNegativePrompt(String negativePrompt) {
    this.negativePrompt = negativePrompt;
  }

  public CreateInferenceDto steps(BigDecimal steps) {
    this.steps = steps;
    return this;
  }

  /**
   * How many steps the AI will take to generate the image. Lower is faster but less detailed, higher is slower more detailed.
   * @return steps
  */
  @Valid 
  @Schema(name = "steps", example = "50", description = "How many steps the AI will take to generate the image. Lower is faster but less detailed, higher is slower more detailed.", required = false)
  public BigDecimal getSteps() {
    return steps;
  }

  public void setSteps(BigDecimal steps) {
    this.steps = steps;
  }

  public CreateInferenceDto width(BigDecimal width) {
    this.width = width;
    return this;
  }

  /**
   * The width of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models.
   * @return width
  */
  @Valid 
  @Schema(name = "width", example = "1024", description = "The width of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models.", required = false)
  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public CreateInferenceDto height(BigDecimal height) {
    this.height = height;
    return this;
  }

  /**
   * The height of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models.
   * @return height
  */
  @Valid 
  @Schema(name = "height", example = "1024", description = "The height of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models.", required = false)
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public CreateInferenceDto numberOfImages(BigDecimal numberOfImages) {
    this.numberOfImages = numberOfImages;
    return this;
  }

  /**
   * The number of images to generate, up to 4.
   * @return numberOfImages
  */
  @Valid 
  @Schema(name = "numberOfImages", example = "1", description = "The number of images to generate, up to 4.", required = false)
  public BigDecimal getNumberOfImages() {
    return numberOfImages;
  }

  public void setNumberOfImages(BigDecimal numberOfImages) {
    this.numberOfImages = numberOfImages;
  }

  public CreateInferenceDto promptStrength(BigDecimal promptStrength) {
    this.promptStrength = promptStrength;
    return this;
  }

  /**
   * The higher the prompt strength, the closer the generated image will be to the prompt. Must be between 0 and 30.
   * @return promptStrength
  */
  @Valid 
  @Schema(name = "promptStrength", example = "7", description = "The higher the prompt strength, the closer the generated image will be to the prompt. Must be between 0 and 30.", required = false)
  public BigDecimal getPromptStrength() {
    return promptStrength;
  }

  public void setPromptStrength(BigDecimal promptStrength) {
    this.promptStrength = promptStrength;
  }

  public CreateInferenceDto seed(BigDecimal seed) {
    this.seed = seed;
    return this;
  }

  /**
   * A random number to use as a seed when generating the image. This is helpful if you want to generate the same image multiple times. If you want to generate different images, keep this empty or provide a random number.
   * @return seed
  */
  @Valid 
  @Schema(name = "seed", example = "4523184", description = "A random number to use as a seed when generating the image. This is helpful if you want to generate the same image multiple times. If you want to generate different images, keep this empty or provide a random number.", required = false)
  public BigDecimal getSeed() {
    return seed;
  }

  public void setSeed(BigDecimal seed) {
    this.seed = seed;
  }

  public CreateInferenceDto webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

  /**
   * An optional webhook URL that will be called with a POST request when the image generation request completes.
   * @return webhookUrl
  */
  
  @Schema(name = "webhookUrl", description = "An optional webhook URL that will be called with a POST request when the image generation request completes.", required = false)
  public String getWebhookUrl() {
    return webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInferenceDto createInferenceDto = (CreateInferenceDto) o;
    return Objects.equals(this.prompt, createInferenceDto.prompt) &&
        Objects.equals(this.negativePrompt, createInferenceDto.negativePrompt) &&
        Objects.equals(this.steps, createInferenceDto.steps) &&
        Objects.equals(this.width, createInferenceDto.width) &&
        Objects.equals(this.height, createInferenceDto.height) &&
        Objects.equals(this.numberOfImages, createInferenceDto.numberOfImages) &&
        Objects.equals(this.promptStrength, createInferenceDto.promptStrength) &&
        Objects.equals(this.seed, createInferenceDto.seed) &&
        Objects.equals(this.webhookUrl, createInferenceDto.webhookUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prompt, negativePrompt, steps, width, height, numberOfImages, promptStrength, seed, webhookUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInferenceDto {\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    negativePrompt: ").append(toIndentedString(negativePrompt)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    numberOfImages: ").append(toIndentedString(numberOfImages)).append("\n");
    sb.append("    promptStrength: ").append(toIndentedString(promptStrength)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
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

