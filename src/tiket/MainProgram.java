/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiket;

/**
 *
 * @author ASUS
 */
public class MainProgram {
    public static void main(String[] args) {
        
        System.out.println("HARGA TIKET KONSER TULUS");
        System.out.println("");
        
        TiketVIP tiketVIP = new TiketVIP("VIP", 500000, "Tempat duduk VIP");
        
        TiketBiasa tiketBiasa = new TiketBiasa("Reguler", 200000, true);
        
        TiketVVIP tiketVVIP = new TiketVVIP("VVIP", 800000 , "Tempat duduk dekat panggung");
        
        // Menampilkan informasi, diskon, dan harga setelah diskon untuk TiketVVIP.
        tiketVVIP.tampilkanInfo();
        System.out.println("Diskon: " + tiketVVIP.hitungDiskon());
        System.out.println("Harga setelah diskon:" + tiketVVIP.hargadiskon());
        System.out.println();
        
        // Menampilkan informasi, diskon, dan harga setelah diskon untuk TiketVIP.
        tiketVIP.tampilkanInfo();
        System.out.println("Diskon: " + tiketVIP.hitungDiskon());
        System.out.println("Harga setelah diskon:" + tiketVIP.hargadiskon());
        System.out.println();
        
        // Menampilkan informasi, diskon, dan harga setelah diskon untuk TiketBiasa.
        tiketBiasa.tampilkanInfo();
        System.out.println("Diskon: " + tiketBiasa.hitungDiskon());
        System.out.println("Harga setelah diskon:" + tiketBiasa.harga);
    }
}
