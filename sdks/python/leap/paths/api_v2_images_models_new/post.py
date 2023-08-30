# coding: utf-8

"""
    Leap

    The Official Leap API

    The version of the OpenAPI document: 1.0
    Created by: https://tryleap.ai/
"""

from dataclasses import dataclass
import typing_extensions
import urllib3
from leap.request_before_hook import request_before_hook
import json
from urllib3._collections import HTTPHeaderDict

from leap.api_response import AsyncGeneratorResponse
from leap import api_client, exceptions
from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from leap import schemas  # noqa: F401

from leap.model.model_v2_entity import ModelV2Entity as ModelV2EntitySchema
from leap.model.create_and_train_model_dto_image_sample_files import CreateAndTrainModelDtoImageSampleFiles as CreateAndTrainModelDtoImageSampleFilesSchema
from leap.model.create_and_train_model_dto_image_sample_urls import CreateAndTrainModelDtoImageSampleUrls as CreateAndTrainModelDtoImageSampleUrlsSchema
from leap.model.create_and_train_model_dto import CreateAndTrainModelDto as CreateAndTrainModelDtoSchema

from leap.type.model_v2_entity import ModelV2Entity
from leap.type.create_and_train_model_dto_image_sample_files import CreateAndTrainModelDtoImageSampleFiles
from leap.type.create_and_train_model_dto import CreateAndTrainModelDto
from leap.type.create_and_train_model_dto_image_sample_urls import CreateAndTrainModelDtoImageSampleUrls

from . import path

# body param
SchemaForRequestBodyMultipartFormData = CreateAndTrainModelDtoSchema


request_body_create_and_train_model_dto = api_client.RequestBody(
    content={
        'multipart/form-data': api_client.MediaType(
            schema=SchemaForRequestBodyMultipartFormData),
    },
    required=True,
)
_auth = [
    'bearer',
]
SchemaFor200ResponseBodyApplicationJson = ModelV2EntitySchema


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    body: ModelV2Entity


@dataclass
class ApiResponseFor200Async(api_client.AsyncApiResponse):
    body: ModelV2Entity


_response_for_200 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor200,
    response_cls_async=ApiResponseFor200Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor200ResponseBodyApplicationJson),
    },
)
_status_code_to_response = {
    '200': _response_for_200,
}
_all_accept_content_types = (
    'application/json',
)


class BaseApi(api_client.Api):

    def _train_model_mapped_args(
        self,
        name: typing.Optional[str] = None,
        subject_keyword: typing.Optional[str] = None,
        subject_type: typing.Optional[str] = None,
        webhook_url: typing.Optional[str] = None,
        image_sample_urls: typing.Optional[CreateAndTrainModelDtoImageSampleUrls] = None,
        image_sample_files: typing.Optional[CreateAndTrainModelDtoImageSampleFiles] = None,
    ) -> api_client.MappedArgs:
        args: api_client.MappedArgs = api_client.MappedArgs()
        _body = {}
        if name is not None:
            _body["name"] = name
        if subject_keyword is not None:
            _body["subjectKeyword"] = subject_keyword
        if subject_type is not None:
            _body["subjectType"] = subject_type
        if webhook_url is not None:
            _body["webhookUrl"] = webhook_url
        if image_sample_urls is not None:
            _body["imageSampleUrls"] = image_sample_urls
        if image_sample_files is not None:
            _body["imageSampleFiles"] = image_sample_files
        args.body = _body
        return args

    async def _atrain_model_oapg(
        self,
        body: typing.Any = None,
        skip_deserialization: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        content_type: str = 'multipart/form-data',
        stream: bool = False,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        """
        Train Model
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        used_path = path.value
    
        _headers = HTTPHeaderDict()
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)
        method = 'post'.upper()
        _headers.add('Content-Type', content_type)
    
        if body is schemas.unset:
            raise exceptions.ApiValueError(
                'The required body parameter has an invalid value of: unset. Set a valid value instead')
        _fields = None
        _body = None
        request_before_hook(
            resource_path=used_path,
            method=method,
            configuration=self.api_client.configuration,
            body=body,
            auth_settings=_auth,
            headers=_headers,
        )
        serialized_data = request_body_create_and_train_model_dto.serialize(body, content_type)
        if 'fields' in serialized_data:
            _fields = serialized_data['fields']
        elif 'body' in serialized_data:
            _body = serialized_data['body']
    
        response = await self.api_client.async_call_api(
            resource_path=used_path,
            method=method,
            headers=_headers,
            fields=_fields,
            serialized_body=_body,
            body=body,
            auth_settings=_auth,
            timeout=timeout,
        )
    
        if stream:
            if not 200 <= response.http_response.status <= 299:
                body = (await response.http_response.content.read()).decode("utf-8")
                raise exceptions.ApiStreamingException(
                    status=response.http_response.status,
                    reason=response.http_response.reason,
                    body=body,
                )
    
            async def stream_iterator():
                """
                iterates over response.http_response.content and closes connection once iteration has finished
                """
                async for line in response.http_response.content:
                    if line == b'\r\n':
                        continue
                    yield line
                response.http_response.close()
                await response.session.close()
            return AsyncGeneratorResponse(
                content=stream_iterator(),
                headers=response.http_response.headers,
                status=response.http_response.status,
                response=response.http_response
            )
    
        response_for_status = _status_code_to_response.get(str(response.http_response.status))
        if response_for_status:
            api_response = await response_for_status.deserialize_async(
                                                    response,
                                                    self.api_client.configuration,
                                                    skip_deserialization=skip_deserialization
                                                )
        else:
            # If response data is JSON then deserialize for SDK consumer convenience
            is_json = api_client.JSONDetector._content_type_is_json(response.http_response.headers.get('Content-Type', ''))
            api_response = api_client.ApiResponseWithoutDeserializationAsync(
                body=await response.http_response.json() if is_json else await response.http_response.text(),
                response=response.http_response,
                round_trip_time=response.round_trip_time,
                status=response.http_response.status,
                headers=response.http_response.headers,
            )
    
        if not 200 <= api_response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)
    
        # cleanup session / response
        response.http_response.close()
        await response.session.close()
    
        return api_response


    def _train_model_oapg(
        self,
        body: typing.Any = None,
        skip_deserialization: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        content_type: str = 'multipart/form-data',
        stream: bool = False,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        """
        Train Model
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        used_path = path.value
    
        _headers = HTTPHeaderDict()
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)
        method = 'post'.upper()
        _headers.add('Content-Type', content_type)
    
        if body is schemas.unset:
            raise exceptions.ApiValueError(
                'The required body parameter has an invalid value of: unset. Set a valid value instead')
        _fields = None
        _body = None
        request_before_hook(
            resource_path=used_path,
            method=method,
            configuration=self.api_client.configuration,
            body=body,
            auth_settings=_auth,
            headers=_headers,
        )
        serialized_data = request_body_create_and_train_model_dto.serialize(body, content_type)
        if 'fields' in serialized_data:
            _fields = serialized_data['fields']
        elif 'body' in serialized_data:
            _body = serialized_data['body']
    
        response = self.api_client.call_api(
            resource_path=used_path,
            method=method,
            headers=_headers,
            fields=_fields,
            serialized_body=_body,
            body=body,
            auth_settings=_auth,
            timeout=timeout,
        )
    
        response_for_status = _status_code_to_response.get(str(response.http_response.status))
        if response_for_status:
            api_response = response_for_status.deserialize(
                                                    response,
                                                    self.api_client.configuration,
                                                    skip_deserialization=skip_deserialization
                                                )
        else:
            # If response data is JSON then deserialize for SDK consumer convenience
            is_json = api_client.JSONDetector._content_type_is_json(response.http_response.headers.get('Content-Type', ''))
            api_response = api_client.ApiResponseWithoutDeserialization(
                body=json.loads(response.http_response.data) if is_json else response.http_response.data,
                response=response.http_response,
                round_trip_time=response.round_trip_time,
                status=response.http_response.status,
                headers=response.http_response.headers,
            )
    
        if not 200 <= api_response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)
    
        return api_response


class TrainModel(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    async def atrain_model(
        self,
        name: typing.Optional[str] = None,
        subject_keyword: typing.Optional[str] = None,
        subject_type: typing.Optional[str] = None,
        webhook_url: typing.Optional[str] = None,
        image_sample_urls: typing.Optional[CreateAndTrainModelDtoImageSampleUrls] = None,
        image_sample_files: typing.Optional[CreateAndTrainModelDtoImageSampleFiles] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._train_model_mapped_args(
            name=name,
            subject_keyword=subject_keyword,
            subject_type=subject_type,
            webhook_url=webhook_url,
            image_sample_urls=image_sample_urls,
            image_sample_files=image_sample_files,
        )
        return await self._atrain_model_oapg(
            body=args.body,
        )
    
    def train_model(
        self,
        name: typing.Optional[str] = None,
        subject_keyword: typing.Optional[str] = None,
        subject_type: typing.Optional[str] = None,
        webhook_url: typing.Optional[str] = None,
        image_sample_urls: typing.Optional[CreateAndTrainModelDtoImageSampleUrls] = None,
        image_sample_files: typing.Optional[CreateAndTrainModelDtoImageSampleFiles] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._train_model_mapped_args(
            name=name,
            subject_keyword=subject_keyword,
            subject_type=subject_type,
            webhook_url=webhook_url,
            image_sample_urls=image_sample_urls,
            image_sample_files=image_sample_files,
        )
        return self._train_model_oapg(
            body=args.body,
        )

class ApiForpost(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    async def apost(
        self,
        name: typing.Optional[str] = None,
        subject_keyword: typing.Optional[str] = None,
        subject_type: typing.Optional[str] = None,
        webhook_url: typing.Optional[str] = None,
        image_sample_urls: typing.Optional[CreateAndTrainModelDtoImageSampleUrls] = None,
        image_sample_files: typing.Optional[CreateAndTrainModelDtoImageSampleFiles] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._train_model_mapped_args(
            name=name,
            subject_keyword=subject_keyword,
            subject_type=subject_type,
            webhook_url=webhook_url,
            image_sample_urls=image_sample_urls,
            image_sample_files=image_sample_files,
        )
        return await self._atrain_model_oapg(
            body=args.body,
        )
    
    def post(
        self,
        name: typing.Optional[str] = None,
        subject_keyword: typing.Optional[str] = None,
        subject_type: typing.Optional[str] = None,
        webhook_url: typing.Optional[str] = None,
        image_sample_urls: typing.Optional[CreateAndTrainModelDtoImageSampleUrls] = None,
        image_sample_files: typing.Optional[CreateAndTrainModelDtoImageSampleFiles] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._train_model_mapped_args(
            name=name,
            subject_keyword=subject_keyword,
            subject_type=subject_type,
            webhook_url=webhook_url,
            image_sample_urls=image_sample_urls,
            image_sample_files=image_sample_files,
        )
        return self._train_model_oapg(
            body=args.body,
        )

