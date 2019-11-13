package com.locslender.englishgame.model;

public class BaiHoc {
    private String titleBaiHoc;
    private float tiendoBaiHoc;
    private String gioBaiHoc;
    private int idTopic;
    private int imgBaiHoc;

    public BaiHoc(String titleBaiHoc, float tiendoBaiHoc, String gioBaiHoc, int idTopic, int imgBaiHoc) {
        this.titleBaiHoc = titleBaiHoc;
        this.tiendoBaiHoc = tiendoBaiHoc;
        this.gioBaiHoc = gioBaiHoc;
        this.idTopic = idTopic;
        this.imgBaiHoc = imgBaiHoc;
    }

    public int getImgBaiHoc() {
        return imgBaiHoc;
    }

    public void setImgBaiHoc(int imgBaiHoc) {
        this.imgBaiHoc = imgBaiHoc;
    }

    public int getIdTopic() {
        return idTopic;
    }

    public void setIdTopic(int idTopic) {
        this.idTopic = idTopic;
    }

    public String getTitleBaiHoc() {
        return titleBaiHoc;
    }

    public void setTitleBaiHoc(String titleBaiHoc) {
        this.titleBaiHoc = titleBaiHoc;
    }

    public double getTiendoBaiHoc() {
        return tiendoBaiHoc;
    }

    public void setTiendoBaiHoc(float tiendoBaiHoc) {
        this.tiendoBaiHoc = tiendoBaiHoc;
    }

    public String getGioBaiHoc() {
        return gioBaiHoc;
    }

    public void setGioBaiHoc(String gioBaiHoc) {
        this.gioBaiHoc = gioBaiHoc;
    }
}
