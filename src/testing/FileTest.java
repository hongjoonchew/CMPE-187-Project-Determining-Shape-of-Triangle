/*
 * This class accepts a file for the test cases. It returns a 2D array, where a line of 
 * integers from the file will represent a one dimensional ArrayList inside the 2D 
 * ArrayList
 */
package testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eliballislife11
 */
public class FileTest {

	/* fileName is the name of the testing file */
    public static ArrayList<ArrayList<Integer>> readInFromFile (String fileName) {
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();
        
        Scanner scanner = null;
        File file = new File(fileName);
        
        try {
            scanner = new Scanner(file);
            int i = 0;	// Counter for the ArrayList;
            /* check if there is content on the next line*/
            while(scanner.hasNextLine()) {
            	/* Add an ArrayList to represent the line */
                numbers.add(new ArrayList<Integer>());
                String currentLine = scanner.nextLine();
                /* Split up the numbers into an array */
                String[] nums = currentLine.split(" ");
                
                for (String num: nums) {
                    try {	// Only add integers into the ArrayList
                        int oneNum = Integer.parseInt(num);
                        numbers.get(i).add(oneNum);
                    } catch (NumberFormatException e) {} // Catch anything that is not an integer            
                }
                i++;	// increment the counter to move to the next Integer ArrayList in the 2D ArrayList
            }
        } catch (FileNotFoundException e) {
            System.out.println(file.toString() + " was not found");
        } finally {
        	scanner.close();
        }
      
        return numbers;		// Return the 2D ArrayList
    }
    
//    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> list = FileTest.readInFromFile("testFile.txt");
//        
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//    }
    
}
