import java.util.*;
import java.io.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine().trim());
        
        for(int t = 1; t <= T; t++) {
        	StringTokenizer st = new StringTokenizer(br.readLine().trim());
        	int n = Integer.parseInt(st.nextToken());
        	int m = Integer.parseInt(st.nextToken());
        	
        	int [][] arr = new int[n][n];
        	
        	for(int i = 0; i < n; i++) {
        		st = new StringTokenizer(br.readLine());
        		for(int j = 0; j < n; j++) {
        			arr[i][j] = Integer.parseInt(st.nextToken());
        		}
        	}
        	
        	int max = 0;
        	for(int r = 0; r <= n - m; r++) {
        		for(int c = 0; c <= n - m; c++) {
    				int num = 0;
        			for(int r1 = r; r1 < r + m; r1++) {
        				for(int c1 = c; c1 < c + m; c1++) {
        					num += arr[r1][c1];
        				}
        			}
        			if(num >= max) max = num;
        		}
        	}
        	
        	sb.append("#").append(t).append(" ").append(max).append("\n");
       
        }
        System.out.print(sb);
       }
    
 
    
}