import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        myOrder();
        scan.close();

    }

    static void myOrder() {
        System.out.println("My List Of Orders");
        System.out.print("Enter your first order: ");
        String firstOrder = scan.nextLine();
        System.out.print("Enter the price: ");
        double a = scan.nextDouble();
    
        scan.nextLine();

        System.out.print("Enter your second order: ");
        String secondOrder = scan.nextLine();
        System.out.print("Enter the price: ");
        double b = scan.nextDouble();

        scan.nextLine();

        System.out.print("Enter your third order: ");
        String thirdOrder = scan.nextLine();
        System.out.print("Enter the price: ");
        double c = scan.nextDouble();

        double sum = a + b + c;

        System.out.println("My List Of Orders: " + "Order 1: " + firstOrder + "Order 2: " + secondOrder + "Order 3: " + thirdOrder);
        System.out.print("Total Amount: " + sum);
    
    }
}
