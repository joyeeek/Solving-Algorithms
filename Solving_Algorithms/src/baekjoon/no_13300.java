package baekjoon;

import java.util.Scanner;

// 방 배정
public class no_13300 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int stu = sc.nextInt();
        int max = sc.nextInt();
        int[] girl = new int[7];
        int[] boy = new int[7];
        int count = 0;
        
        for(int i=0; i<stu; i++){
            int gender = sc.nextInt();
            int grade = sc.nextInt();
            if(gender == 0){
                // 여자
                girl[grade]++;
            } else if(gender == 1){
                // 남자
                boy[grade]++;
            }
        }
        
        for(int i=1; i<girl.length; i++){
            int gResult = (girl[i] / max);
            if(girl[i] % max >0) {
            	gResult++;
            }            
            int bResult = (boy[i] / max);
            if(boy[i] % max >0) {
            	bResult++;
            }           
            count += gResult + bResult;
        }
        System.out.println(count);
    }
}
