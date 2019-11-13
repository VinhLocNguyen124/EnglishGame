package com.locslender.englishgame.model;

import java.io.Serializable;

public class TuVung implements Serializable {
    private String tuTiengAnh;
    private String tuTiengViet;
    private int imgTuvung;
    private int keyNgonngu;

    public TuVung(String tuTiengAnh, String tuTiengViet, int imgTuvung, int keyNgonngu) {
        this.tuTiengAnh = tuTiengAnh;
        this.tuTiengViet = tuTiengViet;
        this.imgTuvung = imgTuvung;
        this.keyNgonngu = keyNgonngu;
    }

    public TuVung() {
    }

    public String getTuTiengAnh() {
        return tuTiengAnh;
    }

    public void setTuTiengAnh(String tuTiengAnh) {
        this.tuTiengAnh = tuTiengAnh;
    }

    public String getTuTiengViet() {
        return tuTiengViet;
    }

    public void setTuTiengViet(String tuTiengViet) {
        this.tuTiengViet = tuTiengViet;
    }

    public int getImgTuvung() {
        return imgTuvung;
    }

    public void setImgTuvung(int imgTuvung) {
        this.imgTuvung = imgTuvung;
    }

    public int getKeyNgonngu() {
        return keyNgonngu;
    }

    public void setKeyNgonngu(int keyNgonngu) {
        this.keyNgonngu = keyNgonngu;
    }
}
