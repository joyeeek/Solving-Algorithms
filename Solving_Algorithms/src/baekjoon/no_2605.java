package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

// 줄 세우기
public class no_2605 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        
        for(int i=1; i<arr.length; i++){
            list.add(arr[i],i+1);
        }
        
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
