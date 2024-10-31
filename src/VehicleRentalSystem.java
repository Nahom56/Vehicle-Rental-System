import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create some customers
        Customer Nahomcustomer1 = new Customer("Nahom Hailu", "Muyenga Kampala St", 26);
        Customer Nahomcustomer2 = new Customer("Hana Debay", "Soya Kampala St.", 28);
        Customer Nahomcustomer3 = new Customer("Mirgisa Teketa", "Gulu Uganda St.", 30);
        Customer Nahomcustomer4 = new Customer("Musa Musa", "Kasanga Uganda St.", 34);
        Customer Nahomcustomer5 = new Customer("Mundez Mundez", "Kabalagala Uganda St.", 32);

        // Create some vehicles
        VehicleInformation nahomvehicle1 = new VehicleInformation("UBT211", "Red", 60);
        VehicleInformation nahomvehicle2 = new VehicleInformation("UBT321", "Blue", 85);
        VehicleInformation nahomvehicle3 = new VehicleInformation("UBT565", "Grey", 90);
        VehicleInformation nahomvehicle4 = new VehicleInformation("UBT845", "White", 100);

        // Rent vehicles for the customer
        nahomvehicle1.rentVehicle(Nahomcustomer1, 3);
        nahomvehicle2.rentVehicle(Nahomcustomer2, 5);
        nahomvehicle2.rentVehicle(Nahomcustomer3, 10);
        nahomvehicle3.rentVehicle(Nahomcustomer4, 30);
        nahomvehicle4.rentVehicle(Nahomcustomer5, 1);

        // Return vehicles from the customer
        nahomvehicle1.returnVehicle();
        nahomvehicle2.returnVehicle();

        // Calculate total rental price for a customer
        int totalPrice = nahomvehicle1.calculateTotalRentalPrice(Nahomcustomer1);
        System.out.println("Total rental price for " + Nahomcustomer1.getName() + ": $" + totalPrice);
        System.out.println("Total rental price for " + Nahomcustomer2.getName() + ": $" + totalPrice);
        System.out.println("Total rental price for " + Nahomcustomer3.getName() + ": $" + totalPrice);
        System.out.println("Total rental price for " + Nahomcustomer4.getName() + ": $" + totalPrice);
        System.out.println("Total rental price for " + Nahomcustomer5.getName() + ": $" + totalPrice);

        // Get a list of max last 5 rentals per vehicle
        List<Rental> lastFiveRentals = nahomvehicle4.getLastFiveRentals();
        System.out.println("Last 5 rentals for vehicle " + nahomvehicle4.getLicensePlate() + ":");
        for (Rental rental : lastFiveRentals) {
            System.out.println("- Customer: " + rental.getCustomer().getName() + ", Days: " + rental.getDays());
        }

    }
}