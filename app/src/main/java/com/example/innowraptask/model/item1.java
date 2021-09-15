package com.example.innowraptask.model;

public class item1 {

    private final int image, color, colorBack;
    private final String text1, text2;

    public item1(int image, String text1, String text2, int color, int colorBack) {
        this.image = image;
        this.text1 = text1;
        this.text2 = text2;
        this.color = color;
        this.colorBack = colorBack;
    }

    public int getImage() {
        return image;
    }


    public String getText1() {
        return text1;
    }


    public String getText2() {
        return text2;
    }

    public int getColor() {
        return color;
    }

    public int getColorBack() {
        return colorBack;
    }
}