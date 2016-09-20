/** This is a chatbot that likes to talk about sports
* unless you type in bye or Bye
* @author Krish Bhavnani
* @version 1.0
*/

import java.util.Scanner;

public class ChatBotSports
{
  public static void main(String[] args){
    /**
    * This is the main method
    * @param args This is the command line argument
    * @return This program does not return anything
    */
    // Scanner for user input
    Scanner s = new Scanner(System.in);
    // variable to simultaneously store as a the users answers
    System.out.println("Hi! My name's Adam and I like to talk about sports!");
    System.out.println("What's your name");
    String response = s.nextLine();
    if (!response.equals("bye") && !response.equals("Bye")){
      System.out.println("Hi, " + response);
    }
    // main part of the program where user is asked questions until he / she types bye
    while(!response.equals("bye") && !response.equals("Bye")){
      System.out.println("What sport would you like to talk about?: ");
      response = s.nextLine();
      if(response.equals("bye") || response.equals("Bye")){
        continue;
      }
      if(response.equals("squash") || response  .equals("Squash")){
        System.out.println("Hey that's my favorite sport!");
      } else{
        System.out.println("That's a cool sport.");
      }
      System.out.println("Who's your favorite player?");
      response = s.nextLine();
      if(response.equals("bye") || response.equals("Bye")){
        continue;
      }
      System.out.println("Hey " + response + " is my favorite player too!");
      }
    if(response.equals("bye") || response.equals("Bye")){
      System.out.println("Bye!");
    }
  }
}
