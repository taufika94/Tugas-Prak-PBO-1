/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiket;

/**
 *
 * @author ASUS
 */

public abstract class Tiket implements TiketInterface {
    protected String jenisTiket;
    protected double harga;
    
    
    /**
     * Konstruktor untuk menginisialisasi properti jenisTiket dan harga.
     */

    public Tiket(String jenisTiket, double harga) {
        this.jenisTiket = jenisTiket;
        this.harga = harga;
    }

        /**
     * Implementasi metode tampilkanInfo() dari TiketInterface.
     * Menampilkan informasi jenis tiket dan harga.
     */
    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis Tiket: " + jenisTiket);
        System.out.println("Harga Tiket awal: " + harga);
        
    }

    public abstract double hitungDiskon();
}

