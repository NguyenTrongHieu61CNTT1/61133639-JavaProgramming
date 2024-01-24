import java.util.Scanner;

public class Lab1Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào cạnh của khối lập phương: ");
		double a = scanner.nextDouble();
		double the_tich = Math.pow(a,3);
		System.out.printf("Thể tích khối lập phương = %.1f", the_tich);
	}

}
