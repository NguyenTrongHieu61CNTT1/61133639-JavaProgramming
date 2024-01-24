import java.util.Scanner;

public class Lab1_Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Phương trình bậc 2: ax^2 + bx + c = 0");
		System.out.print("\nNhập vào hệ số a: ");
		double a = scanner.nextDouble();
		System.out.print("\nNhập vào hệ số b: ");
		double b = scanner.nextDouble();
		System.out.print("\nNhập vào hằng số c: ");
		double c = scanner.nextDouble();
		double delta = Math.pow(b, 2)-4*a*c;
		double can_delta = Math.sqrt(delta);
		System.out.printf("Giá trị của căn delta = %.1f", can_delta);
	}

}
