package com.app.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(App.class)  // Test only the App controller layer
public class AppTest {

    @Autowired
    private MockMvc mockMvc;  // MockMvc simulates HTTP requests

    @Test
    public void testHelloEndpoint() throws Exception {
        // Send a GET request to the root ("/") and verify the response status and content
        mockMvc.perform(get("/"))
               .andExpect(status().isOk())  // Expecting HTTP status 200 (OK)
               .andExpect(content().string("<center>welcome to infosys spring boot</center>"));
    }
}
