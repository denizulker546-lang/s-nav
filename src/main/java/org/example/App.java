package org.example;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RestorantMenu restoranMenu = new RestorantMenu();

        // Queue yerine normal bir ArrayList kullanarak müşteri sırası oluşturuyoruz
        ArrayList<String> musteriSirasi = new ArrayList<>();

        // Sıraya örnek müşteriler ekliyoruz (ArrayList mantığıyla)
        musteriSirasi.add("Ahmet Yılmaz");
        musteriSirasi.add("Ayşe Demir");
        musteriSirasi.add("Mehmet Kaya");


        ArrayList<Yemek> menu = new ArrayList<>();
        menu.add(new Yemek("Adana Kebap", 240.0, "Et"));
        menu.add(new Yemek("Tavuk Şiş", 190.0, "Tavuk"));
        menu.add(new Yemek("Beyti Sarma", 260.0, "Et"));
        menu.add(new Yemek("Tavuk Kanat", 200.0, "Tavuk"));

        System.out.println("=== RESTORAN SİSTEMİ BAŞLADI ===");


        while (musteriSirasi.size() > 0) {
            String aktifMusteri = musteriSirasi.get(0);
            System.out.println("--- ŞU ANKİ MÜŞTERİ: " + aktifMusteri + " ---");



            ArrayList<Yemek> sepet = new ArrayList<>();

            // Sipariş alma döngüsü
            while (true) {
                // Menüyü ekrana en basit haliyle basıyoruz
                System.out.println("\n--- MENÜ ---");
                for (int i = 0; i < menu.size(); i++) {
                    Yemek y = menu.get(i);
                    System.out.println((i + 1) + ". " + y.isim + " (" + y.getEtTuru() + ") - " + y.fiyat + " TL");
                }
                System.out.println("0. Siparişi Tamamla");

                System.out.print("Seçiminiz: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Lütfen sadece menüdeki sayıları giriniz!");
                    scanner.next();
                    continue;
                }
                int secim = scanner.nextInt();


            }
            System.out.println("=== HESAP ÖZETİ:  ===");
            double toplam = 0;


            for (Yemek y : sepet) {
                System.out.println("- " + y.isim + " (" + y.getEtTuru() + ") : " + y.fiyat + " TL");
                toplam = toplam + y.fiyat;
            }


            System.out.println("TOPLAM TUTAR: " + toplam + " TL");
            System.out.println("=================================");

            // İşlemi biten müşteriyi sıradan (0. indekten) siliyoruz
            musteriSirasi.remove(0);

       }
        System.out.println("\nTüm müşterilere hizmet verildi. Dükkan kapanıyor.");
        scanner.close();
    }


    }



