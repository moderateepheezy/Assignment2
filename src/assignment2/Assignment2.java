/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author simpumind
 */
public class Assignment2 {
    
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws IOException{
        int hours,mins, choose;
        Ass as = new Ass();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Excercise 1 <<Angles between hand of a clock>>");
        System.out.println("Excercise 2 <<Reverse String>>");
        System.out.println("Excercise 3 <<Reverse each word in a String>>");
        System.out.println("Excercise 4 <<Sort character in a String acending and Decending>>");
        System.out.println("Excercise 5 <<A non-recursive prime number>>");
        System.out.println("Excercise 6 <<Using recursion to generate prime number>>");
        System.out.println("Excercise 7 <<Secon lowest and highest of an item in an Array>>\n");
        System.out.print("Choose: ");

        choose = input.nextInt();
        switch(choose){
            case 1:
            System.out.println("Enter the Time(hours) : ");
            hours = input.nextInt();

             System.out.println("Enter the time(mins) : ");
            mins = input.nextInt();

            System.out.println(as.angle(hours, mins));
                break;
            case 2:
                String x = getString();
                as.reverseString(x);
                break;
            case 3:
                String y = getString();
                System.out.println(as.reverseEachWord(y));
                break;
            case 4:
                String z = getString();
                System.out.println("\nSorted Descending order");
                as.sortDescending(z); 
                System.out.println("\nSorted Ascending order");
                as.sortAscending(z);
                break;
            case 5:
                int r = getInt();
                as.nonRecursivePrimeNumbers(r);
                break;
            case 6:
                int range = getInt();
                    as.recursivePrimeNumber(range);
                break;
            case 7:
               int maxSize = 16;
        ArrayElements arr = new ArrayElements(maxSize);
        
        for(int i = 0; i < maxSize; i++){
            double n = (int)(Math.random()*99);
            arr.insert(n);
        }
        
        arr.display();
        arr.quickSort();
        System.out.println("Second lowest item is: " + arr.getItem(1));
        System.out.println("Highest item  is: " + arr.getItem(arr.getSize()-1));  
        }
    }
    
    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
    public static int getInt() throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }
}
