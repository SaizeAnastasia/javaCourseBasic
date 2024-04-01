package homework_33.task2;

import homework_33.task2.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {

    private Map<Integer, Product> catalog;
    public ProductCatalog() {
        catalog = new HashMap<>();
    }

    public void addProduct(int productId, Product product) {
        if (catalog.containsKey(productId)) {
            System.out.println(" Product with ID " + productId + " already exists in the catalog. ");
        } else {
            catalog.put(productId, product);
        }
    }


    public void deleteProduct(int productId) {
        if (catalog.containsKey(productId)) {
            catalog.remove(productId);
        } else {
            System.out.println(" Product with ID " + productId + " does not exist in the catalog ");
        }
    }


    public Product findProduct(int productId) {
        if (catalog.containsKey(productId)) {
            return catalog.get(productId);
        } else {
            System.out.println(" Product with ID " + productId + "does not exist in the catalog ");
            return null;

        }
    }
}
