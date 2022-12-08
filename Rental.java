public class Rental {

	private Movie _movie;
	private int _daysRented;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	public int getFrequentRenterPoints() {
		// add frequent renter points
		int frequentRenterPoints = 0;

		// add bonus for a two day new release rental
		if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
			frequentRenterPoints++;

		return frequentRenterPoints;
	}

	// determine amounts for each line
	public double getCharge() {
		return _movie.getCharge(_daysRented);
	}
}