import java.security.SecureRandom;
import java.util.Random;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author Joel W. Rhea 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	private boolean active;
	private String intelligenceType;
	
	//Added eclipse generated getters and setters
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getIntelligenceType() {
		return intelligenceType;
	}
	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}
	
	//Created the empty argument constructor
	public NonPlayerCharacter() {
		super();
		setActive(false);
		setIntelligenceType("Average");
	}
	
	//This is my preferred constructor
	public NonPlayerCharacter(String uniqueId, String personality, boolean active, String intelligenceType) {
		super(uniqueId, personality);
	}
	//Override for reportStructure method
	@Override
	public String reportStructure() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.reportStructure());
        sb.append("==================================\n");
        sb.append("Active: ").append(isActive()).append("\n");
        sb.append("Intelligence: ").append(getIntelligenceType()).append("\n");
        sb.append("==================================\n");
        return sb.toString();
	}
	
	//Introduction method
	public String introduce() {
		return "Hello, my name is " + getUniqueID();
	}
	
	//Exclaim method
	public String exclaim() {
		String[] exclamations = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
		Random random = new Random();
		int index = random.nextInt(exclamations.length);
		return exclamations[index];
	}

}//end class
