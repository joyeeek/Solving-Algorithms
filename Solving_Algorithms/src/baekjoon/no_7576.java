package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 토마토
public class no_7576 {
    static int C;
    static int R;
    static int[][] tomato;
    static Queue<Dot> queue = new LinkedList<Dot>();
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,-1,0,1};
    
    static class Dot{
        int x;
        int y;
        int day;
        
        public Dot(int x, int y, int day){
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        R = sc.nextInt();
        tomato = new int[R][C];
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                tomato[i][j] = sc.nextInt();
                if(tomato[i][j] == 1){
                    queue.add(new Dot(j,i,0));
                }
            }
        }
        bfs();
    }
    
    static void bfs(){
        int day = 0;
        while(!queue.isEmpty()){
            Dot dot = queue.poll();
            day = dot.day;
            for(int i=0; i<4; i++){
                int nextX = dot.x + dx[i];
                int nextY = dot.y + dy[i];
                if(nextX < 0 || nextX >= C || nextY < 0 || nextY >= R){
                    continue;
                }
                if(tomato[nextY][nextX] == -1 || tomato[nextY][nextX] == 1){
                    continue;
                }
                tomato[nextY][nextX] = 1;
                queue.add(new Dot(nextX,nextY,day+1));
            }
        }
        
        if(check()){
            System.out.println(day);
        } else {
            System.out.println(-1);
        }
    }
    
    static boolean check(){
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(tomato[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
