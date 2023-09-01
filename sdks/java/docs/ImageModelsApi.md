# ImageModelsApi

All URIs are relative to *https://api.tryleap.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteModel**](ImageModelsApi.md#deleteModel) | **DELETE** /api/v2/images/models/{modelId} | Delete a Model |
| [**getModel**](ImageModelsApi.md#getModel) | **GET** /api/v2/images/models/{modelId} | Get a Single Model |
| [**listAllModels**](ImageModelsApi.md#listAllModels) | **GET** /api/v2/images/models | List All Models |
| [**trainModel**](ImageModelsApi.md#trainModel) | **POST** /api/v2/images/models/new | Train Model |


<a name="deleteModel"></a>
# **deleteModel**
> ModelV2Entity deleteModel(modelId).execute();

Delete a Model

This endpoint will delete a model. This is not reversible.

### Example
```java
import com.konfigthis.leap.client.ApiClient;
import com.konfigthis.leap.client.ApiException;
import com.konfigthis.leap.client.ApiResponse;
import com.konfigthis.leap.client.Leap;
import com.konfigthis.leap.client.Configuration;
import com.konfigthis.leap.client.auth.*;
import com.konfigthis.leap.client.model.*;
import com.konfigthis.leap.client.api.ImageModelsApi;
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
    String modelId = "5f9b9c0e-7c1f-4b5c-9c0e-7c1f4b5c9c0e"; // The ID of the model to delete.
    try {
      ModelV2Entity result = client
              .imageModels
              .deleteModel(modelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getSubjectKeyword());
      System.out.println(result.getSubjectType());
      System.out.println(result.getStatus());
      System.out.println(result.getImageSamples());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageModelsApi#deleteModel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelV2Entity> response = client
              .imageModels
              .deleteModel(modelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageModelsApi#deleteModel");
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
| **modelId** | **String**| The ID of the model to delete. | |

### Return type

[**ModelV2Entity**](ModelV2Entity.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted the model |  -  |

<a name="getModel"></a>
# **getModel**
> ModelV2Entity getModel(modelId).execute();

Get a Single Model

This endpoint will return a single model.

### Example
```java
import com.konfigthis.leap.client.ApiClient;
import com.konfigthis.leap.client.ApiException;
import com.konfigthis.leap.client.ApiResponse;
import com.konfigthis.leap.client.Leap;
import com.konfigthis.leap.client.Configuration;
import com.konfigthis.leap.client.auth.*;
import com.konfigthis.leap.client.model.*;
import com.konfigthis.leap.client.api.ImageModelsApi;
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
    String modelId = "5f9b9c0e-7c1f-4b5c-9c0e-7c1f4b5c9c0e"; // The ID of the model to retrieve.
    try {
      ModelV2Entity result = client
              .imageModels
              .getModel(modelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getSubjectKeyword());
      System.out.println(result.getSubjectType());
      System.out.println(result.getStatus());
      System.out.println(result.getImageSamples());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageModelsApi#getModel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelV2Entity> response = client
              .imageModels
              .getModel(modelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageModelsApi#getModel");
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
| **modelId** | **String**| The ID of the model to retrieve. | |

### Return type

[**ModelV2Entity**](ModelV2Entity.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the model. |  -  |
| **404** | Model does not exist |  -  |

<a name="listAllModels"></a>
# **listAllModels**
> ListModelsV2Response listAllModels().execute();

List All Models

This endpoint will return a list of all models for the workspace.

### Example
```java
import com.konfigthis.leap.client.ApiClient;
import com.konfigthis.leap.client.ApiException;
import com.konfigthis.leap.client.ApiResponse;
import com.konfigthis.leap.client.Leap;
import com.konfigthis.leap.client.Configuration;
import com.konfigthis.leap.client.auth.*;
import com.konfigthis.leap.client.model.*;
import com.konfigthis.leap.client.api.ImageModelsApi;
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
    try {
      ListModelsV2Response result = client
              .imageModels
              .listAllModels()
              .execute();
      System.out.println(result);
      System.out.println(result.getModels());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageModelsApi#listAllModels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListModelsV2Response> response = client
              .imageModels
              .listAllModels()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageModelsApi#listAllModels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListModelsV2Response**](ListModelsV2Response.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved models. |  -  |

<a name="trainModel"></a>
# **trainModel**
> ModelV2Entity trainModel().name(name).subjectKeyword(subjectKeyword).subjectType(subjectType).webhookUrl(webhookUrl).imageSampleUrls(imageSampleUrls).imageSampleFiles(imageSampleFiles).execute();

Train Model

Upload a few image samples, and train a new model. Training usually takes 20-40 minutes. To be notified when the model completes training you must provide a &#x60;webhookUrl&#x60; in the training request, or check for completion by calling [Get a Single Model](https://reference.tryleap.ai/reference/get-model-1). After training completes, you can use the model to generate images with [Generate Images](https://reference.tryleap.ai/reference/inferencescontroller_create-1).

### Example
```java
import com.konfigthis.leap.client.ApiClient;
import com.konfigthis.leap.client.ApiException;
import com.konfigthis.leap.client.ApiResponse;
import com.konfigthis.leap.client.Leap;
import com.konfigthis.leap.client.Configuration;
import com.konfigthis.leap.client.auth.*;
import com.konfigthis.leap.client.model.*;
import com.konfigthis.leap.client.api.ImageModelsApi;
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
    String name = "name_example"; // Provide a name so you can more easily identify the model.
    String subjectKeyword = "subjectKeyword_example"; // This is the keyword you will use during image generation to trigger your custom subject. For example \\\"a photo of @me\\\".
    String subjectType = "person"; // The subject type - a short description, usually a noun, that describes what the underlying model is learning. For example: person, man, woman, cat, dog, icon, style. Defaults to \\\"person\\\".
    String webhookUrl = "webhookUrl_example"; // An optional webhook URL that will be called with a POST request when the model completes training or fails.
    List<String> imageSampleUrls = Arrays.asList(); // An array of strings containing the URLs of the images to upload. Either this or imageSampleFiles is required, but not both.
    List<File> imageSampleFiles = Arrays.asList(); // An array of files containing the images to upload. Either this or imageSampleUrls is required, but not both.
    try {
      ModelV2Entity result = client
              .imageModels
              .trainModel()
              .name(name)
              .subjectKeyword(subjectKeyword)
              .subjectType(subjectType)
              .webhookUrl(webhookUrl)
              .imageSampleUrls(imageSampleUrls)
              .imageSampleFiles(imageSampleFiles)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getSubjectKeyword());
      System.out.println(result.getSubjectType());
      System.out.println(result.getStatus());
      System.out.println(result.getImageSamples());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageModelsApi#trainModel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelV2Entity> response = client
              .imageModels
              .trainModel()
              .name(name)
              .subjectKeyword(subjectKeyword)
              .subjectType(subjectType)
              .webhookUrl(webhookUrl)
              .imageSampleUrls(imageSampleUrls)
              .imageSampleFiles(imageSampleFiles)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageModelsApi#trainModel");
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
| **name** | **String**| Provide a name so you can more easily identify the model. | [optional] |
| **subjectKeyword** | **String**| This is the keyword you will use during image generation to trigger your custom subject. For example \\\&quot;a photo of @me\\\&quot;. | [optional] |
| **subjectType** | **String**| The subject type - a short description, usually a noun, that describes what the underlying model is learning. For example: person, man, woman, cat, dog, icon, style. Defaults to \\\&quot;person\\\&quot;. | [optional] [default to person] |
| **webhookUrl** | **String**| An optional webhook URL that will be called with a POST request when the model completes training or fails. | [optional] |
| **imageSampleUrls** | [**List&lt;String&gt;**](String.md)| An array of strings containing the URLs of the images to upload. Either this or imageSampleFiles is required, but not both. | [optional] |
| **imageSampleFiles** | **List&lt;File&gt;**| An array of files containing the images to upload. Either this or imageSampleUrls is required, but not both. | [optional] |

### Return type

[**ModelV2Entity**](ModelV2Entity.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully submitted training job. |  -  |

