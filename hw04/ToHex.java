//Huy Hoang
//CSE 2
//Convert Decimal to Hexadecimal

import java.util.Scanner;
public class ToHex {
    // main method required for every java program
    public static void main(String[]args){//java program class
    Scanner myScanner = new Scanner (System.in);//declare scanner object
    String x1 = "";// the remainder of the first number
    String y1 = "";// the divider of the first number
    String x2 = "";// the remainder of the 2nd number
    String y2 = "";// the divider of the 2nd number 
    String x3 = "";// the remainder of the 3rd number
    String y3 = "";// the divider of the 3rd number 
    
    String result = "";
    
    System.out.println("Please choose 3 numbers that represent the RGB values");// ask the user to choose 3 numbers
    if (myScanner.hasNextInt()) {
        int num1 = myScanner.nextInt();//accept the number chose
        int num2 = myScanner.nextInt();
        int num3 = myScanner.nextInt();
        if (num1 < 0 || num1>255){
            System.out.println("You must choose a number between 0 to 255");//error because the user did not input the correct number
            System.exit(0);// exit if the integer does not match the requirement 
        }
        if (num2 < 0 || num2 >255){
            System.out.println("You must choose a number between 0 to 255");//error because the user did not input the correct number
            System.exit(0);// exit if the integer does not match the requirement
        }
        if (num3 < 0 || num3 >255){
            System.out.println("You must choose a number between 0 to 255");//error because the user did not input the correct number
            System.exit(0);// exit if the integer does not match the requirement
        }
        if (0<=num1/16 && num1/16<=9){
            y1+=""+num1/16;
        }// 0<=divider<=9
        else {
            switch (num1/16){
                case 10:
                y1="A";
                break;
                case 11:
                y1="B";
                break;
                case 12:
                y1="C";
                break;
                case 13:
                y1="D";
                break;
                case 14:
                y1="E";
                break;
                case 15:
                y1="F";
                break;
            }
        }
        
        if (0<= num2/16&&num2/16<=9){
            y2+=""+num2/16;
        }
        else {
        switch (num2/16){
        case 10:
        y2="A";
        break;
        case 11:
        y2="B";
        break;
        case 12:
        y2="C";
        break;
        case 13:
        y2="D";
        break;
        case 14:
        y2="E";
        break;
        case 15:
        y2="F";
        break;
    }
}
        if (0<=num3/16 && num3/16 <=9){
        y3+=num3/16;
    }
        else {
        switch(num3/16){
            case 10:
            y3="A";
            break;
            case 11:
            y3="B";
            break;
            case 12:
            y3="C";
            break;
            case 13:
            y3="D";
            break;
            case 14:
            y3="E";
            break;
            case 15:
            y3="F";
            break;
            }
        }
        if (0<=num1%16 && num1%16 <=9){
            x1+=""+num1%16;
        }//0<=remainder<=9
        else {
            switch(num1%16){
            case 10:
            x1="A";
            break;
            case 11:
            x1="B";
            break;
            case 12:
            x1="C";
            break;
            case 13:
            x1="D";
            break;
            case 14:
            x1="E";
            break;
            case 15:
            x1="F";
            break;
        }
}
        if(0<=num2%16&&num2%16<=9){
        x2+=num2%16;
    }
        else {
        switch(num2%16){
            case 10:
            x2="A";
            break;
            case 11:
            x2="A";
            break;
            case 12:
            x2="A";
            break;
            case 13:
            x2="A";
            break;
            case 14:
            x2="A";
            break;
            case 15:
            x2="A";
            break;
        }
    }
        if (0<=num3%16 && num3%16<=9){
        x3+=num3%16;
    }
        else {
        switch(num3%16){
            case 10:
            x3="A";
            break;
            case 11:
            x3="B";
            break;
            case 12:
            x3="C";
            break;
            case 13:
            x3="D";
            break;
            case 14:
            x3="E";
            break;
            case 15:
            x3="F";
            break;
        }
        }
        
        System.out.println("The decimal number R:" +num1+",G:"+num2+",B:"+num3+ "is presented in hexadecimal as:"+x1+y1+x2+y2+x3+y3);
    }
    else{
        System.out.println("Please input integers.");
        System.exit(0);
    }
    }
}


