import java.util.ArrayList;
import java.util.List;

class Vehicle {
    private String licensePlate;
    double rentalPrice;
    boolean isRented;

    public Vehicle(String licensePlate, double rentalPrice) {
        this.licensePlate = licensePlate;
        this.rentalPrice = rentalPrice;
        this.isRented = false;
    }

    public boolean isFree() {
        return !isRented;
    }
}