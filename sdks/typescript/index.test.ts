import { Leap } from "./index";

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
});
