import java.util.Scanner;

public class PemilihanBilangan08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan sebuah angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " termasuk bilangan genap");
        } else {
            System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        }
    }
}
