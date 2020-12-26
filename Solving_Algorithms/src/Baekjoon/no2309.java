package Baekjoon;

import java.util.Scanner;

// ¿œ∞ˆ ≥≠¿Ô¿Ã
public class no2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[9];
        int result = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            result += arr[i];
        }
        
        //ø¿∏ß¬˜º¯
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        all:for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if((result - arr[i] - arr[j]) == 100){
                    arr[i] = 0;
                    arr[j] = 0;
                    break all;
                }
            }
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                System.out.println(arr[i]);
            }
        }
	}
}
