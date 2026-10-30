package org.example;

public class Icecekler  extends MenuItem{
    private String ad;
    private double fiyat;
    private String boyut;

    public Icecekler(String ad, double fiyat, String boyut) {
        super();
        this.ad = ad;
        this.fiyat = fiyat;
        this.boyut = boyut;
    }
    public void hazırla(){
        System.out.println(ad+"hazırlanıyor");
    }

}
