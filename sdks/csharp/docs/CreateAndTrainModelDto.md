# Leap.Model.CreateAndTrainModelDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Provide a name so you can more easily identify the model. | [optional] 
**SubjectKeyword** | **string** | This is the keyword you will use during image generation to trigger your custom subject. For example \&quot;a photo of @me\&quot;. | [optional] 
**SubjectType** | **string** | The subject type - a short description, usually a noun, that describes what the underlying model is learning. For example: person, man, woman, cat, dog, icon, style. Defaults to \&quot;person\&quot;. | [optional] [default to "person"]
**WebhookUrl** | **string** | An optional webhook URL that will be called with a POST request when the model completes training or fails. | [optional] 
**ImageSampleUrls** | **List&lt;string&gt;** | An array of strings containing the URLs of the images to upload. Either this or imageSampleFiles is required, but not both. | [optional] 
**ImageSampleFiles** | **List&lt;System.IO.Stream&gt;** | An array of files containing the images to upload. Either this or imageSampleUrls is required, but not both. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

