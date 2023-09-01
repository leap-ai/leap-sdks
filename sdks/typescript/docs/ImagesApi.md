# ImagesApi

All URIs are relative to *https://api.tryleap.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](ImagesApi.md#delete) | **DELETE** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Delete Image Job
[**findOne**](ImagesApi.md#findOne) | **GET** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Get Single Image Job
[**generate**](ImagesApi.md#generate) | **POST** /api/v1/images/models/{modelId}/inferences | Generate an Image
[**listAll**](ImagesApi.md#listAll) | **GET** /api/v1/images/models/{modelId}/inferences | List All Image Jobs


# **delete**

#### **DELETE** /api/v1/images/models/{modelId}/inferences/{inferenceId}

### Description
Delete the image job and all related images.

### Example


```typescript
import { Leap } from "@leap-ai/sdk";

const leap = new Leap({
  // Defining the base path is optional and defaults to https://api.tryleap.ai
  // basePath: "https://api.tryleap.ai",
  accessToken: "ACCESS_TOKEN",
});

const deleteResponse = await leap.images.delete({
  modelId: "modelId_example",
  inferenceId: "inferenceId_example",
});

console.log(deleteResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | [**string**] | The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models | defaults to undefined
 **inferenceId** | [**string**] | The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job. | defaults to undefined


### Return type

void (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully deleted image generation job. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **findOne**

#### **GET** /api/v1/images/models/{modelId}/inferences/{inferenceId}

### Description
Retrieve a single image generation job, including the urls for the images generated.

### Example


```typescript
import { Leap } from "@leap-ai/sdk";

const leap = new Leap({
  // Defining the base path is optional and defaults to https://api.tryleap.ai
  // basePath: "https://api.tryleap.ai",
  accessToken: "ACCESS_TOKEN",
});

const findOneResponse = await leap.images.findOne({
  modelId: "modelId_example",
  inferenceId: "inferenceId_example",
});

console.log(findOneResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | [**string**] | The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models | defaults to undefined
 **inferenceId** | [**string**] | The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job. | defaults to undefined


### Return type

**InferenceEntity**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved image generation job. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **generate**

#### **POST** /api/v1/images/models/{modelId}/inferences

### Description
Generate an image by providing a text description. Generations usually take bettween 4-20 seconds per image. Total generation time depends on the number of `steps` and `noOfImages` you select. This endpoint will submit the generation job and return immediately. To retrieve the results you must provide a webhook URL or query/poll the [Get a Single Image Job](https://reference.tryleap.ai/reference/inferencescontroller_findone-1) endpoint.

### Example


```typescript
import { Leap } from "@leap-ai/sdk";

const leap = new Leap({
  // Defining the base path is optional and defaults to https://api.tryleap.ai
  // basePath: "https://api.tryleap.ai",
  accessToken: "ACCESS_TOKEN",
});

const generateResponse = await leap.images.generate({
  modelId: "modelId_example",
  prompt: "A photo of an astronaut riding a horse",
  negativePrompt: "asymmetric, bad hands, bad hair",
  steps: 50,
  width: 1024,
  height: 1024,
  numberOfImages: 1,
  promptStrength: 7,
  seed: 4523184,
});

console.log(generateResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createInferenceDto** | **CreateInferenceDto**|  |
 **modelId** | [**string**] | The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models | defaults to undefined


### Return type

**InferenceEntity**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successfully submitted image generation job. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **listAll**

#### **GET** /api/v1/images/models/{modelId}/inferences

### Description
Fetch a list of inference jobs for a specific model.

### Example


```typescript
import { Leap } from "@leap-ai/sdk";

const leap = new Leap({
  // Defining the base path is optional and defaults to https://api.tryleap.ai
  // basePath: "https://api.tryleap.ai",
  accessToken: "ACCESS_TOKEN",
});

const listAllResponse = await leap.images.listAll({
  modelId: "modelId_example",
});

console.log(listAllResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | [**string**] | The ID of the model to generate images. This can be a custom model or a public model. Visit: https://docs.tryleap.ai/public-models to view the list of public models. | defaults to undefined
 **onlyFinished** | [**boolean**] | If set to true, only finished inferences will be returned. If set to false or not set, all inference jobs will be returned. | (optional) defaults to undefined
 **page** | [**number**] | The page to request. | (optional) defaults to undefined
 **pageSize** | [**number**] | The number of items to return per page. | (optional) defaults to undefined


### Return type

**Array<InferenceEntity>**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved list of image generation jobs. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


