package org.example;

public class MenuItem {
    public int etTuru;
    private String isim;
    private double fiyat;

    public MenuItem(String isim, double fiyat) {
        this.isim = isim;
        this.fiyat = fiyat;
    }

    public MenuItem() {

    }

    public String getIsim() {
        return isim;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public Object getFiyat() {
        return 0;
    }
}

