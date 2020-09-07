package movierental;

public enum Rating {
  CHILDREN(new Price(1.5D), new Penalities(1.5D, 3)),
  NEW_RELEASE(new Price(0D), new Penalities(3D, 0)),
  REGULAR(new Price(2D), new Penalities(1.5D, 2));

  Rating(Price amount, Penalities penalities) {
    this.amount = amount;
    this.penalities = penalities;
  }

  private Price amount;
  private Penalities penalities;

  public Price getPrice(int days) {
    return amount.plus(penalities.getPrice(days));
  }

}
