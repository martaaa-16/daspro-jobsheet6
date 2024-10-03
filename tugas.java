import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        String kategori;
        int jumlahBeli;
        double diskon = 0, harga = 20000, totalDiskon, totalBayar;

        System.out.print("Jenis Buku: ");
        kategori = input15.nextLine();
        System.out.print("Jumlah Buku: ");
        jumlahBeli = input15.nextInt();

        if (kategori.equalsIgnoreCase("Kamus")) {
            diskon = 0.1;
            if (jumlahBeli > 2) {
                diskon += 0.02;
            }
            totalDiskon = diskon * (jumlahBeli * harga) ;
            totalBayar = (harga * jumlahBeli) - totalDiskon;

            System.out.println("Total Diskon: " + totalDiskon);
            System.out.println("Total Bayar: " + totalBayar);
        } else if (kategori.equalsIgnoreCase("Novel")) {
            diskon = 0.07;
            if (jumlahBeli > 3) {
                diskon += 0.02; 
            } else if (jumlahBeli <= 3) {
                diskon += 0.01;
            }
            totalDiskon = diskon * (jumlahBeli * harga) ;
            totalBayar = (harga * jumlahBeli) - totalDiskon;

            System.out.println("Total Diskon: " + totalDiskon);
            System.out.println("Total Bayar: " + totalBayar);
       
        } else{
           if (jumlahBeli > 3) {
            diskon += 0.05;
            
           }
           totalDiskon = diskon * (jumlahBeli * harga) ;
            totalBayar = (int) (harga * jumlahBeli - totalDiskon);

            System.out.println("Total Diskon: " + totalDiskon);
            System.out.println("Total Bayar: " + totalBayar);
        }
    }
}
