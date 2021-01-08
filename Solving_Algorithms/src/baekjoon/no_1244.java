package baekjoon;

import java.util.Scanner;

// 스위치 켜고 끄기
public class no_1244 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int swi = sc.nextInt();
        int[] s = new int[swi];
        for(int i=0; i<swi; i++){
            s[i] = sc.nextInt();
        }
        
        int students = sc.nextInt();
        for(int i=0; i<students; i++){
            int gender = sc.nextInt();
            int num = sc.nextInt();
            if(gender == 1){
                for(int j=num-1; j<s.length; j+=num){
                    if(s[j] == 0){
                        s[j] = 1;
                    } else if(s[j] == 1){
                        s[j] = 0;
                    }
                }
            } else if(gender == 2){
                int left = num-1;
                int right = num-1;
                while(true){
                    left--;
                    right++;
                    if(left<0 || right >= swi || s[left] != s[right]){
                        // 실패 -> 한단계 전으로 돌아가기
                        left++;
                        right--;
                        break;
                    }
                }
                for(int k = left; k<=right; k++){
                    if(s[k] == 0){
                        s[k] = 1;
                    } else if(s[k] == 1){
                        s[k] = 0;
                    }
                }
            }
        }
        int count = 0;
        for(int i=0; i<s.length; i++){
            if(count % 20 == 0 && count != 0){
                System.out.println();
            }
            System.out.print(s[i] + " ");
            count ++;
        }
    }
}
