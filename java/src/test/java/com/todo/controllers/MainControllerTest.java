package com.todo.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MainControllerTest {
    private MockMvc mockMvc;

    @Autowired
    MainController sut;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(sut).build();
    }

    @Test
    public void getAllUsersTest() throws Exception {
        // when
        MvcResult result = mockMvc.perform(get("/demo/all"))
                .andExpect(status().isOk())
//                .andExpect(content().string("[{\"id\":1,\"name\":\"myname\",\"email\":\"abc@example.com\"},{\"id\":2,\"name\":\"myname2\",\"email\":\"abcd@example.com\"},{\"id\":3,\"name\":\"myname3\",\"email\":\"mail@example.com\"},{\"id\":4,\"name\":\"myname3\",\"email\":\"mail@example.com\"},{\"id\":5,\"name\":\"myname3\",\"email\":\"mail@example.com\"}]"))
                .andExpect(content().string("[]"))
                .andReturn();
    }
}