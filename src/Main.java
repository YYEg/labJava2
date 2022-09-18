import java.util.Scanner;
import java.util.Random;

public class Main {


    public static void doTaskTwo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность необходимого массива:");

        int arrRange = in.nextInt();
        int[] numbersArray = new int[arrRange];
        Random randomNum = new Random();

        for (int i = 0; i < arrRange; i++) {
            numbersArray[i] = randomNum.nextInt(100);
        }

        System.out.println("При выводе четные числа будут помечаться символом: ^_^");
        System.out.println("Сколько чисел вы хотите вывести?");

        int neededNumberOut = in.nextInt();

        for (int i = 0; i < neededNumberOut; i++) {
            if (numbersArray[i] % 2 == 0)
                System.out.println(numbersArray[i] + "^_^");
            else
                System.out.println(numbersArray[i]);
        }
    }

    public static void doTaskThree() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность необходимого массива:");

        int arrRange = in.nextInt();
        int[] numbersArray = new int[arrRange];
        Random randomNum = new Random();
        int avarageValue = 0, countOfNumbers = 0;

        for (int i = 0; i < arrRange; i++) {
            numbersArray[i] = randomNum.nextInt(100);
            avarageValue += numbersArray[i];
            countOfNumbers++;
        }
        System.out.println("Среднее значение всех чисел массива равно:");
        System.out.println(avarageValue / countOfNumbers);
    }

    public static void doTaskFour() {
        String[] belowTwenty = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одинадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] tens = {" ", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] hundreds = {"тысяча", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое хотите вывести в текстовом формате(<1000):");

        int startNumber = in.nextInt();

        if (startNumber < 20) {
            System.out.println(belowTwenty[startNumber]);
        } else if (startNumber < 100) {
            int mid = startNumber / 10;
            int low = startNumber % 10;
            String text = tens[mid];
            if (low != 0)
                text = text + " " + belowTwenty[low];
            System.out.println(text);
        } else if (startNumber < 1000) {
            int high = startNumber / 100;
            int mid = startNumber / 10 % 10;
            int low = startNumber % 10;
            String text = hundreds[high];
            if (mid != 0)
                text = text + " " + tens[mid];
            if (low != 0)
                text = text + " " + belowTwenty[low];

            System.out.println(text);
        }
    }

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
                doTaskTwo();
            } else if (choice == 3) {
                doTaskThree();
            } else if (choice == 4) {
                doTaskFour();
            } else {
                break;
            }
        }

        in.close();

    }
}
