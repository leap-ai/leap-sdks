# GenerateMusicApi

All URIs are relative to *https://api.tryleap.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAudio**](GenerateMusicApi.md#createAudio) | **POST** /api/v1/music | Generate Music |
| [**findAllAudio**](GenerateMusicApi.md#findAllAudio) | **GET** /api/v1/music | List Music Generation Jobs |
| [**findOneAudio**](GenerateMusicApi.md#findOneAudio) | **GET** /api/v1/music/{inferenceId} | Get a Music Generation Job |


<a name="createAudio"></a>
# **createAudio**
> MusicgenInferenceEntity createAudio(createMusicgenInferenceDto).execute();

Generate Music

Generate music by providing a text description. Generations usually take bettween 1-3 minutes. Total generation time depends on the &#x60;duration&#x60; you select. This endpoint will submit the generation job and return immediately. To retrieve the results you must provide a webhook URL or query/poll the [Get a Music Generation Job](https://reference.tryleap.ai/reference/musiccontroller_findoneaudio) endpoint.

### Example
```java
import com.konfigthis.leap.client.ApiClient;
import com.konfigthis.leap.client.ApiException;
import com.konfigthis.leap.client.ApiResponse;
import com.konfigthis.leap.client.Leap;
import com.konfigthis.leap.client.Configuration;
import com.konfigthis.leap.client.auth.*;
import com.konfigthis.leap.client.model.*;
import com.konfigthis.leap.client.api.GenerateMusicApi;
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
    String prompt = "An electronic music soundtrack with a trumpet solo"; // A description of the music you want to generate.
    String mode = "melody"; // Select a mode, each option generates different results. Melody is best for melody, music is best for full songs
    Double duration = 28D; // Duration of the generated audio in seconds. Max 30 seconds.
    try {
      MusicgenInferenceEntity result = client
              .generateMusic
              .createAudio(prompt, mode, duration)
              .execute();
      System.out.println(result);

      System.out.println(result.getId());

      System.out.println(result.getCreatedAt());

      System.out.println(result.getPrompt());

      System.out.println(result.getState());

      System.out.println(result.getMediaUri());

    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateMusicApi#createAudio");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MusicgenInferenceEntity> response = client
              .generateMusic
              .createAudio(prompt, mode, duration)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateMusicApi#createAudio");
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
| **createMusicgenInferenceDto** | [**CreateMusicgenInferenceDto**](CreateMusicgenInferenceDto.md)|  | |

### Return type

[**MusicgenInferenceEntity**](MusicgenInferenceEntity.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully submitted music generation job. |  -  |

<a name="findAllAudio"></a>
# **findAllAudio**
> List&lt;MusicgenInferenceEntity&gt; findAllAudio().execute();

List Music Generation Jobs

List all music generation jobs for a workspace.

### Example
```java
import com.konfigthis.leap.client.ApiClient;
import com.konfigthis.leap.client.ApiException;
import com.konfigthis.leap.client.ApiResponse;
import com.konfigthis.leap.client.Leap;
import com.konfigthis.leap.client.Configuration;
import com.konfigthis.leap.client.auth.*;
import com.konfigthis.leap.client.model.*;
import com.konfigthis.leap.client.api.GenerateMusicApi;
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
      List<MusicgenInferenceEntity> result = client
              .generateMusic
              .findAllAudio()
              .execute();
      System.out.println(result);

    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateMusicApi#findAllAudio");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<MusicgenInferenceEntity>> response = client
              .generateMusic
              .findAllAudio()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateMusicApi#findAllAudio");
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

[**List&lt;MusicgenInferenceEntity&gt;**](MusicgenInferenceEntity.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved music generation jobs. |  -  |

<a name="findOneAudio"></a>
# **findOneAudio**
> MusicgenInferenceEntity findOneAudio(inferenceId).execute();

Get a Music Generation Job

Get a specific music generation job.

### Example
```java
import com.konfigthis.leap.client.ApiClient;
import com.konfigthis.leap.client.ApiException;
import com.konfigthis.leap.client.ApiResponse;
import com.konfigthis.leap.client.Leap;
import com.konfigthis.leap.client.Configuration;
import com.konfigthis.leap.client.model.*;
import com.konfigthis.leap.client.api.GenerateMusicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.tryleap.ai";

    Leap client = new Leap(configuration);
    String inferenceId = "inferenceId_example"; // The ID of the music generation job to retrieve. This is the same ID returned when you submit a job.
    try {
      MusicgenInferenceEntity result = client
              .generateMusic
              .findOneAudio(inferenceId)
              .execute();
      System.out.println(result);

      System.out.println(result.getId());

      System.out.println(result.getCreatedAt());

      System.out.println(result.getPrompt());

      System.out.println(result.getState());

      System.out.println(result.getMediaUri());

    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateMusicApi#findOneAudio");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MusicgenInferenceEntity> response = client
              .generateMusic
              .findOneAudio(inferenceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateMusicApi#findOneAudio");
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
| **inferenceId** | **String**| The ID of the music generation job to retrieve. This is the same ID returned when you submit a job. | |

### Return type

[**MusicgenInferenceEntity**](MusicgenInferenceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved music generation job. |  -  |

