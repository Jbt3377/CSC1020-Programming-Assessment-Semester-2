package part02;

public class PlayerCard extends TradingCard {
	private String playerName;
	private String team;
	private int rating;
	
	public PlayerCard(String cardTitle, double current_value,String playerName, String team, int rating) {
		super(cardTitle, current_value);
		this.playerName=playerName;
		this.team = team;
		this.rating = rating;

	}

	@Override
	public String getCardInfo() {
		return "Player: "+this.playerName+"\nTeam: "+this.team+"\nSkillRating: "+this.rating;
	}

}
