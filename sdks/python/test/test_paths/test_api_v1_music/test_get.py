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
from leap.paths.api_v1_music import get
from leap import configuration, schemas, api_client

from .. import ApiTestMixin


class TestApiV1Music(ApiTestMixin, unittest.TestCase):
    """
    ApiV1Music unit test stubs
        List Music Generation Jobs
    """

    def setUp(self):
        pass

    def tearDown(self):
        pass

    response_status = 200




if __name__ == '__main__':
    unittest.main()
