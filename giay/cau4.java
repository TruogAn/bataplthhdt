package giay;

import java.util.Scanner;

public class cau4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,s,temp,arr[];
			Scanner ta = new Scanner(System.in);
			System.out.println("Nhap mang: ");
			n = ta.nextInt();
			arr = new int[n];
			i = ta.nextInt();
			temp = ta.nextInt();
		for (i=0; i<1; i++) {
			System.out.println("Nhap phan tu" +i+ ":");
			arr[i] = ta.nextInt();
		}
		for (i=0; i<1;i++) {
			for (s = i+1; s<n; s++) {
				if (arr[i] > arr[s]) {
					temp = arr[i];
					arr[i] = arr[s];
					arr[s] = temp;
				}
		}
	}
		ta.close();
	}}

