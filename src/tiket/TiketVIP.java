/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiket;

/**
 *
 * @author ASUS
 */
public class TiketVIP extends Tiket { // Kelas TiketVIP merupakan turunan dari kelas Tiket.
    private String fasilitas;
    //Konstruktor untuk membuat objek TiketVIP dengan menginisialisasi properti jenisTiket, harga, dan fasilitas.
    public TiketVIP(String jenisTiket, double harga, String fasilitas) {
        super(jenisTiket, harga);
        this.fasilitas = fasilitas;
    }

    @Override
    public double hitungDiskon() {
        return harga * 0.1; // Diskon 10% untuk Tiket VIP
    }
    
    
    public double hargadiskon() {
        return harga - hitungDiskon();}
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Fasilitas: " + fasilitas);
    }
}
