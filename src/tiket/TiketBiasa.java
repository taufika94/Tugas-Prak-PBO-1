/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiket;

/**
 *
 * @author ASUS
 */
public class TiketBiasa extends Tiket { //Kelas TiketBiasa merupakan turunan dari kelas Tiket.
    private boolean termasukSnack;

    public TiketBiasa(String jenisTiket, double harga, boolean termasukSnack) {
        super(jenisTiket, harga);
        this.termasukSnack = termasukSnack;
        //Konstruktor untuk membuat objek TiketBiasa dengan menginisialisasi properti jenisTiket, harga, dan termasukSnack.
    }

    @Override // Override metode hitungDiskon() dari kelas Tiket untuk TiketBiasa.
    public double hitungDiskon() {
        return 0; // Tidak ada diskon untuk Tiket Biasa
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Termasuk Snack: " + (termasukSnack ? "Ya" : "Tidak"));
    }
}

