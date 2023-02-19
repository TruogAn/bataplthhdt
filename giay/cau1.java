package giay;
import java.util.Scanner;

public class cau1 {
static boolean checkPerfectSquare (int n)
{
	double sqrt = Math.sqrt(n);
	return ((sqrt - Math.floor(sqrt))== 0);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
			Scanner ta = new Scanner(System.in);
			System.out.print("Nhap vao so can kiem tra: ");
			n = ta.nextInt();
		if (checkPerfectSquare (n)== true) {
			System.out.println("Thoa dieu kien, day la so chinh phuong");
}
		else {
			System.out.println("Khong thoa dieu kien, khong phai la so chinh phuong");
}
ta.close();
	}
}
