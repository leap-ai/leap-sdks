# leap.model.create_inference_dto.CreateInferenceDto

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**prompt** | str,  | str,  | A text description of the image you what you want to generate. | if omitted the server will use the default value of "A photo of an astronaut riding a horse"
**negativePrompt** | str,  | str,  | A text description of what the image should try to avoid generating. | [optional] if omitted the server will use the default value of "asymmetric, watermarks"
**steps** | decimal.Decimal, int, float,  | decimal.Decimal,  | How many steps the AI will take to generate the image. Lower is faster but less detailed, higher is slower more detailed. | [optional] if omitted the server will use the default value of 50
**width** | decimal.Decimal, int, float,  | decimal.Decimal,  | The width of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models. | [optional] if omitted the server will use the default value of 1024
**height** | decimal.Decimal, int, float,  | decimal.Decimal,  | The height of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models. | [optional] if omitted the server will use the default value of 1024
**numberOfImages** | decimal.Decimal, int, float,  | decimal.Decimal,  | The number of images to generate, up to 4. | [optional] if omitted the server will use the default value of 1
**promptStrength** | decimal.Decimal, int, float,  | decimal.Decimal,  | The higher the prompt strength, the closer the generated image will be to the prompt. Must be between 0 and 30. | [optional] if omitted the server will use the default value of 7
**seed** | decimal.Decimal, int, float,  | decimal.Decimal,  | A random number to use as a seed when generating the image. This is helpful if you want to generate the same image multiple times. If you want to generate different images, keep this empty or provide a random number. | [optional] if omitted the server will use the default value of 4523184
**webhookUrl** | str,  | str,  | An optional webhook URL that will be called with a POST request when the image generation request completes. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

