import java.util.Scanner;

public class Pemilihan2Percobaan215 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        int pilihanMenu, jmlBeli = 0, harga = 0, potonganQRIS = 1000;
        String member, caraPembayaran;
        double diskon = 0.1, totalBayar = 0;

        System.out.println("---------------------------------------");
        System.out.println("=========== MENU CAFE JTI =============");
        System.out.println("---------------------------------------");
        System.out.println("1. Rice Bowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Rice Bowl + Ice Tea)");
        System.out.println("---------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihanMenu = input15.nextInt();
        input15.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input15.nextLine();
        System.out.println("Masukkan cara pembayaran (Cash/QRIS): ");
        caraPembayaran = input15.next();
        System.out.println("---------------------------------------");

        if (member.equals("y")) {
            System.out.println("Besar diskon = 10%");
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga rice bowl = " + harga);

            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
                
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
                
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            
            totalBayar = harga - (harga * diskon) * jmlBeli;
            System.out.println("Menu yang dipilih: " + pilihanMenu);
            System.out.println("Total bayar setelah diskon = " + totalBayar);
            if (caraPembayaran.equals("QRIS")) {
                totalBayar -= 1000;
                System.out.println("Total Bayar Dengan QRIS: " + totalBayar);  
            }
        }
        
        else if (member.equals("n")) {
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga rice bowl = ");
                
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            totalBayar = harga * jmlBeli;
            System.out.println("Menu yang dipilih: " + pilihanMenu);
            System.out.println("Total bayar = " + harga);

        } if (caraPembayaran.equals("QRIS")) {
            totalBayar -= 1000;
            System.out.println("Total Bayar Dengan QRIS: " + totalBayar);
            
        }
        System.out.println("---------------------------------------");
    }
}