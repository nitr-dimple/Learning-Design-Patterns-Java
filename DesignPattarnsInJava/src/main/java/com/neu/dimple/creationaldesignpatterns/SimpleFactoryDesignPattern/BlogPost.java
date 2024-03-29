package com.neu.dimple.creationaldesignpatterns.SimpleFactoryDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class BlogPost extends Post{

    private String author;
    private String[] tags;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public void print(){
        System.out.println( "Printing from blog post");
    }
}
