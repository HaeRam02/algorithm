import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine().trim());
		for(int i = 1; i <= t; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			int sum = 0;
			int [][] maze = new int[n][n];
			
			for(int r = 0; r < n; r++) {
				String line = br.readLine().trim();
				for(int c = 0; c < n; c++) {
					maze[r][c] = line.charAt(c) - '0';
				}
			}
			
			int mid = n / 2;
			
			for(int r1 = 0; r1 <= mid; r1++) {
				int cnt = 0;
					if(r1 == mid) {
							for(int b = 0; b < n; b++) {
								sum += maze[r1][b];
							}
					} else {
						for(int r2 = r1; cnt < 1; cnt++, r2++) {
							for(int c2 = mid - r1; c2 <= mid + r1; c2++) {
								sum += maze[r2][c2];
								sum += maze[n - 1 - r2][c2];
							}
						}
					}
				
			}
			
			sb.append("#").append(i).append(" ").append(sum).append("\n");
		}
		
		System.out.print(sb);
		
		
	}
}
