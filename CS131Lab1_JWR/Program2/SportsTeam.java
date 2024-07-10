
public abstract class SportsTeam {
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;
	
	//This is the empty-argument constructor
	public SportsTeam() {
		this.teamName = "";
		this.teamMascot = "";
		this.headCoach = "";
		this.wins = 0;
		this.losses = 0;
	}
	
	//This will be the preferred constructor
	public SportsTeam(String teamName, String teamMascot, String headCoach) {
		this.teamName = "";
		this.teamMascot = "";
		this.headCoach = "";
		this.wins = 0;
		this.losses = 0;
	}
	//Used Eclipse to auto-generate getters and setters 
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamMascot() {
		return teamMascot;
	}

	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	}

	public String getHeadCoach() {
		return headCoach;
	}

	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}
	
	//This method will calculate win percentage based on the formula provided
	public double getWinPercentage() {
		if (wins + losses == 0 ) {
			return 0;
		}
		return (double) wins / (wins + losses);
	}

	//The method for getStats is abstract
	public abstract double[] getStats();

}
