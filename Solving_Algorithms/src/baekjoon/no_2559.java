package baekjoon;

import java.util.Scanner;

// 수열
public class no_2559 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int day = sc.nextInt();
        int num = sc.nextInt();
        int[] result = new int[day];
        int count = -100 * day;
        for(int i=0; i<day; i++){
            result[i] = sc.nextInt();
        }
        
        for(int i=0; i<=day-num; i++){
            int sum = 0;
            for(int j=i; j<i+num; j++){ 
                sum+=result[j];
            }
            if(sum>count){
                count = sum;
            }
        }
        System.out.println(count);
    }
}
