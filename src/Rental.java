/**
 * Created by juanjo on 18/2/15.
 */
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

	protected double getCharge() {
		return _movie.getCharge(_daysRented);
	}

	protected int frecuentRenderPoint() {

		return _movie.getFrequentRenterPoints(_daysRented);

	}
}
