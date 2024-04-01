package homework.extraHomework.addHomeWork3.task3;

public class ProductDemo {
    public static void main(String[] args) {

        Product product = new Product(" Буренка ");

        String milk = product.getMilk();
        System.out.println(" Наш продукт " + milk);

        product.actualPrice();
        System.out.println(" Цена со скидкой " + product.actualPrice());

    }
}
