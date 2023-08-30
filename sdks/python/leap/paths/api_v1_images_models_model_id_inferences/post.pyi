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

from leap.model.inference_entity import InferenceEntity as InferenceEntitySchema
from leap.model.create_inference_dto import CreateInferenceDto as CreateInferenceDtoSchema

from leap.type.inference_entity import InferenceEntity
from leap.type.create_inference_dto import CreateInferenceDto

# Path params
ModelIdSchema = schemas.StrSchema
RequestRequiredPathParams = typing_extensions.TypedDict(
    'RequestRequiredPathParams',
    {
        'modelId': typing.Union[ModelIdSchema, str, ],
    }
)
RequestOptionalPathParams = typing_extensions.TypedDict(
    'RequestOptionalPathParams',
    {
    },
    total=False
)


class RequestPathParams(RequestRequiredPathParams, RequestOptionalPathParams):
    pass


request_path_model_id = api_client.PathParameter(
    name="modelId",
    style=api_client.ParameterStyle.SIMPLE,
    schema=ModelIdSchema,
    required=True,
)
# body param
SchemaForRequestBodyApplicationJson = CreateInferenceDtoSchema


request_body_create_inference_dto = api_client.RequestBody(
    content={
        'application/json': api_client.MediaType(
            schema=SchemaForRequestBodyApplicationJson),
    },
    required=True,
)
SchemaFor200ResponseBodyApplicationJson = InferenceEntitySchema


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    body: InferenceEntity


@dataclass
class ApiResponseFor200Async(api_client.AsyncApiResponse):
    body: InferenceEntity


_response_for_200 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor200,
    response_cls_async=ApiResponseFor200Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor200ResponseBodyApplicationJson),
    },
)
_all_accept_content_types = (
    'application/json',
)


class BaseApi(api_client.Api):

    def _create_mapped_args(
        self,
        prompt: str,
        model_id: str,
        negative_prompt: typing.Optional[str] = None,
        steps: typing.Optional[typing.Union[int, float]] = None,
        width: typing.Optional[typing.Union[int, float]] = None,
        height: typing.Optional[typing.Union[int, float]] = None,
        number_of_images: typing.Optional[typing.Union[int, float]] = None,
        prompt_strength: typing.Optional[typing.Union[int, float]] = None,
        seed: typing.Optional[typing.Union[int, float]] = None,
        webhook_url: typing.Optional[str] = None,
    ) -> api_client.MappedArgs:
        args: api_client.MappedArgs = api_client.MappedArgs()
        _path_params = {}
        _body = {}
        if prompt is not None:
            _body["prompt"] = prompt
        if negative_prompt is not None:
            _body["negativePrompt"] = negative_prompt
        if steps is not None:
            _body["steps"] = steps
        if width is not None:
            _body["width"] = width
        if height is not None:
            _body["height"] = height
        if number_of_images is not None:
            _body["numberOfImages"] = number_of_images
        if prompt_strength is not None:
            _body["promptStrength"] = prompt_strength
        if seed is not None:
            _body["seed"] = seed
        if webhook_url is not None:
            _body["webhookUrl"] = webhook_url
        args.body = _body
        if model_id is not None:
            _path_params["modelId"] = model_id
        args.path = _path_params
        return args

    async def _acreate_oapg(
        self,
        body: typing.Any = None,
            path_params: typing.Optional[dict] = {},
        skip_deserialization: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        content_type: str = 'application/json',
        stream: bool = False,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        """
        Generate an Image
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestPathParams, path_params)
        used_path = path.value
    
        _path_params = {}
        for parameter in (
            request_path_model_id,
        ):
            parameter_data = path_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _path_params.update(serialized_data)
    
        for k, v in _path_params.items():
            used_path = used_path.replace('{%s}' % k, v)
    
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
        serialized_data = request_body_create_inference_dto.serialize(body, content_type)
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


    def _create_oapg(
        self,
        body: typing.Any = None,
            path_params: typing.Optional[dict] = {},
        skip_deserialization: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        content_type: str = 'application/json',
        stream: bool = False,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        """
        Generate an Image
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestPathParams, path_params)
        used_path = path.value
    
        _path_params = {}
        for parameter in (
            request_path_model_id,
        ):
            parameter_data = path_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _path_params.update(serialized_data)
    
        for k, v in _path_params.items():
            used_path = used_path.replace('{%s}' % k, v)
    
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
        serialized_data = request_body_create_inference_dto.serialize(body, content_type)
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


class Create(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    async def acreate(
        self,
        prompt: str,
        model_id: str,
        negative_prompt: typing.Optional[str] = None,
        steps: typing.Optional[typing.Union[int, float]] = None,
        width: typing.Optional[typing.Union[int, float]] = None,
        height: typing.Optional[typing.Union[int, float]] = None,
        number_of_images: typing.Optional[typing.Union[int, float]] = None,
        prompt_strength: typing.Optional[typing.Union[int, float]] = None,
        seed: typing.Optional[typing.Union[int, float]] = None,
        webhook_url: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._create_mapped_args(
            prompt=prompt,
            model_id=model_id,
            negative_prompt=negative_prompt,
            steps=steps,
            width=width,
            height=height,
            number_of_images=number_of_images,
            prompt_strength=prompt_strength,
            seed=seed,
            webhook_url=webhook_url,
        )
        return await self._acreate_oapg(
            body=args.body,
            path_params=args.path,
        )
    
    def create(
        self,
        prompt: str,
        model_id: str,
        negative_prompt: typing.Optional[str] = None,
        steps: typing.Optional[typing.Union[int, float]] = None,
        width: typing.Optional[typing.Union[int, float]] = None,
        height: typing.Optional[typing.Union[int, float]] = None,
        number_of_images: typing.Optional[typing.Union[int, float]] = None,
        prompt_strength: typing.Optional[typing.Union[int, float]] = None,
        seed: typing.Optional[typing.Union[int, float]] = None,
        webhook_url: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._create_mapped_args(
            prompt=prompt,
            model_id=model_id,
            negative_prompt=negative_prompt,
            steps=steps,
            width=width,
            height=height,
            number_of_images=number_of_images,
            prompt_strength=prompt_strength,
            seed=seed,
            webhook_url=webhook_url,
        )
        return self._create_oapg(
            body=args.body,
            path_params=args.path,
        )

class ApiForpost(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    async def apost(
        self,
        prompt: str,
        model_id: str,
        negative_prompt: typing.Optional[str] = None,
        steps: typing.Optional[typing.Union[int, float]] = None,
        width: typing.Optional[typing.Union[int, float]] = None,
        height: typing.Optional[typing.Union[int, float]] = None,
        number_of_images: typing.Optional[typing.Union[int, float]] = None,
        prompt_strength: typing.Optional[typing.Union[int, float]] = None,
        seed: typing.Optional[typing.Union[int, float]] = None,
        webhook_url: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._create_mapped_args(
            prompt=prompt,
            model_id=model_id,
            negative_prompt=negative_prompt,
            steps=steps,
            width=width,
            height=height,
            number_of_images=number_of_images,
            prompt_strength=prompt_strength,
            seed=seed,
            webhook_url=webhook_url,
        )
        return await self._acreate_oapg(
            body=args.body,
            path_params=args.path,
        )
    
    def post(
        self,
        prompt: str,
        model_id: str,
        negative_prompt: typing.Optional[str] = None,
        steps: typing.Optional[typing.Union[int, float]] = None,
        width: typing.Optional[typing.Union[int, float]] = None,
        height: typing.Optional[typing.Union[int, float]] = None,
        number_of_images: typing.Optional[typing.Union[int, float]] = None,
        prompt_strength: typing.Optional[typing.Union[int, float]] = None,
        seed: typing.Optional[typing.Union[int, float]] = None,
        webhook_url: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._create_mapped_args(
            prompt=prompt,
            model_id=model_id,
            negative_prompt=negative_prompt,
            steps=steps,
            width=width,
            height=height,
            number_of_images=number_of_images,
            prompt_strength=prompt_strength,
            seed=seed,
            webhook_url=webhook_url,
        )
        return self._create_oapg(
            body=args.body,
            path_params=args.path,
        )

