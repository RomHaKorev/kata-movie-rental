package movierental;

public class Movie {
    private String title;
    private Rating priceCode;

    public Movie(String title, Rating priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public Rating getPriceCode() {
        return priceCode;
    }

    public String getTitle() {
        return title;
    }

    public Price getPrice(int days) {
        return priceCode.getPrice(days);
    }

}
