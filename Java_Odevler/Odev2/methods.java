package Java_Odevler.Odev2;

public class methods {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    // camel Casing
    public static void sayiBulmaca() {
        int[] sayilar = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int aranacak = 5;
        for (int i : sayilar) {
            if (i == aranacak) {
                    mesajVer("Sayı Mevcuttur: "+aranacak);
                break;
            } else {
                System.out.println("Aranan Sayı Bulunamadı");
                continue;
            }
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}