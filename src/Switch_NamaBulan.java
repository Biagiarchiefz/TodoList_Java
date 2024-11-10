import java.util.Scanner;

public class Switch_NamaBulan {
    public static void main(String[] args) {
        System.out.print("Masukan Nomor Bulan = ");

        Scanner hai = new Scanner(System.in);
        int Bulan = hai.nextInt();

        switch (Bulan){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("maret");
                break;
            case 4:
                System.out.println("april");
                break;
            default:
                System.out.println("Nomor Bulan Tidak Valid");
        }
//        System.out.println("NamaBulan: " + Bulan);
    }
}
