package com.example.wallpaper;

public class Photo {
    private int id;
    private String owner;
    private String title;
    private String url_image;

    public Photo(int id, String owner, String title, String url_image) {
        this.id = id;
        this.owner = owner;
        this.title = title;
        this.url_image = url_image;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
