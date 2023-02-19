package lab02;

import java.util.Scanner;

public class cau1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b;
		Scanner ta = new Scanner(System.in);
		System.out.println("Nhap a: ");
		a = ta.nextFloat();
		System.out.println("Nhap b: ");
		b = ta.nextFloat();
		if (a==0) {
			if (b==0) {
				System.out.println("Bai toan vo so nghiem");
			}
			else {
				System.out.println("Bai toan vo nghiem");
			}
		}
		else {
			System.out.print("Nghiem la: " +(-b/a));
		}
		ta.close();
	}

}
