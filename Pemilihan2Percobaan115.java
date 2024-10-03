import java.util.Scanner;

public class Pemilihan2Percobaan115 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        int tahun;

        System.out.print("Masukkan tahun: ");
        tahun = input15.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) 
                System.out.print("Tahun Kabisat");
        } else
            System.out.print("Bukan Tahun Kabisat");       
    }
}