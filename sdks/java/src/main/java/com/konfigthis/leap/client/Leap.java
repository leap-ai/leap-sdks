package com.konfigthis.leap.client;

import com.konfigthis.leap.client.api.ImagesApi;
import com.konfigthis.leap.client.api.ImageModelsApi;
import com.konfigthis.leap.client.api.MusicApi;

public class Leap {
    private ApiClient apiClient;
    public final ImagesApi images;
    public final ImageModelsApi imageModels;
    public final MusicApi music;

    public Leap() {
        this(null);
    }

    public Leap(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.images = new ImagesApi(this.apiClient);
        this.imageModels = new ImageModelsApi(this.apiClient);
        this.music = new MusicApi(this.apiClient);
    }

}
