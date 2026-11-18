import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 10; i++) {
			boolean loop = true;
			int t = Integer.parseInt(br.readLine().trim());
			
			Queue<Integer> q = new ArrayDeque<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 8; j++) {
				q.offer(Integer.parseInt(st.nextToken()));
			}
				
			while(loop) {
				int cnt = 1;
				while(cnt <= 5) {
					int num = q.poll() - cnt;
					if(num <= 0) {
						num = 0;
						q.offer(num);
						loop = false;
						cnt = 6;
					} else {
						q.offer(num);
						cnt++;
					}
				}
			}
			sb.append("#").append(t).append(" ");
			while(!q.isEmpty()) {
				sb.append(q.poll()).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
		
		
	}
}
