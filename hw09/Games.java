// Huy Hoang
// CSE 2 
// March 29 2016

import java.util.random;
public class Games{
    public static void main (String []args){
        System.out.println("Welcome to Huy's game center");
        Scanner input= new Scanner(System.in);
        System.out.println("Which game would you want to play (guessTheBox,spinTheWheel,scrammble)?");
        gameChoice= input.nextLine();
        if(gameChoice=="guessTheBox"){
            Scanner input= new Scanner(System.in);
            System.out.println("Please enter a number between 1 and 3");
            choice = Scanner.nextInt();
            if (choice<=0 || choice >3){
                System.out.println("Error.Please input a number from 1 to 3");
            }
        }
        
        
    }
}