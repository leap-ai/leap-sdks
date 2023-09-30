# Leap - C#

[![NuGet](https://img.shields.io/badge/NuGet-1.0.2-blue.svg)](https://www.nuget.org/packages/Leap/1.0.2)
[![More Info](https://img.shields.io/badge/More%20Info-Click%20Here-orange)](https://tryleap.ai/)

The Official Leap API

## Frameworks supported
- .NET Core >=1.0
- .NET Framework >=4.6
- Mono/Xamarin >=vNext

## Installation

Using the [.NET Core command-line interface (CLI) tools][dotnet-core-cli-tools]:

```sh
dotnet add package Leap
```

Using the [NuGet Command Line Interface (CLI)][nuget-cli]:

```sh
nuget install Leap
```

Using the [Package Manager Console][package-manager-console]:

```powershell
Install-Package Leap
```

From within Visual Studio:

1. Open the Solution Explorer.
2. Right-click on a project within your solution.
3. Click on *Manage NuGet Packages...*
4. Click on the *Browse* tab and search for "Leap".
5. Click on the "Leap" package, select the appropriate version in the
   right-tab and click *Install*.

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

            var modelId = "26a1a203-3a46-42cb-8cfa-f4de075907d8";  // The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models
            var prompt = "A photo of an astronaut riding a horse"; // A text description of the image you what you want to generate.
            var negativePrompt = "asymmetric, bad hands, bad hair"; // A text description of what the image should try to avoid generating.
            var steps = 50; // How many steps the AI will take to generate the image. Lower is faster but less detailed, higher is slower more detailed.
            var width = 1024; // The width of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models.
            var height = 1024; // The height of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models.
            var numberOfImages = 1; // The number of images to generate, up to 4.
            var promptStrength = 7; // The higher the prompt strength, the closer the generated image will be to the prompt. Must be between 0 and 30.
            var seed = 4523184; // A random number to use as a seed when generating the image. This is helpful if you want to generate the same image multiple times. If you want to generate different images, keep this empty or provide a random number.
            var webhookUrl = "webhookUrl_example"; // An optional webhook URL that will be called with a POST request when the image generation request completes.
            
            // The parameters to use to generate the image.
            var createInferenceDto = new CreateInferenceDto(
                prompt,
                negativePrompt,
                steps,
                width,
                height,
                numberOfImages,
                promptStrength,
                seed,
                webhookUrl
            );
            
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

 - [CreateAndTrainModelDto](docs/CreateAndTrainModelDto.md)
 - [CreateInferenceDto](docs/CreateInferenceDto.md)
 - [CreateMusicgenInferenceDto](docs/CreateMusicgenInferenceDto.md)
 - [InferenceEntity](docs/InferenceEntity.md)
 - [InferenceImageEntity](docs/InferenceImageEntity.md)
 - [ListModelsV2Response](docs/ListModelsV2Response.md)
 - [ModelV2Entity](docs/ModelV2Entity.md)
 - [MusicgenInferenceEntity](docs/MusicgenInferenceEntity.md)


## Dependencies

- [RestSharp](https://www.nuget.org/packages/RestSharp) - 106.13.0 or later
- [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) - 13.0.1 or later
- [JsonSubTypes](https://www.nuget.org/packages/JsonSubTypes/) - 1.8.0 or later
- [System.ComponentModel.Annotations](https://www.nuget.org/packages/System.ComponentModel.Annotations) - 5.0.0 or later

## Author
This C# package is automatically generated by [Konfig](https://konfigthis.com)

[dotnet-core-cli-tools]: https://docs.microsoft.com/en-us/dotnet/core/tools/
[nuget-cli]: https://docs.microsoft.com/en-us/nuget/tools/nuget-exe-cli-reference
[package-manager-console]: https://docs.microsoft.com/en-us/nuget/tools/package-manager-console
