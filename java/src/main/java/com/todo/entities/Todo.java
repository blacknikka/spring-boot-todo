package com.todo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Todo {
    public Todo (String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String title;

    public String getTitle() {
        return this.title;
    }

    private String description;

    public String getDescription() {
        return this.description;
    }

    private boolean isDone = false;

    public boolean isDone() {
        return this.isDone;
    }
}