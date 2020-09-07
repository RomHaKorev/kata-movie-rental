package movierental;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Subscription {

  private List<Rental> rentals;
  private int frequentRenterPoints;

  Subscription(){
    rentals = new ArrayList<>();
    frequentRenterPoints = 0;
  }


  public void add(Rental rental) {
    frequentRenterPoints++;
    rentals.add(rental);
    if ((rental.getMovie().getPriceCode() == Rating.NEW_RELEASE) && rental.getDaysRented() > 1)
      frequentRenterPoints++;
  }


  public Price total() {
    return rentals.stream().map(Rental::getPrice).reduce(Price::plus).orElse(new Price(0D));
  }

  @Override
  public String toString() {
    return  "\t" + rentals.stream().map(Rental::toString).collect(Collectors.joining("\n\t"))
            + "\n" + "Amount owed is " + total().toString() + "\n"
            + "You earned " + frequentRenterPoints + " frequent renter points";

  }
}
