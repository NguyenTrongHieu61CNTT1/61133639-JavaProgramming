import java.util.Scanner;

public class Lab2Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhập hệ số c: ");
		double c = scanner.nextDouble();
		
		if(a==0) {
			if(b==0)
				System.out.print("PT có vô số nghiệm!");
			else
				System.out.print("PT có vô nghiệm!");
		}
		else {
			double delta = b*b - 4*a*c;
			double x1 = (-b + Math.sqrt(delta)) / (2 * a), x2 = (-b - Math.sqrt(delta)) / (2 * a);
			double x_kep = -b/(2*a);
			
			if(delta<0)
				System.out.print("PT vô nghiệm!");
			else if(delta == 0)
				System.out.printf("PT có nghiệm kép: x1 = x2 = %.2f", x_kep);
			else
				System.out.printf("PT có 2 nghiệm: x1 = %.2f, x2 = %.2f",x1,x2);
		}
	}

}
