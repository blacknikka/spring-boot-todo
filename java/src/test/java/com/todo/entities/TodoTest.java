package com.todo.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoTest {
    @Test
    public void test_constructor() {
        var sut = new Todo("title", "description");
        assertEquals(sut.getTitle(), "title");
        assertEquals(sut.getDescription(), "description");
        assertFalse(sut.isDone());
    }

}