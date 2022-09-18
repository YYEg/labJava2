import java.util.Scanner;
public class FibNum {
    private int currentValue = 1;
    private int last = 1;
    private int beforeLast = 0;

    void countFibNum() {
        System.out.println("Введите желаемый номер чесла Фибоначчи:");
        Scanner in = new Scanner(System.in);

        int range = in.nextInt();

        for (int i = 0; i < range; i++) {
            System.out.println((i + 1) + " число Фибоначчи: " + currentValue);

            currentValue = beforeLast + last;
            beforeLast = last;
            last = currentValue;
        }
    }
}
