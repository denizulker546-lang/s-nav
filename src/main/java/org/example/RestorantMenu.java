package org.example;

import java.util.ArrayList;

public class RestorantMenu {
    private ArrayList<MenuItem> urunler;

    public void RestoranMenu() {
        urunler = new ArrayList<>();
        menuyuOlustur(); // Restoran açıldığında menü otomatik yüklensin.
    }

    private void menuyuOlustur() {
        urunler.add(new MenuItem("Mercimek Çorbası", 80.0));
        urunler.add(new MenuItem("Adana Kebap", 240.0));
        urunler.add(new MenuItem("Tavuk Şiş", 190.0));
        urunler.add(new MenuItem("Mevsim Salatası", 60.0));
        urunler.add(new MenuItem("Künefe", 110.0));
        urunler.add(new MenuItem("Ayran", 30.0));
        urunler.add(new MenuItem("Kutu Kola", 45.0));
    }
    public void menuyuGoster() {
        System.out.println("--- LEZZET RESTORANI MENÜSÜ ---");
        for (int i = 0; i < urunler.size(); i++) {
            System.out.printf("", (i + 1), urunler.get(i).getIsim(), urunler.get(i).getFiyat());
        }
        System.out.println("[0] Siparişi Tamamla ve Hesabı İste");
        System.out.println("--------------------------------");
    }

}
