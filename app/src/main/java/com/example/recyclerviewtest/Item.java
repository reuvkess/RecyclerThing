package com.example.recyclerviewtest;

public class Item {
    private String name;
    private String description;
    private int image;
    public Item(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setImage(int image) {
        this.image = image;
    }
    public int getImage() {
        return this.image;
    }
    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}
