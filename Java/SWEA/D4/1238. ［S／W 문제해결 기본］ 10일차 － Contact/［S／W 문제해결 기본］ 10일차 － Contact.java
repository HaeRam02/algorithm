import java.util.*;
import java.io.*;



public class Solution {
	static List<Integer> [] arr;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        
        for(int t = 1; t <= 10; t++) {
        arr = new ArrayList[101];
        
        for(int i = 1; i < 101; i++) {
        	arr[i] = new ArrayList<>();
        }
        
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int n = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine().trim());
        for(int j = 0; j < n / 2; j++) {
        	int idx = Integer.parseInt(st.nextToken());
        	int num = Integer.parseInt(st.nextToken());
        	
        	arr[idx].add(num);
        }
        	
        sb.append("#").append(t).append(" ").append(bfs(start)).append("\n");
        
        }
        System.out.print(sb);
    }
    
    static int bfs(int start) {
    	Queue<Integer> q = new ArrayDeque<>();
    	boolean [] called = new boolean[101];
    	int max;
    	int result = 0;
    	called[start] = true;
    	q.offer(start);
    	
    	while(!q.isEmpty()) {
    		int size = q.size();
    		max = 0;
    		for(int i = 0; i < size; i++) {
    			int cur = q.poll();
    			if(cur >= max) max = cur;
    			for(int next : arr[cur]) {
    				if(called[next] == true) continue;
    				called[next] = true;
    				q.offer(next);
    			}
    		}
    		
    		result = max;
    	}
    	
    	return result;
    }
 
    
}