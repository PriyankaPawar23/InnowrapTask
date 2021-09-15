package com.example.innowraptask.model;

public class items {
    private final int type;
    private final Object obj;

    public items(int type, Object obj) {
        this.type = type;
        this.obj = obj;
    }

    public int getType() {
        return type;
    }

    public Object getObj() {
        return obj;
    }
}
