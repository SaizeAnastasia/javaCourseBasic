package homework_34.project;

public class CarDemo {
    public static void main(String[] args) {
        CarDealer dealer = new CarDealer();

        dealer.addCar("VIN123", new Car("Toyota", "Camry", 2022,25000,4.5));
        dealer.addCar("VIN456", new Car("Honda", "Accord", 2021,27000,4.7));
        dealer.addCar("VIN789", new Car("Mazda", "3",2023,20000,1.6));


        System.out.println(" Информация обо всех автомобилях в наличии");
        dealer.displayAllCars();
        System.out.println();


        System.out.println("Информация об автомобилях марки Мазда");
        dealer.displayCarsByBrand("Mazda");
        System.out.println();


        dealer.updateCar("VIN456", 3000, 4.8);

        System.out.println("Информация обо всех автомобилях в наличии после обновления");
        dealer.displayAllCars();

        dealer.removeCar("VIN123");

        System.out.println("Информация об автомобилях в наличии после удаления ");
        dealer.displayAllCars();



    }
}
