<a name="__pageTop"></a>
# leap.apis.tags.generate_music_api.GenerateMusicApi

All URIs are relative to *https://api.tryleap.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_audio**](#create_audio) | **post** /api/v1/music | Generate Music
[**find_all_audio**](#find_all_audio) | **get** /api/v1/music | List Music Generation Jobs
[**find_one_audio**](#find_one_audio) | **get** /api/v1/music/{inferenceId} | Get a Music Generation Job

# **create_audio**

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
    create_audio_response = leap.generate_music.create_audio(
        prompt="An electronic music soundtrack with a trumpet solo",  # required
        mode="melody",  # required
        duration=28,  # required
    )
    pprint(create_audio_response.body)
    pprint(create_audio_response.body["id"])
    pprint(create_audio_response.body["created_at"])
    pprint(create_audio_response.body["prompt"])
    pprint(create_audio_response.body["state"])
    pprint(create_audio_response.body["media_uri"])
    pprint(create_audio_response.headers)
    pprint(create_audio_response.status)
    pprint(create_audio_response.round_trip_time)
except ApiException as e:
    print("Exception when calling GenerateMusicApi.create_audio: %s\n" % e)
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
200 | [ApiResponseFor200](#create_audio.ApiResponseFor200) | Successfully submitted music generation job.

#### create_audio.ApiResponseFor200
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

# **find_all_audio**

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
    find_all_audio_response = leap.generate_music.find_all_audio()
    pprint(find_all_audio_response.body)
    pprint(find_all_audio_response.headers)
    pprint(find_all_audio_response.status)
    pprint(find_all_audio_response.round_trip_time)
except ApiException as e:
    print("Exception when calling GenerateMusicApi.find_all_audio: %s\n" % e)
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
200 | [ApiResponseFor200](#find_all_audio.ApiResponseFor200) | Successfully retrieved music generation jobs.

#### find_all_audio.ApiResponseFor200
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

# **find_one_audio**

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
    find_one_audio_response = leap.generate_music.find_one_audio(
        inference_id="inferenceId_example",  # required
    )
    pprint(find_one_audio_response.body)
    pprint(find_one_audio_response.body["id"])
    pprint(find_one_audio_response.body["created_at"])
    pprint(find_one_audio_response.body["prompt"])
    pprint(find_one_audio_response.body["state"])
    pprint(find_one_audio_response.body["media_uri"])
    pprint(find_one_audio_response.headers)
    pprint(find_one_audio_response.status)
    pprint(find_one_audio_response.round_trip_time)
except ApiException as e:
    print("Exception when calling GenerateMusicApi.find_one_audio: %s\n" % e)
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
200 | [ApiResponseFor200](#find_one_audio.ApiResponseFor200) | Successfully retrieved music generation job.

#### find_one_audio.ApiResponseFor200
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

