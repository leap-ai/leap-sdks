

# CreateInferenceDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**prompt** | **String** | A text description of the image you what you want to generate. |  |
|**negativePrompt** | **String** | A text description of what the image should try to avoid generating. |  [optional] |
|**steps** | **Double** | How many steps the AI will take to generate the image. Lower is faster but less detailed, higher is slower more detailed. |  [optional] |
|**width** | **Double** | The width of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models. |  [optional] |
|**height** | **Double** | The height of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models. |  [optional] |
|**numberOfImages** | **Double** | The number of images to generate, up to 4. |  [optional] |
|**promptStrength** | **Double** | The higher the prompt strength, the closer the generated image will be to the prompt. Must be between 0 and 30. |  [optional] |
|**seed** | **Double** | A random number to use as a seed when generating the image. This is helpful if you want to generate the same image multiple times. If you want to generate different images, keep this empty or provide a random number. |  [optional] |
|**webhookUrl** | **String** | An optional webhook URL that will be called with a POST request when the image generation request completes. |  [optional] |



