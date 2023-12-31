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


import java.io.File;
import com.konfigthis.leap.client.model.ListModelsV2Response;
import com.konfigthis.leap.client.model.ModelV2Entity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ImageModelsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ImageModelsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ImageModelsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call deleteModelCall(String modelId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/images/models/{modelId}"
            .replace("{" + "modelId" + "}", localVarApiClient.escapeString(modelId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteModelValidateBeforeCall(String modelId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new ApiException("Missing the required parameter 'modelId' when calling deleteModel(Async)");
        }

        return deleteModelCall(modelId, _callback);

    }


    private ApiResponse<ModelV2Entity> deleteModelWithHttpInfo(String modelId) throws ApiException {
        okhttp3.Call localVarCall = deleteModelValidateBeforeCall(modelId, null);
        Type localVarReturnType = new TypeToken<ModelV2Entity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteModelAsync(String modelId, final ApiCallback<ModelV2Entity> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteModelValidateBeforeCall(modelId, _callback);
        Type localVarReturnType = new TypeToken<ModelV2Entity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class DeleteModelRequestBuilder {
        private final String modelId;

        private DeleteModelRequestBuilder(String modelId) {
            this.modelId = modelId;
        }

        /**
         * Build call for deleteModel
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully deleted the model </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteModelCall(modelId, _callback);
        }


        /**
         * Execute deleteModel request
         * @return ModelV2Entity
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully deleted the model </td><td>  -  </td></tr>
         </table>
         */
        public ModelV2Entity execute() throws ApiException {
            ApiResponse<ModelV2Entity> localVarResp = deleteModelWithHttpInfo(modelId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute deleteModel request with HTTP info returned
         * @return ApiResponse&lt;ModelV2Entity&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully deleted the model </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ModelV2Entity> executeWithHttpInfo() throws ApiException {
            return deleteModelWithHttpInfo(modelId);
        }

        /**
         * Execute deleteModel request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully deleted the model </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ModelV2Entity> _callback) throws ApiException {
            return deleteModelAsync(modelId, _callback);
        }
    }

    /**
     * Delete a Model
     * This endpoint will delete a model. This is not reversible.
     * @param modelId The ID of the model to delete. (required)
     * @return DeleteModelRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully deleted the model </td><td>  -  </td></tr>
     </table>
     */
    public DeleteModelRequestBuilder deleteModel(String modelId) throws IllegalArgumentException {
        if (modelId == null) throw new IllegalArgumentException("\"modelId\" is required but got null");
            

        return new DeleteModelRequestBuilder(modelId);
    }
    private okhttp3.Call getModelCall(String modelId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/images/models/{modelId}"
            .replace("{" + "modelId" + "}", localVarApiClient.escapeString(modelId.toString()));

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
    private okhttp3.Call getModelValidateBeforeCall(String modelId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new ApiException("Missing the required parameter 'modelId' when calling getModel(Async)");
        }

        return getModelCall(modelId, _callback);

    }


    private ApiResponse<ModelV2Entity> getModelWithHttpInfo(String modelId) throws ApiException {
        okhttp3.Call localVarCall = getModelValidateBeforeCall(modelId, null);
        Type localVarReturnType = new TypeToken<ModelV2Entity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getModelAsync(String modelId, final ApiCallback<ModelV2Entity> _callback) throws ApiException {

        okhttp3.Call localVarCall = getModelValidateBeforeCall(modelId, _callback);
        Type localVarReturnType = new TypeToken<ModelV2Entity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetModelRequestBuilder {
        private final String modelId;

        private GetModelRequestBuilder(String modelId) {
            this.modelId = modelId;
        }

        /**
         * Build call for getModel
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved the model. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Model does not exist </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getModelCall(modelId, _callback);
        }


        /**
         * Execute getModel request
         * @return ModelV2Entity
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved the model. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Model does not exist </td><td>  -  </td></tr>
         </table>
         */
        public ModelV2Entity execute() throws ApiException {
            ApiResponse<ModelV2Entity> localVarResp = getModelWithHttpInfo(modelId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getModel request with HTTP info returned
         * @return ApiResponse&lt;ModelV2Entity&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved the model. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Model does not exist </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ModelV2Entity> executeWithHttpInfo() throws ApiException {
            return getModelWithHttpInfo(modelId);
        }

        /**
         * Execute getModel request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved the model. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Model does not exist </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ModelV2Entity> _callback) throws ApiException {
            return getModelAsync(modelId, _callback);
        }
    }

    /**
     * Get a Single Model
     * This endpoint will return a single model.
     * @param modelId The ID of the model to retrieve. (required)
     * @return GetModelRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved the model. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Model does not exist </td><td>  -  </td></tr>
     </table>
     */
    public GetModelRequestBuilder getModel(String modelId) throws IllegalArgumentException {
        if (modelId == null) throw new IllegalArgumentException("\"modelId\" is required but got null");
            

        return new GetModelRequestBuilder(modelId);
    }
    private okhttp3.Call listAllModelsCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/images/models";

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
    private okhttp3.Call listAllModelsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return listAllModelsCall(_callback);

    }


    private ApiResponse<ListModelsV2Response> listAllModelsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listAllModelsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ListModelsV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAllModelsAsync(final ApiCallback<ListModelsV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAllModelsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ListModelsV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListAllModelsRequestBuilder {

        private ListAllModelsRequestBuilder() {
        }

        /**
         * Build call for listAllModels
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved models. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listAllModelsCall(_callback);
        }


        /**
         * Execute listAllModels request
         * @return ListModelsV2Response
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved models. </td><td>  -  </td></tr>
         </table>
         */
        public ListModelsV2Response execute() throws ApiException {
            ApiResponse<ListModelsV2Response> localVarResp = listAllModelsWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listAllModels request with HTTP info returned
         * @return ApiResponse&lt;ListModelsV2Response&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved models. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ListModelsV2Response> executeWithHttpInfo() throws ApiException {
            return listAllModelsWithHttpInfo();
        }

        /**
         * Execute listAllModels request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved models. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ListModelsV2Response> _callback) throws ApiException {
            return listAllModelsAsync(_callback);
        }
    }

    /**
     * List All Models
     * This endpoint will return a list of all models for the workspace.
     * @return ListAllModelsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved models. </td><td>  -  </td></tr>
     </table>
     */
    public ListAllModelsRequestBuilder listAllModels() throws IllegalArgumentException {
        return new ListAllModelsRequestBuilder();
    }
    private okhttp3.Call trainModelCall(String name, String subjectKeyword, String subjectType, String webhookUrl, List<String> imageSampleUrls, List<File> imageSampleFiles, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/images/models/new";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (name != null) {
            localVarFormParams.put("name", name);
        }

        if (subjectKeyword != null) {
            localVarFormParams.put("subjectKeyword", subjectKeyword);
        }

        if (subjectType != null) {
            localVarFormParams.put("subjectType", subjectType);
        }

        if (webhookUrl != null) {
            localVarFormParams.put("webhookUrl", webhookUrl);
        }

        if (imageSampleUrls != null) {
            localVarFormParams.put("imageSampleUrls", imageSampleUrls);
        }

        if (imageSampleFiles != null) {
            localVarFormParams.put("imageSampleFiles", imageSampleFiles);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call trainModelValidateBeforeCall(String name, String subjectKeyword, String subjectType, String webhookUrl, List<String> imageSampleUrls, List<File> imageSampleFiles, final ApiCallback _callback) throws ApiException {
        return trainModelCall(name, subjectKeyword, subjectType, webhookUrl, imageSampleUrls, imageSampleFiles, _callback);

    }


    private ApiResponse<ModelV2Entity> trainModelWithHttpInfo(String name, String subjectKeyword, String subjectType, String webhookUrl, List<String> imageSampleUrls, List<File> imageSampleFiles) throws ApiException {
        okhttp3.Call localVarCall = trainModelValidateBeforeCall(name, subjectKeyword, subjectType, webhookUrl, imageSampleUrls, imageSampleFiles, null);
        Type localVarReturnType = new TypeToken<ModelV2Entity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call trainModelAsync(String name, String subjectKeyword, String subjectType, String webhookUrl, List<String> imageSampleUrls, List<File> imageSampleFiles, final ApiCallback<ModelV2Entity> _callback) throws ApiException {

        okhttp3.Call localVarCall = trainModelValidateBeforeCall(name, subjectKeyword, subjectType, webhookUrl, imageSampleUrls, imageSampleFiles, _callback);
        Type localVarReturnType = new TypeToken<ModelV2Entity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class TrainModelRequestBuilder {
        private String name;
        private String subjectKeyword;
        private String subjectType;
        private String webhookUrl;
        private List<String> imageSampleUrls;
        private List<File> imageSampleFiles;

        private TrainModelRequestBuilder() {
        }

        /**
         * Set name
         * @param name Provide a name so you can more easily identify the model. (optional)
         * @return TrainModelRequestBuilder
         */
        public TrainModelRequestBuilder name(String name) {
            this.name = name;
            return this;
        }
        
        /**
         * Set subjectKeyword
         * @param subjectKeyword This is the keyword you will use during image generation to trigger your custom subject. For example \\\&quot;a photo of @me\\\&quot;. (optional)
         * @return TrainModelRequestBuilder
         */
        public TrainModelRequestBuilder subjectKeyword(String subjectKeyword) {
            this.subjectKeyword = subjectKeyword;
            return this;
        }
        
        /**
         * Set subjectType
         * @param subjectType The subject type - a short description, usually a noun, that describes what the underlying model is learning. For example: person, man, woman, cat, dog, icon, style. Defaults to \\\&quot;person\\\&quot;. (optional, default to person)
         * @return TrainModelRequestBuilder
         */
        public TrainModelRequestBuilder subjectType(String subjectType) {
            this.subjectType = subjectType;
            return this;
        }
        
        /**
         * Set webhookUrl
         * @param webhookUrl An optional webhook URL that will be called with a POST request when the model completes training or fails. (optional)
         * @return TrainModelRequestBuilder
         */
        public TrainModelRequestBuilder webhookUrl(String webhookUrl) {
            this.webhookUrl = webhookUrl;
            return this;
        }
        
        /**
         * Set imageSampleUrls
         * @param imageSampleUrls An array of strings containing the URLs of the images to upload. Either this or imageSampleFiles is required, but not both. (optional)
         * @return TrainModelRequestBuilder
         */
        public TrainModelRequestBuilder imageSampleUrls(List<String> imageSampleUrls) {
            this.imageSampleUrls = imageSampleUrls;
            return this;
        }
        
        /**
         * Set imageSampleFiles
         * @param imageSampleFiles An array of files containing the images to upload. Either this or imageSampleUrls is required, but not both. (optional)
         * @return TrainModelRequestBuilder
         */
        public TrainModelRequestBuilder imageSampleFiles(List<File> imageSampleFiles) {
            this.imageSampleFiles = imageSampleFiles;
            return this;
        }
        
        /**
         * Build call for trainModel
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully submitted training job. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return trainModelCall(name, subjectKeyword, subjectType, webhookUrl, imageSampleUrls, imageSampleFiles, _callback);
        }


        /**
         * Execute trainModel request
         * @return ModelV2Entity
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully submitted training job. </td><td>  -  </td></tr>
         </table>
         */
        public ModelV2Entity execute() throws ApiException {
            ApiResponse<ModelV2Entity> localVarResp = trainModelWithHttpInfo(name, subjectKeyword, subjectType, webhookUrl, imageSampleUrls, imageSampleFiles);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute trainModel request with HTTP info returned
         * @return ApiResponse&lt;ModelV2Entity&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully submitted training job. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ModelV2Entity> executeWithHttpInfo() throws ApiException {
            return trainModelWithHttpInfo(name, subjectKeyword, subjectType, webhookUrl, imageSampleUrls, imageSampleFiles);
        }

        /**
         * Execute trainModel request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully submitted training job. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ModelV2Entity> _callback) throws ApiException {
            return trainModelAsync(name, subjectKeyword, subjectType, webhookUrl, imageSampleUrls, imageSampleFiles, _callback);
        }
    }

    /**
     * Train Model
     * Upload a few image samples, and train a new model. Training usually takes 20-40 minutes. To be notified when the model completes training you must provide a &#x60;webhookUrl&#x60; in the training request, or check for completion by calling [Get a Single Model](https://reference.tryleap.ai/reference/get-model-1). After training completes, you can use the model to generate images with [Generate Images](https://reference.tryleap.ai/reference/inferencescontroller_create-1).
     * @return TrainModelRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully submitted training job. </td><td>  -  </td></tr>
     </table>
     */
    public TrainModelRequestBuilder trainModel() throws IllegalArgumentException {
        return new TrainModelRequestBuilder();
    }
}
