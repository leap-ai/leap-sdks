# Leap.Api.ImagesApi

All URIs are relative to *https://api.tryleap.ai*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**Delete**](ImagesApi.md#delete) | **DELETE** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Delete Image Job |
| [**FindOne**](ImagesApi.md#findone) | **GET** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Get Single Image Job |
| [**Generate**](ImagesApi.md#generate) | **POST** /api/v1/images/models/{modelId}/inferences | Generate an Image |
| [**ListAll**](ImagesApi.md#listall) | **GET** /api/v1/images/models/{modelId}/inferences | List All Image Jobs |


# **Delete**

Delete Image Job

Delete the image job and all related images.

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Leap.Client;
using Leap.Model;

namespace Example
{
    public class DeleteExample
    {
        public static void Main()
        {
            LeapClient client = new LeapClient();
            // Configure token for authorization
            client.SetAccessToken("YOUR_TOKEN");

            var modelId = "26a1a203-3a46-42cb-8cfa-f4de075907d8";  // string | The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models
            var inferenceId = "a047df00-8bdd-4d57-a9bd-6eebef36ecaa";  // string | The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job.
            
            try
            {
                // Delete Image Job
                client.Images.Delete(modelId, inferenceId);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling ImagesApi.Delete: " + e.Message);
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

#### Using the DeleteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete Image Job
    apiInstance.DeleteWithHttpInfo(modelId, inferenceId);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ImagesApi.DeleteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modelId** | **string** | The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models |  |
| **inferenceId** | **string** | The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job. |  |

### Return type

void (empty response body)


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted image generation job. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# **FindOne**

Get Single Image Job

Retrieve a single image generation job, including the urls for the images generated.

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Leap.Client;
using Leap.Model;

namespace Example
{
    public class FindOneExample
    {
        public static void Main()
        {
            LeapClient client = new LeapClient();
            // Configure token for authorization
            client.SetAccessToken("YOUR_TOKEN");

            var modelId = "26a1a203-3a46-42cb-8cfa-f4de075907d8";  // string | The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models
            var inferenceId = "a047df00-8bdd-4d57-a9bd-6eebef36ecaa";  // string | The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job.
            
            try
            {
                // Get Single Image Job
                InferenceEntity result = client.Images.FindOne(modelId, inferenceId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling ImagesApi.FindOne: " + e.Message);
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

#### Using the FindOneWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Single Image Job
    ApiResponse<InferenceEntity> response = apiInstance.FindOneWithHttpInfo(modelId, inferenceId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ImagesApi.FindOneWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modelId** | **string** | The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models |  |
| **inferenceId** | **string** | The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job. |  |

### Return type

[**InferenceEntity**](InferenceEntity.md)


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved image generation job. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# **Generate**

Generate an Image

Generate an image by providing a text description. Generations usually take bettween 4-20 seconds per image. Total generation time depends on the number of `steps` and `noOfImages` you select. This endpoint will submit the generation job and return immediately. To retrieve the results you must provide a webhook URL or query/poll the [Get a Single Image Job](https://reference.tryleap.ai/reference/inferencescontroller_findone-1) endpoint.

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Leap.Client;
using Leap.Model;

namespace Example
{
    public class GenerateExample
    {
        public static void Main()
        {
            LeapClient client = new LeapClient();
            // Configure token for authorization
            client.SetAccessToken("YOUR_TOKEN");

            var modelId = "26a1a203-3a46-42cb-8cfa-f4de075907d8";  // string | The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models
            var createInferenceDto = new CreateInferenceDto(); // CreateInferenceDto | The parameters to use to generate the image.
            
            try
            {
                // Generate an Image
                InferenceEntity result = client.Images.Generate(modelId, createInferenceDto);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling ImagesApi.Generate: " + e.Message);
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

#### Using the GenerateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Generate an Image
    ApiResponse<InferenceEntity> response = apiInstance.GenerateWithHttpInfo(modelId, createInferenceDto);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ImagesApi.GenerateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modelId** | **string** | The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models |  |
| **createInferenceDto** | [**CreateInferenceDto**](CreateInferenceDto.md) | The parameters to use to generate the image. |  |

### Return type

[**InferenceEntity**](InferenceEntity.md)


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully submitted image generation job. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# **ListAll**

List All Image Jobs

Fetch a list of inference jobs for a specific model.

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Leap.Client;
using Leap.Model;

namespace Example
{
    public class ListAllExample
    {
        public static void Main()
        {
            LeapClient client = new LeapClient();
            // Configure token for authorization
            client.SetAccessToken("YOUR_TOKEN");

            var modelId = "26a1a203-3a46-42cb-8cfa-f4de075907d8";  // string | The ID of the model to generate images. This can be a custom model or a public model. Visit: https://docs.tryleap.ai/public-models to view the list of public models.
            var onlyFinished = true;  // bool? | If set to true, only finished inferences will be returned. If set to false or not set, all inference jobs will be returned. (optional) 
            var page = 8.14D;  // double? | The page to request. (optional) 
            var pageSize = 8.14D;  // double? | The number of items to return per page. (optional) 
            
            try
            {
                // List All Image Jobs
                List<InferenceEntity> result = client.Images.ListAll(modelId, onlyFinished, page, pageSize);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling ImagesApi.ListAll: " + e.Message);
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

#### Using the ListAllWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List All Image Jobs
    ApiResponse<List<InferenceEntity>> response = apiInstance.ListAllWithHttpInfo(modelId, onlyFinished, page, pageSize);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ImagesApi.ListAllWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modelId** | **string** | The ID of the model to generate images. This can be a custom model or a public model. Visit: https://docs.tryleap.ai/public-models to view the list of public models. |  |
| **onlyFinished** | **bool?** | If set to true, only finished inferences will be returned. If set to false or not set, all inference jobs will be returned. | [optional]  |
| **page** | **double?** | The page to request. | [optional]  |
| **pageSize** | **double?** | The number of items to return per page. | [optional]  |

### Return type

[**List&lt;InferenceEntity&gt;**](InferenceEntity.md)


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved list of image generation jobs. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

