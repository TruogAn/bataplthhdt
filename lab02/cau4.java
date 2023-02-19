package lab02;

import java.util.Scanner;

public class cau4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nhapvao;
		Scanner ta = new Scanner(System.in);
		System.out.println("Nhap su lua chon vao: ");
		nhapvao = ta.nextInt();
		switch ( nhapvao ) {
		case 1: 
			float a,b;
			Scanner ta1 = new Scanner(System.in);
			System.out.println("Nhap a: ");
			a = ta1.nextFloat();
			System.out.println("Nhap b: ");
			b = ta1.nextFloat();
			if (a==0) {
				if (b==0) {
					System.out.println("Thong bao rang vo so nghiem");
				}
				else {
					System.out.println("Thong bao rang vo nghiem");
				}
			}
			else {
				System.out.println("Thong bao co nghiem la: "+ (-b/a));
			}
			ta1.close();
		break;
		case 2:
			float n,m,l, delta, x1, x2;
			Scanner ta2 = new Scanner(System.in);
			System.out.println("Nhap a: ");
			m = ta2.nextFloat();
			System.out.println("Nhap b: ");
			n = ta2.nextFloat();
			System.out.println("Nhap c: ");
			l = ta2.nextFloat();
			if (m==0) {
				if (n==0) {
					System.out.println("Thong bao vo so nghiem");
				}
				else {
					System.out.println("Thong bao vo nghiem");
				}
				System.out.println("Thong bao co pt bac nhat x= "+ (-l/m));
			}
			else { 
				delta = n*n - 4*m*l;
				if (delta < 0) {
					System.out.println("Phuong trinh vo nghiem x= "+ delta);
				}
				else {
					if (delta == 0) {
						System.out.println("Phuong trinh co nghiem kep x= "+ (-n/2*m));
					}
					else {
						if (delta > 0) {
							x1 = (float) ((-n + Math.sqrt(delta))/(2*m));
							x2 = (float) ((-n - Math.sqrt(delta))/(2*m));
							System.out.println("Phuong trinh co hai nghiem phan biet =>"+ "x1 ="+ x1+ "x2 ="+ x2);
						}
					}
				}
				
			}
			ta2.close();
		break;
		case 3:
			int sodien, t;
			Scanner ta3 = new Scanner(System.in);
			System.out.println("Nhap so dien trong mot thang ");
			sodien = ta3.nextInt();
			if (sodien < 50) {
				t = sodien*1000;
				System.out.println("Tien dien trong mot thang la: "+ t);
			}
			else {
				if (sodien > 50) {
					t = 50*1000+ (sodien-50)*1200;
					System.out.println("Tien dien trong mot thanng la: "+ t);
				}
			}
			ta3.close();
		break;
		default:
		System.exit(0);
		}
	}

}
