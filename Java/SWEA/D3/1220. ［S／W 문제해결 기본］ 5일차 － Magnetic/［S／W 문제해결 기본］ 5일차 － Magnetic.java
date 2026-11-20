import java.util.*;
import java.io.*;



public class Solution {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        
        for(int t = 1; t <= 10; t++) {
        	int n = Integer.parseInt(br.readLine().trim());
        	int result = 0;
        	int [][] arr = new int[n][n];
        	
        	for(int i = 0; i < n; i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine().trim());
        		for(int j = 0; j < n; j++) {
        			arr[i][j] = Integer.parseInt(st.nextToken());
        		}
        	}
        	for(int c = 0; c < n; c++) {
        		for(int r = 0; r < n; r++) {
        			if(arr[r][c] == 1 && r + 1 == n) arr[r][c] = 0;
        			if(arr[r][c] == 1 && arr[r+1][c] == 0) {
        				arr[r][c] = 0;
        				arr[r+1][c] = 1;
        			}
        			
        			if(arr[n - r - 1][c] == 2 && n - r - 2 < 0) arr[n-r-1][c] = 0;
        			if(arr[n-r-1][c] == 2 && n - r - 2 >= 0 && arr[n-r-2][c] == 0) {
        				arr[n-r-1][c] = 0;
        				arr[n-r-2][c] = 2;
        			}
        		}
        	}
        	
        	for(int c1 = 0; c1 < n; c1++) {
        		for(int r1 = 0; r1 < n; r1++) {
        			int nextIdx = r1 + 1;
        			if(r1 + 1 == n) break;
        			if(arr[r1][c1] == 1 && arr[r1+1][c1] == 2) {
        				result++;
        			}
        			
        		}
        	}
        	
        	sb.append("#").append(t).append(" ").append(result).append("\n");
        	}
        System.out.print(sb);
        }
         
    
    
   
 
    
}