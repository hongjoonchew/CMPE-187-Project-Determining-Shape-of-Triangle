/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filetest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eliballislife11
 */
public class FileTest {

    public static ArrayList<ArrayList<Integer>> readInFromFile (String fileName) {
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();
        
        Scanner scanner = null;
        File file = new File(fileName);
        
        try {
            scanner = new Scanner(file);
            int i = 0;
            while(scanner.hasNextLine()) {
                numbers.add(new ArrayList<Integer>());
                String currentLine = scanner.nextLine();
                String[] words = currentLine.split(" ");
                
                for (String word: words) {
                    try {
                        int num = Integer.parseInt(word);
                        numbers.get(i).add(num);
                    } catch (NumberFormatException e) {}             
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(file.toString() + " was not found");
        }
      
        return numbers;
    }
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = FileTest.readInFromFile("testFile.txt");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    
}
