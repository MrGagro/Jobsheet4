import java.util.Scanner;

public class PemilihanHari08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama hari: ");
        String dayName = input.nextLine();
        String dayType;

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "Nama hari tidak valid";
            break;
        }

        System.out.println(dayName + " adalah " + dayType);

        input.close();

    }
}
