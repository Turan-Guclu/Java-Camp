package Java_Odevler.Odev2.classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.set_name("Laptop");
        product.set_Id(1);
        product.set_description("Asus Leptop");
        product.set_price(5000);
        product.set_stockAmount(3);
        ProducutManager producutManager = new ProducutManager();
        producutManager.Add(product.get_name());

    }
}
