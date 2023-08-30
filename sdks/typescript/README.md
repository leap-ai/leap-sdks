# @leap-ai/sdk@1.0.0

The Official Leap API
## Installing

### npm
```
npm install @leap-ai/sdk --save
```

### yarn
```
yarn add @leap-ai/sdk
```

**Important note: this library can be used in both the client-side or server-side, but using it
in client-side browser code is not recommended as you would expose security credentials.**



## Getting Started

```typescript
import { Leap } from "@leap-ai/sdk";

const leap = new Leap({
  // Defining the base path is optional and defaults to https://api.tryleap.ai
  // basePath: "https://api.tryleap.ai",
  accessToken: "ACCESS_TOKEN",
});

const createResponse = await leap.generateImages.create({
  modelId: "modelId_example",
  prompt: "A photo of an astronaut riding a horse",
  negative_prompt: "asymmetric, bad hands, bad hair",
  steps: 50,
  width: 1024,
  height: 1024,
  number_of_images: 1,
  prompt_strength: 7,
  seed: 4523184,
});

console.log(createResponse);
```

## Documentation for API Endpoints

All URIs are relative to *https://api.tryleap.ai*

Tag | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*Generate Images* | [**create**](docs/GenerateImagesApi.md#create) | **POST** /api/v1/images/models/{modelId}/inferences | Generate an Image
*Generate Images* | [**findAll**](docs/GenerateImagesApi.md#findAll) | **GET** /api/v1/images/models/{modelId}/inferences | List All Image Jobs
*Generate Images* | [**findOne**](docs/GenerateImagesApi.md#findOne) | **GET** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Get Single Image Job
*Generate Images* | [**remove**](docs/GenerateImagesApi.md#remove) | **DELETE** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Delete Image Job
*Generate Music* | [**createAudio**](docs/GenerateMusicApi.md#createAudio) | **POST** /api/v1/music | Generate Music
*Generate Music* | [**findAllAudio**](docs/GenerateMusicApi.md#findAllAudio) | **GET** /api/v1/music | List Music Generation Jobs
*Generate Music* | [**findOneAudio**](docs/GenerateMusicApi.md#findOneAudio) | **GET** /api/v1/music/{inferenceId} | Get a Music Generation Job
*Train Image Models* | [**deleteModel**](docs/TrainImageModelsApi.md#deleteModel) | **DELETE** /api/v2/images/models/{modelId} | Delete a Model
*Train Image Models* | [**getModel**](docs/TrainImageModelsApi.md#getModel) | **GET** /api/v2/images/models/{modelId} | Get a Single Model
*Train Image Models* | [**listAllModels**](docs/TrainImageModelsApi.md#listAllModels) | **GET** /api/v2/images/models | List All Models
*Train Image Models* | [**trainModel**](docs/TrainImageModelsApi.md#trainModel) | **POST** /api/v2/images/models/new | Train Model
