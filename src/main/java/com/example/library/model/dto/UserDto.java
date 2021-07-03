package com.example.library.model.dto;

public class UserDto {

    private String name;
    private String CodeMeli;
    private int role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeMeli() {
        return CodeMeli;
    }

    public void setCodeMeli(String codeMeli) {
        CodeMeli = codeMeli;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
