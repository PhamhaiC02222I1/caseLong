package com.company.dto;

public class AlbumDTO {
    private int id;
    private String tenAlbum;
    private String caSiAlbum;

    public AlbumDTO() {
    }


    public AlbumDTO(String tenAlbum, String caSiAlbum) {
        this.tenAlbum = tenAlbum;
        this.caSiAlbum = caSiAlbum;
    }


    public AlbumDTO(int id, String tenAlbum, String caSiAlbum) {
        this.id = id;
        this.tenAlbum = tenAlbum;
        this.caSiAlbum = caSiAlbum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "AlbumDTO{" +
                "id=" + id +
                ", tenAlbum='" + tenAlbum + '\'' +
                ", caSiAlbum='" + caSiAlbum + '\'' +
                '}';
    }
}
