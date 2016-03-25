// Huy Hoang 
//CSE2
//03/11/2016

import java.util.Scanner;
public class Bowtie{
  public static void main(String[] args) {
    int input = 7;
    for(int i = 0; i <= input/2; i++ ) {
      
      for(int j = 0; j <= input; j++) {
        if(i < j && i+j <= input) {
          System.out.print("X");
        } else {
          System.out.print(" ");
        }
        
      }
      System.out.println();
    }
  }
}