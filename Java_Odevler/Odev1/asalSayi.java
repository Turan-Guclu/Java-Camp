package Java_Odevler.Odev1;
import java.util.Scanner;

public class asalSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz: ");
        int number = input.nextInt();
        boolean isPrime = true;

        if (number == 1) {
            System.out.println(number + " Sayısı Asal Bir Sayı Değildir");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {

            System.out.println(number + " Sayısı Asal Bir Sayıdır");
        } else {
            System.out.println(number + " Sayısı Asal Bir Sayı Değildir");
        }
    }
}
