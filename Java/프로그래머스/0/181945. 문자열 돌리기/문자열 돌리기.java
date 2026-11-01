import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char [] b = new char[a.length()];
        for(int i=0; i<a.length();i++){
            b[i] = a.charAt(i);
            System.out.println(b[i]);
        }
    }
}