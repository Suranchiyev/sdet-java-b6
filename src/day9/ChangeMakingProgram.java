package day9;

//do not remove imports
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ChangeMakingProgram {
 public static void main (String[] args) {
     int amount = Integer.parseInt(InputFromUser.getInput("Enter amount(from 1 to 99):"));
     System.out.println(amount + " cents in coins:");
     
     // /
     // %
     System.out.println(amount / 25);
     amount = amount % 25;
 }
}

//do not change this code, program needs this code for testing purposes only
class InputFromUser {
 public static boolean isRunFromTest = false;
 public static List<String> input;
 public static int index = 0;

 public static String getInput(String msg) {
     if (isRunFromTest) {
         return input.get(index++);
     } else {
         try {
             BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
             System.out.println(msg);
             return buffReader.readLine();
         } catch (IOException e) {
             e.printStackTrace();
             throw new RuntimeException(e);
         }
     }

 }

 public static String getInput() {
     if (isRunFromTest) {
         return input.get(index++);
     } else {
         try {
             BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
             return buffReader.readLine();
         } catch (IOException e) {
             e.printStackTrace();
             throw new RuntimeException(e);
         }
     }
 }
}

