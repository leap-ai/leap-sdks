# coding: utf-8

"""
    Leap

    The Official Leap API

    The version of the OpenAPI document: 1.0
    Created by: https://tryleap.ai/
"""

import unittest
from unittest.mock import patch

import urllib3

import leap
from leap.paths.api_v2_images_models_new import post
from leap import configuration, schemas, api_client

from .. import ApiTestMixin


class TestApiV2ImagesModelsNew(ApiTestMixin, unittest.TestCase):
    """
    ApiV2ImagesModelsNew unit test stubs
        Train Model
    """

    def setUp(self):
        pass

    def tearDown(self):
        pass

    response_status = 201






if __name__ == '__main__':
    unittest.main()
