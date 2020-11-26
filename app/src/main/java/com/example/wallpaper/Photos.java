package com.example.wallpaper;

public class Photos {
    public int page;
    public int pages;
    public int perPage;
    public int total;
    public Photos[] photos;

    public Photos(int page, int pages, int perPage, int total, Photos[] photos) {
        this.page = page;
        this.pages = pages;
        this.perPage = perPage;
        this.total = total;
        this.photos = photos;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Photos[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photos[] photos) {
        this.photos = photos;
    }
}
