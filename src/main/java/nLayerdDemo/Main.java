package nLayerdDemo;

import nLayerdDemo.business.abstracts.ProductService;
import nLayerdDemo.business.concretes.ProductManager;
import nLayerdDemo.core.jLoggerManagerAdapter;
import nLayerdDemo.dataAccess.concretes.HibernateProductDao;
import nLayerdDemo.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {

        ProductService productService = new ProductManager(new HibernateProductDao(),new jLoggerManagerAdapter());

        Product product = new Product(2,5,"Badimcan",55,89);
        productService.add(product);
    }
}
