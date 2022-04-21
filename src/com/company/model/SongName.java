package com.company.model;

import java.io.Serializable;

public class SongName implements Serializable {
    private String tenCD;
    private String tenCaSy;
    private float giaThanh;

    public SongName() {
    }

    public SongName(String tenCD, String tenCaSy, float giaThanh) {
        this.tenCD = tenCD;
        this.tenCaSy = tenCaSy;
        this.giaThanh = giaThanh;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public String getTenCaSy() {
        return tenCaSy;
    }

    public void setTenCaSy(String tenCaSy) {
        this.tenCaSy = tenCaSy;
    }

    public float getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }

    @Override
    public String toString() {
        return "SongName{" +
                "tenCD='" + tenCD + '\'' +
                ", tenCaSy='" + tenCaSy + '\'' +
                ", giaThanh=" + giaThanh +
                '}';
    }
}
