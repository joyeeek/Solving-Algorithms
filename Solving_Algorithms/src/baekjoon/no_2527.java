package baekjoon;

import java.util.Scanner;

// 직사각형
public class no_2527 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<4; i++){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
            int a4 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int b3 = sc.nextInt();
            int b4 = sc.nextInt();
            
            if((a1 > b3 || b1 > a3) || (a2 > b4 || b2 > a4)){
                System.out.println("d");
            } else if((a1 == b3 || a3 == b1)&&(a2 == b4 || a4 == b2)){
                System.out.println("c");
            } else if(a1 == b3 || a3 == b1 || a2 == b4 || a4 == b2){
                System.out.println("b");
            } else {
                System.out.println("a");
            }
        }
    }
}
