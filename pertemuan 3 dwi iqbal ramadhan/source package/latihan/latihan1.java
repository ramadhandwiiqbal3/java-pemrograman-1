package Latihan;

import java.text.NumberFormat;
import java.util.Locale;

public class latihan1 {

    public static void main(String[] args) {
        double Angka = 83243463.342245;
        double AngkaPecahan = 0.902235643;

        // --- Format GERMANY ---
        NumberFormat NumberFormatterGERMANY = NumberFormat.getNumberInstance(Locale.GERMANY);
        NumberFormat CurrFormatterGERMANY = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat PercentFormatterGERMANY = NumberFormat.getPercentInstance(Locale.GERMANY);

        String NumberStrGERMANY = NumberFormatterGERMANY.format(Angka);
        String CurrStrGERMANY = CurrFormatterGERMANY.format(Angka);
        String PercentStrGERMANY = PercentFormatterGERMANY.format(AngkaPecahan);

        System.out.println("--- FORMAT JERMAN ---");
        System.out.println("Angka berformat number   : " + NumberStrGERMANY);
        System.out.println("Angka berformat currency : " + CurrStrGERMANY);
        System.out.println("Angka berformat percent  : " + PercentStrGERMANY);
        
        System.out.println(); // Spasi pemisah

        // --- Format US ---
        NumberFormat NumberFormatterUS = NumberFormat.getNumberInstance(Locale.US);
        NumberFormat CurrFormatterUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat PercentFormatterUS = NumberFormat.getPercentInstance(Locale.US);

        String NumberStrUS = NumberFormatterUS.format(Angka);
        String CurrStrUS = CurrFormatterUS.format(Angka);
        String PercentStrUS = PercentFormatterUS.format(AngkaPecahan);

        System.out.println("--- FORMAT US ---");
        System.out.println("Angka berformat number   : " + NumberStrUS);
        System.out.println("Angka berformat currency : " + CurrStrUS);
        System.out.println("Angka berformat percent  : " + PercentStrUS);
    }
}