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

        System.out.println("*****************************************");
        System.out.println("*\tWelcome to Claire's Coder Cafe!\t\t*");
        System.out.println("*\t\t\t" + myDate + " " + formattedTime + "\t\t\t*");

        System.out.print("*\t" + icedMatchaLatteItems + " x " + "Iced Matcha Latte\t $");
        System.out.printf("%.2f\t\t*\n",icedMatchaLatte*icedMatchaLatteItems);

        System.out.print("*\t" + icedLatteItems + " x " + "Iced Latte\t\t\t $");
        System.out.printf("%.2f\t\t*\n",icedLatte*icedLatteItems);

        System.out.print("*\t" + cappuccinoItems + " x " + "Cappuccino\t\t\t $");
        System.out.printf("%.2f\t\t*\n",cappuccino*cappuccinoItems);

        System.out.print("*\t" + hotChocolateItems + " x " + "Hot Chocolate\t\t $");
        System.out.printf("%.2f\t\t*\n",hotChocolate*hotChocolateItems);

        System.out.println("*\t\t\t\t\t\t\t\t\t\t*");
        System.out.printf("*\tSubtotal:\t\t\t\t $%.2f\t\t*\n", subTotal);
        System.out.printf("*\tSalesTax: \t\t\t\t $%.2f\t\t*\n", tax);
        System.out.printf("*\tService Fee: \t\t\t $%.2f\t\t*\n", serviceFee);
        System.out.printf("*\tCoder cafe Fee: \t\t $%.2f\t\t*\n", cafeFee);
        System.out.println("*\t\t\t\t\t\t\t\t\t\t*");
        System.out.printf("*\tTotal: \t\t\t\t\t $%.2f\t\t*\n", total);
        System.out.println("*\t\tThank you, come again!\t\t\t*");
        System.out.println("*****************************************");



    }
}