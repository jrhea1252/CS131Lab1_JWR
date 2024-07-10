
public class BasketballTeam extends SportsTeam {
	private int fieldGoals; 
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	//Empty-argument constructor
	public BasketballTeam() {
		super();
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
	}
	
	//This is the preferred constructor
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		super(teamName, teamMascot, headCoach);
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
	}
	//Used Eclipse to generate getters and setters

	public int getFieldGoals() {
		return fieldGoals;
	}

	public void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	}

	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}

	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}

	public int getFreeThrows() {
		return freeThrows;
	}

	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}

	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}

	public void setFreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}
	
	//Create method to calculate field goals percentage
	public double fieldGoalPercentage() {
		if (fieldGoalsAttempted == 0) {
			return 0;
		}
		return (double) fieldGoals / fieldGoalsAttempted;
	}
	
	//Create method that calculates free throw percentage
	public double freeThrowPercentage() {
		if (freeThrowsAttempted == 0) {
			return 0;
		}
		return (double) freeThrows / freeThrowsAttempted;
	}

	//This will get the stats.
	@Override
	public double[] getStats() {
		double[] stats = new double[3];
		stats[0] = getWinPercentage();
		stats[1] = fieldGoalPercentage();
		stats[2] = freeThrowPercentage();
		return stats;
	}
}
