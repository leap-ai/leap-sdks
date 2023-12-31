# coding: utf-8

"""
    Leap

    The Official Leap API

    The version of the OpenAPI document: 1.0
    Created by: https://tryleap.ai/
"""

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


class CreateAndTrainModelDto(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            name = schemas.StrSchema
            subjectKeyword = schemas.StrSchema
            subjectType = schemas.StrSchema
            webhookUrl = schemas.StrSchema
        
            @staticmethod
            def imageSampleUrls() -> typing.Type['CreateAndTrainModelDtoImageSampleUrls']:
                return CreateAndTrainModelDtoImageSampleUrls
        
            @staticmethod
            def imageSampleFiles() -> typing.Type['CreateAndTrainModelDtoImageSampleFiles']:
                return CreateAndTrainModelDtoImageSampleFiles
            __annotations__ = {
                "name": name,
                "subjectKeyword": subjectKeyword,
                "subjectType": subjectType,
                "webhookUrl": webhookUrl,
                "imageSampleUrls": imageSampleUrls,
                "imageSampleFiles": imageSampleFiles,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> MetaOapg.properties.name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["subjectKeyword"]) -> MetaOapg.properties.subjectKeyword: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["subjectType"]) -> MetaOapg.properties.subjectType: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["webhookUrl"]) -> MetaOapg.properties.webhookUrl: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["imageSampleUrls"]) -> 'CreateAndTrainModelDtoImageSampleUrls': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["imageSampleFiles"]) -> 'CreateAndTrainModelDtoImageSampleFiles': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["name", "subjectKeyword", "subjectType", "webhookUrl", "imageSampleUrls", "imageSampleFiles", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["name"]) -> typing.Union[MetaOapg.properties.name, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["subjectKeyword"]) -> typing.Union[MetaOapg.properties.subjectKeyword, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["subjectType"]) -> typing.Union[MetaOapg.properties.subjectType, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["webhookUrl"]) -> typing.Union[MetaOapg.properties.webhookUrl, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["imageSampleUrls"]) -> typing.Union['CreateAndTrainModelDtoImageSampleUrls', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["imageSampleFiles"]) -> typing.Union['CreateAndTrainModelDtoImageSampleFiles', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["name", "subjectKeyword", "subjectType", "webhookUrl", "imageSampleUrls", "imageSampleFiles", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        name: typing.Union[MetaOapg.properties.name, str, schemas.Unset] = schemas.unset,
        subjectKeyword: typing.Union[MetaOapg.properties.subjectKeyword, str, schemas.Unset] = schemas.unset,
        subjectType: typing.Union[MetaOapg.properties.subjectType, str, schemas.Unset] = schemas.unset,
        webhookUrl: typing.Union[MetaOapg.properties.webhookUrl, str, schemas.Unset] = schemas.unset,
        imageSampleUrls: typing.Union['CreateAndTrainModelDtoImageSampleUrls', schemas.Unset] = schemas.unset,
        imageSampleFiles: typing.Union['CreateAndTrainModelDtoImageSampleFiles', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'CreateAndTrainModelDto':
        return super().__new__(
            cls,
            *args,
            name=name,
            subjectKeyword=subjectKeyword,
            subjectType=subjectType,
            webhookUrl=webhookUrl,
            imageSampleUrls=imageSampleUrls,
            imageSampleFiles=imageSampleFiles,
            _configuration=_configuration,
            **kwargs,
        )

from leap.model.create_and_train_model_dto_image_sample_files import CreateAndTrainModelDtoImageSampleFiles
from leap.model.create_and_train_model_dto_image_sample_urls import CreateAndTrainModelDtoImageSampleUrls
