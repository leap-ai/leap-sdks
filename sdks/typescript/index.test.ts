import { Leap } from "./index";
import * as fs from "fs";
import * as path from "path";

const MOCK_SERVER_URL = "http://127.0.0.1:4010";

describe("@leap-ai/sdk", () => {
  it("initialize client", async () => {
    const leap = new Leap();
  });
  it("initialize client with token and make request", async () => {
    const leap = new Leap({
      accessToken: "TEST",
      basePath: MOCK_SERVER_URL,
    });
    const response = await leap.generateImages.create({
      modelId: "26a1a203-3a46-42cb-8cfa-f4de075907d8",
      prompt: "A red bird",
    });
    expect(response).not.toBeNull();
  });
  it("initialize client with token and make multiple requests", async () => {
    const leap = new Leap({
      accessToken: "TEST",
      basePath: MOCK_SERVER_URL,
    });
    const response = await leap.generateImages.create({
      modelId: "26a1a203-3a46-42cb-8cfa-f4de075907d8",
      prompt: "A red bird",
    });
    const images = await leap.generateImages.findOne({
      modelId: "26a1a203-3a46-42cb-8cfa-f4de075907d8",
      inferenceId: response.data.id,
    });
    expect(images).not.toBeNull();
  });

  it("generate music", async () => {
    const leap = new Leap({
      accessToken: "TEST",
      basePath: MOCK_SERVER_URL,
    });

    const createAudioResponse = await leap.generateMusic.createAudio({
      prompt: "An electronic music soundtrack with a trumpet solo",
      mode: "melody",
      duration: 28,
    });

    const findAllAudioResponse = await leap.generateMusic.findAllAudio();

    const findOneAudioResponse = await leap.generateMusic.findOneAudio({
      inferenceId: "inferenceId_example",
    });

    expect(createAudioResponse).not.toBeNull();
    expect(findAllAudioResponse).not.toBeNull();
    expect(findOneAudioResponse).not.toBeNull();
  });

  it.skip("train model - form data", async () => {
    const leap = new Leap({
      accessToken: "TEST",
      basePath: "http://127.0.0.1:8080",
    });

    // read in image as File class
    const filePath = path.join(
      path.dirname(path.dirname(__dirname)),
      "logo.png"
    );
    const image = fs.readFileSync(filePath);

    const trainModelResponse = await leap.trainImageModels.trainModel({
      name: "Alex Avatar Model",
      subjectKeyword: "@me",
      subjectType: "person",
      webhookUrl: "https://example.com/api/webhook",
      imageSampleFiles: [image],
    });
    expect(trainModelResponse).not.toBeNull();
  });

  it("train model", async () => {
    const leap = new Leap({
      accessToken: "TEST",
      basePath: MOCK_SERVER_URL,
    });

    const listAllModelsResponse = await leap.trainImageModels.listAllModels();

    const getModelResponse = await leap.trainImageModels.getModel({
      modelId: "modelId_example",
    });

    const deleteModelResponse = await leap.trainImageModels.deleteModel({
      modelId: "modelId_example",
    });

    expect(listAllModelsResponse).not.toBeNull();
    expect(getModelResponse).not.toBeNull();
    expect(deleteModelResponse).not.toBeNull();
  });
});
