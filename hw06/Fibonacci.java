//Huy Hoang
//CSE2
//03/04/2016

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[]args){
        Scanner myScanner= new Scanner(System.in);
        
        System.out.println("Please input the first positive integer");
        while(! myScanner.hasNextInt()){
            System.out.println("Please enter a valid value");
        }
        int num1=myScanner.nextInt();
        
        System.out.println("Please input the second positive integer");
        while(! myScanner.hasNextInt()){
            System.out.println("Please enter a valid value");
        }
        int num2=myScanner.nextInt();
        
        System.out.println("Please input the custom Fibonacci numbers to be printed");
        while(! myScanner.hasNextInt()){
            System.out.println("Please enter a valid value");
        }
        int n=myScanner.nextInt();
        
        int x=0;
        int num3=0;
        
        
        
        System.out.print("The Fibonacci sequence is: "+num1+","+num2+",");
        while (x<n-2){
            num3 = num1 + num2;
            System.out.print(num3+",");
         num1 = num2;
         num2 = num3;
         x++;
            
            
        }
        
    
    }
}