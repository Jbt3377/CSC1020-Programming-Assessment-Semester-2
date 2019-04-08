package part02;

import java.util.ArrayList;

public class CardTester {

	public static void main(String[] args) {
		
		ArrayList<String> teamColours = new ArrayList<String>();
		teamColours.add("red"); teamColours.add("white"); teamColours.add("black");
		
		TeamCard manu = new TeamCard("ManU", 2.50, "Manchester United", teamColours);
		PlayerCard messi = new PlayerCard("Messi", 1.50, "Lionel Messi", "Barcelone FC", 94);
		
		// Polymorphic array list containing traiding cards
		ArrayList<TradingCard> myCards = new ArrayList<TradingCard>();
		myCards.add(manu);
		myCards.add(messi);
		
		try {
			manu.sellCard(2.50);
			messi.sellCard(2.50);
		}catch(InvalidSaleException ise) {
			System.out.println(ise.getMessage());
		}

	}

}
