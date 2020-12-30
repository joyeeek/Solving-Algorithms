package baekjoon;

import java.util.Scanner;

// 직사각형 네개의 합집합의 면적 구하기
public class no_2669 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[100][100];
        int count = 0;
        
        for(int i=0; i<4; i++){
            int lx = sc.nextInt();
            int ly = sc.nextInt();
            int rx = sc.nextInt();
            int ry = sc.nextInt();
            
            for(int j=lx; j<rx; j++){
                for(int k=ly; k<ry; k++){
                    if(arr[j][k] != 1){
                        arr[j][k] = 1;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
