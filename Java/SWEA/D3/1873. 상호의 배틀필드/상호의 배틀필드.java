import java.util.*;
import java.io.*;



public class Solution {
	static int [] dr = {-1, 1, 0,0};
	static int [] dc = {0,0,-1,1};
	static char [] dir = {'^','v','<','>'};

	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= t; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine().trim());
        	int h = Integer.parseInt(st.nextToken());
        	int w = Integer.parseInt(st.nextToken());
        	
        	char [][] map = new char[h][w];
        	
        	int r = 0;
        	int c = 0;
        	int d = 0;
        	
        	for(int c1 = 0; c1 < h; c1++) map[c1] = br.readLine().trim().toCharArray();
        	
        	for(int a = 0; a < h; a++) {
        		for(int b = 0; b < w; b++) {
        			for(int d1 = 0; d1 < 4; d1++) {
        				if(map[a][b] == dir[d1]) {r = a; c = b; d = d1;}
        			}
        		}
        	}
        	int n = Integer.parseInt(br.readLine().trim());
        	String cmds = br.readLine().trim();
        	
        	
        	for(int i1 = 0; i1 < n; i1++) {
        		char cmd = cmds.charAt(i1);
        		if(cmd == 'S') {
        			int nr = r + dr[d];
        			int nc = c + dc[d];
        			while(nr >= 0 && nr < h && nc >= 0 && nc < w) {
        				if(map[nr][nc] == '*') {map[nr][nc] = '.'; break;}
        				if(map[nr][nc] == '#') break;
        				nr = nr + dr[d]; nc = nc + dc[d];
        			}
        		} else {
        			d = "UDLR".indexOf(cmd);
        			int nr = r + dr[d]; int nc = c + dc[d];
        			if(nr >= 0 && nr < h && nc >= 0 && nc < w && map[nr][nc] == '.') {
        				map[r][c] = '.';
        				map[nr][nc] = dir[d];
        				r = nr; c= nc; 
        			} else {
        				map[r][c] = dir[d];
        			}
        		}
        	}
        	
			sb.append("#").append(i).append(" ");	
        	
        	for(int a1 = 0; a1 < h; a1++) {
        		for(int b1 = 0; b1 < w; b1++) {
        			sb.append(map[a1][b1]);	
        		}
        		sb.append("\n");
        	}
        	
        }
        System.out.print(sb);
    }
    
 
    
}