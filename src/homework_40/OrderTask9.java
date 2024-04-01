package homework_40;

import java.time.LocalDate;

public class OrderTask9 {
        private int id;
        private LocalDate date;
        private double amount;
        private String status;

    public OrderTask9(int id, LocalDate date, double amount, String status) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.status = status;
    }

    public LocalDate getDate() {
            return date;
        }

        public double getAmount() {
            return amount;
        }
    }

