package com.example.health;

public class DandFModel {
    private final int image;
    private final String title;

    public DandFModel(int image, String title) {
        this.image = image;
        this.title = title;
    }



    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
}
