package homework_41;

import java.time.LocalDate;
import java.util.List;

public class OrderTask3 {
        private LocalDate date;
        private List<PurchaseTask3> purchases;

    public OrderTask3(LocalDate date, List<PurchaseTask3> purchases) {
        this.date = date;
        this.purchases = purchases;
    }

    public LocalDate getDate() {
            return date;
        }

        public List<PurchaseTask3> getPurchases() {
            return purchases;
        }
    }


