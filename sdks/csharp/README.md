# Leap - the C# library for the Leap

[![NuGet](https://img.shields.io/badge/NuGet-1.0.0-blue.svg)](https://www.nuget.org/packages/Leap/1.0.0)
[![More Info](https://img.shields.io/badge/More%20Info-Click%20Here-orange)](https://tryleap.ai/)

The Official Leap API

## Frameworks supported
- .NET Core >=1.0
- .NET Framework >=4.6
- Mono/Xamarin >=vNext

## Dependencies

- [RestSharp](https://www.nuget.org/packages/RestSharp) - 106.13.0 or later
- [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) - 13.0.1 or later
- [JsonSubTypes](https://www.nuget.org/packages/JsonSubTypes/) - 1.8.0 or later
- [System.ComponentModel.Annotations](https://www.nuget.org/packages/System.ComponentModel.Annotations) - 5.0.0 or later

The DLLs included in the package may not be the latest version. We recommend using [NuGet](https://docs.nuget.org/consume/installing-nuget) to obtain the latest version of the packages:
```
Install-Package RestSharp
Install-Package Newtonsoft.Json
Install-Package JsonSubTypes
Install-Package System.ComponentModel.Annotations
```

NOTE: RestSharp versions greater than 105.1.0 have a bug which causes file uploads to fail. See [RestSharp#742](https://github.com/restsharp/RestSharp/issues/742).
NOTE: RestSharp for .Net Core creates a new socket for each api call, which can lead to a socket exhaustion problem. See [RestSharp#1406](https://github.com/restsharp/RestSharp/issues/1406).

## Installation
Generate the DLL using your preferred tool (e.g. `dotnet build`)

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using Leap.Api;
using Leap.Client;
using Leap.Model;
```

## Getting Started

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

## Documentation for API Endpoints

All URIs are relative to *https://api.tryleap.ai*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ImagesApi* | [**Generate**](docs/ImagesApi.md#generate) | **POST** /api/v1/images/models/{modelId}/inferences | Generate an Image
*ImagesApi* | [**Delete**](docs/ImagesApi.md#delete) | **DELETE** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Delete Image Job
*ImagesApi* | [**FindOne**](docs/ImagesApi.md#findone) | **GET** /api/v1/images/models/{modelId}/inferences/{inferenceId} | Get Single Image Job
*ImagesApi* | [**ListAll**](docs/ImagesApi.md#listall) | **GET** /api/v1/images/models/{modelId}/inferences | List All Image Jobs
*ImageModelsApi* | [**DeleteModel**](docs/ImageModelsApi.md#deletemodel) | **DELETE** /api/v2/images/models/{modelId} | Delete a Model
*ImageModelsApi* | [**GetModel**](docs/ImageModelsApi.md#getmodel) | **GET** /api/v2/images/models/{modelId} | Get a Single Model
*ImageModelsApi* | [**ListAllModels**](docs/ImageModelsApi.md#listallmodels) | **GET** /api/v2/images/models | List All Models
*ImageModelsApi* | [**TrainModel**](docs/ImageModelsApi.md#trainmodel) | **POST** /api/v2/images/models/new | Train Model
*MusicApi* | [**FindOne**](docs/MusicApi.md#findone) | **GET** /api/v1/music/{inferenceId} | Get a Music Generation Job
*MusicApi* | [**Generate**](docs/MusicApi.md#generate) | **POST** /api/v1/music | Generate Music
*MusicApi* | [**ListAll**](docs/MusicApi.md#listall) | **GET** /api/v1/music | List Music Generation Jobs


## Documentation for Models

 - [Model.CreateAndTrainModelDto](docs/CreateAndTrainModelDto.md)
 - [Model.CreateInferenceDto](docs/CreateInferenceDto.md)
 - [Model.CreateMusicgenInferenceDto](docs/CreateMusicgenInferenceDto.md)
 - [Model.InferenceEntity](docs/InferenceEntity.md)
 - [Model.InferenceImageEntity](docs/InferenceImageEntity.md)
 - [Model.ListModelsV2Response](docs/ListModelsV2Response.md)
 - [Model.ModelV2Entity](docs/ModelV2Entity.md)
 - [Model.MusicgenInferenceEntity](docs/MusicgenInferenceEntity.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
