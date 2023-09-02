# coding: utf-8

# flake8: noqa

"""
    Leap

    The Official Leap API

    The version of the OpenAPI document: 1.0
    Created by: https://tryleap.ai/
"""

__version__ = "1.1.3"

# import ApiClient
from leap.api_client import ApiClient

# import Configuration
from leap.configuration import Configuration

# import exceptions
from leap.exceptions import OpenApiException
from leap.exceptions import ApiAttributeError
from leap.exceptions import ApiTypeError
from leap.exceptions import ApiValueError
from leap.exceptions import ApiKeyError
from leap.exceptions import ApiException

from leap.client import Leap
