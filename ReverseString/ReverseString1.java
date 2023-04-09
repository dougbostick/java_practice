package ReverseString;
import java.util.Scanner;

class ReverseString1 {
    public static void main(String[] arg){
        // ReverseString1 rev = new ReverseString1(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Reverse of a String is: " + ReverseString1.reverse(str));
    }
    static String reverse(String s){
        String rev = "";
        for(int j = s.length(); j > 0; j--){
            rev = rev + (s.charAt(j-1));
        }
        return rev;
    }
}

/*
1. old code had static on line 13
2. String in front of reverse implies what? The arg already has String s
static means you can only call a method on the class itself (the template), it won't work on instances
*/
