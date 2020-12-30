package baekjoon;

import java.util.Scanner;

// 경비원 ★
public class no_2564 {
    static int c; 
    static int r; 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        c = sc.nextInt();
        r = sc.nextInt();
        int circumference = (c+r)*2; // 둘레
        int store = sc.nextInt(); // 상점의 갯수
        int[] dist = new int[store+1]; // 동근이 거리 + 상점의 거리
        
        for(int i=0; i<dist.length; i++){
            int direction = sc.nextInt();
            int pos = sc.nextInt();
            
            dist[i] = dist_calc(direction, pos);
        }
        int start = dist[store]; // 동근이 거리 = 시작점
        
        int sum = 0;
        for(int i=0; i<dist.length-1; i++){
            int clock = Math.abs(start - dist[i]);
            sum += Math.min(clock, circumference - clock);
        }
        System.out.println(sum);
    }
    
    static int dist_calc(int direction, int pos){
        if(direction == 1){
            return pos;
        } else if(direction == 2){
            return c + r + c-pos;
        } else if(direction == 3){
            return c + r + c + r-pos;
        } else{
            return c + pos;
        } 
    }
}
