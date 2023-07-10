package com.neu.dimple.creationaldesignpatterns.SimpleFactoryDesignPattern;

import java.time.LocalDate;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class NewsPost extends Post{

    private String headline;
    private LocalDate newsTime;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public LocalDate getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(LocalDate newsTime) {
        this.newsTime = newsTime;
    }
}
