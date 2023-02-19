package giay;

import java.util.Scanner;

public class cau3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, gt;
		Scanner ta = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen n: ");
		n = ta.nextInt();
		gt = 1;
		for (int i=1; i <= n; i++) {
			gt *= i;
		}
		System.out.println("Giai thua cua +n+ la: " +gt);
		ta.close();
	}
}
