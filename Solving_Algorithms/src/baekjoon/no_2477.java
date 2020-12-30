package baekjoon;

import java.util.Scanner;

// Âü¿Ü¹ç
public class no_2477 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int[] arr = new int[6];
        for(int i=0; i<6; i++){
            int dir = sc.nextInt();
            arr[i] = sc.nextInt();
        }
        
        int big = 0;
        int count = 0;
        for(int i=0; i<6; i++){
            int temp = arr[i] * arr[(i+1)%6];
            if(temp > big){
                big = temp;
                count = i;
            }
        }
        
        int small = 0;
        small = arr[(count+3)%6] * arr[(count+4)%6];
        
        System.out.println((big-small)*num);
    }
}