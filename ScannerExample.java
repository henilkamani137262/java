import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        System.out.print("Enter your Height: ");
        float height = sc.nextFloat();

        System.out.print("Enter your Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your Gender (Male/Female): ");
        char gender = sc.next().charAt(0);

        sc.nextLine();
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.println("\n--- User Details ---");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Height : " + height);
        System.out.println("Salary : " + salary);
        System.out.println("Gender : " + gender);

        sc.close();
    }
}
