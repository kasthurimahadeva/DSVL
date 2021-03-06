package com.dsvl.flood.model;

public class Result {
    private String fileName;
    private String url;

    public Result() {
    }

    public Result(String fileName, String url) {
        this.fileName = fileName;
        this.url = url;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Result{" +
                "fileName='" + fileName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
