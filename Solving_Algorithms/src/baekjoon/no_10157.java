package baekjoon;

import java.util.Scanner;

// 자리배정
public class no_10157 {
    static int R;
    static int C;
    static int K;
    static int[] rn = {0,1,0,-1}; // 우, 하, 좌, 상
    static int[] cn = {1,0,-1,0};
    static int[][] seat;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        K = sc.nextInt();
        seat = new int[R][C];
        if(R*C < K){
            System.out.println(0);
        } else {
            go(0,0);
        }
    }
    static void go(int r, int c){
        // 0우 1하 2좌 3상
        int d = 0;
        int num = 1;
        
        while(true){
        	seat[r][c] = num;
            if(num == K){
                break;
            } 
                num++;
                int rd = r + rn[d];
                int cd = c + cn[d];
                
                // 범위검사 후 해당 좌표가 0인지 확인
                if(rd>=0 && rd<R && cd>=0 && cd<C && seat[rd][cd]==0){
                    r = rd;
                    c = cd;
                } else{
                	// 조건에 맞지 않을 시, 방향 전환 후 이동
                    d = (d+1)%4;
                    r += rn[d];
                    c += cn[d];
                }                    
           }
        System.out.println((r+1)+" "+(c+1));
    }
}
