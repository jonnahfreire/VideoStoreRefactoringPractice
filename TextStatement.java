import java.util.Enumeration;

public class TextStatement extends Statement {

	@Override
	public String statement(Enumeration<Rental> rentals, Customer customer) {
		String result = "Rental Record for " + customer.getName() + "\n";
		
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		
		result += "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}
}