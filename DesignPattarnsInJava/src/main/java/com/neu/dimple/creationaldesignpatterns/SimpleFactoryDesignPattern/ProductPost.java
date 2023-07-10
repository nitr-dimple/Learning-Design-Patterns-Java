package com.neu.dimple.creationaldesignpatterns.SimpleFactoryDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class ProductPost extends Post{

    private String imageUrl;
    private String name;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
