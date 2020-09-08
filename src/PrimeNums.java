import java.util.Scanner;

public class PrimeNums {
    public static void main(String[] args) {

        Scanner mySc = new Scanner(System.in);
        int limitInt;

        do {
            System.out.println("Zadejte limit filtrovani prvocisel");
            String limitString = mySc.nextLine();
            try {
                limitInt = Integer.parseInt(limitString);
            } catch (java.lang.NumberFormatException e) {
                limitInt = 0;
            }
        } while (limitInt <= 1);

        int[] primeNums = new int[limitInt];
        int[] compositeNums = new int[limitInt];
        compositeNums[0] = 1;

        double boundSqrt = Math.sqrt(limitInt);

        int primeNumsCounter = 0;
        int compositeNumsCounter = 1;

        boolean check = false;

        for (int primeNumCandidate = 2; primeNumCandidate <= limitInt; primeNumCandidate++) {
            if (!contains(compositeNums, primeNumCandidate)) {
                primeNums[primeNumsCounter] = primeNumCandidate;
                primeNumsCounter++;
                if (primeNumCandidate <= boundSqrt) {
                    for (int multiple = 2; (multiple * primeNumCandidate) <= limitInt; multiple++) {
                        if (!contains(compositeNums, (multiple * primeNumCandidate))) {
                            compositeNums[compositeNumsCounter] = (multiple * primeNumCandidate);
                            compositeNumsCounter++;
                        }
                    }
                }
            }
        }
        log(compositeNums, primeNums);
    }

    public static void log(int[] compositeNums, int[] primeNums) {
        System.out.println("\n/////////////////////////////////////////////////");
        System.out.println("Slozena cisla jsou:");
        for (int compositeNum : compositeNums) {
            if (compositeNum != 0) {
                System.out.print(compositeNum + "-");
            }
        }

        System.out.println("");

        System.out.println("Prvocisla jsou:");
        for (int primeNum : primeNums) {
            if (primeNum != 0) {
                System.out.print(primeNum + "-");
            }
        }
    }

    public static boolean contains(int[] arr, int filteredVariable) {
        for (int element : arr) {
            if (filteredVariable == element) {
                return true;
            }
        }
        return false;
    }
}