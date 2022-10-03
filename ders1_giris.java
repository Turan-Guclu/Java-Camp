public class ders1_giris {
    public static void main(String[] args) {
        System.out.println("Hello World!...");

        // Değişken İsmi
        String ortaMetin = "İlginizi Çekebilir";
        String altMetin = "Vade Süresi";
        System.out.println(ortaMetin);

        //
       // int vade = 12;
        double dolarDun = 18.15;
        double dolarBugun = 18.15;
     //   boolean dolarDustumu = true; // false

        String OkYonu = "";
        if (dolarBugun < dolarDun) {
            // True
            OkYonu = "down.svg";
            System.out.println(OkYonu);
        } else if (dolarBugun > dolarDun) {
            // False
            OkYonu = "up.svg";
            System.out.println(OkYonu);
        } else {
            // False
            OkYonu = "notr.svg";
            System.out.println(OkYonu);
        }

        // Array
        String[] krediler = { "Hızlı Kredi ", "Maaşını HalkBanktan", "Mutlu Emekli",altMetin };

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
        ;
    };

}