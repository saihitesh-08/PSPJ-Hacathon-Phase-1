import java.util.Scanner;

public class household {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of family members: ");
        int f_mem = sc.nextInt();

        System.out.print("Enter water consumed in litres: ");
        double w_consumed = sc.nextDouble();

        System.out.print("Enter house number: ");
        int h_num = sc.nextInt();

        System.out.print("Enter water usage status (E - Efficient, H - High): ");
        char w_status = sc.next().charAt(0);

        // Displaying details
        System.out.println("\nHousehold Details");
        System.out.println("Number of family members: " + f_mem);
        System.out.println("Water consumed: " + w_consumed + " litres");
        System.out.println("House number: " + h_num);
        System.out.println("Water usage status: " + w_status);

        sc.close();
    }
}