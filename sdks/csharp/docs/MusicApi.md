# Leap.Api.MusicApi

All URIs are relative to *https://api.tryleap.ai*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**FindOne**](MusicApi.md#findone) | **GET** /api/v1/music/{inferenceId} | Get a Music Generation Job |
| [**Generate**](MusicApi.md#generate) | **POST** /api/v1/music | Generate Music |
| [**ListAll**](MusicApi.md#listall) | **GET** /api/v1/music | List Music Generation Jobs |

<a name="findone"></a>
# **FindOne**
> MusicgenInferenceEntity FindOne (string inferenceId)

Get a Music Generation Job

Get a specific music generation job.

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
            // Configure custom BasePath if desired
            client.SetBasePath("https://api.tryleap.ai");

            var inferenceId = "inferenceId_example";  // string | The ID of the music generation job to retrieve. This is the same ID returned when you submit a job.

            try
            {
                // Get a Music Generation Job
                MusicgenInferenceEntity result = client.Music.FindOne(inferenceId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling MusicApi.FindOne: " + e.Message);
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
    // Get a Music Generation Job
    ApiResponse<MusicgenInferenceEntity> response = apiInstance.FindOneWithHttpInfo(inferenceId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling MusicApi.FindOneWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **inferenceId** | **string** | The ID of the music generation job to retrieve. This is the same ID returned when you submit a job. |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="generate"></a>
# **Generate**
> MusicgenInferenceEntity Generate (CreateMusicgenInferenceDto createMusicgenInferenceDto)

Generate Music

Generate music by providing a text description. Generations usually take bettween 1-3 minutes. Total generation time depends on the `duration` you select. This endpoint will submit the generation job and return immediately. To retrieve the results you must provide a webhook URL or query/poll the [Get a Music Generation Job](https://reference.tryleap.ai/reference/musiccontroller_findoneaudio) endpoint.

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
            // Configure custom BasePath if desired
            client.SetBasePath("https://api.tryleap.ai");
            // Configure Bearer token for authorization: bearer
            client.SetAccessToken("YOUR_BEARER_TOKEN");

            var createMusicgenInferenceDto = new CreateMusicgenInferenceDto(); // CreateMusicgenInferenceDto | 

            try
            {
                // Generate Music
                MusicgenInferenceEntity result = client.Music.Generate(createMusicgenInferenceDto);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling MusicApi.Generate: " + e.Message);
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
    // Generate Music
    ApiResponse<MusicgenInferenceEntity> response = apiInstance.GenerateWithHttpInfo(createMusicgenInferenceDto);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling MusicApi.GenerateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createMusicgenInferenceDto** | [**CreateMusicgenInferenceDto**](CreateMusicgenInferenceDto.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listall"></a>
# **ListAll**
> List&lt;MusicgenInferenceEntity&gt; ListAll ()

List Music Generation Jobs

List all music generation jobs for a workspace.

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
            // Configure custom BasePath if desired
            client.SetBasePath("https://api.tryleap.ai");
            // Configure Bearer token for authorization: bearer
            client.SetAccessToken("YOUR_BEARER_TOKEN");


            try
            {
                // List Music Generation Jobs
                List<MusicgenInferenceEntity> result = client.Music.ListAll();
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling MusicApi.ListAll: " + e.Message);
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
    // List Music Generation Jobs
    ApiResponse<List<MusicgenInferenceEntity>> response = apiInstance.ListAllWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling MusicApi.ListAllWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

