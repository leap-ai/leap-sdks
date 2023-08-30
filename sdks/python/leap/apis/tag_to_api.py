import typing_extensions

from leap.apis.tags import TagValues
from leap.apis.tags.generate_images_api import GenerateImagesApi
from leap.apis.tags.train_image_models_api import TrainImageModelsApi
from leap.apis.tags.generate_music_api import GenerateMusicApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        TagValues.GENERATE_IMAGES: GenerateImagesApi,
        TagValues.TRAIN_IMAGE_MODELS: TrainImageModelsApi,
        TagValues.GENERATE_MUSIC: GenerateMusicApi,
    }
)

tag_to_api = TagToApi(
    {
        TagValues.GENERATE_IMAGES: GenerateImagesApi,
        TagValues.TRAIN_IMAGE_MODELS: TrainImageModelsApi,
        TagValues.GENERATE_MUSIC: GenerateMusicApi,
    }
)
