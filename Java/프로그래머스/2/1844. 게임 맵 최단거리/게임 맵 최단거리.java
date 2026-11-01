import java.util.*;
class Solution {
    static int [] dr = {-1,1,0,0};
    static int [] dc = {0,0,-1,1};
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        answer = bfs(maps,n,m);
        return answer;
    }
    
    public int bfs(int [][] maps,int n,int m){
        boolean [][] visited = new boolean[n][m];
        
        int r = 0;
        int c = 0;
        int cnt = 0;
        
    
        
        Queue<int []> queue = new ArrayDeque<>();
        visited[r][c] = true;
        queue.offer(new int[]{r,c,cnt});
        while(!queue.isEmpty()){
            int [] result = queue.poll();
            int nr = result[0];
            int nc = result[1];
            int newCnt = result[2];
            if(nr == n - 1 && nc == m - 1){
                newCnt++;
                return newCnt;
            }
            newCnt++;
            for(int i = 0; i < 4; i++){
                int ndr = nr + dr[i];
                int ndc = nc + dc[i];
                
                if(ndr < 0 || ndr >= n || ndc < 0 || ndc >= m) continue;
                if(maps[ndr][ndc] == 0) continue;
                if(visited[ndr][ndc] == true) continue;
                visited[ndr][ndc] = true;

                queue.offer(new int[]{ndr,ndc,newCnt});
            }
        }
        
        return -1;
        
    }
}