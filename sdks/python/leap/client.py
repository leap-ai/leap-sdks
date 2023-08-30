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
from leap.apis.tags.generate_images_api import GenerateImagesApi
from leap.apis.tags.generate_music_api import GenerateMusicApi
from leap.apis.tags.train_image_models_api import TrainImageModelsApi



class Leap(ClientCustom):

    def __init__(self, configuration: typing.Union[Configuration, None] = None, **kwargs):
        super().__init__(configuration, **kwargs)
        if (len(kwargs) > 0):
            configuration = Configuration(**kwargs)
        if (configuration is None):
            raise Exception("configuration is required")
        api_client = ApiClient(configuration)
        self.generate_images: GenerateImagesApi = GenerateImagesApi(api_client)
        self.generate_music: GenerateMusicApi = GenerateMusicApi(api_client)
        self.train_image_models: TrainImageModelsApi = TrainImageModelsApi(api_client)
