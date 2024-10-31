abstract class Motorcycle {
    String licensceplate;
    String vehicletype;
    double rentalPrice;
    Customer rentedPerson;
    public Motorcycle(String licensceplate, double rentalPrice) {
        this.licensceplate = licensceplate;
        this.vehicletype = "MotorCycle";
        this.rentalPrice = rentalPrice;

    }

    public String getLicensceplate() {
        return licensceplate;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public Double getRentalPrice() {
        return rentalPrice;
    }

    public void printVehicleDetails() {
        System.out.println("License Plate: " + licensceplate);
        System.out.println("Vehicle Type: " + vehicletype);
        System.out.println("Rental Price: " + rentalPrice);
    }
}