package com.lfigueira.mybucketlist;

public class Item {

    String name;
    int image;
    Class<?> activityClass;

    public Item(String name, int image, Class<?> activityClass) {
        this.name = name;
        this.image = image;
        this.activityClass = activityClass;

    }

    public Class<?> getActivityClass() {
        return activityClass;
    }
}
