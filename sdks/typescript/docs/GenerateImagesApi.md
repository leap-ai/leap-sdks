# GenerateImagesApi

All URIs are relative to *https://api.tryleap.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](GenerateImagesApi.md#create) | **POST** /api/v1/images/models/{modelId}/inferences | Generate an Image
[**findAll**](GenerateImagesApi.md#findAll) | **GET** /api/v1/images/models/{modelId}/inferences | List All Image Jobs
[**findOne**](GenerateImagesApi.md#findOne) | **GET** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Get Single Image Job
[**remove**](GenerateImagesApi.md#remove) | **DELETE** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Delete Image Job


# **create**

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

const createResponse = await leap.generateImages.create({
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

console.log(createResponse);
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
**200** | Successfully submitted image generation job. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **findAll**

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

const findAllResponse = await leap.generateImages.findAll({
  modelId: "modelId_example",
});

console.log(findAllResponse);
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

const findOneResponse = await leap.generateImages.findOne({
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

# **remove**

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

const removeResponse = await leap.generateImages.remove({
  modelId: "modelId_example",
  inferenceId: "inferenceId_example",
});

console.log(removeResponse);
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


