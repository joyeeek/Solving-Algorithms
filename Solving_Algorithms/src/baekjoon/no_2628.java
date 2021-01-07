package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

// 종이 자르기
public class no_2628 {
    static int C;
    static int R;
    static int N;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        R = sc.nextInt();
        N = sc.nextInt();
        
        ArrayList<Integer> row = new ArrayList<Integer>();
        ArrayList<Integer> col = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            int dir = sc.nextInt();
            int pos = sc.nextInt();
            if(dir == 0){
                row.add(pos);
            } else if(dir == 1){
                col.add(pos);
            }
        }
        
        for(int i=0; i<row.size()-1; i++){
            for(int j=i+1; j<row.size(); j++){
                if(row.get(i)>row.get(j)){
                    int temp = row.get(i);
                    row.set(i,row.get(j));
                    row.set(j,temp);
                }
            }
        }
        
        for(int i=0; i<col.size()-1; i++){
            for(int j=i+1; j<col.size(); j++){
                if(col.get(i)>col.get(j)){
                    int temp = col.get(i);
                    col.set(i,col.get(j));
                    col.set(j,temp);
                }
            }
        }
        System.out.println(cut(row,R)*cut(col,C));
    }
    static int cut(ArrayList<Integer> list, int end){
        int start = 0;
        int max = 0;
        for(int i=0; i<list.size(); i++){
            int temp = list.get(i) - start;
            if(temp > max){
                max = temp;
            }
            start = list.get(i);
        }
        return Math.max(max,end-start);
    }
}
