package giay;

import java.util.Scanner;

public class cau2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float t, v, av, dtb;
			Scanner ta = new Scanner(System.in);
			System.out.println("Nhap diem toan cua hoc sinh");
			t = ta.nextFloat();
			System.out.println("Nhap diem van cua hoc sinh");
			v = ta.nextFloat();
			System.out.println("Nhap diem tieng anh cua hoc sinh");
			av = ta.nextFloat();
			System.out.println("Diem trung binh cua hoc sinh la: " + (t*2 + v + av)/4);
			dtb = ta.nextFloat();
		if (dtb < 5) {
			System.out.println("Ket qua: " + dtb);
			System.out.print("Hoc luc kem");
		}
		else {
			if (dtb >= 5 && dtb < 7) {
				System.out.println("Ket qua: " + dtb);
				System.out.print("Hoc luc trung binh");
			}
			else {
				if (dtb >= 7 && dtb < 8) {
					System.out.println("Ket qua: " + dtb);
					System.out.print("Hoc luc kha");
				}
				else {
					if (dtb > 8) {
						System.out.println("Ket qua: " + dtb);
						System.out.print("Hoc luc gioi");
					}
				}
			}
		}	
ta.close();
	}
}
