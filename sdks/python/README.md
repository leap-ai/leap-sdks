# leap

[![PyPI](https://img.shields.io/badge/PyPI-v1.0.0-blue)](https://pypi.org/project/leap/1.0.0)
[![More Info](https://img.shields.io/badge/More%20Info-Click%20Here-orange)](https://tryleap.ai/)

The Official Leap API


## Requirements

Python >=3.7

## Installing

```sh
pip install leap==1.0.0
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
    # Generate an Image
    create_response = leap.generate_images.create(
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
    pprint(create_response.body)
    pprint(create_response.body["id"])
    pprint(create_response.body["created_at"])
    pprint(create_response.body["prompt"])
    pprint(create_response.body["negative_prompt"])
    pprint(create_response.body["seed"])
    pprint(create_response.body["width"])
    pprint(create_response.body["height"])
    pprint(create_response.body["prompt_strength"])
    pprint(create_response.body["number_of_images"])
    pprint(create_response.body["state"])
    pprint(create_response.body["steps"])
    pprint(create_response.body["images"])
    pprint(create_response.body["model_id"])
    pprint(create_response.body["upscaling_option"])
    pprint(create_response.headers)
    pprint(create_response.status)
    pprint(create_response.round_trip_time)
except ApiException as e:
    print("Exception when calling GenerateImagesApi.create: %s\n" % e)
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
        # Generate an Image
        create_response = await leap.generate_images.acreate(
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
        pprint(create_response.body)
        pprint(create_response.body["id"])
        pprint(create_response.body["created_at"])
        pprint(create_response.body["prompt"])
        pprint(create_response.body["negative_prompt"])
        pprint(create_response.body["seed"])
        pprint(create_response.body["width"])
        pprint(create_response.body["height"])
        pprint(create_response.body["prompt_strength"])
        pprint(create_response.body["number_of_images"])
        pprint(create_response.body["state"])
        pprint(create_response.body["steps"])
        pprint(create_response.body["images"])
        pprint(create_response.body["model_id"])
        pprint(create_response.body["upscaling_option"])
        pprint(create_response.headers)
        pprint(create_response.status)
        pprint(create_response.round_trip_time)
    except ApiException as e:
        print("Exception when calling GenerateImagesApi.create: %s\n" % e)
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
*Generate Images* | [**create**](docs/apis/tags/GenerateImagesApi.md#create) | **POST** /api/v1/images/models/{modelId}/inferences | Generate an Image
*Generate Images* | [**find_all**](docs/apis/tags/GenerateImagesApi.md#find_all) | **GET** /api/v1/images/models/{modelId}/inferences | List All Image Jobs
*Generate Images* | [**find_one**](docs/apis/tags/GenerateImagesApi.md#find_one) | **GET** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Get Single Image Job
*Generate Images* | [**remove**](docs/apis/tags/GenerateImagesApi.md#remove) | **DELETE** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Delete Image Job
*Generate Music* | [**create_audio**](docs/apis/tags/GenerateMusicApi.md#create_audio) | **POST** /api/v1/music | Generate Music
*Generate Music* | [**find_all_audio**](docs/apis/tags/GenerateMusicApi.md#find_all_audio) | **GET** /api/v1/music | List Music Generation Jobs
*Generate Music* | [**find_one_audio**](docs/apis/tags/GenerateMusicApi.md#find_one_audio) | **GET** /api/v1/music/{inferenceId} | Get a Music Generation Job
*Train Image Models* | [**delete_model**](docs/apis/tags/TrainImageModelsApi.md#delete_model) | **DELETE** /api/v2/images/models/{modelId} | Delete a Model
*Train Image Models* | [**get_model**](docs/apis/tags/TrainImageModelsApi.md#get_model) | **GET** /api/v2/images/models/{modelId} | Get a Single Model
*Train Image Models* | [**list_all_models**](docs/apis/tags/TrainImageModelsApi.md#list_all_models) | **GET** /api/v2/images/models | List All Models
*Train Image Models* | [**train_model**](docs/apis/tags/TrainImageModelsApi.md#train_model) | **POST** /api/v2/images/models/new | Train Model

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
