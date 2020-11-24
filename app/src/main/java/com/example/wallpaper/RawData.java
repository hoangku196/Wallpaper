package com.example.wallpaper;

public class RawData {
    public Photos photos;
    public String stat;

    public RawData() {
    }

    public RawData(Photos photos, String stat) {
        this.photos = photos;
        this.stat = stat;
    }

    public Photos getPhotos() {
        return photos;
    }

    public void setPhotos(Photos photos) {
        this.photos = photos;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }
}
