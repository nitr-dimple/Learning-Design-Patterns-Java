package com.neu.dimple.creationaldesignpatterns.SimpleFactoryDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Client {

    public static void main(String args[]){
        Post post = PostFactory.createPost("blog");
        System.out.println(post);
        post.print();
    }
}
