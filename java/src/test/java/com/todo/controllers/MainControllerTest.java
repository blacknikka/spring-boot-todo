package com.todo.controllers;

import com.todo.entities.User;
import com.todo.services.UserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;

public class MainControllerTest {
    private MockMvc mockMvc;

    @InjectMocks
    MainController sut;

    @Mock
    UserService userService;

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(sut).build();
    }

    @Test
    public void getAllUsersTest() throws Exception {
        User userA = new User("userA", "user-a@examle.com");
        User userB = new User("userB", "user-b@examle.com");
        User resultOfFindAll[] = {userA, userB};
        when(userService.findAll()).thenReturn(Arrays.asList(resultOfFindAll));

//        MvcResult actual = mockMvc.perform(get("/demo/all"))
//                .andExpect(status().isOk())
//                .andReturn();

        // test実施
        var actual =  sut.getAllUsers();

        int i = 0;
        for (User u : actual) {
            assertThat("id", u.getId(), is(resultOfFindAll[i].getId()));
            assertThat("name", u.getName(), is(resultOfFindAll[i].getName()));
            assertThat("email", u.getEmail(), is(resultOfFindAll[i].getEmail()));
            i++;
        }
    }
}