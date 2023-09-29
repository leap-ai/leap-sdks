# Leap.Model.CreateInferenceDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Prompt** | **string** | A text description of the image you what you want to generate. | [default to "A photo of an astronaut riding a horse"]
**NegativePrompt** | **string** | A text description of what the image should try to avoid generating. | [optional] [default to "asymmetric, watermarks"]
**Steps** | **decimal** | How many steps the AI will take to generate the image. Lower is faster but less detailed, higher is slower more detailed. | [optional] [default to 50M]
**Width** | **decimal** | The width of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models. | [optional] [default to 1024M]
**Height** | **decimal** | The height of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models. | [optional] [default to 1024M]
**NumberOfImages** | **decimal** | The number of images to generate, up to 4. | [optional] [default to 1M]
**PromptStrength** | **decimal** | The higher the prompt strength, the closer the generated image will be to the prompt. Must be between 0 and 30. | [optional] [default to 7M]
**Seed** | **decimal** | A random number to use as a seed when generating the image. This is helpful if you want to generate the same image multiple times. If you want to generate different images, keep this empty or provide a random number. | [optional] [default to 4523184M]
**WebhookUrl** | **string** | An optional webhook URL that will be called with a POST request when the image generation request completes. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

