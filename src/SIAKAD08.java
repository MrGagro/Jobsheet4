import java.util.Scanner;

public class SIAKAD08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukan NIM: ");
        int nim = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan kelas: ");
        String kelas = input.nextLine();
        System.out.print("Masukkan no absen: ");
        int absen = input.nextInt();
        System.out.print("Masukan nilai kuis: ");
        double kuis = input.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukan nilai ujian: ");
        double ujian = input.nextDouble();

        double nilaiAkhir = (kuis + tugas + ujian) / 3;

        String nilaiHuruf;
        double nilaiSetara;
        String kualifikasi;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = 4.00;
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih Dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3;
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih Dari Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            nilaiSetara = 2;
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            nilaiSetara = 1;
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            nilaiSetara = 0;
            kualifikasi = "Gagal";
        }

        System.out.println("\n========== Hasil ==========");
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("Kelas: "+kelas);
        System.out.println("No Absen: "+absen);
        System.out.println("Nilai Kuis: "+kuis);
        System.out.println("Nilai Tugas: "+tugas);
        System.out.println("Nilai Ujian: "+ujian);
        System.out.println("Nilai Akhir: "+nilaiAkhir);
        System.out.println("Nilai Huruf: "+nilaiHuruf);
        System.out.println("Nilai Setara: "+nilaiSetara);
        System.out.println("Kualifikasi: "+kualifikasi);

    }
}
