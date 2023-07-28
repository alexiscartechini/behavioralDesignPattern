public class Mediator {

    private ECommerceSite site;
    private Customer customer;
    private Driver driver;

    public Mediator(){
        this.customer = new Customer("123 Sunny Street");
        site = new ECommerceSite();
        driver = new Driver(customer);
    }

    public void buy(String item, int quantity) {
        if (site.checkInStock(item, quantity)) {
            site.sell(item, quantity);
            driver.deliver(item, quantity, customer);
        }
    }
}
