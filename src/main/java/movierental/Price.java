package movierental;

public class Price {
  public Price(Double price) {
    this.price = price;
  }

  private Double price;

  public Price plus(Price other) {
    return new Price(price + other.price);
  }

  @Override
  public String toString() {
    return price.toString();
  }
}
