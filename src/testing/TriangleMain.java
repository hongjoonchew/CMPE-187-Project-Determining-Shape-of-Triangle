package testing;

import java.util.ArrayList;

/*
 * CMPE187 Triangle Test HW1
 * Authors: Hong Joon Chew, Anthony Minaise, Elias Habash, Justin Leinbach
 * 
 */

public class TriangleMain {
	private static int x;
	private static int y;
	private static int z;
	
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
		
		ArrayList<ArrayList<Integer>> numbers = FileTest.readInFromFile("testFile.txt");
		

		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i).size() > 3) {
				System.out.println("Too many inputs, invalid triangle");
				continue;
			}
			
			if (numbers.get(i).size() < 3) {
				System.out.println("Not enough inputs, invalid triangle");
				continue;
			}
			int x = numbers.get(i).get(0);
			int y = numbers.get(i).get(1);
			int z = numbers.get(i).get(2);
			TriangleMain triangle = new TriangleMain(x, y, z);
			triangle.testTriangle();
		}


	}

}
