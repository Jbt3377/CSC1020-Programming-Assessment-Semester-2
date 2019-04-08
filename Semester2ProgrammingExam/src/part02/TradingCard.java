package part02;

public abstract class TradingCard {
	private String cardTitle;//Reference name of the card
	private double current_value;//The monetary value of the card
	
	public TradingCard(String cardTitle, double current_value){
		this.setCardTitle(cardTitle);
		this.current_value = current_value;
	}
	//The following four methods are the accessor and mutator 
	//methods for the two variables.
	public String getCardTitle() {
		return cardTitle;
	}
	public void setCardTitle(String cardTitle) {
		this.cardTitle = cardTitle;
	}	
	public double getCurrent_value() {
		return this.current_value;
	}
	public void setCurrent_value(double price) {
		this.current_value = price;
	}
	
	//The sellCard method sells the card for the price supplied 
	//as the input parameter
	public void sellCard(double price) throws InvalidSaleException{
		
		if(price > this.current_value) {
			// If the price the card is being sold at exceeds the monitary value of the card,
			// the sale is rejected
			throw new InvalidSaleException();
		}else {
			// Sale continues as normal provided the price is equal to or below the monitary value of the card
			System.out.printf("Selling card for £%.2f",price);	
			System.out.println();
		}
	}
	public abstract String getCardInfo();
	
}
