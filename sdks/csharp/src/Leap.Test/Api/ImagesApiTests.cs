/*
 * Leap
 *
 * The Official Leap API
 *
 * The version of the OpenAPI document: 1.0
 * Generated by: https://konfigthis.com
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Leap.Client;
using Leap.Api;
using Leap.Model;

namespace Leap.Test.Api
{
    /// <summary>
    ///  Class for testing ImagesApi
    /// </summary>
    public class ImagesApiTests : IDisposable
    {
        private LeapClient client;

        public ImagesApiTests()
        {
            client = new LeapClient();
            client.SetBasePath("http://127.0.0.1:4010");
            // Configure token for authorization
            client.SetAccessToken("YOUR_TOKEN");

        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test Delete
        /// </summary>
        [Fact]
        public void DeleteTest()
        {
            var modelId = "26a1a203-3a46-42cb-8cfa-f4de075907d8";  // The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models
            var inferenceId = "a047df00-8bdd-4d57-a9bd-6eebef36ecaa";  // The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job.
            
            try
            {
                // Delete Image Job
                client.Images.Delete(modelId, inferenceId);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling ImagesApi.Delete: " + e.Message);
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

        /// <summary>
        /// Test FindOne
        /// </summary>
        [Fact]
        public void FindOneTest()
        {
            var modelId = "26a1a203-3a46-42cb-8cfa-f4de075907d8";  // The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models
            var inferenceId = "a047df00-8bdd-4d57-a9bd-6eebef36ecaa";  // The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job.
            
            try
            {
                // Get Single Image Job
                InferenceEntity result = client.Images.FindOne(modelId, inferenceId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling ImagesApi.FindOne: " + e.Message);
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

        /// <summary>
        /// Test Generate
        /// </summary>
        [Fact]
        public void GenerateTest()
        {
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

        /// <summary>
        /// Test ListAll
        /// </summary>
        [Fact]
        public void ListAllTest()
        {
            var modelId = "26a1a203-3a46-42cb-8cfa-f4de075907d8";  // The ID of the model to generate images. This can be a custom model or a public model. Visit: https://docs.tryleap.ai/public-models to view the list of public models.
            var onlyFinished = true;  // If set to true, only finished inferences will be returned. If set to false or not set, all inference jobs will be returned. (optional) 
            var page = 8.14D;  // The page to request. (optional) 
            var pageSize = 8.14D;  // The number of items to return per page. (optional) 
            
            try
            {
                // List All Image Jobs
                List<InferenceEntity> result = client.Images.ListAll(modelId, onlyFinished, page, pageSize);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling ImagesApi.ListAll: " + e.Message);
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