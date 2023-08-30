# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from leap.apis.path_to_api import path_to_api

import enum


class PathValues(str, enum.Enum):
    API_V1_IMAGES_MODELS_MODEL_ID_INFERENCES = "/api/v1/images/models/{modelId}/inferences"
    API_V1_IMAGES_MODELS_MODEL_ID_INFERENCES_INFERENCE_ID = "/api/v1/images/models/{modelId}/inferences/{inferenceId}"
    API_V2_IMAGES_MODELS_NEW = "/api/v2/images/models/new"
    API_V2_IMAGES_MODELS = "/api/v2/images/models"
    API_V2_IMAGES_MODELS_MODEL_ID = "/api/v2/images/models/{modelId}"
    API_V1_MUSIC = "/api/v1/music"
    API_V1_MUSIC_INFERENCE_ID = "/api/v1/music/{inferenceId}"
