package com.company.model;

import java.io.Serializable;

public class AlbumF1 implements Serializable {
    private String tenAlbum;
    private String caSiAlbum;

    public AlbumF1() {
    }

    public AlbumF1(String tenAlbum, String caSiAlbum) {
        this.tenAlbum = tenAlbum;
        this.caSiAlbum = caSiAlbum;
    }

    public String getTenAlbum() {
        return tenAlbum;
    }

    public void setTenAlbum(String tenAlbum) {
        this.tenAlbum = tenAlbum;
    }

    public String getCaSiAlbum() {
        return caSiAlbum;
    }

    public void setCaSiAlbum(String caSiAlbum) {
        this.caSiAlbum = caSiAlbum;
    }

    @Override
    public String toString() {
        return "AlbumF1{" +
                "tenAlbum='" + tenAlbum + '\'' +
                ", caSiAlbum='" + caSiAlbum + '\'' +
                '}'+"\n";
    }
}
