public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan nim:");
        String nim = input.nextLine();

        System.out.println("masukkan nama:");
        String nama = input.nextLine();

        System.out.println("masukkan alamat:");
        String alamat = input.nextLine();

        System.out.println("masukkan usia;");
        int usia = input.nextInt();
        String Usia = input.nextLine();

        System.out.println("masukkan tanggal lahir:");
        String tanggal = input.nextLine();

        System.out.println("nim kamu:"+nim);
        System.out.println("nama kamu:"+nama);
        System.out.println("alamat kamu:"+alamat);
        System.out.println("usia kamu:"+usia);
        System.out.println("tanggal lahir kamu:"+tanggal);

        input.close();

}
}
