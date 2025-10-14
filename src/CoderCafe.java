// File for your Coder Cafe code!
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CoderCafe {
    public static void main(String args[]) {
        //declaring constant variables
        double icedMatchaLattePrice = 4.50;
        double icedLattePrice = 5.30;
        double cappuccinoPrice = 3.75;
        double hotChocolatePrice = 4.80;
        double serviceFee = 1.21;

        int icedMatchaLatteItems = 2;
        int icedLatteItems = 4;
        int cappuccinoItems = 3;
        int hotChocolateItems = 1;

        //subtotals for items
        double icedMatchaLatteSubtotal = icedMatchaLattePrice * icedMatchaLatteItems;
        double icedLatteSubtotal = icedLattePrice * icedLatteItems;
        double cappuccinoSubtotal = cappuccinoPrice * cappuccinoItems;
        double hotChocolateSubtotal = hotChocolatePrice * hotChocolateItems;

        //calculating variables
        int totalItems = icedMatchaLatteItems + icedLatteItems + cappuccinoItems + hotChocolateItems;
        double subTotal = icedMatchaLatteSubtotal + icedLatteSubtotal + cappuccinoSubtotal + hotChocolateSubtotal;
        double tax = subTotal * .08875;
        double cafeFee = subTotal % totalItems;
        double total = tax + serviceFee + cafeFee + subTotal;

        //objects for time
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = myDate.format(dateFormatter);
        String formattedTime = myTime.format(myFormatter);

        //printing
        System.out.println("*****************************************");
        System.out.println("*\tWelcome to Claire's Coder Cafe!\t\t*");
        System.out.println("*\t\t " + formattedDate + " " + formattedTime + " \t\t\t*");
        System.out.println("*\t\t\t\t\t\t\t\t\t\t*");

        System.out.print("*\t" + icedMatchaLatteItems + " x " + "Iced Matcha Latte\t $");
        System.out.printf("%.2f\t\t*\n",icedMatchaLatteSubtotal);
        System.out.print("*\t" + icedLatteItems + " x " + "Iced Latte\t\t\t $");
        System.out.printf("%.2f\t\t*\n",icedLatteSubtotal);
        System.out.print("*\t" + cappuccinoItems + " x " + "Cappuccino\t\t\t $");
        System.out.printf("%.2f\t\t*\n",cappuccinoSubtotal);
        System.out.print("*\t" + hotChocolateItems + " x " + "Hot Chocolate\t\t $");
        System.out.printf("%.2f\t\t*\n",hotChocolateSubtotal);

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