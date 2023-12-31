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


class ModelV2Entity(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "subjectKeyword",
            "createdAt",
            "name",
            "id",
            "subjectType",
            "imageSamples",
            "status",
        }
        
        class properties:
            id = schemas.StrSchema
            name = schemas.StrSchema
            createdAt = schemas.StrSchema
            subjectKeyword = schemas.StrSchema
            subjectType = schemas.StrSchema
            status = schemas.StrSchema
        
            @staticmethod
            def imageSamples() -> typing.Type['ModelV2EntityImageSamples']:
                return ModelV2EntityImageSamples
            __annotations__ = {
                "id": id,
                "name": name,
                "createdAt": createdAt,
                "subjectKeyword": subjectKeyword,
                "subjectType": subjectType,
                "status": status,
                "imageSamples": imageSamples,
            }
    
    subjectKeyword: MetaOapg.properties.subjectKeyword
    createdAt: MetaOapg.properties.createdAt
    name: MetaOapg.properties.name
    id: MetaOapg.properties.id
    subjectType: MetaOapg.properties.subjectType
    imageSamples: 'ModelV2EntityImageSamples'
    status: MetaOapg.properties.status
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> MetaOapg.properties.name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["createdAt"]) -> MetaOapg.properties.createdAt: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["subjectKeyword"]) -> MetaOapg.properties.subjectKeyword: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["subjectType"]) -> MetaOapg.properties.subjectType: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> MetaOapg.properties.status: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["imageSamples"]) -> 'ModelV2EntityImageSamples': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["id", "name", "createdAt", "subjectKeyword", "subjectType", "status", "imageSamples", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["name"]) -> MetaOapg.properties.name: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["createdAt"]) -> MetaOapg.properties.createdAt: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["subjectKeyword"]) -> MetaOapg.properties.subjectKeyword: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["subjectType"]) -> MetaOapg.properties.subjectType: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["status"]) -> MetaOapg.properties.status: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["imageSamples"]) -> 'ModelV2EntityImageSamples': ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["id", "name", "createdAt", "subjectKeyword", "subjectType", "status", "imageSamples", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        subjectKeyword: typing.Union[MetaOapg.properties.subjectKeyword, str, ],
        createdAt: typing.Union[MetaOapg.properties.createdAt, str, ],
        name: typing.Union[MetaOapg.properties.name, str, ],
        id: typing.Union[MetaOapg.properties.id, str, ],
        subjectType: typing.Union[MetaOapg.properties.subjectType, str, ],
        imageSamples: 'ModelV2EntityImageSamples',
        status: typing.Union[MetaOapg.properties.status, str, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'ModelV2Entity':
        return super().__new__(
            cls,
            *args,
            subjectKeyword=subjectKeyword,
            createdAt=createdAt,
            name=name,
            id=id,
            subjectType=subjectType,
            imageSamples=imageSamples,
            status=status,
            _configuration=_configuration,
            **kwargs,
        )

from leap.model.model_v2_entity_image_samples import ModelV2EntityImageSamples
