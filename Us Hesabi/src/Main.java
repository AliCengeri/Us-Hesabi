import java.util.Scanner;

public class Main {
    static int power(int number, int exp) {
        int result = 1;
        if (exp == 0) {
            return 1;
        } else {
            result = number * power(number, exp - 1);
            return result;
        }
    }

    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Taban değeri giriniz: ");
            int number = input.nextInt();
            System.out.print("Üs değerini giriniz: ");
            int exp = input.nextInt();
            System.out.println("Sonuç: " + power(number, exp));
        }
    }
}