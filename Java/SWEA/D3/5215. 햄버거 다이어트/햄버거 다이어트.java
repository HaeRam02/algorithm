import java.util.*;
import java.io.*;

public class Solution {
	static int max;
	static int [] arr1;
	static int [] arr2;
	static int n;
	static int l;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= t; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	 n = Integer.parseInt(st.nextToken());
        	 l = Integer.parseInt(st.nextToken());
        	max = 0;
        	arr1 = new int[n];
        	arr2 = new int[n];
        	
        	for(int j = 0; j < n; j++) {
        		st = new StringTokenizer(br.readLine());
        		
        		arr1[j] = Integer.parseInt(st.nextToken());
        		arr2[j] = Integer.parseInt(st.nextToken());
        	}
        	
        	dfs(0,0,0);
        	
        	sb.append("#").append(i).append(" ").append(max).append("\n");
        	
        }
        
        System.out.print(sb);
    }
    
    static void dfs(int idx, int score, int cal) {
    	
    	if(idx == n) {
    		if(cal <= l && score >= max) {
    			max = score;
    		}
    		return;
    	}
    	
    	dfs(idx+1, score + arr1[idx], cal + arr2[idx]);
    	dfs(idx+1, score, cal);
    	
    }
}