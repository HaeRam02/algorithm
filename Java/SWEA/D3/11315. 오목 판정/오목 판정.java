import java.util.*;
import java.io.*;



public class Solution {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine().trim());
        
        for(int t = 1; t <= T; t++) {
        	int n = Integer.parseInt(br.readLine().trim());
        	int [][] arr = new int[n][n];
        	
        	for(int i = 0; i < n; i++) {
        		String line = br.readLine();
        		for(int j = 0; j < n; j++) {
        			if(line.charAt(j) == '.') arr[i][j] = 0;
        			else arr[i][j] = 1;
        		}
        	}
        	
        	boolean result = false;
        	
        	for(int r = 0; r < n; r++) {
        		for(int c = 0; c < n; c++) {
        			int cnt = 0;
        			for(int k = 0; k <= 4; k++) {
        				int nr = r;
        				int nc = c + k;
        				if(nr < 0 || nr >= n || nc < 0 || nc >= n || arr[nr][nc] == 0 ) break;
        				else cnt++;
        			}
        			if(cnt == 5) result = true;
        		}
        	}
        	
        	for(int c = 0; c < n; c++) {
        		for(int r = 0; r < n; r++) {
        			int cnt = 0;
        			for(int k = 0; k <= 4; k++) {
        				int nr = r+k;
        				int nc = c;
        				if(nr < 0 || nr >= n || nc < 0 || nc >= n || arr[nr][nc] == 0 ) break;
        				else cnt++;
        			}
        			if(cnt == 5) result = true;
        		}
        	}
        	
         	for(int r = 0; r < n; r++) {
        		for(int c = 0; c < n; c++) {
        			int cnt = 0;
        			for(int k = 0; k <= 4; k++) {
        				int nr = r + k;
        				int nc = c + k;
        				if(nr < 0 || nr >= n || nc < 0 || nc >= n || arr[nr][nc] == 0 ) break;
        				else cnt++;
        			}
        			if(cnt == 5) result = true;
        		}
        	}
        	
        	for(int r = 0; r < n; r++) {
        		for(int c = n - 1; c >=0; c--) {
        			int cnt = 0;
        			for(int k = 0; k <= 4; k++) {
        				int nr = r + k;
        				int nc = c - k;
        				if(nr < 0 || nr >= n || nc < 0 || nc >= n || arr[nr][nc] == 0 ) break;
        				else cnt++;
        			}
        			if(cnt == 5) result = true;
        		}
        	}
        	
        	if(result == true) {
        		sb.append("#").append(t).append(" ").append("YES").append("\n");
        	} else {
        		sb.append("#").append(t).append(" ").append("NO").append("\n");
        	}
        	
        }
        
        System.out.print(sb);
   
    }
    
   
 
    
}