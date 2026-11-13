
import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			int len = Integer.parseInt(st.nextToken());
			
			List<Integer>[] arr = new ArrayList[100];
			for(int j = 0; j < 100; j++) {arr[j] = new ArrayList<>();}
			
			st = new StringTokenizer(br.readLine());
			
			for(int a = 0; a < len; a++) {
				int idx = Integer.parseInt(st.nextToken());
				int neighbor = Integer.parseInt(st.nextToken());
				arr[idx].add(neighbor);	
			}
			
			sb.append("#").append(i).append(" ").append(bfs(arr)).append("\n");
		}
		System.out.println(sb);
	
	}
	
	static int bfs(List<Integer>[] arr) {
		boolean [] visited = new boolean[100];
		Queue<Integer> queue = new ArrayDeque<>();
		
		queue.offer(0);
		visited[0] = true;
		while(!queue.isEmpty()) {
			int num = queue.poll();
			if(num == 99) return 1;
			
			for(int next : arr[num]) {
				if(visited[next] == true) continue;
				visited[next] = true;
				queue.offer(next);
			}
			
		}
		return 0;
		
	}
	

}
