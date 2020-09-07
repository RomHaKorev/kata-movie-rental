package movierental;


public class Customer {

    private String name;
    private Subscription subscription = new Subscription();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        subscription.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        return  "Rental Record for " + getName() + "\n" + subscription.toString();
    }
}
