package Java_Odevler.Odev1;

public class loopDemo {
    public static void main(String[] args) {
        // For
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Döngü Bitti");

        // While
        int i = 2;
        while (i <= 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("while Döngü Bitti");

        // Do While
        int j=1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);
        System.out.println("Do-while Döngü Bitti");
    }
}
