package com.konfigthis.leap.client;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.konfigthis.leap.client.model.InferenceEntity;
import com.konfigthis.leap.client.model.ListModelsV2Response;
import com.konfigthis.leap.client.model.ModelV2Entity;
import com.konfigthis.leap.client.model.MusicgenInferenceEntity;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        Leap client = new Leap(configuration);
        assertNotNull(client);
    }

    @Test
    void multipleRequestsTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.host = MOCK_SERVER_URL;
        configuration.token = "TEST";
        Leap client = new Leap(configuration);
        InferenceEntity execute = client.generateImages.create("A red bird", "test").execute();
        InferenceEntity poll = client.generateImages.findOne("test", execute.getId()).execute();
        assertNotNull(poll);
    }

    @Test
    void generateImagesTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.host = MOCK_SERVER_URL;
        configuration.token = "TEST";
        Leap client = new Leap(configuration);

        String prompt = "A photo of an astronaut riding a horse"; // A text description of the image you what you want
                                                                  // to generate.
        String modelId = "26a1a203-3a46-42cb-8cfa-f4de075907d8"; // The ID of the model to use to generate images. This
                                                                 // can be a custom model, or a public model. To view
                                                                 // the list of public models, visit:
                                                                 // https://docs.tryleap.ai/public-models
        String negativePrompt = "asymmetric, watermarks"; // A text description of what the image should try to avoid
                                                          // generating.
        Double steps = 50D; // How many steps the AI will take to generate the image. Lower is faster but
                            // less detailed, higher is slower more detailed.
        Double width = 1024D; // The width of the image to use for the inference. Must be a multiple of 8. For
                              // best results use 1024x1024 for SDXL, and 512x512 for other models.
        Double height = 1024D; // The height of the image to use for the inference. Must be a multiple of 8.
                               // For best results use 1024x1024 for SDXL, and 512x512 for other models.
        Double numberOfImages = 1D; // The number of images to generate, up to 4.
        Double promptStrength = 7D; // The higher the prompt strength, the closer the generated image will be to the
                                    // prompt. Must be between 0 and 30.
        Double seed = 4523184D; // A random number to use as a seed when generating the image. This is helpful
                                // if you want to generate the same image multiple times. If you want to
                                // generate different images, keep this empty or provide a random number.
        String webhookUrl = "webhookUrl_example"; // An optional webhook URL that will be called with a POST request
                                                  // when the image generation request completes.
        InferenceEntity generateImagesResponse = client.generateImages
                .create(prompt, modelId)
                .negativePrompt(negativePrompt)
                .steps(steps)
                .width(width)
                .height(height)
                .numberOfImages(numberOfImages)
                .promptStrength(promptStrength)
                .seed(seed)
                .webhookUrl(webhookUrl)
                .execute();

        modelId = "26a1a203-3a46-42cb-8cfa-f4de075907d8"; // The ID of the model to generate images. This can be
                                                          // a custom model or a public model. Visit:
                                                          // https://docs.tryleap.ai/public-models to view the
                                                          // list of public models.
        Boolean onlyFinished = true; // If set to true, only finished inferences will be returned. If set to false or
                                     // not set, all inference jobs will be returned.
        Double page = 3.4D; // The page to request.
        Double pageSize = 3.4D; // The number of items to return per page.
        List<InferenceEntity> findAllResponse = client.generateImages
                .findAll(modelId)
                .onlyFinished(onlyFinished)
                .page(page)
                .pageSize(pageSize)
                .execute();

        String inferenceId = "a047df00-8bdd-4d57-a9bd-6eebef36ecaa"; // The ID of the image generation job to retrieve.
                                                                     // This is the same ID that is returned when you
                                                                     // submit a new image generation job.
        InferenceEntity findOneResponse = client.generateImages
                .findOne(modelId, inferenceId)
                .execute();

        client.generateImages
                .remove(modelId, inferenceId)
                .execute();

        assertNotNull(generateImagesResponse);
        assertNotNull(findAllResponse);
        assertNotNull(findOneResponse);
    }

    @Test
    void generateMusicTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.host = MOCK_SERVER_URL;
        configuration.token = "TEST";
        Leap client = new Leap(configuration);
        String prompt = "An electronic music soundtrack with a trumpet solo"; // A description of the music you want to
                                                                              // generate.
        String mode = "melody"; // Select a mode, each option generates different results. Melody is best for
                                // melody, music is best for full songs
        Double duration = 28D; // Duration of the generated audio in seconds. Max 30 seconds.
        MusicgenInferenceEntity createAudioResponse = client.generateMusic
                .createAudio(prompt, mode, duration)
                .execute();

        List<MusicgenInferenceEntity> findAllAudioResponse = client.generateMusic
                .findAllAudio()
                .execute();

        String inferenceId = "inferenceId_example"; // The ID of the music generation job to retrieve. This is the same
                                                    // ID returned when you submit a job.
        MusicgenInferenceEntity findOneAudioResponse = client.generateMusic
                .findOneAudio(inferenceId)
                .execute();

        assertNotNull(createAudioResponse);
        assertNotNull(findAllAudioResponse);
        assertNotNull(findOneAudioResponse);
    }

    @Test
    void trainModelsTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.host = MOCK_SERVER_URL;
        configuration.token = "TEST";
        Leap client = new Leap(configuration);
        String modelId = "5f9b9c0e-7c1f-4b5c-9c0e-7c1f4b5c9c0e"; // The ID of the model to delete.
        ModelV2Entity deleteModelResponse = client.trainImageModels
                .deleteModel(modelId)
                .execute();

        modelId = "5f9b9c0e-7c1f-4b5c-9c0e-7c1f4b5c9c0e"; // The ID of the model to retrieve.
        ModelV2Entity getModelResponse = client.trainImageModels
                .getModel(modelId)
                .execute();

        ListModelsV2Response listAllModelsResponse = client.trainImageModels
                .listAllModels()
                .execute();

        assertNotNull(deleteModelResponse);
        assertNotNull(getModelResponse);
        assertNotNull(listAllModelsResponse);
    }

    @Disabled("prism (mock server) does't support multipart/form-data")
    @Test
    void trainModelMultipartFormdataTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.host = "http://localhost:8080";
        configuration.token = "TEST";
        Leap client = new Leap(configuration);
        // print current directory
        System.out.println(System.getProperty("user.dir"));

        String name = "name_example"; // Provide a name so you can more easily identify the model.
        String subjectKeyword = "subjectKeyword_example"; // This is the keyword you will use during image generation to
                                                          // trigger your custom subject. For example \\\"a photo of
                                                          // @me\\\".
        String subjectType = "person"; // The subject type - a short description, usually a noun, that describes what
                                       // the underlying model is learning. For example: person, man, woman, cat, dog,
                                       // icon, style. Defaults to \\\"person\\\".
        String webhookUrl = "webhookUrl_example"; // An optional webhook URL that will be called with a POST request
                                                  // when the model completes training or fails.

        // read two directories above a file called logo.png and add it to
        // imageSampleFiles array
        File file = new File("../../logo.png");

        List<File> imageSampleFiles = Arrays.asList(file); // An array of files containing the images to upload. Either
                                                           // this
        // or imageSampleUrls is required, but not both.

        ModelV2Entity result = client.trainImageModels
                .trainModel()
                .name(name)
                .subjectKeyword(subjectKeyword)
                .subjectType(subjectType)
                .webhookUrl(webhookUrl)
                .imageSampleFiles(imageSampleFiles)
                .execute();
        System.out.println(result);
        System.out.println(result.getId());
        System.out.println(result.getName());
        System.out.println(result.getCreatedAt());
        System.out.println(result.getSubjectKeyword());
        System.out.println(result.getSubjectType());
        System.out.println(result.getStatus());
        System.out.println(result.getImageSamples());
    }
}
