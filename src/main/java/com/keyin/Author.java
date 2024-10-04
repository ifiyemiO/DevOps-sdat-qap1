package com.keyin;

public class Author {
    private String name;
    private String title;

    public Author(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Author{name='" + name + "', title='" + title + "'}";
    }
}
