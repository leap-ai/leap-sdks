# leap-java-sdk

[![Maven Central](https://img.shields.io/badge/Maven%20Central-v1.1.4-blue)](https://central.sonatype.com/artifact/com.konfigthis.leap/leap-java-sdk/1.1.4)
[![More Info](https://img.shields.io/badge/More%20Info-Click%20Here-orange)](https://tryleap.ai/)

The Official Leap API

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis.leap</groupId>
  <artifactId>leap-java-sdk</artifactId>
  <version>1.1.4</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis.leap:leap-java-sdk:1.1.4"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/leap-java-sdk-1.1.4.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.leap.client.ApiClient;
import com.konfigthis.leap.client.ApiException;
import com.konfigthis.leap.client.ApiResponse;
import com.konfigthis.leap.client.Leap;
import com.konfigthis.leap.client.Configuration;
import com.konfigthis.leap.client.auth.*;
import com.konfigthis.leap.client.model.*;
import com.konfigthis.leap.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.tryleap.ai";
    
    // Configure HTTP bearer authorization: bearer
    configuration.token = "BEARER TOKEN";

    Leap client = new Leap(configuration);
    String prompt = "A photo of an astronaut riding a horse"; // A text description of the image you what you want to generate.
    String modelId = "26a1a203-3a46-42cb-8cfa-f4de075907d8"; // The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models
    String negativePrompt = "asymmetric, watermarks"; // A text description of what the image should try to avoid generating.
    Double steps = 50D; // How many steps the AI will take to generate the image. Lower is faster but less detailed, higher is slower more detailed.
    Double width = 1024D; // The width of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models.
    Double height = 1024D; // The height of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models.
    Double numberOfImages = 1D; // The number of images to generate, up to 4.
    Double promptStrength = 7D; // The higher the prompt strength, the closer the generated image will be to the prompt. Must be between 0 and 30.
    Double seed = 4523184D; // A random number to use as a seed when generating the image. This is helpful if you want to generate the same image multiple times. If you want to generate different images, keep this empty or provide a random number.
    String webhookUrl = "webhookUrl_example"; // An optional webhook URL that will be called with a POST request when the image generation request completes.
    try {
      InferenceEntity result = client
              .images
              .generate(prompt, modelId)
              .negativePrompt(negativePrompt)
              .steps(steps)
              .width(width)
              .height(height)
              .numberOfImages(numberOfImages)
              .promptStrength(promptStrength)
              .seed(seed)
              .webhookUrl(webhookUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getPrompt());
      System.out.println(result.getNegativePrompt());
      System.out.println(result.getSeed());
      System.out.println(result.getWidth());
      System.out.println(result.getHeight());
      System.out.println(result.getPromptStrength());
      System.out.println(result.getNumberOfImages());
      System.out.println(result.getState());
      System.out.println(result.getStatus());
      System.out.println(result.getSteps());
      System.out.println(result.getImages());
      System.out.println(result.getModelId());
      System.out.println(result.getUpscalingOption());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#generate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InferenceEntity> response = client
              .images
              .generate(prompt, modelId)
              .negativePrompt(negativePrompt)
              .steps(steps)
              .width(width)
              .height(height)
              .numberOfImages(numberOfImages)
              .promptStrength(promptStrength)
              .seed(seed)
              .webhookUrl(webhookUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#generate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.tryleap.ai*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ImagesApi* | [**generate**](docs/ImagesApi.md#generate) | **POST** /api/v1/images/models/{modelId}/inferences | Generate an Image
*ImagesApi* | [**delete**](docs/ImagesApi.md#delete) | **DELETE** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Delete Image Job
*ImagesApi* | [**findOne**](docs/ImagesApi.md#findOne) | **GET** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Get Single Image Job
*ImagesApi* | [**listAll**](docs/ImagesApi.md#listAll) | **GET** /api/v1/images/models/{modelId}/inferences | List All Image Jobs
*ImageModelsApi* | [**deleteModel**](docs/ImageModelsApi.md#deleteModel) | **DELETE** /api/v2/images/models/{modelId} | Delete a Model
*ImageModelsApi* | [**getModel**](docs/ImageModelsApi.md#getModel) | **GET** /api/v2/images/models/{modelId} | Get a Single Model
*ImageModelsApi* | [**listAllModels**](docs/ImageModelsApi.md#listAllModels) | **GET** /api/v2/images/models | List All Models
*ImageModelsApi* | [**trainModel**](docs/ImageModelsApi.md#trainModel) | **POST** /api/v2/images/models/new | Train Model
*MusicApi* | [**findOne**](docs/MusicApi.md#findOne) | **GET** /api/v1/music/{inferenceId} | Get a Music Generation Job
*MusicApi* | [**generate**](docs/MusicApi.md#generate) | **POST** /api/v1/music | Generate Music
*MusicApi* | [**listAll**](docs/MusicApi.md#listAll) | **GET** /api/v1/music | List Music Generation Jobs


## Documentation for Models

 - [CreateAndTrainModelDto](docs/CreateAndTrainModelDto.md)
 - [CreateInferenceDto](docs/CreateInferenceDto.md)
 - [CreateMusicgenInferenceDto](docs/CreateMusicgenInferenceDto.md)
 - [InferenceEntity](docs/InferenceEntity.md)
 - [InferenceImageEntity](docs/InferenceImageEntity.md)
 - [ListModelsV2Response](docs/ListModelsV2Response.md)
 - [ModelV2Entity](docs/ModelV2Entity.md)
 - [MusicgenInferenceEntity](docs/MusicgenInferenceEntity.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
