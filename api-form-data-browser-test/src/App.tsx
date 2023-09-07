import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";
import { Leap } from "leap";

async function makeFileRequest(files: File[]) {
  const leap = new Leap({
    accessToken: "TEST",
    basePath: "http://127.0.0.1:8080",
  });

  const trainModelResponse = await leap.imageModels.trainModel({
    name: "Alex Avatar Model",
    subjectKeyword: "@me",
    subjectType: "person",
    webhookUrl: "https://example.com/api/webhook",
    imageSampleFiles: files,
  });
  return trainModelResponse;
}

function App() {
  const [count, setCount] = useState(0);

  return (
    <>
      <div>
        <a href="https://vitejs.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Vite + React</h1>

      {/* a form that accepts multile file uploads and passes them to "makeFileRequest" */}
      <form
        onSubmit={(e) => {
          e.preventDefault();
          const files = Array.from(e.target[0].files);
          makeFileRequest(files);
        }}
      >
        <input type="file" multiple />
        <input type="submit" />
      </form>

      <div className="card">
        <button onClick={() => setCount((count) => count + 1)}>
          count is {count}
        </button>
        <p>
          Edit <code>src/App.tsx</code> and save to test HMR
        </p>
      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>
    </>
  );
}

export default App;
