
import java.util.*;
import java.io.*;

public class Solution {
	static int cnt;
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	int t = Integer.parseInt(br.readLine().trim());
    	
    	for(int i = 1; i <= t; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine().trim());
    		int n = Integer.parseInt(st.nextToken());
    		int k = Integer.parseInt(st.nextToken());
    		cnt = 0;
    		int [] arr = new int[n];
    		
    		st = new StringTokenizer(br.readLine());
    		
    		
    		for(int j = 0; j < n; j++) {
    			arr[j] = Integer.parseInt(st.nextToken());
    		}
    		
    	
    		
    		dfs(arr,0,0,n,k);
    		
    		sb.append("#").append(i).append(" ").append(cnt).append("\n");
    	}
    	
    	System.out.print(sb);
    }



    
    static void dfs(int [] arr,int idx, int sum, int n, int k) {
    	
    	if(idx == n) {
    		if(sum == k) cnt++;
    		return;
    	}
    	
    	dfs(arr, idx+1, sum + arr[idx], n, k);
    	dfs(arr,idx+1, sum, n, k);
    }
}
	