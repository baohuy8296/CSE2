import java.util.Scanner;

// Huy Hoang
// CSE 2 
// Convert Meters to Inches

public class Convert {
    public static void main (String [] args){
        Scanner input= new Scanner( System.in);
        System.out.println("Enter the value for meters in the form of xx.xx");
        double value= input.nextDouble();
        double inches = value*39.37;
        double thoinches=1000*inches;
        inches= thoinches/1000.0;
        System.out.printf ("%.2f meters is %.4f inches \n", value,inches);
        
    }
}