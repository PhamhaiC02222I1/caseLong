package com.company.model;

import java.io.Serializable;

public class Song implements Serializable {
    private int maCD;
    private String tenCD;
    private String caSy;
    private int soBH;

    public Song() {
    }

    public Song(int maCD, String tenCD, String caSy, int soBH) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.caSy = caSy;
        this.soBH = soBH;

    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public int getSoBH() {
        return soBH;
    }

    public void setSoBH(int soBH) {
        this.soBH = soBH;
    }


    @Override
    public String toString() {
        return "Album{" +
                "maCD=" + maCD +
                ", tenCD='" + tenCD + '\'' +
                ", caSy='" + caSy + '\'' +
                ", soBH=" + soBH +
                '}';
    }

    public void hienThiAlbum(){
        System.out.printf("%-10d %-20s %-20s %-10d \n",maCD, tenCD, caSy, soBH);
    }
}
