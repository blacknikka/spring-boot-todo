package com.todo.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    @Test
    public void test_constructor() {
        var sut = new User("name", "my-email");
        assertEquals(sut.getName(), "name");
        assertEquals(sut.getEmail(), "my-email");
        assertNull(sut.getId());
    }
}