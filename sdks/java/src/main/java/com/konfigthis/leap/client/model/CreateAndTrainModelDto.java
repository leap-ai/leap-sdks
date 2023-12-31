/*
 * Leap
 * The Official Leap API
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.leap.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.leap.client.JSON;

/**
 * CreateAndTrainModelDto
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateAndTrainModelDto {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUBJECT_KEYWORD = "subjectKeyword";
  @SerializedName(SERIALIZED_NAME_SUBJECT_KEYWORD)
  private String subjectKeyword;

  public static final String SERIALIZED_NAME_SUBJECT_TYPE = "subjectType";
  @SerializedName(SERIALIZED_NAME_SUBJECT_TYPE)
  private String subjectType = "person";

  public static final String SERIALIZED_NAME_WEBHOOK_URL = "webhookUrl";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_URL)
  private String webhookUrl;

  public static final String SERIALIZED_NAME_IMAGE_SAMPLE_URLS = "imageSampleUrls";
  @SerializedName(SERIALIZED_NAME_IMAGE_SAMPLE_URLS)
  private List<String> imageSampleUrls = null;

  public static final String SERIALIZED_NAME_IMAGE_SAMPLE_FILES = "imageSampleFiles";
  @SerializedName(SERIALIZED_NAME_IMAGE_SAMPLE_FILES)
  private List<File> imageSampleFiles = null;

  public CreateAndTrainModelDto() {
  }

  public CreateAndTrainModelDto name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Provide a name so you can more easily identify the model.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Alex Avatar Model", value = "Provide a name so you can more easily identify the model.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CreateAndTrainModelDto subjectKeyword(String subjectKeyword) {
    
    
    
    
    this.subjectKeyword = subjectKeyword;
    return this;
  }

   /**
   * This is the keyword you will use during image generation to trigger your custom subject. For example \&quot;a photo of @me\&quot;.
   * @return subjectKeyword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "@me", value = "This is the keyword you will use during image generation to trigger your custom subject. For example \"a photo of @me\".")

  public String getSubjectKeyword() {
    return subjectKeyword;
  }


  public void setSubjectKeyword(String subjectKeyword) {
    
    
    
    this.subjectKeyword = subjectKeyword;
  }


  public CreateAndTrainModelDto subjectType(String subjectType) {
    
    
    
    
    this.subjectType = subjectType;
    return this;
  }

   /**
   * The subject type - a short description, usually a noun, that describes what the underlying model is learning. For example: person, man, woman, cat, dog, icon, style. Defaults to \&quot;person\&quot;.
   * @return subjectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject type - a short description, usually a noun, that describes what the underlying model is learning. For example: person, man, woman, cat, dog, icon, style. Defaults to \"person\".")

  public String getSubjectType() {
    return subjectType;
  }


  public void setSubjectType(String subjectType) {
    
    
    
    this.subjectType = subjectType;
  }


  public CreateAndTrainModelDto webhookUrl(String webhookUrl) {
    
    
    
    
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * An optional webhook URL that will be called with a POST request when the model completes training or fails.
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/api/webhook", value = "An optional webhook URL that will be called with a POST request when the model completes training or fails.")

  public String getWebhookUrl() {
    return webhookUrl;
  }


  public void setWebhookUrl(String webhookUrl) {
    
    
    
    this.webhookUrl = webhookUrl;
  }


  public CreateAndTrainModelDto imageSampleUrls(List<String> imageSampleUrls) {
    
    
    
    
    this.imageSampleUrls = imageSampleUrls;
    return this;
  }

  public CreateAndTrainModelDto addImageSampleUrlsItem(String imageSampleUrlsItem) {
    if (this.imageSampleUrls == null) {
      this.imageSampleUrls = new ArrayList<>();
    }
    this.imageSampleUrls.add(imageSampleUrlsItem);
    return this;
  }

   /**
   * An array of strings containing the URLs of the images to upload. Either this or imageSampleFiles is required, but not both.
   * @return imageSampleUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of strings containing the URLs of the images to upload. Either this or imageSampleFiles is required, but not both.")

  public List<String> getImageSampleUrls() {
    return imageSampleUrls;
  }


  public void setImageSampleUrls(List<String> imageSampleUrls) {
    
    
    
    this.imageSampleUrls = imageSampleUrls;
  }


  public CreateAndTrainModelDto imageSampleFiles(List<File> imageSampleFiles) {
    
    
    
    
    this.imageSampleFiles = imageSampleFiles;
    return this;
  }

  public CreateAndTrainModelDto addImageSampleFilesItem(File imageSampleFilesItem) {
    if (this.imageSampleFiles == null) {
      this.imageSampleFiles = new ArrayList<>();
    }
    this.imageSampleFiles.add(imageSampleFilesItem);
    return this;
  }

   /**
   * An array of files containing the images to upload. Either this or imageSampleUrls is required, but not both.
   * @return imageSampleFiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of files containing the images to upload. Either this or imageSampleUrls is required, but not both.")

  public List<File> getImageSampleFiles() {
    return imageSampleFiles;
  }


  public void setImageSampleFiles(List<File> imageSampleFiles) {
    
    
    
    this.imageSampleFiles = imageSampleFiles;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CreateAndTrainModelDto instance itself
   */
  public CreateAndTrainModelDto putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAndTrainModelDto createAndTrainModelDto = (CreateAndTrainModelDto) o;
    return Objects.equals(this.name, createAndTrainModelDto.name) &&
        Objects.equals(this.subjectKeyword, createAndTrainModelDto.subjectKeyword) &&
        Objects.equals(this.subjectType, createAndTrainModelDto.subjectType) &&
        Objects.equals(this.webhookUrl, createAndTrainModelDto.webhookUrl) &&
        Objects.equals(this.imageSampleUrls, createAndTrainModelDto.imageSampleUrls) &&
        Objects.equals(this.imageSampleFiles, createAndTrainModelDto.imageSampleFiles)&&
        Objects.equals(this.additionalProperties, createAndTrainModelDto.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subjectKeyword, subjectType, webhookUrl, imageSampleUrls, imageSampleFiles, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAndTrainModelDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subjectKeyword: ").append(toIndentedString(subjectKeyword)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    imageSampleUrls: ").append(toIndentedString(imageSampleUrls)).append("\n");
    sb.append("    imageSampleFiles: ").append(toIndentedString(imageSampleFiles)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("subjectKeyword");
    openapiFields.add("subjectType");
    openapiFields.add("webhookUrl");
    openapiFields.add("imageSampleUrls");
    openapiFields.add("imageSampleFiles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateAndTrainModelDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateAndTrainModelDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAndTrainModelDto is not found in the empty JSON string", CreateAndTrainModelDto.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("subjectKeyword") != null && !jsonObj.get("subjectKeyword").isJsonNull()) && !jsonObj.get("subjectKeyword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subjectKeyword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subjectKeyword").toString()));
      }
      if ((jsonObj.get("subjectType") != null && !jsonObj.get("subjectType").isJsonNull()) && !jsonObj.get("subjectType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subjectType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subjectType").toString()));
      }
      if ((jsonObj.get("webhookUrl") != null && !jsonObj.get("webhookUrl").isJsonNull()) && !jsonObj.get("webhookUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhookUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhookUrl").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("imageSampleUrls") != null && !jsonObj.get("imageSampleUrls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageSampleUrls` to be an array in the JSON string but got `%s`", jsonObj.get("imageSampleUrls").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("imageSampleFiles") != null && !jsonObj.get("imageSampleFiles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageSampleFiles` to be an array in the JSON string but got `%s`", jsonObj.get("imageSampleFiles").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAndTrainModelDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAndTrainModelDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAndTrainModelDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAndTrainModelDto.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAndTrainModelDto>() {
           @Override
           public void write(JsonWriter out, CreateAndTrainModelDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAndTrainModelDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateAndTrainModelDto instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateAndTrainModelDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAndTrainModelDto
  * @throws IOException if the JSON string is invalid with respect to CreateAndTrainModelDto
  */
  public static CreateAndTrainModelDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAndTrainModelDto.class);
  }

 /**
  * Convert an instance of CreateAndTrainModelDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

