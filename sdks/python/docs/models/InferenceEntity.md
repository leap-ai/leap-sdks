# leap.model.inference_entity.InferenceEntity

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[images](#images)** | list, tuple,  | tuple,  |  | 
**seed** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | 
**modelId** | [**InferenceEntityModelId**](InferenceEntityModelId.md) | [**InferenceEntityModelId**](InferenceEntityModelId.md) |  | 
**upscalingOption** | str,  | str,  |  | must be one of ["x1", "x2", "x4", ] 
**steps** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | 
**promptStrength** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | 
**negativePrompt** | str,  | str,  |  | 
**createdAt** | str, datetime,  | str,  |  | value must conform to RFC-3339 date-time
**numberOfImages** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | 
**width** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | 
**id** | str,  | str,  |  | 
**state** | str,  | str,  |  | must be one of ["failed", "finished", "processing", "queued", ] 
**prompt** | str,  | str,  |  | 
**height** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | 
**status** | str,  | str,  |  | must be one of ["failed", "finished", "processing", "queued", ] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# images

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InferenceImageEntity**](InferenceImageEntity.md) | [**InferenceImageEntity**](InferenceImageEntity.md) | [**InferenceImageEntity**](InferenceImageEntity.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

