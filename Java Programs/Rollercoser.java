import java.util.Scanner;

public class Rollercoser {
    public static void main(String[] args) {

        System.out.print("hello welcome to rollercoster: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("what is the current hight?: ");
        int hight = scanner.nextInt();
        int bill = 0;

        if (hight >= 120) {

            System.out.println("you can ride the rollercoster!");
            Scanner user = new Scanner(System.in);
            System.out.print("what is the current age?: ");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("ride money is $12");
                bill = 12;
            }

            else if (age <= 12) {
                System.out.println("ride money is $5");
                bill = 5;

            }

            else {
                System.out.println("ride money is $7");
                bill = 7;
            }

        } else {
            System.out.println("you can't ride the rollercoster!");

        }

        Scanner ph = new Scanner(System.in);
        System.out.println("what you want photo?");
        String photos = ph.next();

        if (photos.equalsIgnoreCase("y")) {
            bill += 3;
        }

        else if (photos.equalsIgnoreCase("n")) {
            System.out.println("no extra charges!");
        }
        System.out.println("your final bill is $" + bill);
    }

}
