abstract class Car {

    String licensceplate;
    String vehicletype;
    double rentalPrice;
    Customer rentedPerson;

    //Constructor parameters
    public Car(String licensceplate, double rentalPrice) {
        this.licensceplate = licensceplate;
        this.vehicletype = "Car";
        this.rentalPrice = rentalPrice;
    }
//
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

    public void rentVehicle(Customer customer) {
        this.rentedPerson = customer;
        System.out.println(customer.getName() + "has rented");
    }
}