package part02;
import java.util.ArrayList;
public class TeamCard extends TradingCard {
	private String teamName;
	private ArrayList<String> teamColours;
	
	public TeamCard(String cardTitle, double current_value, String teamName, ArrayList<String> teamColours) {
		super(cardTitle, current_value);
		this.teamName = teamName;
		this.teamColours = new ArrayList<String>(teamColours);
	}
	
	
	@Override
	public String getCardInfo() {
		return "Team: "+this.teamName+"\nWear team colours: "+this.teamColours;
	}

}
