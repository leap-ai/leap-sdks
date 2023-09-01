# leap-python-sdk

[![PyPI](https://img.shields.io/badge/PyPI-v1.1.1-blue)](https://pypi.org/project/leap-python-sdk/1.1.1)
[![More Info](https://img.shields.io/badge/More%20Info-Click%20Here-orange)](https://tryleap.ai/)

The Official Leap API


## Requirements

Python >=3.7

## Installing

```sh
pip install leap-python-sdk==1.1.1
```

## Getting Started

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

## Async

`async` support is available by prepending `a` to any method.

```python
import asyncio
from pprint import pprint
from leap import Leap, ApiException

leap = Leap(
    # Defining the host is optional and defaults to https://api.tryleap.ai
    # See configuration.py for a list of all supported configuration parameters.
    host="https://api.tryleap.ai",
    # Configure Bearer authorization (JWT): bearer
    access_token="YOUR_BEARER_TOKEN",
)


async def main():
    try:
        # Delete a Model
        delete_model_response = await leap.image_models.adelete_model(
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


asyncio.run(main())
```


## Documentation for API Endpoints

All URIs are relative to *https://api.tryleap.ai*

Tag | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*Image Models* | [**delete_model**](docs/apis/tags/ImageModelsApi.md#delete_model) | **DELETE** /api/v2/images/models/{modelId} | Delete a Model
*Image Models* | [**get_model**](docs/apis/tags/ImageModelsApi.md#get_model) | **GET** /api/v2/images/models/{modelId} | Get a Single Model
*Image Models* | [**list_all_models**](docs/apis/tags/ImageModelsApi.md#list_all_models) | **GET** /api/v2/images/models | List All Models
*Image Models* | [**train_model**](docs/apis/tags/ImageModelsApi.md#train_model) | **POST** /api/v2/images/models/new | Train Model
*Images* | [**delete**](docs/apis/tags/ImagesApi.md#delete) | **DELETE** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Delete Image Job
*Images* | [**find_one**](docs/apis/tags/ImagesApi.md#find_one) | **GET** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Get Single Image Job
*Images* | [**generate**](docs/apis/tags/ImagesApi.md#generate) | **POST** /api/v1/images/models/{modelId}/inferences | Generate an Image
*Images* | [**list_all**](docs/apis/tags/ImagesApi.md#list_all) | **GET** /api/v1/images/models/{modelId}/inferences | List All Image Jobs
*Music* | [**find_one**](docs/apis/tags/MusicApi.md#find_one) | **GET** /api/v1/music/{inferenceId} | Get a Music Generation Job
*Music* | [**generate**](docs/apis/tags/MusicApi.md#generate) | **POST** /api/v1/music | Generate Music
*Music* | [**list_all**](docs/apis/tags/MusicApi.md#list_all) | **GET** /api/v1/music | List Music Generation Jobs

## Documentation For Models

 - [CreateAndTrainModelDto](docs/models/CreateAndTrainModelDto.md)
 - [CreateAndTrainModelDtoImageSampleFiles](docs/models/CreateAndTrainModelDtoImageSampleFiles.md)
 - [CreateAndTrainModelDtoImageSampleUrls](docs/models/CreateAndTrainModelDtoImageSampleUrls.md)
 - [CreateInferenceDto](docs/models/CreateInferenceDto.md)
 - [CreateMusicgenInferenceDto](docs/models/CreateMusicgenInferenceDto.md)
 - [InferenceEntity](docs/models/InferenceEntity.md)
 - [InferenceEntityModelId](docs/models/InferenceEntityModelId.md)
 - [InferenceImageEntity](docs/models/InferenceImageEntity.md)
 - [InferencesControllerFindAllResponse](docs/models/InferencesControllerFindAllResponse.md)
 - [ListModelsV2Response](docs/models/ListModelsV2Response.md)
 - [ModelV2Entity](docs/models/ModelV2Entity.md)
 - [ModelV2EntityImageSamples](docs/models/ModelV2EntityImageSamples.md)
 - [MusicControllerFindAllAudioResponse](docs/models/MusicControllerFindAllAudioResponse.md)
 - [MusicgenInferenceEntity](docs/models/MusicgenInferenceEntity.md)


## Author
This Python package is automatically generated by [Konfig](https://konfigthis.com)
