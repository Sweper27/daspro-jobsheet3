import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah jam kerja : ");
        double jamKerja = sc.nextDouble();
        System.out.print("Masukkan upah perjam: ");
        double upahPerjam = sc.nextDouble();

        double gajiSebelumPajak = jamKerja * upahPerjam;
        double bonus = 0.10 * gajiSebelumPajak;
        double totalSebelumPajak = gajiSebelumPajak + bonus;
        double pajak = 0.05 * totalSebelumPajak;
        double TotalGaji = totalSebelumPajak - pajak;

        System.out.println("Bonus Gaji: " + bonus);
        System.out.println("Pajak: " + pajak);
        System.out.println("Total Gaji Karyawan: " + TotalGaji);

    }
}
