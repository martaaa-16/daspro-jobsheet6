import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kategori_buku;
        int jumlah_beli, totalBayar;
        double diskon = 0, harga_buku = 20000, totaldiskon;


        System.out.println("Jenis Buku: ");
        kategori_buku = input.nextLine();
        System.out.println("Jumlah Buku: ");
        jumlah_beli = input.nextInt();

        if (kategori_buku.equalsIgnoreCase("Kamus")) {
            diskon = 0.1;
            if (jumlah_beli > 2) {
                diskon += 0.02;
            }
            totaldiskon = diskon * (jumlah_beli * harga_buku) ;
            totalBayar = (int) (harga_buku *jumlah_beli - totaldiskon);

            System.out.println("diskon: " +totaldiskon);
            System.out.println("bayar: " +totalBayar);
        }else if (kategori_buku.equalsIgnoreCase("Novel")) {
            diskon = 0.07;
            if (jumlah_beli > 3) {
                diskon += 0.02; 
            }else if (jumlah_beli <= 3) {
                diskon += 0.01;
            }
            totaldiskon = diskon * (jumlah_beli * harga_buku) ;
            totalBayar = (int) (harga_buku *jumlah_beli - totaldiskon);

            System.out.println("diskon: " +totaldiskon);
            System.out.println("bayar: " +totalBayar);
        }else{
           if (jumlah_beli > 3) {
            diskon += 0.05;
            totaldiskon = diskon * (jumlah_beli * harga_buku) ;
            totalBayar = (int) (harga_buku *jumlah_beli - totaldiskon);

            System.out.println("diskon: " +totaldiskon);
            System.out.println("bayar: " +totalBayar);
           }
        }
    }
}
