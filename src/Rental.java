public class Rental {
    private Customer customer;
    private int days;
//    private int price;
//Constructor constructor
    public Rental(Customer customer, int days) {
        this.customer = customer;
        this.days = days;
    }
//Getters and setters
    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }

    public int calculatePrice(int price) {
        return days * price;
    }
}