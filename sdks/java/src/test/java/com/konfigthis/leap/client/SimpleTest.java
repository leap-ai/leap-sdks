package com.konfigthis.leap.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import com.konfigthis.leap.client.model.InferenceEntity;

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
}
