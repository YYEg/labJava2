import java.util.Scanner;

public class Words {
    private String[] belowTwenty = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одинадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    private String[] tens = {" ", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    private String[] hundreds = {"тысяча", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
    private int inputNumber;
    public void ConvertFromNumToWords() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое хотите вывести в текстовом формате(<1000):");

        inputNumber = in.nextInt();

        if (inputNumber < 20) {
            System.out.println(belowTwenty[inputNumber]);
        } else if (inputNumber < 100) {
            int mid = inputNumber / 10;
            int low = inputNumber % 10;
            String text = tens[mid];
            if (low != 0)
                text = text + " " + belowTwenty[low];
            System.out.println(text);
        } else if (inputNumber < 1000) {
            int high = inputNumber / 100;
            int mid = inputNumber / 10 % 10;
            int low = inputNumber % 10;
            String text = hundreds[high];
            if (mid != 0)
                text = text + " " + tens[mid];
            if (low != 0)
                text = text + " " + belowTwenty[low];

            System.out.println(text);
        }
    }
}
