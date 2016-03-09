import java.util.Scanner;

public class RunFactorial{
    public static void main(String[]args){
        System.out.println("Please input the a positive integer between 9 and 16");
        Scanner myScanner= new Scanner(System.in);
        while(! myScanner.hasNextInt()){
            System.out.println("Your value has to be an integer between 9 and 16");
            myScanner.next();
        }
        int num1= myScanner.nextInt();
        while(num1<9 || num1>16){
            System.out.println("Invalid Input, try again");
            while(! myScanner.hasNextInt()){
                System.out.println("Invalid Input,try again");
                myScanner.next();
            }
            num1=myScanner.nextInt();
            
        }
        int a =1;
        while(num1>=1){
            a=a*num1;
            num1=num1-1;
            
        }
        System.out.println("Input accepted"+a);
    }
}

        