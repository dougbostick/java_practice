package ReverseString;
import java.util.Scanner;

public class ReverseString2 {
    public static void main(String[] arg){
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = scan.nextLine();
        scan.close();
        char[] ch = str.toCharArray();
        System.out.println("Reverse of a string is: ");
        int j = ch.length;
        for(int i = j; i > 0; i--){
            System.out.print(ch[i-1]);
        }
    }
}
