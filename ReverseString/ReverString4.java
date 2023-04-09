package ReverseString;
import java.util.Scanner;

public class ReverString4 {
  public static void main(String[] arg){
    String str;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string: ");
    str = scan.nextLine();
    scan.close();
    System.out.println("Reverse of a string: ");
    int i = str.length();
    while( i > 0){
      System.out.print(str.charAt(i - 1));
      i--;
    }
  }
}
