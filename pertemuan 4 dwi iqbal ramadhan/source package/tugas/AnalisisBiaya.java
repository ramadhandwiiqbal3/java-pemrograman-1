package tugas;

import java.util.Scanner;

public class AnalisisBiaya { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inisialisasi variabel
        double makanan = 20000;
        double transport = 10000;
        double belanja = 50000;

        // Menghitung total pengeluaran
        double total = makanan + transport + belanja;

        // Menghitung persentase
        double persenMakan = (makanan / total) * 100;
        double persenTransport = (transport / total) * 100;
        double persenBelanja = (belanja / total) * 100;

        // Menampilkan hasil
        System.out.println("--- Laporan Persentase Pengeluaran ---");
        System.out.printf("Total Makanan   : %.2f%%\n", persenMakan);
        System.out.printf("Total Transport : %.2f%%\n", persenTransport);
        System.out.printf("Total Belanja   : %.2f%%\n", persenBelanja);
        System.out.println("--------------------------------------");
        System.out.println("Total Biaya     : Rp " + total);

        input.close();
    }
}