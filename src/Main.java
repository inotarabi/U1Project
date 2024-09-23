import java.util.Scanner;

public class  Main {
    public static void main(String[] args){

        String designLine = "------------------------------------";
        String textSpaceHolder = "            ";

        // asks for the bill amoumt
        Scanner billInput = new Scanner(System.in);
        System.out.print("Enter your Bill ($): ");
        double bill = billInput.nextDouble();

        // asks for the tip percentage
        Scanner tipInput = new Scanner(System.in);
        System.out.print("Tip Percent: ");
        int tipPercentage = tipInput.nextInt();

        // asks for the number of people
        Scanner numPeopleInput = new Scanner(System.in);
        System.out.print("Number of people: ");
        int numPeople = numPeopleInput.nextInt();

        // calculates the total tip and prints it
        double totalTip = ((double) tipPercentage / 100) * bill; // converts percentage and then finds tip amount
        System.out.format("%s\nTotal tip amount: $%.2f %s|\n", designLine, totalTip, textSpaceHolder); // rounds to 2 places

        // calculates the total bill amount
        double totalBill = bill + totalTip;
        System.out.format("%s\nTotal bill cost: $%.2f %s|\n", designLine, totalBill, textSpaceHolder);

        // calculuates the tip per person
        double tipPerPerson = totalTip / numPeople;
        System.out.format("%s\nTip per person: $%.2f %s|\n", designLine, tipPerPerson, textSpaceHolder);

        // calculuates the total bill per person
        double totalPerPerson = totalBill / numPeople;
        System.out.format("%s\nTotal bill per person: $%.2f %s|\n", designLine, totalPerPerson, textSpaceHolder);
        System.out.println("|");
    }
}

