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


class RequiredCreateInferenceDto(TypedDict):
    # A text description of the image you what you want to generate.
    prompt: str

class OptionalCreateInferenceDto(TypedDict, total=False):
    # A text description of what the image should try to avoid generating.
    negativePrompt: str

    # How many steps the AI will take to generate the image. Lower is faster but less detailed, higher is slower more detailed.
    steps: typing.Union[int, float]

    # The width of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models.
    width: typing.Union[int, float]

    # The height of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models.
    height: typing.Union[int, float]

    # The number of images to generate, up to 4.
    numberOfImages: typing.Union[int, float]

    # The higher the prompt strength, the closer the generated image will be to the prompt. Must be between 0 and 30.
    promptStrength: typing.Union[int, float]

    # A random number to use as a seed when generating the image. This is helpful if you want to generate the same image multiple times. If you want to generate different images, keep this empty or provide a random number.
    seed: typing.Union[int, float]

    # An optional webhook URL that will be called with a POST request when the image generation request completes.
    webhookUrl: str

class CreateInferenceDto(RequiredCreateInferenceDto, OptionalCreateInferenceDto):
    pass
