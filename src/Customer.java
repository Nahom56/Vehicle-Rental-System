import java.util.*;

class Customer {
    private String name;
    private String address;
    private int age;
    private List<Vehicle> rentedVehicles;
    private Map<Vehicle, List<Date>> rentalHistory;

    public Customer(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.rentedVehicles = new ArrayList<>();
        this.rentalHistory = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void rentVehicle(Vehicle vehicle) {
        if (vehicle.isFree()) {
            vehicle.isRented = true;
            rentedVehicles.add(vehicle);
            rentalHistory.computeIfAbsent(vehicle, k -> new ArrayList<>()).add(new Date());
        } else {
            System.out.println("Vehicle is not free.");
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        if (rentedVehicles.contains(vehicle)) {
            vehicle.isRented = false;
            rentedVehicles.remove(vehicle);
            rentalHistory.get(vehicle).remove(rentalHistory.get(vehicle).size() - 1);
        } else {
            System.out.println("Customer does not have this vehicle rented.");
        }
    }

    public double calculateTotalRentalPrice() {
        double totalPrice = 0;
        for (Vehicle vehicle : rentedVehicles) {
            totalPrice += vehicle.rentalPrice;
        }
        return totalPrice;
    }

    public List<Vehicle> getLastFiveRentals() {
        List<Vehicle> lastFiveRentals = new ArrayList<>();
        List<Map.Entry<Vehicle, List<Date>>> sortedRentals = new ArrayList<>(rentalHistory.entrySet());
        sortedRentals.sort((a, b) -> b.getValue().get(b.getValue().size() - 1).compareTo(a.getValue().get(a.getValue().size() - 1)));

        for (int i = 0; i < Math.min(5, sortedRentals.size()); i++) {
            lastFiveRentals.add(sortedRentals.get(i).getKey());
        }

        return lastFiveRentals;
    }
}
