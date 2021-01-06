package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

// 수 이어가기
public class no_2635 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int max = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=num; i>=0; i--){
            list.clear();
            list.add(num);
            int k = i;
            
            while(k>=0){
                list.add(k);
                k = list.get(list.size()-2) - list.get(list.size()-1);
            }
            
            if(list.size()>max){
                max = list.size();
                result.clear();
                for(int j=0; j<list.size(); j++){
                    result.add(list.get(j));
                }
            }           
        }      
        System.out.println(result.size());
        for(int i=0; i<result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
    }
}
