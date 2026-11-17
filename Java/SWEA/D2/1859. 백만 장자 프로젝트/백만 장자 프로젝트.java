import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine().trim());
		for(int i = 1; i <= t; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			int [] arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			int max = arr[n - 1];
			long sum = 0;
			for(int k = n - 2; k >= 0; k--) {
				if(arr[k] >= max) max = arr[k];
				else sum += max - arr[k];
			}
			
			sb.append("#").append(i).append(" ").append(sum).append("\n");
		}
		
		System.out.print(sb);
		
		
	}
}
