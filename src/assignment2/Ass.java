/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author simpumind
 */
public class Ass {
    
    public double angle(int h, int m) {
        double hAngle = 0.5D * (h * 60 + m);
        double mAngle = 6 * m;
        double angle = Math.abs(hAngle - mAngle);
        angle = Math.min(angle, 360 - angle);
        return angle;
    }
    
    public void reverseString(String str) {
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == ' '){
                continue;
            }
            else{
                reverse = reverse + str.charAt(i);
            }
        }
        System.out.print(reverse);
        System.out.println();
    }
    
    public String reverseEachWord(String str){
        int strLeng = str.length()-1;
        String reverse = "", temp = "";

        for(int i = 0; i <= strLeng; i++){
            temp += str.charAt(i);
            if((str.charAt(i) == ' ') || (i == strLeng)){
                for(int j = temp.length()-1; j >= 0; j--){
                    reverse += temp.charAt(j);
                    if((j == 0) && (i != strLeng))
                        reverse += " ";
                }
                temp = "";
            }
        }

        return reverse;
    }
    
    public void sortDescending(String str){
        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        // print them backwards i.e. descending order.
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
    public void sortAscending(String str){
        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        // print them backwards i.e. descending order.
        for(int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
    public void nonRecursivePrimeNumbers(int range){
        int i = 0;
        int num = 0;
        String primeNumbers = "";
        for(i = 1; i <= range; i++){
            int counter = 0;
            for(num = i; num >= 1; num--){
                if(i%num==0){
                    counter = counter + 1;
                }
            }
            if(counter == 2){
                primeNumbers = primeNumbers  + " " + i;
            }
        }
        System.out.println("Prime numbers from 1 to " + range + " are");
        System.out.println(primeNumbers);
    }
 
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n % 2 == 0 & n != 2) {
            return false;
        } else {
            return isPrime(n, (int) Math.sqrt(n));
        }
    }

    private static boolean isPrime(int n, int i) {
        if (i < 2) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else {
            return isPrime(n, --i);
        }
    }

   public static void recursivePrimeNumber(int n){
       if(n < 2) {
            return ;
       } else if(isPrime(n)) {
            System.out.println(n);
       } 

       recursivePrimeNumber(--n);

   }
}
