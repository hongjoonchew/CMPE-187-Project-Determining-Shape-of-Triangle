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
	private int x;
	private int y;
	private int z;
	
	public TriangleMain(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	/*
	 * This first test tests if the current three integers are a triangle.
	 */
	public void testTriangle() {
		if (x+y > z && x+z > y && y+z > x) {
			System.out.println("The current integers are a triangle");
			testTriangleShape();
		}
		else {
			System.out.println("The current integers are not a triangle.");
			System.exit(0);
		}
	}
	
	/*
	 * This method is to test what shape is the triangle.
	 */
	public void testTriangleShape() {
		
	}
	
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("Not enough arguments");
			System.exit(0);
		}
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		TriangleMain t = new TriangleMain(x,y,z);
		System.out.println("The current integers are " + x + ", " + y + ", and " + z + ".");
		t.testTriangle(); //This is where all the tests start. 
		

	}

}
