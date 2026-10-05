import java.util.*;

public class waterconsumption {
    static int calculateTotal(int m_usage, int e_usage) {
        return m_usage + e_usage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter morning water usage: ");
        int m_usage = sc.nextInt();

        System.out.print("Enter evening water usage: ");
        int e_usage = sc.nextInt();

        int total = calculateTotal(m_usage, e_usage);

        System.out.println("Total water consumption: " + total + " litres");

        sc.close();
    }
}