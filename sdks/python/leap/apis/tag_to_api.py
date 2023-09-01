import typing_extensions

from leap.apis.tags import TagValues
from leap.apis.tags.images_api import ImagesApi
from leap.apis.tags.image_models_api import ImageModelsApi
from leap.apis.tags.music_api import MusicApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        TagValues.IMAGES: ImagesApi,
        TagValues.IMAGE_MODELS: ImageModelsApi,
        TagValues.MUSIC: MusicApi,
    }
)

tag_to_api = TagToApi(
    {
        TagValues.IMAGES: ImagesApi,
        TagValues.IMAGE_MODELS: ImageModelsApi,
        TagValues.MUSIC: MusicApi,
    }
)
