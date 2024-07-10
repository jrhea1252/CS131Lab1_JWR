/**
 * This is the Application object that will launch our application
 * @author Modified by Joel Rhea from Rob Kelley's base code
 * @version 1.3
 * Lab1 
 * CS131ON
 */
public class Application {

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter();
		//Uncomment the line below to ensure reportStructure() method works after you have written it.
		System.out.println(npc.reportStructure());
		System.out.println();
		System.out.println(npc.introduce());
		System.out.println();
		System.out.println(npc.exclaim());

	}//end main

}//end class