// Huy Hoang
// 2/12/2016
// CSE 2
// A program that uses the Scanner class to obtain from the user the orginal costs of the check

import java.util.Scanner;

public class Check{
    // main method required for every Java program
    public static void main(String[] args){// Java Program class
    
Scanner myScanner= new Scanner(System.in);

double checkCost=myScanner. nextDouble();
 
double tipPercent=myScanner.nextDouble();
tipPercent/=100; 
System.out.print("Enter the number of people who went out for dinner:");
int numPeople=myScanner.nextInt();
double totalCost=0;
double costPerPerson=0;
int dollars,   
totalCost=checkCost*(1.0+tipPercent);
costPerPerson=totalCost/numPeople;
dollar=(int)costPerPerson;
dimes=(int)(costPerPerson*10)%10;
pennies=(int)(costPerPerson*100)%10;
System.out.println("Each person in the group owes $"+dollar+'.'+dimes+pennies);
System.out.print("Enter the percentage of tip that you wish to pay as whole number(in the form of xx):");
System.out.print("Enter the cost of orginal check in the form of xx.xx:");
    
    }//end of method
}//end of class

