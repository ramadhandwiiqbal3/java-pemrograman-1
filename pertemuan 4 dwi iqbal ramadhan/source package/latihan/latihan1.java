public class latihan1 {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);

        //input kehadiran
        System.out.println("masukkan jumlah kehadiran:");
        float kehadiran = input.nextFloat();
        System.out.println("masukkan realisasi kehadiran:");
        float realisasi = input.nextFloat();
        float bobot = (kehadiran/realisasi)*10;
        System.out.println("bobot kehadiran = " +bobot);


        //input tugas
        System.out.println("masukkan nilai tugas:");
        float tugas = input.nextFloat();

        //input uts
        System.out.println("masukkan nilai uts:");
        float uts = input.nextFloat();

        //input uas
        System.out.println("masukkan nilai uas:");
        float uas = input.nextFloat();

        float bobottugas = (tugas*20)/100;
        float bobotuts = (uts*30)/100;
        float bobotuas = (uas*40)/100;

        float nilaiakhir  = bobot + bobottugas + bobotuts + bobotuas;
        
        System.out.println("total nilai akhir :" + nilaiakhir);
        input.close();

    }
}


