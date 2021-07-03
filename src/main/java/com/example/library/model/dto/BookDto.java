package com.example.library.model.dto;

import com.example.library.model.entity.Category;
import com.example.library.model.entity.User;

public class BookDto {
    private String name;
    public Category category;
    private User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
