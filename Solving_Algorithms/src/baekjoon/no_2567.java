package baekjoon;

import java.util.Scanner;

// 색종이
public class no_2567 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int paper[][] = new int[101][101];
        for(int i=0; i<num; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            for(int j=r; j<r+10; j++){
                for(int k=c; k<c+10; k++){
                    paper[j][k] = 1;
                }
            }
        }
        
        int[] dir = {0,1,0,-1};
        int[] pos = {1,0,-1,0};
        int count = 0;
        for(int i=0; i<101; i++){
            for(int j=0; j<101; j++){
                if(paper[i][j] == 1){
                    for(int k=0; k<4; k++){
                        int rd = i + dir[k];
                        int cd = j + pos[k];
                        if(rd>=0 && rd<101 && cd>=0 && cd<101 && paper[rd][cd]==0){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
