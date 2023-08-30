# leap.model.create_and_train_model_dto.CreateAndTrainModelDto

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | str,  | str,  | Provide a name so you can more easily identify the model. | [optional] 
**subjectKeyword** | str,  | str,  | This is the keyword you will use during image generation to trigger your custom subject. For example \&quot;a photo of @me\&quot;. | [optional] 
**subjectType** | str,  | str,  | The subject type - a short description, usually a noun, that describes what the underlying model is learning. For example: person, man, woman, cat, dog, icon, style. Defaults to \&quot;person\&quot;. | [optional] if omitted the server will use the default value of "person"
**webhookUrl** | str,  | str,  | An optional webhook URL that will be called with a POST request when the model completes training or fails. | [optional] 
**imageSampleUrls** | [**CreateAndTrainModelDtoImageSampleUrls**](CreateAndTrainModelDtoImageSampleUrls.md) | [**CreateAndTrainModelDtoImageSampleUrls**](CreateAndTrainModelDtoImageSampleUrls.md) |  | [optional] 
**imageSampleFiles** | [**CreateAndTrainModelDtoImageSampleFiles**](CreateAndTrainModelDtoImageSampleFiles.md) | [**CreateAndTrainModelDtoImageSampleFiles**](CreateAndTrainModelDtoImageSampleFiles.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

