package Java_Odevler.Odev1;

import java.util.Arrays;

public class recapDemo1 {

    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 332;
        int enBuyuk =sayi1;


     
        int[] sayilar;
        sayilar=new int[]{sayi1,sayi2,sayi3};
        Arrays.sort(sayilar);
        System.out.println(sayilar[sayilar.length-1]);
        


        if(enBuyuk<sayi2){
            enBuyuk=sayi2;
        }
        if(enBuyuk<sayi3){
            enBuyuk=sayi3;
        }

        System.out.println(enBuyuk);


       
    }

}
