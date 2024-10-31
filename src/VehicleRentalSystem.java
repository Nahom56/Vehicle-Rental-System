import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VehicleRentalSystem {

        public static void main (String[] args) {

            Toyota rush = new Toyota("NAHOM784", 150);
            Toyota v8 = new Toyota("Nahom333", 850);
            Toyota vitz = new Toyota("UBT213", 300);
            SportBike sportBike = new SportBike("PRINCE12", 30);

            Customer nahcustomer1 = new Customer("Nahom Hailu", "Gulu Kampala St.", 26);
            Customer nahcustomer2 = new Customer("Hana Debay", "Kasanga Kampala St.", 28);
            Customer nahcustomer3 = new Customer("Yosef Kesete", "Soya Kampala St.", 35);

            rush.printVehicleDetails();
            rush.rentVehicle(nahcustomer1);

            v8.printVehicleDetails();
            v8.rentVehicle(nahcustomer2);

            Customer nahcustomer4 = new Customer("Prince", "Muyenga", 28);
            sportBike.printVehicleDetails();
            sportBike.getRentalPrice();
        }

}