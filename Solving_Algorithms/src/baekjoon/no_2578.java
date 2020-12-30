package baekjoon;

import java.util.Scanner;

// 빙고
public class no_2578 {
    static int N = 5;
    static int[][] bingo;
    static int[][] pos;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        bingo = new int[N][N];
        pos = new int[26][2];
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                bingo[i][j] = sc.nextInt();
                
                pos[bingo[i][j]][0] = i;
                pos[bingo[i][j]][1] = j;
            }
        }
        
        int count = 0;
        all:for(int i=0; i<25; i++){
            int call = sc.nextInt();
            
            int row = pos[call][0];
            int col = pos[call][1];
            
            bingo[row][col] = 0;
            count++;
            
            if(check()){
                break all;
            }
        }
        System.out.println(count);                
    }
    
    
    static boolean check(){
        int cnt = 0;
        for(int i=0; i<N; i++){
            int row_cnt = 0;
            int col_cnt = 0;
            for(int j=0; j<N; j++){
                if(bingo[i][j] == 0){
                    row_cnt++;
                }
                if(bingo[j][i] == 0){
                    col_cnt++;
                }
            }
            if(row_cnt == 5){
                cnt++;
            }
            if(col_cnt == 5){
                cnt++;
            }
        }
        
        int left_cnt = 0;
        int right_cnt = 0;
        for(int i=0; i<N; i++){
            if(bingo[i][i] == 0){
                left_cnt++;
            }
            if(bingo[i][N-i-1] == 0){
                right_cnt++;
            }
        }
        if(left_cnt == 5){
            cnt++;
        }
        if(right_cnt == 5){
            cnt++;
        }
        if(cnt >= 3){
            return true;
        } else {
            return false;
        }
    }
}
