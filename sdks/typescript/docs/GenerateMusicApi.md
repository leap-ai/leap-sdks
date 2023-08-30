# GenerateMusicApi

All URIs are relative to *https://api.tryleap.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAudio**](GenerateMusicApi.md#createAudio) | **POST** /api/v1/music | Generate Music
[**findAllAudio**](GenerateMusicApi.md#findAllAudio) | **GET** /api/v1/music | List Music Generation Jobs
[**findOneAudio**](GenerateMusicApi.md#findOneAudio) | **GET** /api/v1/music/{inferenceId} | Get a Music Generation Job


# **createAudio**

#### **POST** /api/v1/music

### Description
Generate music by providing a text description. Generations usually take bettween 1-3 minutes. Total generation time depends on the `duration` you select. This endpoint will submit the generation job and return immediately. To retrieve the results you must provide a webhook URL or query/poll the [Get a Music Generation Job](https://reference.tryleap.ai/reference/musiccontroller_findoneaudio) endpoint.

### Example


```typescript
import { Leap } from "@leap-ai/sdk";

const leap = new Leap({
  // Defining the base path is optional and defaults to https://api.tryleap.ai
  // basePath: "https://api.tryleap.ai",
  accessToken: "ACCESS_TOKEN",
});

const createAudioResponse = await leap.generateMusic.createAudio({
  prompt: "An electronic music soundtrack with a trumpet solo",
  mode: "melody",
  duration: 28,
});

console.log(createAudioResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createMusicgenInferenceDto** | **CreateMusicgenInferenceDto**|  |


### Return type

**MusicgenInferenceEntity**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully submitted music generation job. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **findAllAudio**

#### **GET** /api/v1/music

### Description
List all music generation jobs for a workspace.

### Example


```typescript
import { Leap } from "@leap-ai/sdk";

const leap = new Leap({
  // Defining the base path is optional and defaults to https://api.tryleap.ai
  // basePath: "https://api.tryleap.ai",
  accessToken: "ACCESS_TOKEN",
});

const findAllAudioResponse = await leap.generateMusic.findAllAudio();

console.log(findAllAudioResponse);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Array<MusicgenInferenceEntity>**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved music generation jobs. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **findOneAudio**

#### **GET** /api/v1/music/{inferenceId}

### Description
Get a specific music generation job.

### Example


```typescript
import { Leap } from "@leap-ai/sdk";

const leap = new Leap({
  // Defining the base path is optional and defaults to https://api.tryleap.ai
  // basePath: "https://api.tryleap.ai",
});

const findOneAudioResponse = await leap.generateMusic.findOneAudio({
  inferenceId: "inferenceId_example",
});

console.log(findOneAudioResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inferenceId** | [**string**] | The ID of the music generation job to retrieve. This is the same ID returned when you submit a job. | defaults to undefined


### Return type

**MusicgenInferenceEntity**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved music generation job. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


