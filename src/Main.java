import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        /*
        * Compound Interest Calculator
        * This prog will determine the final amount
        * of money after a given time and interest.
        *
        *    - Take input from user
        *    -
        *    -
        */

//        Taking input from user
        Scanner scan = new Scanner(System.in);

//        Declaring the variables
        double principal; // The original investment
        double rate; // The amount of interest
        int timesCompounded; // How often does the interest double (yearly / monthly)
        int year; // the total time of investment
        double amount; // The final amount you will receive

//        Taking the input from user
        System.out.print("Enter the Principal: ");
        principal = scan.nextDouble();

        System.out.print("Enter the Rate of interest (in %): ");
        rate = scan.nextDouble() / 100; /*why dividing by 100? -
                                           Because to convert any number in % form
                                           we need to divide the number by 100*/

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scan.nextInt();

        System.out.print("Enter the number of years: ");
        year = scan.nextInt();

        /*The formula to calculate the amount
        * amount = principal * (1 + (rate/time compounded))^(time compounded * year)
        * amount = principal * Math.pow((1 + (rate / timesCompounded)) ,(timesCompounded * year))
        * */

        amount = principal * Math.pow((1 + (rate / timesCompounded)) ,(timesCompounded * year));

        System.out.println("You Rewarded Amount is: " + amount + " $");
        System.out.printf("You Rewarded Amount is: %.2f $", amount);


//      Closing the scan
        scan.close();
    }
}