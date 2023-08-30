# GenerateImagesApi

All URIs are relative to *https://api.tryleap.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](GenerateImagesApi.md#create) | **POST** /api/v1/images/models/{modelId}/inferences | Generate an Image |
| [**findAll**](GenerateImagesApi.md#findAll) | **GET** /api/v1/images/models/{modelId}/inferences | List All Image Jobs |
| [**findOne**](GenerateImagesApi.md#findOne) | **GET** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Get Single Image Job |
| [**remove**](GenerateImagesApi.md#remove) | **DELETE** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Delete Image Job |


<a name="create"></a>
# **create**
> InferenceEntity create(modelId, createInferenceDto).execute();

Generate an Image

Generate an image by providing a text description. Generations usually take bettween 4-20 seconds per image. Total generation time depends on the number of &#x60;steps&#x60; and &#x60;noOfImages&#x60; you select. This endpoint will submit the generation job and return immediately. To retrieve the results you must provide a webhook URL or query/poll the [Get a Single Image Job](https://reference.tryleap.ai/reference/inferencescontroller_findone-1) endpoint.

### Example
```java
import com.konfigthis.leap.client.ApiClient;
import com.konfigthis.leap.client.ApiException;
import com.konfigthis.leap.client.ApiResponse;
import com.konfigthis.leap.client.Leap;
import com.konfigthis.leap.client.Configuration;
import com.konfigthis.leap.client.auth.*;
import com.konfigthis.leap.client.model.*;
import com.konfigthis.leap.client.api.GenerateImagesApi;
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
              .generateImages
              .create(prompt, modelId)
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
      System.err.println("Exception when calling GenerateImagesApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InferenceEntity> response = client
              .generateImages
              .create(prompt, modelId)
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
      System.err.println("Exception when calling GenerateImagesApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**| The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models | |
| **createInferenceDto** | [**CreateInferenceDto**](CreateInferenceDto.md)|  | |

### Return type

[**InferenceEntity**](InferenceEntity.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully submitted image generation job. |  -  |

<a name="findAll"></a>
# **findAll**
> List&lt;InferenceEntity&gt; findAll(modelId).onlyFinished(onlyFinished).page(page).pageSize(pageSize).execute();

List All Image Jobs

Fetch a list of inference jobs for a specific model.

### Example
```java
import com.konfigthis.leap.client.ApiClient;
import com.konfigthis.leap.client.ApiException;
import com.konfigthis.leap.client.ApiResponse;
import com.konfigthis.leap.client.Leap;
import com.konfigthis.leap.client.Configuration;
import com.konfigthis.leap.client.auth.*;
import com.konfigthis.leap.client.model.*;
import com.konfigthis.leap.client.api.GenerateImagesApi;
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
    String modelId = "26a1a203-3a46-42cb-8cfa-f4de075907d8"; // The ID of the model to generate images. This can be a custom model or a public model. Visit: https://docs.tryleap.ai/public-models to view the list of public models.
    Boolean onlyFinished = true; // If set to true, only finished inferences will be returned. If set to false or not set, all inference jobs will be returned.
    Double page = 3.4D; // The page to request.
    Double pageSize = 3.4D; // The number of items to return per page.
    try {
      List<InferenceEntity> result = client
              .generateImages
              .findAll(modelId)
              .onlyFinished(onlyFinished)
              .page(page)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateImagesApi#findAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<InferenceEntity>> response = client
              .generateImages
              .findAll(modelId)
              .onlyFinished(onlyFinished)
              .page(page)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateImagesApi#findAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**| The ID of the model to generate images. This can be a custom model or a public model. Visit: https://docs.tryleap.ai/public-models to view the list of public models. | |
| **onlyFinished** | **Boolean**| If set to true, only finished inferences will be returned. If set to false or not set, all inference jobs will be returned. | [optional] |
| **page** | **Double**| The page to request. | [optional] |
| **pageSize** | **Double**| The number of items to return per page. | [optional] |

### Return type

[**List&lt;InferenceEntity&gt;**](InferenceEntity.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved list of image generation jobs. |  -  |

<a name="findOne"></a>
# **findOne**
> InferenceEntity findOne(modelId, inferenceId).execute();

Get Single Image Job

Retrieve a single image generation job, including the urls for the images generated.

### Example
```java
import com.konfigthis.leap.client.ApiClient;
import com.konfigthis.leap.client.ApiException;
import com.konfigthis.leap.client.ApiResponse;
import com.konfigthis.leap.client.Leap;
import com.konfigthis.leap.client.Configuration;
import com.konfigthis.leap.client.auth.*;
import com.konfigthis.leap.client.model.*;
import com.konfigthis.leap.client.api.GenerateImagesApi;
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
    String modelId = "26a1a203-3a46-42cb-8cfa-f4de075907d8"; // The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models
    String inferenceId = "a047df00-8bdd-4d57-a9bd-6eebef36ecaa"; // The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job.
    try {
      InferenceEntity result = client
              .generateImages
              .findOne(modelId, inferenceId)
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
      System.err.println("Exception when calling GenerateImagesApi#findOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InferenceEntity> response = client
              .generateImages
              .findOne(modelId, inferenceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateImagesApi#findOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**| The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models | |
| **inferenceId** | **String**| The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job. | |

### Return type

[**InferenceEntity**](InferenceEntity.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved image generation job. |  -  |

<a name="remove"></a>
# **remove**
> remove(modelId, inferenceId).execute();

Delete Image Job

Delete the image job and all related images.

### Example
```java
import com.konfigthis.leap.client.ApiClient;
import com.konfigthis.leap.client.ApiException;
import com.konfigthis.leap.client.ApiResponse;
import com.konfigthis.leap.client.Leap;
import com.konfigthis.leap.client.Configuration;
import com.konfigthis.leap.client.auth.*;
import com.konfigthis.leap.client.model.*;
import com.konfigthis.leap.client.api.GenerateImagesApi;
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
    String modelId = "26a1a203-3a46-42cb-8cfa-f4de075907d8"; // The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models
    String inferenceId = "a047df00-8bdd-4d57-a9bd-6eebef36ecaa"; // The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job.
    try {
      client
              .generateImages
              .remove(modelId, inferenceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateImagesApi#remove");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .generateImages
              .remove(modelId, inferenceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateImagesApi#remove");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**| The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models | |
| **inferenceId** | **String**| The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job. | |

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted image generation job. |  -  |

