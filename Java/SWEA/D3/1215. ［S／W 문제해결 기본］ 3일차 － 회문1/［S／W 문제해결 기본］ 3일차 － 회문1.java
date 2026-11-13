
import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= 10; i++) {
			char [][] arr = new char[8][8];
			int len = Integer.parseInt(br.readLine().trim());
			int cnt = 0;
			
			for(int r = 0; r < 8; r++) {
				String line = br.readLine();
				for(int c = 0; c < 8; c++) {
					arr[r][c] = line.charAt(c);
				}
			}
			
			for(int r1 = 0; r1 < 8; r1++) {
				for(int c1 = 0; c1 <= 8 - len; c1++) {
					String line1 = "";
					String line2 = "";
					for(int c2 = c1; c2 < len + c1; c2++) {
						line1 += arr[r1][c2];
						line2 += arr[c2][r1];
					}
					
					if(isPalindrome(line1)) cnt++;
					if(isPalindrome(line2)) cnt++;
				}
			}
			
			sb.append("#").append(i).append(" ").append(cnt).append("\n");
		}	
		
		System.out.print(sb);
	}
	
	static boolean isPalindrome(String line) {
		for(int i = 0; i < line.length() / 2; i++) {
			if(line.charAt(i) != line.charAt(line.length() - i - 1)) return false;
			
		}
		return true;
		
	}
}
