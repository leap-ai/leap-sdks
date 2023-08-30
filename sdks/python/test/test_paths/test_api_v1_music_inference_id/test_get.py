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
from leap.paths.api_v1_music_inference_id import get
from leap import configuration, schemas, api_client

from .. import ApiTestMixin


class TestApiV1MusicInferenceId(ApiTestMixin, unittest.TestCase):
    """
    ApiV1MusicInferenceId unit test stubs
        Get a Music Generation Job
    """

    def setUp(self):
        pass

    def tearDown(self):
        pass

    response_status = 200




if __name__ == '__main__':
    unittest.main()
