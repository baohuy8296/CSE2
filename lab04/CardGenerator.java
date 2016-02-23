
// Huy Hoang
// CSE 2
// 2/19/2016

public class CardGenerator {
    //main class required for every java program
    public static void main(String[]args){// java program class
    //[0,1)
int number =(int)(Math.random()*52)+1;

String a = "Diamonds";
String b = "Clubs";
String c = "Hearts";
String d = "Spades";
String s = "";
String r = "Rank";
    
if (1<=number && number<=13){s=a;}
else if (14<=number && number<=26){s=b;}
else if (27<=number && number<=39){s=c;}
else if (40<=number && number<=52){s=d;}

switch(number%13){
    case 1:
    System.out.println("You picked the 2 of "+s);
    break;
    case 2:
    System.out.println("You picked the 3 of "+s);
    break;
    case 3:
    System.out.println("You picked the 4 of "+s);
    break;
    case 4:
    System.out.println("You picked the 5 of "+s);
    break;
    case 5:
    System.out.println("You picked the 6 of "+s);
    break;
    case 6:
    System.out.println("You picked the 7 of "+s);
    break;
    case 7:
    System.out.println("You picked the 8 of "+s);
    break;
    case 8:
    System.out.println("You picked the 9 of "+s);
    break;
    case 9:
    System.out.println("You picked the 10 of "+s);
    break;
    case 10:
    System.out.println("You picked the Jack of "+s);
    break;
    case 11:
    System.out.println("You picked the Queen of "+s);
    break;
    case 12:
    System.out.println("You picked the King of "+s);
    break;
    case 13:
    System.out.println("You picked the Ace of "+s);
    break;
}
}
}


    
    



