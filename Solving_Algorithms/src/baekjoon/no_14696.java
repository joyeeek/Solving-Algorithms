package baekjoon;

import java.util.Scanner;

// 딱지놀이
public class no_14696 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int round = sc.nextInt();
        for(int i=0; i<round; i++){
            int n1 = sc.nextInt();
            int[] arr1 = new int[5];
            for(int j=0; j<n1; j++){
                arr1[sc.nextInt()]++;
            }
            
            int n2 = sc.nextInt();
            int[] arr2 = new int[5];
            for(int k=0; k<n2; k++){
                arr2[sc.nextInt()]++;
            }
            
            boolean check = false;
            for(int z=4; z>0; z--){
                if(arr1[z]>arr2[z]){
                    System.out.println("A");
                    check = true;
                    break;
                } else if(arr1[z]<arr2[z]){
                    System.out.println("B");
                    check = true;
                    break;
                } 
            }
            
            if(!check) {
            	System.out.println("D");
            }
        }
    }
}
