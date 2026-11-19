import java.util.*;
import java.io.*;



public class Solution {
	static List<Integer> [] arr;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine().trim());
        
        for(int t = 1; t <= T; t++) {
        	int ans = 1;
        	int [][] arr = new int[9][9];
        	
        	for(int i = 0; i < 9; i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine().trim());
        		for(int j = 0; j < 9; j++) {
        			arr[i][j] = Integer.parseInt(st.nextToken());
        		}
        	}
        	
        	for(int r = 0; r < 9; r++) {
        		boolean [] arr1 = new boolean[10];
        		boolean [] arr2 = new boolean[10];
        		for(int c = 0; c < 9; c++) {
        			if(arr1[arr[r][c]] == true || arr2[arr[c][r]] == true) {ans = 0; break;}
        			else {arr1[arr[r][c]] = true; arr2[arr[c][r]] = true;}
        		}
        	}
        	
        	if(ans == 0) {
        		sb.append("#").append(t).append(" ").append(ans).append("\n");
        	} else {
        		for(int r1 = 0; r1 < 9; r1 +=3) {
        			for(int c1 = 0; c1 < 9; c1 += 3) {
        				boolean [] arr3 = new boolean[10];
        				for(int r2 = r1; r2 < r1 + 3; r2++) {
        					for(int c2 = c1; c2 < c1 + 3; c2++) {
        						if(arr3[arr[r2][c2]] == true) ans = 0;
        						else arr3[arr[r2][c2]] = true;
        					}
        				}
        			}
        		}
        		sb.append("#").append(t).append(" ").append(ans).append("\n");
        	}
        }
        
        System.out.print(sb);
   
    }
    
   
 
    
}