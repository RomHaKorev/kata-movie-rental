package movierental;

public class Penalities {

  Penalities(double coefficient, int daysPublished) {
    this.coefficient = coefficient;
    this.daysPublished = daysPublished;
  }

  private double coefficient;
  private int daysPublished;


  public Price getPrice(int days) {
    return new Price((days - this.daysPublished) * this.coefficient);
  }
}
