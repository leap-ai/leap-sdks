<a name="__pageTop"></a>
# leap.apis.tags.music_api.MusicApi

All URIs are relative to *https://api.tryleap.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**find_one**](#find_one) | **get** /api/v1/music/{inferenceId} | Get a Music Generation Job
[**generate**](#generate) | **post** /api/v1/music | Generate Music
[**list_all**](#list_all) | **get** /api/v1/music | List Music Generation Jobs

# **find_one**

Get a Music Generation Job

Get a specific music generation job.

### Example

```python
from pprint import pprint
from leap import Leap, ApiException

leap = Leap(
    # Defining the host is optional and defaults to https://api.tryleap.ai
    # See configuration.py for a list of all supported configuration parameters.
    host="https://api.tryleap.ai",
)

try:
    # Get a Music Generation Job
    find_one_response = leap.music.find_one(
        inference_id="inferenceId_example",  # required
    )
    pprint(find_one_response.body)
    pprint(find_one_response.body["id"])
    pprint(find_one_response.body["created_at"])
    pprint(find_one_response.body["prompt"])
    pprint(find_one_response.body["state"])
    pprint(find_one_response.body["media_uri"])
    pprint(find_one_response.headers)
    pprint(find_one_response.status)
    pprint(find_one_response.round_trip_time)
except ApiException as e:
    print("Exception when calling MusicApi.find_one: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
inferenceId | InferenceIdSchema | | 

# InferenceIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#find_one.ApiResponseFor200) | Successfully retrieved music generation job.

#### find_one.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**MusicgenInferenceEntity**](../../models/MusicgenInferenceEntity.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **generate**

Generate Music

Generate music by providing a text description. Generations usually take bettween 1-3 minutes. Total generation time depends on the `duration` you select. This endpoint will submit the generation job and return immediately. To retrieve the results you must provide a webhook URL or query/poll the [Get a Music Generation Job](https://reference.tryleap.ai/reference/musiccontroller_findoneaudio) endpoint.

### Example

```python
from pprint import pprint
from leap import Leap, ApiException

leap = Leap(
    # Defining the host is optional and defaults to https://api.tryleap.ai
    # See configuration.py for a list of all supported configuration parameters.
    host="https://api.tryleap.ai",
    # Configure Bearer authorization (JWT): bearer
    access_token="YOUR_BEARER_TOKEN",
)

try:
    # Generate Music
    generate_response = leap.music.generate(
        prompt="An electronic music soundtrack with a trumpet solo",  # required
        mode="melody",  # required
        duration=28,  # required
    )
    pprint(generate_response.body)
    pprint(generate_response.body["id"])
    pprint(generate_response.body["created_at"])
    pprint(generate_response.body["prompt"])
    pprint(generate_response.body["state"])
    pprint(generate_response.body["media_uri"])
    pprint(generate_response.headers)
    pprint(generate_response.status)
    pprint(generate_response.round_trip_time)
except ApiException as e:
    print("Exception when calling MusicApi.generate: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CreateMusicgenInferenceDto**](../../models/CreateMusicgenInferenceDto.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#generate.ApiResponseFor200) | Successfully submitted music generation job.

#### generate.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**MusicgenInferenceEntity**](../../models/MusicgenInferenceEntity.md) |  | 


### Authorization

[bearer](../../../README.md#bearer)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **list_all**

List Music Generation Jobs

List all music generation jobs for a workspace.

### Example

```python
from pprint import pprint
from leap import Leap, ApiException

leap = Leap(
    # Defining the host is optional and defaults to https://api.tryleap.ai
    # See configuration.py for a list of all supported configuration parameters.
    host="https://api.tryleap.ai",
    # Configure Bearer authorization (JWT): bearer
    access_token="YOUR_BEARER_TOKEN",
)

try:
    # List Music Generation Jobs
    list_all_response = leap.music.list_all()
    pprint(list_all_response.body)
    pprint(list_all_response.headers)
    pprint(list_all_response.status)
    pprint(list_all_response.round_trip_time)
except ApiException as e:
    print("Exception when calling MusicApi.list_all: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#list_all.ApiResponseFor200) | Successfully retrieved music generation jobs.

#### list_all.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**MusicControllerFindAllAudioResponse**](../../models/MusicControllerFindAllAudioResponse.md) |  | 


### Authorization

[bearer](../../../README.md#bearer)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

