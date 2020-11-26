package com.example.wallpaper;

public class LinkParameter {
    private String api_key;
    private String method;
    private String extras;
    private String tags;
    private String format;
    private int noJsonCallBack;

    public LinkParameter() {

    }

    public LinkParameter(String api_key, String method, String extras, String tags, String format, int noJsonCallBack) {
        this.api_key = api_key;
        this.method = method;
        this.extras = extras;
        this.tags = tags;
        this.format = format;
        this.noJsonCallBack = noJsonCallBack;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getNoJsonCallBack() {
        return noJsonCallBack;
    }

    public void setNoJsonCallBack(int noJsonCallBack) {
        this.noJsonCallBack = noJsonCallBack;
    }
}
