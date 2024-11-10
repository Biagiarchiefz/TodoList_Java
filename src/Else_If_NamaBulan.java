
import java.util.Scanner;

public class Else_If_NamaBulan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nomor bulan
        System.out.print("Masukkan nomor bulan (1-12): ");
        int nomorBulan = scanner.nextInt();

        // Periksa nama bulan
        String Bulan;
        if (nomorBulan == 1) {
            Bulan = "Januari";
        } else if (nomorBulan == 2) {
            Bulan = "Februari";
        } else if (nomorBulan == 3) {
            Bulan = "Maret";
        } else if (nomorBulan == 4) {
            Bulan = "April";
        } else if (nomorBulan == 5) {
            Bulan = "Mei";
        } else if (nomorBulan == 6) {
            Bulan = "Juni";
        } else if (nomorBulan == 7) {
            Bulan = "Juli";
        } else if (nomorBulan == 8) {
            Bulan = "Agustus";
        } else if (nomorBulan == 9) {
            Bulan = "September";
        } else if (nomorBulan == 10) {
            Bulan = "Oktober";
        } else if (nomorBulan == 11) {
            Bulan = "November";
        } else if (nomorBulan == 12) {
            Bulan = "Desember";
        } else {
            Bulan = "Nomor bulan tidak valid";
        }

        // Output nama bulan
        System.out.println("Nama bulan: " + Bulan);
    }
}