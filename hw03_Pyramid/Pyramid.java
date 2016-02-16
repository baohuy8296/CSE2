import java.util.Scanner;

// Huy Hoang
// CSE2 
// 02/15/2016

public class Pyramid {
    public static void main (String [] args){
        Scanner input= new Scanner( System.in);
        System.out.println("Enter the value for length in the form of xx.xx");
        double length= input.nextDouble();
        System.out.println("Enter the value for height in the form of xx.xx");
        double height = input.nextDouble();
        double volume = (length*length*height)/3;
        System.out.printf ("%.2f volume is %.4f \n", volume);
        
    }
}

