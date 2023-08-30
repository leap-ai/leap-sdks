

# MusicgenInferenceEntity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**prompt** | **String** |  |  |
|**state** | [**StateEnum**](#StateEnum) |  |  |
|**mediaUri** | **String** |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| FAILED | &quot;failed&quot; |
| FINISHED | &quot;finished&quot; |
| PROCESSING | &quot;processing&quot; |
| QUEUED | &quot;queued&quot; |



