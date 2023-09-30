# Leap.Api.ImageModelsApi

All URIs are relative to *https://api.tryleap.ai*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**DeleteModel**](ImageModelsApi.md#deletemodel) | **DELETE** /api/v2/images/models/{modelId} | Delete a Model |
| [**GetModel**](ImageModelsApi.md#getmodel) | **GET** /api/v2/images/models/{modelId} | Get a Single Model |
| [**ListAllModels**](ImageModelsApi.md#listallmodels) | **GET** /api/v2/images/models | List All Models |
| [**TrainModel**](ImageModelsApi.md#trainmodel) | **POST** /api/v2/images/models/new | Train Model |


# **DeleteModel**



This endpoint will delete a model. This is not reversible.

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Leap.Client;
using Leap.Model;

namespace Example
{
    public class DeleteModelExample
    {
        public static void Main()
        {
            LeapClient client = new LeapClient();
            // Configure token for authorization
            client.SetAccessToken("YOUR_TOKEN");

            var modelId = "5f9b9c0e-7c1f-4b5c-9c0e-7c1f4b5c9c0e";  // The ID of the model to delete.
            
            try
            {
                // Delete a Model
                ModelV2Entity result = client.ImageModels.DeleteModel(modelId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling ImageModelsApi.DeleteModel: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the DeleteModelWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete a Model
    ApiResponse<ModelV2Entity> response = apiInstance.DeleteModelWithHttpInfo(modelId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ImageModelsApi.DeleteModelWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modelId** | **string** | The ID of the model to delete. |  |

### Return type

[**ModelV2Entity**](ModelV2Entity.md)


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted the model |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# **GetModel**



This endpoint will return a single model.

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Leap.Client;
using Leap.Model;

namespace Example
{
    public class GetModelExample
    {
        public static void Main()
        {
            LeapClient client = new LeapClient();
            // Configure token for authorization
            client.SetAccessToken("YOUR_TOKEN");

            var modelId = "5f9b9c0e-7c1f-4b5c-9c0e-7c1f4b5c9c0e";  // The ID of the model to retrieve.
            
            try
            {
                // Get a Single Model
                ModelV2Entity result = client.ImageModels.GetModel(modelId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling ImageModelsApi.GetModel: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the GetModelWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get a Single Model
    ApiResponse<ModelV2Entity> response = apiInstance.GetModelWithHttpInfo(modelId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ImageModelsApi.GetModelWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modelId** | **string** | The ID of the model to retrieve. |  |

### Return type

[**ModelV2Entity**](ModelV2Entity.md)


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the model. |  -  |
| **404** | Model does not exist |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# **ListAllModels**



This endpoint will return a list of all models for the workspace.

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Leap.Client;
using Leap.Model;

namespace Example
{
    public class ListAllModelsExample
    {
        public static void Main()
        {
            LeapClient client = new LeapClient();
            // Configure token for authorization
            client.SetAccessToken("YOUR_TOKEN");

            
            try
            {
                // List All Models
                ListModelsV2Response result = client.ImageModels.ListAllModels();
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling ImageModelsApi.ListAllModels: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the ListAllModelsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List All Models
    ApiResponse<ListModelsV2Response> response = apiInstance.ListAllModelsWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ImageModelsApi.ListAllModelsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**ListModelsV2Response**](ListModelsV2Response.md)


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved models. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# **TrainModel**



Upload a few image samples, and train a new model. Training usually takes 20-40 minutes. To be notified when the model completes training you must provide a `webhookUrl` in the training request, or check for completion by calling [Get a Single Model](https://reference.tryleap.ai/reference/get-model-1). After training completes, you can use the model to generate images with [Generate Images](https://reference.tryleap.ai/reference/inferencescontroller_create-1).

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Leap.Client;
using Leap.Model;

namespace Example
{
    public class TrainModelExample
    {
        public static void Main()
        {
            LeapClient client = new LeapClient();
            // Configure token for authorization
            client.SetAccessToken("YOUR_TOKEN");

            var name = "name_example";  // Provide a name so you can more easily identify the model. (optional) 
            var subjectKeyword = "subjectKeyword_example";  // This is the keyword you will use during image generation to trigger your custom subject. For example \\\"a photo of @me\\\". (optional) 
            var subjectType = "person";  // The subject type - a short description, usually a noun, that describes what the underlying model is learning. For example: person, man, woman, cat, dog, icon, style. Defaults to \\\"person\\\". (optional)  (default to "person")
            var webhookUrl = "webhookUrl_example";  // An optional webhook URL that will be called with a POST request when the model completes training or fails. (optional) 
            // An array of strings containing the URLs of the images to upload. Either this or imageSampleFiles is required, but not both. (optional) 
            var imageSampleUrls = new List<string>();
            // An array of files containing the images to upload. Either this or imageSampleUrls is required, but not both. (optional) 
            var imageSampleFiles = new List<System.IO.Stream>();
            
            try
            {
                // Train Model
                ModelV2Entity result = client.ImageModels.TrainModel(name, subjectKeyword, subjectType, webhookUrl, imageSampleUrls, imageSampleFiles);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling ImageModelsApi.TrainModel: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the TrainModelWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Train Model
    ApiResponse<ModelV2Entity> response = apiInstance.TrainModelWithHttpInfo(name, subjectKeyword, subjectType, webhookUrl, imageSampleUrls, imageSampleFiles);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ImageModelsApi.TrainModelWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **name** | **string** | Provide a name so you can more easily identify the model. | [optional]  |
| **subjectKeyword** | **string** | This is the keyword you will use during image generation to trigger your custom subject. For example \\\&quot;a photo of @me\\\&quot;. | [optional]  |
| **subjectType** | **string** | The subject type - a short description, usually a noun, that describes what the underlying model is learning. For example: person, man, woman, cat, dog, icon, style. Defaults to \\\&quot;person\\\&quot;. | [optional] [default to &quot;person&quot;] |
| **webhookUrl** | **string** | An optional webhook URL that will be called with a POST request when the model completes training or fails. | [optional]  |
| **imageSampleUrls** | [**List&lt;string&gt;**](string.md) | An array of strings containing the URLs of the images to upload. Either this or imageSampleFiles is required, but not both. | [optional]  |
| **imageSampleFiles** | **List&lt;System.IO.Stream&gt;** | An array of files containing the images to upload. Either this or imageSampleUrls is required, but not both. | [optional]  |

### Return type

[**ModelV2Entity**](ModelV2Entity.md)


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully submitted training job. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

