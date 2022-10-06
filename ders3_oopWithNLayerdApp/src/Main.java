package ders3_oopWithNLayerdApp.src;



import ders3_oopWithNLayerdApp.src.bussines.ProductManager;
import ders3_oopWithNLayerdApp.src.core.logging.DatabaseLogger;
import ders3_oopWithNLayerdApp.src.core.logging.FileLogger;
import ders3_oopWithNLayerdApp.src.core.logging.Logger;
import ders3_oopWithNLayerdApp.src.dataAccess.HibernateProductDao;
//import ders3_oopWithNLayerdApp.src.dataAccess.JdbcProductDao;
import ders3_oopWithNLayerdApp.src.entites.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Iphone Xr", 19);

        Logger[] loggers = { new DatabaseLogger(), new FileLogger() };

        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);
    }
}

// Hibernate