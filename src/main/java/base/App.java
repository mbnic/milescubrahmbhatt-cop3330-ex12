package base;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        Investment x = new Investment();

        myApp.getInvestmentInfo(x);
        myApp.getWorth(x);
        myApp.printOutput(x);
    }

    public void printOutput(Investment x) {
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f.", x.years, x.interest, x.worth);
    }

    public void getWorth(Investment x) {
        x.worth = (x.principal * (1 + ((x.interest / 100) * x.years)));
    }

    public void getInvestmentInfo(Investment x) {
        System.out.printf("Enter the principal: ");
        x.principal = Float.parseFloat(in.nextLine());

        System.out.printf("Enter the rate of interest: ");
        x.interest = Float.parseFloat(in.nextLine());

        System.out.printf("Enter the number of years: ");
        x.years = Integer.parseInt(in.nextLine());
    }
}
