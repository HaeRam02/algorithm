
import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= 10; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			int result = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int [] apart = new int[n];
			
			for(int j = 0; j < n; j++) {
				if(j == 0 || j == 1 || j == n - 1 || j == n - 2) apart[j] = Integer.parseInt(st.nextToken());
				else apart[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int k = 2; k < n - 2; k++) {
				int left1 = apart[k - 2];
				int left2 = apart[k - 1];
				int mid = apart[k];
				int right1 = apart[k+1];
				int right2 = apart[k+2];
				
				result += getCnt(left1, left2, mid, right1, right2);
			}
			
			
			sb.append("#").append(i).append(" ").append(result).append("\n");
			
	      }
		
		System.out.print(sb);
	
	}
	
	static int getCnt(int left1, int left2, int mid, int right1, int right2) {
		int max1 = Math.max(left1, left2);
		int max2 = Math.max(right1, right2);
		
		int minus1 = mid - max1;
		int minus2 = mid - max2;
		
		if(minus1 <= 0 || minus2 <= 0) return 0;
		else {
			return Math.min(minus1, minus2);
		}
		
	}
	

	

}
