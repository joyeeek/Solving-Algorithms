package baekjoon;

import java.util.Scanner;

// ������
public class no_2563 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int paper[][] = new int[100][100];
        int num = sc.nextInt();
        int count = 0;
        
        for(int i=0; i<num; i++){
            int row = sc.nextInt();
            int col = sc.nextInt();
            
            for(int k=row; k<row+10; k++){
                for(int z=col; z<col+10; z++){
                	// ��ġ�� �κ� �����ϰ� count
                    if(paper[k][z] != 1){
                        paper[k][z] = 1;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
