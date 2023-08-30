/* tslint:disable */
/* eslint-disable */
/**
 * Leap
 * The Official Leap API
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This file is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */

import globalAxios, { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction, isBrowser } from '../common';
import { fromBuffer } from "file-type/browser"
const FormData = require("form-data")
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
// @ts-ignore
import { CreateInferenceDto } from '../models';
// @ts-ignore
import { InferenceEntity } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
/**
 * GenerateImagesApi - axios parameter creator
 * @export
 */
export const GenerateImagesApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Generate an image by providing a text description. Generations usually take bettween 4-20 seconds per image. Total generation time depends on the number of `steps` and `noOfImages` you select. This endpoint will submit the generation job and return immediately. To retrieve the results you must provide a webhook URL or query/poll the [Get a Single Image Job](https://reference.tryleap.ai/reference/inferencescontroller_findone-1) endpoint.
         * @summary Generate an Image
         * @param {string} modelId The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models
         * @param {CreateInferenceDto} createInferenceDto 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        create: async (modelId: string, createInferenceDto: CreateInferenceDto, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'modelId' is not null or undefined
            assertParamExists('create', 'modelId', modelId)
            // verify required parameter 'createInferenceDto' is not null or undefined
            assertParamExists('create', 'createInferenceDto', createInferenceDto)
            const localVarPath = `/api/v1/images/models/{modelId}/inferences`
                .replace(`{${"modelId"}}`, encodeURIComponent(String(modelId !== undefined ? modelId : `-modelId-`)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration && !isBrowser() ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearer required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)

    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                requestBody: createInferenceDto,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(createInferenceDto, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Fetch a list of inference jobs for a specific model.
         * @summary List All Image Jobs
         * @param {string} modelId The ID of the model to generate images. This can be a custom model or a public model. Visit: https://docs.tryleap.ai/public-models to view the list of public models.
         * @param {boolean} [onlyFinished] If set to true, only finished inferences will be returned. If set to false or not set, all inference jobs will be returned.
         * @param {number} [page] The page to request.
         * @param {number} [pageSize] The number of items to return per page.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        findAll: async (modelId: string, onlyFinished?: boolean, page?: number, pageSize?: number, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'modelId' is not null or undefined
            assertParamExists('findAll', 'modelId', modelId)
            const localVarPath = `/api/v1/images/models/{modelId}/inferences`
                .replace(`{${"modelId"}}`, encodeURIComponent(String(modelId !== undefined ? modelId : `-modelId-`)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration && !isBrowser() ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearer required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)
            if (onlyFinished !== undefined) {
                localVarQueryParameter['onlyFinished'] = onlyFinished;
            }

            if (page !== undefined) {
                localVarQueryParameter['page'] = page;
            }

            if (pageSize !== undefined) {
                localVarQueryParameter['pageSize'] = pageSize;
            }


    
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Retrieve a single image generation job, including the urls for the images generated.
         * @summary Get Single Image Job
         * @param {string} modelId The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models
         * @param {string} inferenceId The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        findOne: async (modelId: string, inferenceId: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'modelId' is not null or undefined
            assertParamExists('findOne', 'modelId', modelId)
            // verify required parameter 'inferenceId' is not null or undefined
            assertParamExists('findOne', 'inferenceId', inferenceId)
            const localVarPath = `/api/v1/images/models/{modelId}/inferences/{inferenceId}`
                .replace(`{${"modelId"}}`, encodeURIComponent(String(modelId !== undefined ? modelId : `-modelId-`)))
                .replace(`{${"inferenceId"}}`, encodeURIComponent(String(inferenceId !== undefined ? inferenceId : `-inferenceId-`)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration && !isBrowser() ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearer required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)

    
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Delete the image job and all related images.
         * @summary Delete Image Job
         * @param {string} modelId The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models
         * @param {string} inferenceId The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        remove: async (modelId: string, inferenceId: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'modelId' is not null or undefined
            assertParamExists('remove', 'modelId', modelId)
            // verify required parameter 'inferenceId' is not null or undefined
            assertParamExists('remove', 'inferenceId', inferenceId)
            const localVarPath = `/api/v1/images/models/{modelId}/inferences/{inferenceId}`
                .replace(`{${"modelId"}}`, encodeURIComponent(String(modelId !== undefined ? modelId : `-modelId-`)))
                .replace(`{${"inferenceId"}}`, encodeURIComponent(String(inferenceId !== undefined ? inferenceId : `-inferenceId-`)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'DELETE', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration && !isBrowser() ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearer required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)

    
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * GenerateImagesApi - functional programming interface
 * @export
 */
export const GenerateImagesApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = GenerateImagesApiAxiosParamCreator(configuration)
    return {
        /**
         * Generate an image by providing a text description. Generations usually take bettween 4-20 seconds per image. Total generation time depends on the number of `steps` and `noOfImages` you select. This endpoint will submit the generation job and return immediately. To retrieve the results you must provide a webhook URL or query/poll the [Get a Single Image Job](https://reference.tryleap.ai/reference/inferencescontroller_findone-1) endpoint.
         * @summary Generate an Image
         * @param {GenerateImagesApiCreateRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async create(requestParameters: GenerateImagesApiCreateRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<InferenceEntity>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.create(requestParameters.modelId, requestParameters, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Fetch a list of inference jobs for a specific model.
         * @summary List All Image Jobs
         * @param {GenerateImagesApiFindAllRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async findAll(requestParameters: GenerateImagesApiFindAllRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<InferenceEntity>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.findAll(requestParameters.modelId, requestParameters.onlyFinished, requestParameters.page, requestParameters.pageSize, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Retrieve a single image generation job, including the urls for the images generated.
         * @summary Get Single Image Job
         * @param {GenerateImagesApiFindOneRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async findOne(requestParameters: GenerateImagesApiFindOneRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<InferenceEntity>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.findOne(requestParameters.modelId, requestParameters.inferenceId, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Delete the image job and all related images.
         * @summary Delete Image Job
         * @param {GenerateImagesApiRemoveRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async remove(requestParameters: GenerateImagesApiRemoveRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.remove(requestParameters.modelId, requestParameters.inferenceId, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * GenerateImagesApi - factory interface
 * @export
 */
export const GenerateImagesApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = GenerateImagesApiFp(configuration)
    return {
        /**
         * Generate an image by providing a text description. Generations usually take bettween 4-20 seconds per image. Total generation time depends on the number of `steps` and `noOfImages` you select. This endpoint will submit the generation job and return immediately. To retrieve the results you must provide a webhook URL or query/poll the [Get a Single Image Job](https://reference.tryleap.ai/reference/inferencescontroller_findone-1) endpoint.
         * @summary Generate an Image
         * @param {GenerateImagesApiCreateRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        create(requestParameters: GenerateImagesApiCreateRequest, options?: AxiosRequestConfig): AxiosPromise<InferenceEntity> {
            return localVarFp.create(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Fetch a list of inference jobs for a specific model.
         * @summary List All Image Jobs
         * @param {GenerateImagesApiFindAllRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        findAll(requestParameters: GenerateImagesApiFindAllRequest, options?: AxiosRequestConfig): AxiosPromise<Array<InferenceEntity>> {
            return localVarFp.findAll(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Retrieve a single image generation job, including the urls for the images generated.
         * @summary Get Single Image Job
         * @param {GenerateImagesApiFindOneRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        findOne(requestParameters: GenerateImagesApiFindOneRequest, options?: AxiosRequestConfig): AxiosPromise<InferenceEntity> {
            return localVarFp.findOne(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Delete the image job and all related images.
         * @summary Delete Image Job
         * @param {GenerateImagesApiRemoveRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        remove(requestParameters: GenerateImagesApiRemoveRequest, options?: AxiosRequestConfig): AxiosPromise<void> {
            return localVarFp.remove(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for create operation in GenerateImagesApi.
 * @export
 * @interface GenerateImagesApiCreateRequest
 */
export type GenerateImagesApiCreateRequest = {
    
    /**
    * The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models
    * @type {string}
    * @memberof GenerateImagesApiCreate
    */
    readonly modelId: string
    
} & CreateInferenceDto

/**
 * Request parameters for findAll operation in GenerateImagesApi.
 * @export
 * @interface GenerateImagesApiFindAllRequest
 */
export type GenerateImagesApiFindAllRequest = {
    
    /**
    * The ID of the model to generate images. This can be a custom model or a public model. Visit: https://docs.tryleap.ai/public-models to view the list of public models.
    * @type {string}
    * @memberof GenerateImagesApiFindAll
    */
    readonly modelId: string
    
    /**
    * If set to true, only finished inferences will be returned. If set to false or not set, all inference jobs will be returned.
    * @type {boolean}
    * @memberof GenerateImagesApiFindAll
    */
    readonly onlyFinished?: boolean
    
    /**
    * The page to request.
    * @type {number}
    * @memberof GenerateImagesApiFindAll
    */
    readonly page?: number
    
    /**
    * The number of items to return per page.
    * @type {number}
    * @memberof GenerateImagesApiFindAll
    */
    readonly pageSize?: number
    
}

/**
 * Request parameters for findOne operation in GenerateImagesApi.
 * @export
 * @interface GenerateImagesApiFindOneRequest
 */
export type GenerateImagesApiFindOneRequest = {
    
    /**
    * The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models
    * @type {string}
    * @memberof GenerateImagesApiFindOne
    */
    readonly modelId: string
    
    /**
    * The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job.
    * @type {string}
    * @memberof GenerateImagesApiFindOne
    */
    readonly inferenceId: string
    
}

/**
 * Request parameters for remove operation in GenerateImagesApi.
 * @export
 * @interface GenerateImagesApiRemoveRequest
 */
export type GenerateImagesApiRemoveRequest = {
    
    /**
    * The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models
    * @type {string}
    * @memberof GenerateImagesApiRemove
    */
    readonly modelId: string
    
    /**
    * The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job.
    * @type {string}
    * @memberof GenerateImagesApiRemove
    */
    readonly inferenceId: string
    
}

/**
 * GenerateImagesApiGenerated - object-oriented interface
 * @export
 * @class GenerateImagesApiGenerated
 * @extends {BaseAPI}
 */
export class GenerateImagesApiGenerated extends BaseAPI {
    /**
     * Generate an image by providing a text description. Generations usually take bettween 4-20 seconds per image. Total generation time depends on the number of `steps` and `noOfImages` you select. This endpoint will submit the generation job and return immediately. To retrieve the results you must provide a webhook URL or query/poll the [Get a Single Image Job](https://reference.tryleap.ai/reference/inferencescontroller_findone-1) endpoint.
     * @summary Generate an Image
     * @param {GenerateImagesApiCreateRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof GenerateImagesApiGenerated
     */
    public create(requestParameters: GenerateImagesApiCreateRequest, options?: AxiosRequestConfig) {
        return GenerateImagesApiFp(this.configuration).create(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Fetch a list of inference jobs for a specific model.
     * @summary List All Image Jobs
     * @param {GenerateImagesApiFindAllRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof GenerateImagesApiGenerated
     */
    public findAll(requestParameters: GenerateImagesApiFindAllRequest, options?: AxiosRequestConfig) {
        return GenerateImagesApiFp(this.configuration).findAll(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Retrieve a single image generation job, including the urls for the images generated.
     * @summary Get Single Image Job
     * @param {GenerateImagesApiFindOneRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof GenerateImagesApiGenerated
     */
    public findOne(requestParameters: GenerateImagesApiFindOneRequest, options?: AxiosRequestConfig) {
        return GenerateImagesApiFp(this.configuration).findOne(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Delete the image job and all related images.
     * @summary Delete Image Job
     * @param {GenerateImagesApiRemoveRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof GenerateImagesApiGenerated
     */
    public remove(requestParameters: GenerateImagesApiRemoveRequest, options?: AxiosRequestConfig) {
        return GenerateImagesApiFp(this.configuration).remove(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
