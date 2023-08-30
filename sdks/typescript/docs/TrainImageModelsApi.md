# TrainImageModelsApi

All URIs are relative to *https://api.tryleap.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteModel**](TrainImageModelsApi.md#deleteModel) | **DELETE** /api/v2/images/models/{modelId} | Delete a Model
[**getModel**](TrainImageModelsApi.md#getModel) | **GET** /api/v2/images/models/{modelId} | Get a Single Model
[**listAllModels**](TrainImageModelsApi.md#listAllModels) | **GET** /api/v2/images/models | List All Models
[**trainModel**](TrainImageModelsApi.md#trainModel) | **POST** /api/v2/images/models/new | Train Model


# **deleteModel**

#### **DELETE** /api/v2/images/models/{modelId}

### Description
This endpoint will delete a model. This is not reversible.

### Example


```typescript
import { Leap } from "@leap-ai/sdk";

const leap = new Leap({
  // Defining the base path is optional and defaults to https://api.tryleap.ai
  // basePath: "https://api.tryleap.ai",
  accessToken: "ACCESS_TOKEN",
});

const deleteModelResponse = await leap.trainImageModels.deleteModel({
  modelId: "modelId_example",
});

console.log(deleteModelResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | [**string**] | The ID of the model to delete. | defaults to undefined


### Return type

**ModelV2Entity**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully deleted the model |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getModel**

#### **GET** /api/v2/images/models/{modelId}

### Description
This endpoint will return a single model.

### Example


```typescript
import { Leap } from "@leap-ai/sdk";

const leap = new Leap({
  // Defining the base path is optional and defaults to https://api.tryleap.ai
  // basePath: "https://api.tryleap.ai",
  accessToken: "ACCESS_TOKEN",
});

const getModelResponse = await leap.trainImageModels.getModel({
  modelId: "modelId_example",
});

console.log(getModelResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | [**string**] | The ID of the model to retrieve. | defaults to undefined


### Return type

**ModelV2Entity**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved the model. |  -  |
**404** | Model does not exist |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **listAllModels**

#### **GET** /api/v2/images/models

### Description
This endpoint will return a list of all models for the workspace.

### Example


```typescript
import { Leap } from "@leap-ai/sdk";

const leap = new Leap({
  // Defining the base path is optional and defaults to https://api.tryleap.ai
  // basePath: "https://api.tryleap.ai",
  accessToken: "ACCESS_TOKEN",
});

const listAllModelsResponse = await leap.trainImageModels.listAllModels();

console.log(listAllModelsResponse);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**ListModelsV2Response**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved models. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **trainModel**

#### **POST** /api/v2/images/models/new

### Description
Upload a few image samples, and train a new model. Training usually takes 20-40 minutes. To be notified when the model completes training you must provide a `webhookUrl` in the training request, or check for completion by calling [Get a Single Model](https://reference.tryleap.ai/reference/get-model-1). After training completes, you can use the model to generate images with [Generate Images](https://reference.tryleap.ai/reference/inferencescontroller_create-1).

### Example


```typescript
import { Leap } from "@leap-ai/sdk";

const leap = new Leap({
  // Defining the base path is optional and defaults to https://api.tryleap.ai
  // basePath: "https://api.tryleap.ai",
  accessToken: "ACCESS_TOKEN",
});

const trainModelResponse = await leap.trainImageModels.trainModel({
  name: "Alex Avatar Model",
  subjectKeyword: "@me",
  subjectType: "person",
  webhookUrl: "https://example.com/api/webhook",
});

console.log(trainModelResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**string**] | Provide a name so you can more easily identify the model. | (optional) defaults to undefined
 **subjectKeyword** | [**string**] | This is the keyword you will use during image generation to trigger your custom subject. For example \\\"a photo of @me\\\". | (optional) defaults to undefined
 **subjectType** | [**string**] | The subject type - a short description, usually a noun, that describes what the underlying model is learning. For example: person, man, woman, cat, dog, icon, style. Defaults to \\\"person\\\". | (optional) defaults to 'person'
 **webhookUrl** | [**string**] | An optional webhook URL that will be called with a POST request when the model completes training or fails. | (optional) defaults to undefined
 **imageSampleUrls** | **Array<string>** | An array of strings containing the URLs of the images to upload. Either this or imageSampleFiles is required, but not both. | (optional) defaults to undefined
 **imageSampleFiles** | **Array<Uint8Array | File>** | An array of files containing the images to upload. Either this or imageSampleUrls is required, but not both. | (optional) defaults to undefined


### Return type

**ModelV2Entity**

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully submitted training job. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


