package ReverseString;
import java.util.Scanner;

public class ReverseString6 {
  public static void main(String[] arg){
    String str;
    String word = "";
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    str = sc.nextLine();
    sc.close();
    char[] ch = str.toCharArray();
    for(int i = 0; i < (ch.length); i++){
      if(ch[i] != ' '){
         word = word + ch[i];
      } else {
        for(int c = word.length(); c > 0; c--){
          System.out.print(word.charAt(c - 1));
        }
        System.out.print(" ");
        word = "";
      }
    }
    for(int c = word.length(); c > 0; c--){
      System.out.print(word.charAt(c - 1));
    }
  }
}
