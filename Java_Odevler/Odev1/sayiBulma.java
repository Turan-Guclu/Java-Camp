package Java_Odevler.Odev1;
public class sayiBulma {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9,0};
        int aranacak = 5;
        for (int i : sayilar) {
            if(i==aranacak){
                System.out.println("Aranan Sayı Bulundu Aranan Sayı="+i);
                break;
            }else{
                System.out.println("Aranan Sayı Bulunamadı");
                continue;
            }
        }
    }
}
