package com.developer.dinhduy.ui_animation;

public class Food {
    private int Picture;
    private String Title;

    public Food(int picture, String title) {

        Picture = picture;
        Title = title;
    }

    public int getPicture() {
        return Picture;
    }

    public void setPicture(int picture) {
        Picture = picture;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
