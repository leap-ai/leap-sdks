package com.konfigthis.leap.client;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        Leap client = new Leap(configuration);
        assertNotNull(client);
    }
}
