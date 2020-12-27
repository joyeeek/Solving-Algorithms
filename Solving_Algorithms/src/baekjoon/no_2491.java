package baekjoon;

import java.util.Scanner;

// ����
public class no_2491 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i=0; i<num; i++){
			arr[i] = sc.nextInt();
		}

		int count = 1;
		int result = 1;

		// �۾����� ����
		for (int i=1; i<arr.length; i++){
			if (arr[i] <= arr[i-1]){
				count++;
			} else {
				count = 1;
			}

			if (result < count){
				result = count;
			}
		}

		// Ŀ���� ����
		count = 1;
		for (int i=1; i<arr.length; i++){
			if (arr[i] >= arr[i-1]){
				count++;
			} else {
				count = 1;
			}

			if (result < count){
				result = count;
			}
		}
		System.out.println(result);
	}
}
