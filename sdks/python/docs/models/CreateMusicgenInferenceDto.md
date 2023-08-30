# leap.model.create_musicgen_inference_dto.CreateMusicgenInferenceDto

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**duration** | decimal.Decimal, int, float,  | decimal.Decimal,  | Duration of the generated audio in seconds. Max 30 seconds. | if omitted the server will use the default value of 28
**mode** | str,  | str,  | Select a mode, each option generates different results. Melody is best for melody, music is best for full songs | must be one of ["melody", "music", ] if omitted the server will use the default value of "melody"
**prompt** | str,  | str,  | A description of the music you want to generate. | if omitted the server will use the default value of "An electronic music soundtrack with a trumpet solo"
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

