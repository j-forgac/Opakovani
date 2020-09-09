import java.util.Scanner;

public class Delitelnost {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        int myNum = 0;
        String stringInput;

        do {
            System.out.println("Zadejte limit filtrovani prvocisel");
            stringInput = mySc.nextLine();
            try {
                myNum = Integer.parseInt(stringInput);
            } catch (java.lang.NumberFormatException e) {
                stringInput = "F";
            }
        } while (stringInput == "F");

        if (myNum % 7 == 0) {
            System.out.println("je delitelne 7");
        } else {
            System.out.println("neni delitelne 7");
        }
    }
}
