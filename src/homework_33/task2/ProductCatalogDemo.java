package homework_33.task2;

import homework_33.task2.Product;
import homework_33.task2.ProductCatalog;

public class ProductCatalogDemo {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct(1,new Product("Apple", 1.99));
        catalog.addProduct(3, new Product("Orange", 0.99));
        catalog.addProduct(2, new Product("Banana", 1.59));


        catalog.deleteProduct(3);
        catalog.deleteProduct(4);

        Product foundProduct = catalog.findProduct(1);
        if (foundProduct != null) {
            System.out.println(" Found product: " + foundProduct.getName() + " , Price: $ " + foundProduct.getPrice());
        }
    }


}
