package Java_Odevler.Odev2;

public class methots2 {

    public static void main(String[] args) {
        String mesaj = ("Bugün Hava Cok Güzel");
        String yeniMesaj = mesaj.substring(0, 2);
        System.out.println(yeniMesaj);
        System.out.println(topla(2, 12));
        int toplam = topla2(1,34,541,214,111);
        System.out.println(toplam);

    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {

        System.out.println("silindi");
    }

    public static void guncelle() {

        System.out.println("Güncellendi");
    }

    public static int topla(int deger1, int deger2) {
        return deger1 + deger2;
    }

    public static int topla2(int... sayilar) {
        int toplam=0;
        for (int i : sayilar) {
          
            toplam+=i;
        }
        return toplam;
    }

    public static String sehirVer() {
        return "Ankara";
    }
}
