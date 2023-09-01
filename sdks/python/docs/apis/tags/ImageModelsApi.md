<a name="__pageTop"></a>
# leap.apis.tags.image_models_api.ImageModelsApi

All URIs are relative to *https://api.tryleap.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_model**](#delete_model) | **delete** /api/v2/images/models/{modelId} | Delete a Model
[**get_model**](#get_model) | **get** /api/v2/images/models/{modelId} | Get a Single Model
[**list_all_models**](#list_all_models) | **get** /api/v2/images/models | List All Models
[**train_model**](#train_model) | **post** /api/v2/images/models/new | Train Model

# **delete_model**

Delete a Model

This endpoint will delete a model. This is not reversible.

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
    # Delete a Model
    delete_model_response = leap.image_models.delete_model(
        model_id="5f9b9c0e-7c1f-4b5c-9c0e-7c1f4b5c9c0e",  # required
    )
    pprint(delete_model_response.body)
    pprint(delete_model_response.body["id"])
    pprint(delete_model_response.body["name"])
    pprint(delete_model_response.body["created_at"])
    pprint(delete_model_response.body["subject_keyword"])
    pprint(delete_model_response.body["subject_type"])
    pprint(delete_model_response.body["status"])
    pprint(delete_model_response.body["image_samples"])
    pprint(delete_model_response.headers)
    pprint(delete_model_response.status)
    pprint(delete_model_response.round_trip_time)
except ApiException as e:
    print("Exception when calling ImageModelsApi.delete_model: %s\n" % e)
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

# ModelIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#delete_model.ApiResponseFor200) | Successfully deleted the model

#### delete_model.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ModelV2Entity**](../../models/ModelV2Entity.md) |  | 


### Authorization

[bearer](../../../README.md#bearer)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **get_model**

Get a Single Model

This endpoint will return a single model.

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
    # Get a Single Model
    get_model_response = leap.image_models.get_model(
        model_id="5f9b9c0e-7c1f-4b5c-9c0e-7c1f4b5c9c0e",  # required
    )
    pprint(get_model_response.body)
    pprint(get_model_response.body["id"])
    pprint(get_model_response.body["name"])
    pprint(get_model_response.body["created_at"])
    pprint(get_model_response.body["subject_keyword"])
    pprint(get_model_response.body["subject_type"])
    pprint(get_model_response.body["status"])
    pprint(get_model_response.body["image_samples"])
    pprint(get_model_response.headers)
    pprint(get_model_response.status)
    pprint(get_model_response.round_trip_time)
except ApiException as e:
    print("Exception when calling ImageModelsApi.get_model: %s\n" % e)
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

# ModelIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_model.ApiResponseFor200) | Successfully retrieved the model.
404 | [ApiResponseFor404](#get_model.ApiResponseFor404) | Model does not exist

#### get_model.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ModelV2Entity**](../../models/ModelV2Entity.md) |  | 


#### get_model.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

[bearer](../../../README.md#bearer)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **list_all_models**

List All Models

This endpoint will return a list of all models for the workspace.

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
    # List All Models
    list_all_models_response = leap.image_models.list_all_models()
    pprint(list_all_models_response.body)
    pprint(list_all_models_response.body["models"])
    pprint(list_all_models_response.headers)
    pprint(list_all_models_response.status)
    pprint(list_all_models_response.round_trip_time)
except ApiException as e:
    print("Exception when calling ImageModelsApi.list_all_models: %s\n" % e)
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
200 | [ApiResponseFor200](#list_all_models.ApiResponseFor200) | Successfully retrieved models.

#### list_all_models.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ListModelsV2Response**](../../models/ListModelsV2Response.md) |  | 


### Authorization

[bearer](../../../README.md#bearer)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **train_model**

Train Model

Upload a few image samples, and train a new model. Training usually takes 20-40 minutes. To be notified when the model completes training you must provide a `webhookUrl` in the training request, or check for completion by calling [Get a Single Model](https://reference.tryleap.ai/reference/get-model-1). After training completes, you can use the model to generate images with [Generate Images](https://reference.tryleap.ai/reference/inferencescontroller_create-1).

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
    # Train Model
    train_model_response = leap.image_models.train_model(
        name="Alex Avatar Model",  # optional
        subject_keyword="@me",  # optional
        subject_type="person",  # optional
        webhook_url="https://example.com/api/webhook",  # optional
        image_sample_urls=["string_example"],  # optional
        image_sample_files=[open("/path/to/file", "rb")],  # optional
    )
    pprint(train_model_response.body)
    pprint(train_model_response.body["id"])
    pprint(train_model_response.body["name"])
    pprint(train_model_response.body["created_at"])
    pprint(train_model_response.body["subject_keyword"])
    pprint(train_model_response.body["subject_type"])
    pprint(train_model_response.body["status"])
    pprint(train_model_response.body["image_samples"])
    pprint(train_model_response.headers)
    pprint(train_model_response.status)
    pprint(train_model_response.round_trip_time)
except ApiException as e:
    print("Exception when calling ImageModelsApi.train_model: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyMultipartFormData] | required |
content_type | str | optional, default is 'multipart/form-data' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyMultipartFormData
Type | Description  | Notes
------------- | ------------- | -------------
[**CreateAndTrainModelDto**](../../models/CreateAndTrainModelDto.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
201 | [ApiResponseFor201](#train_model.ApiResponseFor201) | Successfully submitted training job.

#### train_model.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ModelV2Entity**](../../models/ModelV2Entity.md) |  | 


### Authorization

[bearer](../../../README.md#bearer)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

