package testing;

/*
 * CMPE187 Triangle Test HW1
 * Authors: Hong Joon Chew, Anthony Minaise, Elias Habras, Justin Leinbach
 * 
 */

public class TriangleMain {
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
		//Negative integers check.
		if (x < 0 || y < 0 || z < 0) {
			System.out.println("One of the integers is a negative integer. Please try again.");
		}
		else {
			//Triangle Inequality Theorem
			if (x+y > z && x+z > y && y+z > x) { 
				System.out.println("The current integers are a triangle");
				testTriangleShape();
			}
			else {
				System.out.println("The current integers are not a triangle.");
			}
		}
	}
	
	/*
	 * This method is to test what shape is the triangle.
	 */
	public void testTriangleShape() {
		//Test for equilateral triangle.
		if (x == y && y == z && x == z) {
			System.out.println("All 3 integers are of same value, therefore it is an equilateral triangle.");
		}
		//Test for isosceles triangle.
		else if((x == y && y != z) || (y == z && x != z) || (x == z && y != z) ) {
			System.out.println("2 integers are of the same value, therefore it is an isosceles triangle");
		}
		//If both test fails, it should default to a scalene triangle.
		else {
			System.out.println("The 3 integers represent a scalene triangle.");
		}
	}
	
	/*
	 * 
	 * Main function, where the tests are initialized. The tests will run through a sequence
	 * of methods, similar to a flowchart.
	 */
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
