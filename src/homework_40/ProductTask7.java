package homework_40;

public class ProductTask7 {

        private String name;
        private String category;
        private double price;
        private int quantity;

    public ProductTask7(String name, String category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCategory() {
            return category;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }

