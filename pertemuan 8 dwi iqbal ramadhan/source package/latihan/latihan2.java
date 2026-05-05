import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("Nama : ");
            String nama = input.nextLine();

            System.out.print("NIM : ");
            String nim = input.nextLine();

            System.out.println("Data: " + nama + " - " + nim);

            System.out.print("Ulangi? (y/t): ");
            // Perbaikan: charAt(0) untuk mengambil karakter pertama
            ulang = input.next().charAt(0);
            
            // Perbaikan: membersihkan buffer agar input.nextLine() berikutnya tidak terlewati
            input.nextLine(); 

        } while (ulang == 'y' || ulang == 'Y'); // Perbaikan: variabel 'ilang' diganti 'ulang'
        
        System.out.println("Program selesai.");
        input.close();
    }
}