
import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int len = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken());
			
			List<Integer>[] graph = new ArrayList[101];
			
			for(int j = 0; j < graph.length; j++) {
				graph[j] = new ArrayList();
			}
			
			st = new StringTokenizer(br.readLine());
			
			for(int a = 0; a < len / 2; a++) {
				int node = Integer.parseInt(st.nextToken());
				int num = Integer.parseInt(st.nextToken());
				
				graph[node].add(num);
			}
			sb.append("#").append(i).append(" ").append(findMax(graph, start)).append("\n");
			
	      }
		
		System.out.print(sb);
	
	}
	
	static int findMax(List<Integer>[] graph, int start) {
		boolean [] visited = new boolean[101];
		Queue<Integer> q = new ArrayDeque<>();
		int answer = 0;
		visited[start] = true;
		q.offer(start);
		
		while(!q.isEmpty()) {
			int size = q.size();
			int max = 0;
			for(int i = 0; i < size; i++) {
				int cur = q.poll();
				if(cur >= max) max = cur;
				
				for(int next : graph[cur]) {
					if(visited[next] == true) continue;
					visited[next] = true;
					q.offer(next);
				}
			}
			answer = max;
		}
		
		
		return answer;
	}
	

}
