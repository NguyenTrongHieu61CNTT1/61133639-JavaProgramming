import java.util.Scanner;

public class Bai4Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int chon = 0;
		do {
			System.out.println("+----------------------------+");
			System.out.println("1. Giải phương trình bậc 1.");
			System.out.println("2. Giải phương trình bậc 2.");
			System.out.println("3. Tính tiền điện.");
			System.out.println("4. Exit.");
			System.out.println("+----------------------------+");
			System.out.println("Con số gì đây, số gì đây: ");
			chon = scanner.nextInt();
			
			switch (chon) {
			case 1: //Giải PT bậc 1
				System.out.print("Nhập hệ số a: ");
				double a = scanner.nextDouble();
				System.out.print("Nhập hệ số b: ");
				double b = scanner.nextDouble();
				if(a==0) {
					if(b==0)
						System.out.println("PT có vô số nghiệm!");
					else
						System.out.println("PT có vô nghiệm!");
				}
				else {
					double x = -b/a;
					System.out.printf("PT có nghiệm x = %.1f", x);
				}
                break;
            case 2: //Giải PT bậc 2
            	System.out.println("Nhập hệ số a: ");
        		double a1 = scanner.nextDouble();
        		System.out.println("Nhập hệ số b: ");
        		double b1 = scanner.nextDouble();
        		System.out.println("Nhập hệ số c: ");
        		double c1 = scanner.nextDouble();
        		
        		if(a1==0) {
        			if(b1==0)
        				System.out.println("PT có vô số nghiệm!");
        			else
        				System.out.println("PT có vô nghiệm!");
        		}
        		else {
        			double delta = b1*b1 - 4*a1*c1;
        			double x1 = (-b1 + Math.sqrt(delta)) / (2 * a1), x2 = (-b1 - Math.sqrt(delta)) / (2 * a1);
        			double x_kep = -b1/(2*a1);
        			
        			if(delta<0)
        				System.out.println("PT vô nghiệm!");
        			else if(delta == 0)
        				System.out.printf("PT có nghiệm kép: x1 = x2 = %.2f", x_kep);
        			else
        				System.out.printf("PT có 2 nghiệm: x1 = %.2f, x2 = %.2f",x1,x2);
        		}
                break;
            case 3: //Tính tiền điện
            	System.out.print("Nhập vào số kWh điện đã sử dụng: ");
        		double kWh = scanner.nextDouble();
        		double tien = 0;
        		
        		if(kWh <= 50)
        			tien = kWh*1000;
        		else
        			tien = 50*1000 + (kWh - 50)*1200;
        		
        		System.out.printf("Số tiền điện cần thanh toán là: %.2f VNĐ\n", tien);
                break;
            case 4:
                System.out.println("Bạn đã chọn Exit!");
                break;
            default:
                System.out.println("Lựa chọn không có trong Menu!");
                break;
			}
		}while(chon != 4);
		
	}

}
