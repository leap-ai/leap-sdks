# coding: utf-8

"""
    Leap

    The Official Leap API

    The version of the OpenAPI document: 1.0
    Created by: https://tryleap.ai/
"""

from datetime import datetime, date
import typing
from enum import Enum
from typing_extensions import TypedDict, Literal

from leap.type.model_v2_entity import ModelV2Entity
from leap.type.model_v2_entity_image_samples import ModelV2EntityImageSamples

class RequiredListModelsV2Response(TypedDict):
    models: typing.List[ModelV2Entity]

class OptionalListModelsV2Response(TypedDict, total=False):
    pass

class ListModelsV2Response(RequiredListModelsV2Response, OptionalListModelsV2Response):
    pass
