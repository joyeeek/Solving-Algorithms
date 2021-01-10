package baekjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

// 단지번호붙이기
public class no_2667 {
    static int N;
    static int[][] apart;
    static int[] dir = {0,1,0,-1};
    static int[] pos = {1,0,-1,0};
    static int count;    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        apart = new int[N][N];
        for(int i=0; i<N; i++){
            String num = sc.next();
            for(int j=0; j<N; j++){
                apart[i][j] = num.charAt(j)-'0';
            }
        }
        
        /**
         * total은 총 단지수
         * count는 각 단지의 개수
         * 오름차순으로 출력하기 위해 PriorityQueue에 저장함
         */
        int total = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
         
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(apart[i][j] == 1){
                    count = 0;
                    total++;
                    dfs(i,j);
                    queue.add(count);
                }
            }
        }
        System.out.println(total);
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
    
    static void dfs(int r, int c){
         apart[r][c] = 0;
         count++;
            
         for(int i=0; i<4; i++){
             int rd = r + dir[i];
             int cd = c + pos[i];
                
             if(rd>=0 && rd<N && cd>=0 && cd<N){
                 if(apart[rd][cd] == 1){
                     dfs(rd,cd);
                 }
             }
         }       
    }
}
