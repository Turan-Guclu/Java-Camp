package ders3_oopWithNLayerdApp.src.bussines;

//import java.util.List;

import ders3_oopWithNLayerdApp.src.core.logging.Logger;
import ders3_oopWithNLayerdApp.src.dataAccess.ProductDao;
import ders3_oopWithNLayerdApp.src.entites.Product;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers; // Alternatif private List<Logger> loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        // iş Kuralları
        // Bussines Roles
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün Fiyatı 10 Dan Küçük Olamaz");
        }

        productDao.add(product);

        for (Logger logger : loggers) {
            // [db,File,mail]
            logger.log(product.getName());
        }
    }
}