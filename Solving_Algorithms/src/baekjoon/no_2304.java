package baekjoon;

import java.util.Scanner;

// 창고 다각형
public class no_2304 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] pillar = new int[1001];
        int max_h = 0;
        int max_l = 0;
        for(int i=0; i<num; i++){
            int left = sc.nextInt();
            int height = sc.nextInt();
            pillar[left] = height;
            
            // 가장 높은 기둥
            if(max_h<height){
                max_h = height;
                max_l = left;
            }
        }
        int count = 0;
        // 왼쪽~가장 높은 기둥 너비
        int dis = 0;
        for(int i=0; i<=max_l; i++){
            if(pillar[i]>dis){
                dis = pillar[i];
            }
            count+=dis;
        }
        
        // 맨끝~가장 높은 기둥 너비
        dis = 0;
        for(int i=1000; i>max_l; i--){
            if(dis<pillar[i]){
                dis = pillar[i];
            }
            count+=dis;
        }
        System.out.println(count);
    }
}
