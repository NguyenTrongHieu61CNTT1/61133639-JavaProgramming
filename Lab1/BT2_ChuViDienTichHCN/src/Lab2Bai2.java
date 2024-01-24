import java.util.Scanner;

public class Lab2Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chiều dài: ");
		double a1 = scanner.nextDouble();
		System.out.print("Chiều rộng: ");
		double a2 = scanner.nextDouble();
		double cv = (a1+a2)*2;
		double s = a1*a2;
		double canh = Math.min(a1, a2);
		System.out.printf("Chu vi HCN = %f", cv);
		System.out.printf("Diện tích HCN = %f", s);
		System.out.printf("Cạnh nhỏ nhất của HCN = %f", canh);
	}

}
