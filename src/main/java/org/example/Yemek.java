package org.example;

public class Yemek extends MenuItem{
    public int isim;
    public int fiyat;
    private String etTuru;

    public Yemek(String isim, double fiyat, String etTuru) {
        super(isim, fiyat);
        this.etTuru = etTuru;
    }

    public String getEtTuru() {
        return etTuru;
    }
}
