/*
 * Leap
 * The Official Leap API
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.leap.client.api;

import com.konfigthis.leap.client.ApiCallback;
import com.konfigthis.leap.client.ApiClient;
import com.konfigthis.leap.client.ApiException;
import com.konfigthis.leap.client.ApiResponse;
import com.konfigthis.leap.client.Configuration;
import com.konfigthis.leap.client.Pair;
import com.konfigthis.leap.client.ProgressRequestBody;
import com.konfigthis.leap.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.leap.client.model.CreateMusicgenInferenceDto;
import com.konfigthis.leap.client.model.MusicgenInferenceEntity;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MusicApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MusicApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public MusicApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call findOneCall(String inferenceId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/music/{inferenceId}"
            .replace("{" + "inferenceId" + "}", localVarApiClient.escapeString(inferenceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findOneValidateBeforeCall(String inferenceId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'inferenceId' is set
        if (inferenceId == null) {
            throw new ApiException("Missing the required parameter 'inferenceId' when calling findOne(Async)");
        }

        return findOneCall(inferenceId, _callback);

    }


    private ApiResponse<MusicgenInferenceEntity> findOneWithHttpInfo(String inferenceId) throws ApiException {
        okhttp3.Call localVarCall = findOneValidateBeforeCall(inferenceId, null);
        Type localVarReturnType = new TypeToken<MusicgenInferenceEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call findOneAsync(String inferenceId, final ApiCallback<MusicgenInferenceEntity> _callback) throws ApiException {

        okhttp3.Call localVarCall = findOneValidateBeforeCall(inferenceId, _callback);
        Type localVarReturnType = new TypeToken<MusicgenInferenceEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class FindOneRequestBuilder {
        private final String inferenceId;

        private FindOneRequestBuilder(String inferenceId) {
            this.inferenceId = inferenceId;
        }

        /**
         * Build call for findOne
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved music generation job. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return findOneCall(inferenceId, _callback);
        }


        /**
         * Execute findOne request
         * @return MusicgenInferenceEntity
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved music generation job. </td><td>  -  </td></tr>
         </table>
         */
        public MusicgenInferenceEntity execute() throws ApiException {
            ApiResponse<MusicgenInferenceEntity> localVarResp = findOneWithHttpInfo(inferenceId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute findOne request with HTTP info returned
         * @return ApiResponse&lt;MusicgenInferenceEntity&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved music generation job. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<MusicgenInferenceEntity> executeWithHttpInfo() throws ApiException {
            return findOneWithHttpInfo(inferenceId);
        }

        /**
         * Execute findOne request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved music generation job. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<MusicgenInferenceEntity> _callback) throws ApiException {
            return findOneAsync(inferenceId, _callback);
        }
    }

    /**
     * Get a Music Generation Job
     * Get a specific music generation job.
     * @param inferenceId The ID of the music generation job to retrieve. This is the same ID returned when you submit a job. (required)
     * @return FindOneRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved music generation job. </td><td>  -  </td></tr>
     </table>
     */
    public FindOneRequestBuilder findOne(String inferenceId) throws IllegalArgumentException {
        if (inferenceId == null) throw new IllegalArgumentException("\"inferenceId\" is required but got null");
            

        return new FindOneRequestBuilder(inferenceId);
    }
    private okhttp3.Call generateCall(CreateMusicgenInferenceDto createMusicgenInferenceDto, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createMusicgenInferenceDto;

        // create path and map variables
        String localVarPath = "/api/v1/music";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call generateValidateBeforeCall(CreateMusicgenInferenceDto createMusicgenInferenceDto, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createMusicgenInferenceDto' is set
        if (createMusicgenInferenceDto == null) {
            throw new ApiException("Missing the required parameter 'createMusicgenInferenceDto' when calling generate(Async)");
        }

        return generateCall(createMusicgenInferenceDto, _callback);

    }


    private ApiResponse<MusicgenInferenceEntity> generateWithHttpInfo(CreateMusicgenInferenceDto createMusicgenInferenceDto) throws ApiException {
        okhttp3.Call localVarCall = generateValidateBeforeCall(createMusicgenInferenceDto, null);
        Type localVarReturnType = new TypeToken<MusicgenInferenceEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call generateAsync(CreateMusicgenInferenceDto createMusicgenInferenceDto, final ApiCallback<MusicgenInferenceEntity> _callback) throws ApiException {

        okhttp3.Call localVarCall = generateValidateBeforeCall(createMusicgenInferenceDto, _callback);
        Type localVarReturnType = new TypeToken<MusicgenInferenceEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GenerateRequestBuilder {
        private final String prompt;
        private final String mode;
        private final Double duration;

        private GenerateRequestBuilder(String prompt, String mode, double duration) {
            this.prompt = prompt;
            this.mode = mode;
            this.duration = duration;
        }

        /**
         * Build call for generate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully submitted music generation job. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            CreateMusicgenInferenceDto createMusicgenInferenceDto = buildBodyParams();
            return generateCall(createMusicgenInferenceDto, _callback);
        }

        private CreateMusicgenInferenceDto buildBodyParams() {
            CreateMusicgenInferenceDto createMusicgenInferenceDto = new CreateMusicgenInferenceDto();
            createMusicgenInferenceDto.prompt(this.prompt);
            if (this.mode != null)
            createMusicgenInferenceDto.mode(CreateMusicgenInferenceDto.ModeEnum.fromValue(this.mode));
            createMusicgenInferenceDto.duration(this.duration);
            return createMusicgenInferenceDto;
        }

        /**
         * Execute generate request
         * @return MusicgenInferenceEntity
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully submitted music generation job. </td><td>  -  </td></tr>
         </table>
         */
        public MusicgenInferenceEntity execute() throws ApiException {
            CreateMusicgenInferenceDto createMusicgenInferenceDto = buildBodyParams();
            ApiResponse<MusicgenInferenceEntity> localVarResp = generateWithHttpInfo(createMusicgenInferenceDto);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute generate request with HTTP info returned
         * @return ApiResponse&lt;MusicgenInferenceEntity&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully submitted music generation job. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<MusicgenInferenceEntity> executeWithHttpInfo() throws ApiException {
            CreateMusicgenInferenceDto createMusicgenInferenceDto = buildBodyParams();
            return generateWithHttpInfo(createMusicgenInferenceDto);
        }

        /**
         * Execute generate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully submitted music generation job. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<MusicgenInferenceEntity> _callback) throws ApiException {
            CreateMusicgenInferenceDto createMusicgenInferenceDto = buildBodyParams();
            return generateAsync(createMusicgenInferenceDto, _callback);
        }
    }

    /**
     * Generate Music
     * Generate music by providing a text description. Generations usually take bettween 1-3 minutes. Total generation time depends on the &#x60;duration&#x60; you select. This endpoint will submit the generation job and return immediately. To retrieve the results you must provide a webhook URL or query/poll the [Get a Music Generation Job](https://reference.tryleap.ai/reference/musiccontroller_findoneaudio) endpoint.
     * @param createMusicgenInferenceDto  (required)
     * @return GenerateRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully submitted music generation job. </td><td>  -  </td></tr>
     </table>
     */
    public GenerateRequestBuilder generate(String prompt, String mode, double duration) throws IllegalArgumentException {
        if (prompt == null) throw new IllegalArgumentException("\"prompt\" is required but got null");
            

        if (mode == null) throw new IllegalArgumentException("\"mode\" is required but got null");
            

        
        return new GenerateRequestBuilder(prompt, mode, duration);
    }
    private okhttp3.Call listAllCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/music";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listAllValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return listAllCall(_callback);

    }


    private ApiResponse<List<MusicgenInferenceEntity>> listAllWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listAllValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<MusicgenInferenceEntity>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAllAsync(final ApiCallback<List<MusicgenInferenceEntity>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAllValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<MusicgenInferenceEntity>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListAllRequestBuilder {

        private ListAllRequestBuilder() {
        }

        /**
         * Build call for listAll
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved music generation jobs. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listAllCall(_callback);
        }


        /**
         * Execute listAll request
         * @return List&lt;MusicgenInferenceEntity&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved music generation jobs. </td><td>  -  </td></tr>
         </table>
         */
        public List<MusicgenInferenceEntity> execute() throws ApiException {
            ApiResponse<List<MusicgenInferenceEntity>> localVarResp = listAllWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listAll request with HTTP info returned
         * @return ApiResponse&lt;List&lt;MusicgenInferenceEntity&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved music generation jobs. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<MusicgenInferenceEntity>> executeWithHttpInfo() throws ApiException {
            return listAllWithHttpInfo();
        }

        /**
         * Execute listAll request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved music generation jobs. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<MusicgenInferenceEntity>> _callback) throws ApiException {
            return listAllAsync(_callback);
        }
    }

    /**
     * List Music Generation Jobs
     * List all music generation jobs for a workspace.
     * @return ListAllRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved music generation jobs. </td><td>  -  </td></tr>
     </table>
     */
    public ListAllRequestBuilder listAll() throws IllegalArgumentException {
        return new ListAllRequestBuilder();
    }
}
