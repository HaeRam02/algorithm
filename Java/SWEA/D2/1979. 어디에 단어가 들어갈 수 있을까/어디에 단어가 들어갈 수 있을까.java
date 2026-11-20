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
        	int k = Integer.parseInt(st.nextToken());
        	int result = 0;
        	int [][] arr = new int[n][n];
        	
        	for(int i = 0; i < n; i++) {
        		st = new StringTokenizer(br.readLine().trim());
        		for(int j = 0; j < n; j++) {
        			arr[i][j] = Integer.parseInt(st.nextToken());
        		}
        	}
        	
        	for(int r = 0; r < n; r++) {
        		int rCnt = 0;
        		int cCnt = 0;
        		for(int c = 0; c < n; c++) {
        			if(arr[r][c] == 1) {
        				rCnt++;
        				if(rCnt == k && c == n - 1 || rCnt == k && arr[r][c+1] == 0) {
        					result++;
        				}
        			}
        			else {
        				rCnt = 0;
        			}
        			
        			if(arr[c][r] == 1){
        				cCnt++;
        				if(cCnt == k && c == n -1 || cCnt == k && arr[c+1][r] == 0) result++;
        			}
        			else cCnt = 0;
        		}
        	}
        	sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        
        System.out.print(sb);
   
    }
    
   
 
    
}