# coding: utf-8
"""
    Leap

    The Official Leap API

    The version of the OpenAPI document: 1.0
    Created by: https://tryleap.ai/
"""

import typing
import inspect
from datetime import date, datetime
from leap.client_custom import ClientCustom
from leap.configuration import Configuration
from leap.api_client import ApiClient
from leap.type_util import copy_signature
from leap.apis.tags.image_models_api import ImageModelsApi
from leap.apis.tags.images_api import ImagesApi
from leap.apis.tags.music_api import MusicApi



class Leap(ClientCustom):

    def __init__(self, configuration: typing.Union[Configuration, None] = None, **kwargs):
        super().__init__(configuration, **kwargs)
        if (len(kwargs) > 0):
            configuration = Configuration(**kwargs)
        if (configuration is None):
            raise Exception("configuration is required")
        api_client = ApiClient(configuration)
        self.image_models: ImageModelsApi = ImageModelsApi(api_client)
        self.images: ImagesApi = ImagesApi(api_client)
        self.music: MusicApi = MusicApi(api_client)
