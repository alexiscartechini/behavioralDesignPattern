public class Driver {

    Customer customer;

    public Driver(Customer customer){
        this.customer = customer;
    }

    public void deliver(String item, int quantity, Customer customer) {
        System.out.println(quantity + " " + item + " out for delivery to " + customer.getAddress());
    }
}
