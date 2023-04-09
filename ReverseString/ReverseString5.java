package ReverseString;
import java.util.Scanner;

public class ReverseString5 {
  public static void main(String[] arg){
    String str;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    str = sc.nextLine();
    sc.close();
    System.out.println("Reverse of astring: ");
    for(int j = str.length(); j > 0; j--){
      System.out.print(str.charAt(j - 1));
    }
  }
}


/*
 1. what is the differnce between println and print
 */