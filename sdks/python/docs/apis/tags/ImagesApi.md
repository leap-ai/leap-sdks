<a name="__pageTop"></a>
# leap.apis.tags.images_api.ImagesApi

All URIs are relative to *https://api.tryleap.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](#delete) | **delete** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Delete Image Job
[**find_one**](#find_one) | **get** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Get Single Image Job
[**generate**](#generate) | **post** /api/v1/images/models/{modelId}/inferences | Generate an Image
[**list_all**](#list_all) | **get** /api/v1/images/models/{modelId}/inferences | List All Image Jobs

# **delete**

Delete Image Job

Delete the image job and all related images.

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
    # Delete Image Job
    leap.images.delete(
        model_id="26a1a203-3a46-42cb-8cfa-f4de075907d8",  # required
        inference_id="a047df00-8bdd-4d57-a9bd-6eebef36ecaa",  # required
    )
except ApiException as e:
    print("Exception when calling ImagesApi.delete: %s\n" % e)
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
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
modelId | ModelIdSchema | | 
inferenceId | InferenceIdSchema | | 

# ModelIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# InferenceIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#delete.ApiResponseFor200) | Successfully deleted image generation job.

#### delete.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

[bearer](../../../README.md#bearer)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **find_one**

Get Single Image Job

Retrieve a single image generation job, including the urls for the images generated.

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
    # Get Single Image Job
    find_one_response = leap.images.find_one(
        model_id="26a1a203-3a46-42cb-8cfa-f4de075907d8",  # required
        inference_id="a047df00-8bdd-4d57-a9bd-6eebef36ecaa",  # required
    )
    pprint(find_one_response.body)
    pprint(find_one_response.body["id"])
    pprint(find_one_response.body["created_at"])
    pprint(find_one_response.body["prompt"])
    pprint(find_one_response.body["negative_prompt"])
    pprint(find_one_response.body["seed"])
    pprint(find_one_response.body["width"])
    pprint(find_one_response.body["height"])
    pprint(find_one_response.body["prompt_strength"])
    pprint(find_one_response.body["number_of_images"])
    pprint(find_one_response.body["state"])
    pprint(find_one_response.body["status"])
    pprint(find_one_response.body["steps"])
    pprint(find_one_response.body["images"])
    pprint(find_one_response.body["model_id"])
    pprint(find_one_response.body["upscaling_option"])
    pprint(find_one_response.headers)
    pprint(find_one_response.status)
    pprint(find_one_response.round_trip_time)
except ApiException as e:
    print("Exception when calling ImagesApi.find_one: %s\n" % e)
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
modelId | ModelIdSchema | | 
inferenceId | InferenceIdSchema | | 

# ModelIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# InferenceIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#find_one.ApiResponseFor200) | Successfully retrieved image generation job.

#### find_one.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InferenceEntity**](../../models/InferenceEntity.md) |  | 


### Authorization

[bearer](../../../README.md#bearer)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **generate**

Generate an Image

Generate an image by providing a text description. Generations usually take bettween 4-20 seconds per image. Total generation time depends on the number of `steps` and `noOfImages` you select. This endpoint will submit the generation job and return immediately. To retrieve the results you must provide a webhook URL or query/poll the [Get a Single Image Job](https://reference.tryleap.ai/reference/inferencescontroller_findone-1) endpoint.

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
    # Generate an Image
    generate_response = leap.images.generate(
        prompt="A photo of an astronaut riding a horse",  # required
        model_id="26a1a203-3a46-42cb-8cfa-f4de075907d8",  # required
        negative_prompt="asymmetric, bad hands, bad hair",  # optional
        steps=50,  # optional
        width=1024,  # optional
        height=1024,  # optional
        number_of_images=1,  # optional
        prompt_strength=7,  # optional
        seed=4523184,  # optional
        webhook_url="string_example",  # optional
    )
    pprint(generate_response.body)
    pprint(generate_response.body["id"])
    pprint(generate_response.body["created_at"])
    pprint(generate_response.body["prompt"])
    pprint(generate_response.body["negative_prompt"])
    pprint(generate_response.body["seed"])
    pprint(generate_response.body["width"])
    pprint(generate_response.body["height"])
    pprint(generate_response.body["prompt_strength"])
    pprint(generate_response.body["number_of_images"])
    pprint(generate_response.body["state"])
    pprint(generate_response.body["status"])
    pprint(generate_response.body["steps"])
    pprint(generate_response.body["images"])
    pprint(generate_response.body["model_id"])
    pprint(generate_response.body["upscaling_option"])
    pprint(generate_response.headers)
    pprint(generate_response.status)
    pprint(generate_response.round_trip_time)
except ApiException as e:
    print("Exception when calling ImagesApi.generate: %s\n" % e)
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
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CreateInferenceDto**](../../models/CreateInferenceDto.md) |  | 


### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
modelId | ModelIdSchema | | 

# ModelIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
201 | [ApiResponseFor201](#generate.ApiResponseFor201) | Successfully submitted image generation job.

#### generate.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InferenceEntity**](../../models/InferenceEntity.md) |  | 


### Authorization

[bearer](../../../README.md#bearer)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **list_all**

List All Image Jobs

Fetch a list of inference jobs for a specific model.

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
    # List All Image Jobs
    list_all_response = leap.images.list_all(
        model_id="26a1a203-3a46-42cb-8cfa-f4de075907d8",  # required
        only_finished=True,  # optional
        page=3.14,  # optional
        page_size=3.14,  # optional
    )
    pprint(list_all_response.body)
    pprint(list_all_response.headers)
    pprint(list_all_response.status)
    pprint(list_all_response.round_trip_time)
except ApiException as e:
    print("Exception when calling ImagesApi.list_all: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
onlyFinished | OnlyFinishedSchema | | optional
page | PageSchema | | optional
pageSize | PageSizeSchema | | optional


# OnlyFinishedSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  | 

# PageSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  | 

# PageSizeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
modelId | ModelIdSchema | | 

# ModelIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#list_all.ApiResponseFor200) | Successfully retrieved list of image generation jobs.

#### list_all.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InferencesControllerFindAllResponse**](../../models/InferencesControllerFindAllResponse.md) |  | 


### Authorization

[bearer](../../../README.md#bearer)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

