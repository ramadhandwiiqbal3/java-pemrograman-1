public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = "";
        String jurusan = "Teknik Informatika";
        String reguler = "";
        String cariJurusan;

        System.out.print("masukkan pilihan \n1. masukkan nama \n2. cari jurusan \npilih: ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {
            System.out.print("masukkan nama: ");
            nama = input.nextLine();
            System.out.print("Pilih reguler \n1. Reguler A \n2. Reguler B \n3. Reguler CK \n4. Reguler CS \npilih (1-4): ");
            int pilihReg = input.nextInt();
            switch (pilihReg) {
                case 1:
                    reguler = "Reguler A";
                    break;
                case 2:
                    reguler = "Reguler B";
                    break;
                case 3:
                    reguler = "Reguler CK";
                    break;
                case 4:
                    reguler = "Reguler CS";
                    break;
                default:
                    reguler = "Reguler A";
            }
            System.out.println("\n==data dicari==");
            System.out.println("Nama: " + nama);
            System.out.println("Jurusan: " + jurusan);
            System.out.println("Reguler: " + reguler);

        } else {
            if (pilihan == 2) {
                System.out.print("masukkan jurusan yang ingin dicari: ");
                cariJurusan = input.nextLine();
                if (cariJurusan.equalsIgnoreCase(jurusan)) {
                    System.out.println("jurusan ditemukan: " + jurusan);
                } else {
                    System.out.println("jurusan yang dicari tidak ada");
                }
            } else {
                System.out.println("pilihan yang tersedia hanya 1/2");
            }
        }
    }
}

