// File for your Coder Cafe code!
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CoderCafe {
    public static void main(String args[]) {
        //items
        double icedMatchaLatte = 4.50;
        double icedLatte = 5.30;
        double cappuccino = 3.75;
        double hotChocolate = 4.80;
        int icedMatchaLatteItems = 3;
        int icedLatteItems = 2;
        int cappuccinoItems = 4;
        int hotChocolateItems = 2;
        int items = (icedMatchaLatteItems + icedLatteItems + cappuccinoItems + hotChocolateItems);

        double subTotal = (icedMatchaLatte * icedMatchaLatteItems) + (icedLatte * icedLatteItems) + (cappuccino * cappuccinoItems) + (hotChocolate * hotChocolateItems);
        double tax = subTotal * .08875;
        double serviceFee = 1.21;
        double cafeFee = subTotal % items;
        double total = tax + serviceFee + cafeFee + subTotal;

        //objects for time
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = myTime.format(myFormatter);

        System.out.println("**********************************");
        System.out.println(" Welcome to Claire's Coder Cafe!");
        System.out.println("\t\t" + myDate + " " + formattedTime);
        System.out.println("\t" + icedMatchaLatteItems + " x " + "Iced Matcha Latte");
        System.out.println("\t" + icedLatteItems + " x " + "Iced Latte");
        System.out.println("\t" + cappuccinoItems + " x " + "Cappuccino");
        System.out.println("\t" + hotChocolateItems + " x " + "Hot Chocolate");
        System.out.println();
        System.out.print("\tSubtotal: $");
        System.out.printf("%.2f%n", subTotal);
        System.out.print("\tSales Tax: $");
        System.out.printf("%.2f%n", tax);
        System.out.print("\tService Fee: $");
        System.out.printf("%.2f%n", serviceFee);
        System.out.print("\tCoder cafe Fee: $");
        System.out.printf("%.2f%n", cafeFee);
        System.out.println();
        System.out.print("\tTotal: $");
        System.out.printf("%.2f%n", total);
        System.out.println("\t\tThank you, come again!");
        System.out.println("**********************************");



    }
}