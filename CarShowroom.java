class Car {
    String brand;
    String model;
    double price;

    // Constructor to initialize car details
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayCarInfo() {
        System.out.println(brand + " " + model + " costs $" + price);
    }
}

public class CarShowroom {
    public static void main(String[] args) {
        // Creating car objects
        Car car1 = new Car("Tesla", "Model S", 79999.99);
        Car car2 = new Car("Toyota", "Camry", 24999.99);

        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}
