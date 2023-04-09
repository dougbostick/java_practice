package ReverseString;
import java.util.Scanner;

public class ReverseString3 {
  String reverse(String s){
    if(s.length() == 0)
      return " ";
      return s.charAt(s.length() -1) + reverse(s.substring(0, s.length() - 1));
    }
    public static void main(String[] arg){
      ReverseString3 rev = new ReverseString3();
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str = sc.nextLine();
      sc.close();
      System.out.println("Reverse of a String: " + rev.reverse(str));

  }
}

// public class ReverseString 
//   static String reverse(String s){
//     if(s.length() == 0)
//       return " ";
//       return s.charAt(s.length() -1) + reverse(s.substring(0, s.length() - 1));
//     }
// }
// rev.reverse("wadu");
// ReverseString3.main("hek");

// class ReverseofaString {
// 	String reverse(String s){
// 	 if(s.length() == 0)
//      	 return " ";
//   	 return s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
// 	}
// 	public static void main(String[ ] arg){
// 	ReverseofaString rev=new ReverseofaString();
// 	Scanner sc=new Scanner(System.in);
// 	System.out.print("Enter a string : ");
// 	String  str=sc.nextLine();	
// 	System.out.println("Reverse of a String  :"+rev.reverse(str));
// 	}	
// }