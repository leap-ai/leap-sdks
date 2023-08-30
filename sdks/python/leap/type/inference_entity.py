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

from leap.type.inference_entity_model_id import InferenceEntityModelId
from leap.type.inference_image_entity import InferenceImageEntity

class RequiredInferenceEntity(TypedDict):
    id: str

    createdAt: datetime

    prompt: str

    negativePrompt: str

    seed: typing.Union[int, float]

    width: typing.Union[int, float]

    height: typing.Union[int, float]

    promptStrength: typing.Union[int, float]

    numberOfImages: typing.Union[int, float]

    state: str

    steps: typing.Union[int, float]

    images: typing.List[InferenceImageEntity]

    modelId: InferenceEntityModelId

    upscalingOption: str

class OptionalInferenceEntity(TypedDict, total=False):
    pass

class InferenceEntity(RequiredInferenceEntity, OptionalInferenceEntity):
    pass
