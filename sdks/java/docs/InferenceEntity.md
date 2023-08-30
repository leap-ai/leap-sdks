

# InferenceEntity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**prompt** | **String** |  |  |
|**negativePrompt** | **String** |  |  |
|**seed** | **Double** |  |  |
|**width** | **Double** |  |  |
|**height** | **Double** |  |  |
|**promptStrength** | **Double** |  |  |
|**numberOfImages** | **Double** |  |  |
|**state** | [**StateEnum**](#StateEnum) |  |  |
|**steps** | **Double** |  |  |
|**images** | [**List&lt;InferenceImageEntity&gt;**](InferenceImageEntity.md) |  |  |
|**modelId** | **List&lt;String&gt;** |  |  |
|**upscalingOption** | [**UpscalingOptionEnum**](#UpscalingOptionEnum) |  |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| FAILED | &quot;failed&quot; |
| FINISHED | &quot;finished&quot; |
| PROCESSING | &quot;processing&quot; |
| QUEUED | &quot;queued&quot; |



## Enum: UpscalingOptionEnum

| Name | Value |
|---- | -----|
| X1 | &quot;x1&quot; |
| X2 | &quot;x2&quot; |
| X4 | &quot;x4&quot; |



