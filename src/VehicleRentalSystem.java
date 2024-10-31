class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create vehicles
        Motorcycle motorcycle = new Motorcycle("M12345", 50.0);
        Car car = new Car("UBT457", 80.0);
        Car car2 = new Car("UBT456", 150.0);

        Car car3 = new Car("UBT477", 200.0);

        Truck truck = new Truck("UBT123", 200.0);
        SportBike sportBike = new SportBike("UBT123", 150.0);

        // Create customer
        Customer customer1 = new Customer("Nahom Hailu", "Kampala St", 30);
        Customer customer2 = new Customer("Hana Debay", "Kampala St", 30);

        // Rent vehicles
        customer1.rentVehicle(motorcycle);
        customer1.rentVehicle(car);

        // Calculate total rental price
        double totalRentalPrice = customer1.calculateTotalRentalPrice();
        System.out.println("Total rental price of " + customer1.getName() + " is $" + totalRentalPrice);

        // Return vehicle
        customer2.returnVehicle(motorcycle);
    }
}