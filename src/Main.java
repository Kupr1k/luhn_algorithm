import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите номер банковской карты для проверки: ");

        long cardNumber = input.nextLong();

        if (getCountsOfDigits(cardNumber) != 16) {
            System.out.println("Некорректно введён номер!");
        } else {
            System.out.println(isValidCard(cardNumber));
        }
    }

    public static boolean isValidCard(long number) {

        int sum = 0;
        int i = 0;
        double digit;

        while (number > 0) {
            digit = number % 10;
            number = number / 10;

            if (i % 2 != 0) {
                digit *= 2;
            }

            if (digit > 9) {
                digit = (digit % 10) + 1;
            } else
                digit *= 1;

            sum += digit;
            i++;
        }
        System.out.println(sum);
        return (sum % 10 == 0);
    }

    public static int getCountsOfDigits(long number) {
        return String.valueOf(Math.abs(number)).length();
    }
}
