import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nama = new String[100];
        int[] hadir = new int[100];
        int[] total = new int[100];
        double[] persen = new double[100];

        int jumlahData = 0;
        int pilihan;

        do {
            System.out.println("\n=== MENU SISTEM KEHADIRAN ===");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Lihat Semua Data");
            System.out.println("3. Ranking Kehadiran");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            
            // Validasi input angka
            while (!input.hasNextInt()) {
                System.out.println("Input salah! Masukkan angka menu.");
                input.next();
            }
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    if (jumlahData < 100) {
                        System.out.print("Nama mahasiswa: ");
                        nama[jumlahData] = input.nextLine();

                        System.out.print("Total hari: ");
                        total[jumlahData] = input.nextInt();

                        System.out.print("Jumlah hadir: ");
                        hadir[jumlahData] = input.nextInt();

                        if (hadir[jumlahData] > total[jumlahData] || hadir[jumlahData] < 0) {
                            System.out.println(" Input tidak valid!");
                        } else {
                            persen[jumlahData] = ((double) hadir[jumlahData] / total[jumlahData]) * 100;
                            jumlahData++;
                            System.out.println(" Data berhasil ditambahkan!");
                        }
                    }
                    break;

                case 2:
                    if (jumlahData == 0) {
                        System.out.println(" Belum ada data!");
                    } else {
                        System.out.println("\n=== DATA MAHASISWA ===");
                        for (int i = 0; i < jumlahData; i++) {
                            System.out.printf("%d. %s | Hadir: %d/%d | %.2f%% | %s\n", 
                                (i + 1), nama[i], hadir[i], total[i], persen[i], 
                                (persen[i] >= 70 ? "LULUS" : "TIDAK LULUS"));
                        }
                    }
                    break;

                case 3:
                    if (jumlahData == 0) {
                        System.out.println(" Belum ada data!");
                    } else {
                        // Bubble Sort
                        for (int i = 0; i < jumlahData - 1; i++) {
                            for (int j = 0; j < jumlahData - i - 1; j++) {
                                if (persen[j] < persen[j + 1]) {
                                    // Tukar data
                                    double tempP = persen[j]; persen[j] = persen[j+1]; persen[j+1] = tempP;
                                    String tempN = nama[j]; nama[j] = nama[j+1]; nama[j+1] = tempN;
                                    int tempH = hadir[j]; hadir[j] = hadir[j+1]; hadir[j+1] = tempH;
                                    int tempT = total[j]; total[j] = total[j+1]; total[j+1] = tempT;
                                }
                            }
                        }
                        System.out.println("\n=== RANKING KEHADIRAN ===");
                        for (int i = 0; i < jumlahData; i++) {
                            System.out.printf("%d. %s - %.2f%%\n", (i+1), nama[i], persen[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Menu tidak ada!");
            }
        } while (pilihan != 4);

        input.close();
    }
}