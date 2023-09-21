# leap-python-sdk

[![PyPI](https://img.shields.io/badge/PyPI-v1.1.3-blue)](https://pypi.org/project/leap-python-sdk/1.1.3)
[![More Info](https://img.shields.io/badge/More%20Info-Click%20Here-orange)](https://tryleap.ai/)

The Official Leap API


## Requirements

Python >=3.7

## Installing

```sh
pip install leap-python-sdk==1.1.3
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
        generate_response = await leap.images.agenerate(
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


asyncio.run(main())
```


## Documentation for API Endpoints

All URIs are relative to *https://api.tryleap.ai*

Tag | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*Images* | [**generate**](docs/apis/tags/ImagesApi.md#generate) | **POST** /api/v1/images/models/{modelId}/inferences | Generate an Image
*Images* | [**delete**](docs/apis/tags/ImagesApi.md#delete) | **DELETE** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Delete Image Job
*Images* | [**find_one**](docs/apis/tags/ImagesApi.md#find_one) | **GET** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Get Single Image Job
*Images* | [**list_all**](docs/apis/tags/ImagesApi.md#list_all) | **GET** /api/v1/images/models/{modelId}/inferences | List All Image Jobs
*Image Models* | [**delete_model**](docs/apis/tags/ImageModelsApi.md#delete_model) | **DELETE** /api/v2/images/models/{modelId} | Delete a Model
*Image Models* | [**get_model**](docs/apis/tags/ImageModelsApi.md#get_model) | **GET** /api/v2/images/models/{modelId} | Get a Single Model
*Image Models* | [**list_all_models**](docs/apis/tags/ImageModelsApi.md#list_all_models) | **GET** /api/v2/images/models | List All Models
*Image Models* | [**train_model**](docs/apis/tags/ImageModelsApi.md#train_model) | **POST** /api/v2/images/models/new | Train Model
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
 - [InferenceImageEntity](docs/models/InferenceImageEntity.md)
 - [InferencesControllerFindAllResponse](docs/models/InferencesControllerFindAllResponse.md)
 - [ListModelsV2Response](docs/models/ListModelsV2Response.md)
 - [ModelV2Entity](docs/models/ModelV2Entity.md)
 - [ModelV2EntityImageSamples](docs/models/ModelV2EntityImageSamples.md)
 - [MusicControllerFindAllAudioResponse](docs/models/MusicControllerFindAllAudioResponse.md)
 - [MusicgenInferenceEntity](docs/models/MusicgenInferenceEntity.md)


## Author
This Python package is automatically generated by [Konfig](https://konfigthis.com)
