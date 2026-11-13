import java.io.*;
import java.util.*;

public class Solution{


    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        for(int i = 1; i <= 10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int t = Integer.parseInt(st.nextToken());
            int len = Integer.parseInt(st.nextToken());

            List<Integer>[] graph = new ArrayList[100];
            for(int j = 0; j < 100; j++) graph[j] = new ArrayList<>();

            st = new StringTokenizer(br.readLine());

            for(int a = 0; a < len; a++){
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                graph[from].add(to);
            }


            sb.append("#").append(t).append(" ").append(bfs(graph)).append("\n");
        }
        System.out.print(sb);
    }

    static int bfs(List<Integer>[] graph){
        boolean [] visited = new boolean[100];
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(0);
        visited[0] = true;
        while (!q.isEmpty()){
            int cur = q.poll();
            if(cur == 99) return 1;

            for(int next : graph[cur]){
                if(visited[next] == true) continue;
                visited[next] = true;
                q.offer(next);
            }
        }

        return 0;
    }



}