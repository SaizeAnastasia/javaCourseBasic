package homework_34.project;

import java.util.HashMap;
import java.util.Map;

public class CarDealer {
    private Map<String, Car> carInventory;

    public CarDealer(){
        carInventory = new HashMap<>();
    }


    public void addCar(String vin, Car car){
        carInventory.put(vin, car);
    }

    public void removeCar(String vin){
        carInventory.remove(vin);
    }

    public void updateCar(String vin, double price, double rating) {
        Car car = carInventory.get(vin);
        if (car != null) {
            car.setPrice(price);
            car.setRating(rating);
        }
    }


    public void displayAllCars(){
        for (Car car : carInventory.values() ){
            System.out.println(" Brand: " + car.getBrand() + ", Model: " + car.getModel() + ", Year: " + car.getYear() + ", Price: " + car.getPrice()+
                    ", Rating: " + car.getRating());
        }

    }

    public void displayCarsByBrand(String brand) {
        System.out.println(" Cars of brand " + brand + ":");
        for (Car car : carInventory.values()){
            if (car.getBrand().equals(brand)){
                System.out.println(" Model: " + car.getModel() + ", Year: " + car.getYear() + ", Price: " + car.getPrice()+
                ", Rating: " + car.getRating());
            }
        }
    }
}
