package com.example.innowraptask.model;

public class item3 {
    private final String text1;
    private final String text2;
    private final int color, colorB;

    public item3(String text1, String text2, int color, int colorB) {
        this.text1 = text1;
        this.text2 = text2;
        this.color = color;
        this.colorB = colorB;
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

    public int getColorB() {
        return colorB;
    }
}