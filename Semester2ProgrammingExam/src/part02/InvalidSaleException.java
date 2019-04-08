package part02;

public class InvalidSaleException extends Exception{

	public InvalidSaleException() {
		super("You cannot sell the card for more than the card's value");
	}

}
