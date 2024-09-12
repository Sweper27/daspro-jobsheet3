import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalKwh, hargaKwh = 1500.0;
        boolean Batas;

        System.out.print("Penggunaan listrik: ");
        totalKwh = sc.nextDouble();

        double totalTagihan = totalKwh * hargaKwh;
        Batas = totalKwh > 500;

        System.out.println("Tagihan Listrik: " + totalTagihan);
        System.out.println("Apakah melebihi batas: " + Batas);
    }
}
