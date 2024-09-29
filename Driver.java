
import java.util.Scanner;

class Driver {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      StringTools sTools = new StringTools();
      
      //question 1
      System.out.println("lastLetter test cases:");
      System.out.println("Enter a word with at least one character:");
      String answer1 = input.nextLine();
      System.out.println("The last letter is " + sTools.lastLetter(answer1));
      
      //question 2
      System.out.println("formatPhoneNumber test cases:");
      System.out.println("Enter a ten digit phone number");
      String answer2 = input.nextLine();
      System.out.println(sTools.formatPhoneNumber(answer2));
      
      //question 3
      System.out.println("middleThree test cases:");
      System.out.println("Enter a word that is odd in length and at least three letters");
      String answer3 = input.nextLine();
      System.out.println(sTools.middleThree(answer3));
      
      //question 4
      System.out.println("swapLastTwo test cases:");
      System.out.println("Enter a word that is at least two letters long");
      String answer4 = input.nextLine();
      System.out.println(sTools.swapLastTwo(answer4));
      
      //question 5
      System.out.println("frontAgain test cases:");
      System.out.println("Enter a word and a value for n");
      String answer5 = input.nextLine();
      int answer6= input.nextInt();
      input.nextLine();
      System.out.println(sTools.frontAgain(answer5,answer6));

          
      
      
    }
    
}