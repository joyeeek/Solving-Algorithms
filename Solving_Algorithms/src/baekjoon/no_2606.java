package baekjoon;

import java.util.Scanner;

// 바이러스
public class no_2606 {
    static int com;
    static int link;
    static int count;
    static int[][] map;
    static boolean[] visit;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        com = sc.nextInt();
        link = sc.nextInt();
        map = new int[com+1][com+1];
        visit = new boolean[com+1];
        
        for(int i=0; i<link; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            map[n1][n2] = 1;
            map[n2][n1] = 1;
        }
        System.out.println(dfs(1));
    }
    static int dfs(int n){
        // 탐색 시 true
        visit[n] = true; 
        for(int i=1; i<=com; i++){
            if(map[n][i]==1 && visit[i] == false){
                count++;
                dfs(i);
            }
        }
        return count;
    }
}
