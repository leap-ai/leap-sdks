package com.konfigthis.leap.client;

import com.konfigthis.leap.client.api.GenerateImagesApi;
import com.konfigthis.leap.client.api.GenerateMusicApi;
import com.konfigthis.leap.client.api.TrainImageModelsApi;

public class Leap {
    private ApiClient apiClient;
    public final GenerateImagesApi generateImages;
    public final GenerateMusicApi generateMusic;
    public final TrainImageModelsApi trainImageModels;

    public Leap() {
        this(null);
    }

    public Leap(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.generateImages = new GenerateImagesApi(this.apiClient);
        this.generateMusic = new GenerateMusicApi(this.apiClient);
        this.trainImageModels = new TrainImageModelsApi(this.apiClient);
    }

}
