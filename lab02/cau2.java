package lab02;

import java.util.Scanner;

public class cau2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b, c, delta, x1, x2;
		Scanner ta = new Scanner(System.in);
		System.out.println("Nhap a: ");
		a = ta.nextFloat();
		System.out.println("Nhap b: ");
		b = ta.nextFloat();
		System.out.println("Nhap c: ");
		c = ta.nextFloat();
		if (a==0) {
			if (b==0) {
				System.out.println("Bai toan vo so nghiem");
			}
			else {
				System.out.println("Bia toan vo nghiem");
			}
			System.out.print("Bai toan co phuong trinh bac nhat x= " +(-c/b));
		}
		else {
			delta = b*b - 4*a*c;
			if (delta <0) {
				System.out.print("Vo nghiem x= "+ delta);
			}
			else {
				if (delta==0) {
					System.out.print("Co nghiem kep x="+(-b/2*a));
				}
				else {
					if (delta > 0) {
						x1 = (float) ((-b+Math.sqrt(delta))/(2*a));
						x2 = (float) ((-b-Math.sqrt(delta))/(2*a));
						System.out.print("Phuong trinh co hai nghiem phan biet =>"+ "x1="+x1+"x2="+x2);
					}
				}
			}
		}
ta.close();
	}

}
