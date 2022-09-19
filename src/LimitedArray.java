import java.util.Random;
import java.util.Scanner;

public class LimitedArray {

    Scanner in = new Scanner(System.in);

    private String evenCharacter = "!";
    private int arrRange;
    private int[] numbersArray;
    private int neededNumberOut;

    void fillArray(){
        System.out.println("Введите размерность необходимого массива:");

        arrRange = in.nextInt();
        numbersArray = new int[arrRange];
        Random randomNum = new Random();

        for (int i = 0; i < arrRange; i++) {
            numbersArray[i] = randomNum.nextInt(100);
        }
    }

    void printLimitedArray(){
        System.out.println("При выводе четные числа будут помечаться символом: " + evenCharacter);
        System.out.println("Сколько чисел вы хотите вывести?");

        neededNumberOut = in.nextInt();

        for (int i = 0; i < neededNumberOut; i++) {
            if (numbersArray[i] % 2 == 0)
                System.out.println(numbersArray[i] + evenCharacter);
            else
                System.out.println(numbersArray[i]);
        }
    }
}
