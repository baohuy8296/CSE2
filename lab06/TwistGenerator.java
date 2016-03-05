//Huy Hoang
//CSE2 
//03/04/2016


import java.util.Scanner;

public class TwistGenerator {
    // main method required for every java program
    public static void main(String[]args){//java program class
    System.out.println("Please input an integer");
    Scanner myScanner = new Scanner (System.in);//declare scanner object
    int length = myScanner.nextInt();
    int x = 0;
    int y = 0;
    int z = 0;
    
        
        while(x<length){
            System.out.print("\\");
            System.out.print("/");
            x=x+1;
        }
        System.out.println("");
        
        while(y<length){
            System.out.print("X ");
            y=y+1;
        }
         System.out.println("");
        
        while(z<length){
            System.out.print("/");
            System.out.print("\\");
            z=z+1;
          }
        
    }
}
