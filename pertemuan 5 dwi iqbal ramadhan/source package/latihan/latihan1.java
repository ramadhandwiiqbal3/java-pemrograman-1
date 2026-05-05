import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihan1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String bacaInput = "";
        byte jmlData = 0;
        Byte[] dataArray; // Menggunakan wrapper Byte untuk array

        System.out.print("Jumlah data : ");

        try {
            bacaInput = dataIn.readLine();
            // Mengonversi String ke byte
            jmlData = Byte.parseByte(bacaInput);
            
            dataArray = new Byte[jmlData];
            System.out.println();

            // Input data ke dalam array
            for (int i = 0; i < jmlData; i++) {
                System.out.print("DataArray[" + i + "] = ");
                bacaInput = dataIn.readLine();
                // Menggunakan parseByte daripada 'new Byte()'
                dataArray[i] = Byte.parseByte(bacaInput);
            }

            // Menampilkan data array
            System.out.println("\nHasil Input:");
            for (int i = 0; i < jmlData; i++) {
                System.out.println("DataArray[" + i + "] = " + dataArray[i]);
            }

        } catch (IOException e) {
            System.out.println("Ada kesalahan input/output!");
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan: Input harus berupa angka!");
        }
    }
}