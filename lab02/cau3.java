package lab02;

import java.util.Scanner;

public class cau3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sodien, t;
		Scanner ta = new Scanner(System.in);
		System.out.println("Nhap so dien su dung trong mot thang: ");
		sodien = ta.nextInt();
		if (sodien < 50) {
			t = sodien*1000;
			System.out.println("Tien dien trong thang la: "+ t);
		}
		else {
			if (sodien > 50) {
				t = 50*1000 + (sodien - 50)*1200;
				System.out.println("Tien dien thang nay la: "+ t);
			}
		}
		ta.close();
	}

}
