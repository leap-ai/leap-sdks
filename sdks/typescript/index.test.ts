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
    const response = await leap.images.generate({
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
    const response = await leap.images.generate({
      modelId: "26a1a203-3a46-42cb-8cfa-f4de075907d8",
      prompt: "A red bird",
    });
    const images = await leap.images.findOne({
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

    const createAudioResponse = await leap.music.generate({
      prompt: "An electronic music soundtrack with a trumpet solo",
      mode: "melody",
      duration: 28,
    });

    const findAllAudioResponse = await leap.music.listAll();

    const findOneAudioResponse = await leap.music.findOne({
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

    const trainModelResponse = await leap.imageModels.trainModel({
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

    const listAllModelsResponse = await leap.imageModels.listAllModels();

    const getModelResponse = await leap.imageModels.getModel({
      modelId: "modelId_example",
    });

    const deleteModelResponse = await leap.imageModels.deleteModel({
      modelId: "modelId_example",
    });

    expect(listAllModelsResponse).not.toBeNull();
    expect(getModelResponse).not.toBeNull();
    expect(deleteModelResponse).not.toBeNull();
  });
});
