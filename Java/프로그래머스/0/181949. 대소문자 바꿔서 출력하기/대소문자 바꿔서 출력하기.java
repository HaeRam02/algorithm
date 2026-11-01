import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String output = "";
        int tmp;
        for(int i=0; i<a.length();i++){
            tmp = (int)a.charAt(i);
            if((65<=tmp)&&(tmp<=90)){
                output+=(char)(tmp+32);
            }else if((97<=tmp)&&(tmp<=122)){
                output+=(char)(tmp-32);
            }
        }
        System.out.println(output);
    }
}