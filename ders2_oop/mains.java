package ders2_oop;

public class mains {
    public static void main(String[] args) {
        /*
         * String Mesaj = "Vade Oranı";
         * Product product1 = new Product();
         * product1.setName("Delongi Kahve Makinası");
         * product1.setUnitPrice(7);
         * product1.setDiscount(9);
         * product1.setUnitInStock(3);
         * product1.setImageUrl("image3.jpeg");
         * 
         * // Set Value (Değer Atama)
         * 
         * Product product2 = new Product();
         * product2.setName("Smeg Kahve Makinası");
         * product2.setUnitPrice(6);
         * product2.setDiscount(10);
         * product2.setUnitInStock(4);
         * product2.setImageUrl("image3.jpeg");
         * Product product3 = new Product();
         * product3.setName("Kitchen Aid Kahve Makinası");
         * product3.setUnitPrice(13);
         * product3.setDiscount(14);
         * product3.setUnitInStock(1);
         * product3.setImageUrl("image3.jpeg");
         * Product[] products = {
         * product1,
         * product2,
         * product3,
         * };
         * System.out.println("<ul>");
         * for (Product product : products) {
         * System.out.println("<li>"+product.getName()+"</li>");
         * }
         * System.out.println("</ul>");
         * 
         */

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhoneNumber("05431472214");
        individualCustomer.setCustomerNumber("123456");
        individualCustomer.setFirstname("Engin");
        individualCustomer.setLastname("Demiroğ");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhoneNumber("05411432146");
        corporateCustomer.setTaxNumber("1111111111");
        corporateCustomer.setCustomerNumber("134541");

        Customer[] customers = { individualCustomer, corporateCustomer };
  

        System.out.println("<ul>");
        for (Customer customer : customers) {
            System.out.println("<li>" + customer.getId() + "</li>");

        }
        System.out.println("</ul>");

    }
}
