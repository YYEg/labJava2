import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("What to do?");
            System.out.println("1 - first task");
            System.out.println("2 - second task");
            System.out.println("3 - third task");
            System.out.println("4 - fourth task");

            int choice = in.nextInt();

            if (choice == 1) {
                FibNum countNum = new FibNum();
                countNum.countFibNum();
            } else if (choice == 2) {
                Array limitedArray = new Array();
                limitedArray.printLimitedArray();
            } else if (choice == 3) {
                Array avarageValue = new Array();
                avarageValue.getAvarageValue();
            } else if (choice == 4) {
                Words converter = new Words();
                converter.ConvertFromNumToWords();
            } else {
                break;
            }
        }
        in.close();
    }
}
