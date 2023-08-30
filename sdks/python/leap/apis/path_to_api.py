import typing_extensions

from leap.paths import PathValues
from leap.apis.paths.api_v1_images_models_model_id_inferences import ApiV1ImagesModelsModelIdInferences
from leap.apis.paths.api_v1_images_models_model_id_inferences_inference_id import ApiV1ImagesModelsModelIdInferencesInferenceId
from leap.apis.paths.api_v2_images_models_new import ApiV2ImagesModelsNew
from leap.apis.paths.api_v2_images_models import ApiV2ImagesModels
from leap.apis.paths.api_v2_images_models_model_id import ApiV2ImagesModelsModelId
from leap.apis.paths.api_v1_music import ApiV1Music
from leap.apis.paths.api_v1_music_inference_id import ApiV1MusicInferenceId

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues.API_V1_IMAGES_MODELS_MODEL_ID_INFERENCES: ApiV1ImagesModelsModelIdInferences,
        PathValues.API_V1_IMAGES_MODELS_MODEL_ID_INFERENCES_INFERENCE_ID: ApiV1ImagesModelsModelIdInferencesInferenceId,
        PathValues.API_V2_IMAGES_MODELS_NEW: ApiV2ImagesModelsNew,
        PathValues.API_V2_IMAGES_MODELS: ApiV2ImagesModels,
        PathValues.API_V2_IMAGES_MODELS_MODEL_ID: ApiV2ImagesModelsModelId,
        PathValues.API_V1_MUSIC: ApiV1Music,
        PathValues.API_V1_MUSIC_INFERENCE_ID: ApiV1MusicInferenceId,
    }
)

path_to_api = PathToApi(
    {
        PathValues.API_V1_IMAGES_MODELS_MODEL_ID_INFERENCES: ApiV1ImagesModelsModelIdInferences,
        PathValues.API_V1_IMAGES_MODELS_MODEL_ID_INFERENCES_INFERENCE_ID: ApiV1ImagesModelsModelIdInferencesInferenceId,
        PathValues.API_V2_IMAGES_MODELS_NEW: ApiV2ImagesModelsNew,
        PathValues.API_V2_IMAGES_MODELS: ApiV2ImagesModels,
        PathValues.API_V2_IMAGES_MODELS_MODEL_ID: ApiV2ImagesModelsModelId,
        PathValues.API_V1_MUSIC: ApiV1Music,
        PathValues.API_V1_MUSIC_INFERENCE_ID: ApiV1MusicInferenceId,
    }
)
