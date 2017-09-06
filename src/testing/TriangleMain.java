package testing;

/*
 * CMPE187 Triangle Test HW1
 * Authors: Hong Joon Chew, Anthony Minaise, Elias Habras, Justin Leinbach
 * 
 */

public class TriangleMain {
	/* Main function goes here
	* Perhaps run a txt file as an Object and read the contents to get x,y and z integers.
	* However for now, run this by running the integers through the terminal.
	*/
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("Not enough arguments");
			System.exit(0);;
		}
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		System.out.println("The current integers," + x + "," + y + ", and " + z + ".");
		//Function goes here. Feel free to change, these are all placeholders.
		

	}

	public boolean performFunction (int x, int y, int z) {
		return false;
	}
}
