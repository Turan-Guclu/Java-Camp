package Java_Odevler.Odev2.methodsOverloading;

public class calculatorFunction {
    public static int topla(int sayi1, int sayi2) {
        int result = sayi1 + sayi2;
        return result;
    }
    public static int topla(int sayi1, int sayi2,int sayi3) {
        int result = sayi1 + sayi2+sayi3;
        return result;
    }


    public static int cikar(int sayi1, int sayi2) {
        int result = sayi1 - sayi2;
        return result;
    }

    public static int carp(int sayi1, int sayi2) {
        int result = sayi1 * sayi2;
        return result;
    }

    public static int bol(int sayi1, int sayi2) {
        int result = sayi1 / sayi2;
        return result;
    }
}
