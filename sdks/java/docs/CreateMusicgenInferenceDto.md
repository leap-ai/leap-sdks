

# CreateMusicgenInferenceDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**prompt** | **String** | A description of the music you want to generate. |  |
|**mode** | [**ModeEnum**](#ModeEnum) | Select a mode, each option generates different results. Melody is best for melody, music is best for full songs |  |
|**duration** | **Double** | Duration of the generated audio in seconds. Max 30 seconds. |  |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| MELODY | &quot;melody&quot; |
| MUSIC | &quot;music&quot; |



