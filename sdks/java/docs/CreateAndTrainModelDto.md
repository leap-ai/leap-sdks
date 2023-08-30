

# CreateAndTrainModelDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Provide a name so you can more easily identify the model. |  [optional] |
|**subjectKeyword** | **String** | This is the keyword you will use during image generation to trigger your custom subject. For example \&quot;a photo of @me\&quot;. |  [optional] |
|**subjectType** | **String** | The subject type - a short description, usually a noun, that describes what the underlying model is learning. For example: person, man, woman, cat, dog, icon, style. Defaults to \&quot;person\&quot;. |  [optional] |
|**webhookUrl** | **String** | An optional webhook URL that will be called with a POST request when the model completes training or fails. |  [optional] |
|**imageSampleUrls** | **List&lt;String&gt;** | An array of strings containing the URLs of the images to upload. Either this or imageSampleFiles is required, but not both. |  [optional] |
|**imageSampleFiles** | **List&lt;File&gt;** | An array of files containing the images to upload. Either this or imageSampleUrls is required, but not both. |  [optional] |



