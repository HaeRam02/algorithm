import java.util.*;
import java.io.*;



public class Solution {
	static int n;
	static int l;
	static int [] sc;
	static int [] cal;
	static int max;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine().trim());
        
        for(int t = 1; t <= T; t++) {
        	StringTokenizer st = new StringTokenizer(br.readLine().trim());
        	n = Integer.parseInt(st.nextToken());
        	l = Integer.parseInt(st.nextToken());
        	max = 0;
        	sc = new int[n];
        	cal = new int[n];
        	
        	for(int i = 0; i < n; i++) {
        		st = new StringTokenizer(br.readLine().trim());
        		
        		sc[i] = Integer.parseInt(st.nextToken());
        		cal[i] = Integer.parseInt(st.nextToken());
        	}
        	
        	dfs(0,0,0);
        	
        	sb.append("#").append(t).append(" ").append(max).append("\n");
        	
        }
        System.out.print(sb);
    }
    
    static void dfs(int idx, int sumSc, int sumCal) {
    	if(idx == n) {
    		if(sumCal <= l && sumSc >= max) max = sumSc;
    		return;
    	}
    	
    	dfs(idx+1, sumSc+sc[idx], sumCal + cal[idx]);
    	dfs(idx+1, sumSc, sumCal);
    }
 
    
}