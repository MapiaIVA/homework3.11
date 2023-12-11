import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите шестизначный номер билета: ");
        int number = scanner.nextInt();

        int firstPart = number / 1000;
        int secondPart = number % 1000;

        int sumFirstPart = 0;
        int sumSecondPart = 0;

        while (firstPart > 0) {
            sumFirstPart += firstPart % 10;
            firstPart /= 10;
        }

        while (secondPart > 0) {
            sumSecondPart += secondPart % 10;
            secondPart /= 10;
        }

        if (sumFirstPart == sumSecondPart) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}