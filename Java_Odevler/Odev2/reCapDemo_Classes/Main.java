package Java_Odevler.Odev2.reCapDemo_Classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Sayi 1 Giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lütfen Sayi 2 Giriniz");
        int sayi2 = scan.nextInt();

        calculatorFunction calculator = new calculatorFunction();

        int sonuc1 = calculatorFunction.topla(sayi1, sayi2);
        int sonuc2 = calculatorFunction.cikar(sayi1, sayi2);
        int sonuc3 = calculatorFunction.carp(sayi1, sayi2);
        int sonuc4 = calculatorFunction.bol(sayi1, sayi2);
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
        System.out.println(sonuc4);
    }
}
