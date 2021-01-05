package baekjoon;

import java.util.Scanner;

// 색종이
public class no_10163 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int color = sc.nextInt();
        int[][] paper = new int[102][102];
        int[] result = new int[color];
        
        int[] r1 = new int[color];
        int[] c1 = new int[color];
        int[] r2 = new int[color];
        int[] c2 = new int[color];
        
        for(int i=0; i<color; i++){
            r1[i] = sc.nextInt();
            c1[i] = sc.nextInt();
            r2[i] = sc.nextInt();
            c2[i] = sc.nextInt();
        }
        
        for(int i=color-1; i>=0; i--){
            for(int j=r1[i]; j<r1[i]+r2[i]; j++){
                for(int k=c1[i]; k<c1[i]+c2[i]; k++){
                    if(paper[j][k] != 1){
                        paper[j][k] = 1;
                        result[i]++;
                    }
                }
            }
        }
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
