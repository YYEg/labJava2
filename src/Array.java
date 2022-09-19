import java.util.Random;
import java.util.Scanner;

public class Array {
    int rangeOfArray;
    private int avarageValueOfArray;
    int[] numbersArray;

    private void fillArAndCountSumOfArEl() {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность необходимого массива:");
        rangeOfArray = in.nextInt();
        numbersArray = new int[rangeOfArray];
        Random randomNum = new Random();

        for (int i = 0; i < rangeOfArray; i++) {
            numbersArray[i] = randomNum.nextInt(100);
            avarageValueOfArray += numbersArray[i];
        }
    }
    public void getAvarageValue() {
        fillArAndCountSumOfArEl();
        System.out.println("Среднее значение всех чисел массива равно:");
        System.out.println(avarageValueOfArray / rangeOfArray);
    }
    public void printLimitedArray(){
        Scanner in = new Scanner(System.in);
        fillArAndCountSumOfArEl();
        System.out.println("Сколько чисел вы хотите вывести?");

        int limitOfElements = in.nextInt();
        for (int i = 0; i < limitOfElements; i++) {
            if (numbersArray[i] % 2 == 0)
                System.out.println(numbersArray[i] + "!");
            else
                System.out.println(numbersArray[i]);
        }
    }
}
