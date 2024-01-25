import java.util.Scanner;

public class Bai4Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int chon = 0;
		do {
			System.out.print("+----------------------------+");
			System.out.print("1. Giải phương trình bậc 1.");
			System.out.print("2. Giải phương trình bậc 2.");
			System.out.print("3. Tính tiền điện.");
			System.out.print("4. Exit.");
			System.out.print("+----------------------------+");
			chon = scanner.nextInt();
			
			switch (chon) {
			case 1:
				System.out.print("Nhập hệ số a: ");
				double a = scanner.nextDouble();
				System.out.print("Nhập hệ số b: ");
				double b = scanner.nextDouble();
				if(a==0) {
					if(b==0)
						System.out.print("PT có vô số nghiệm!");
					else
						System.out.print("PT có vô nghiệm!");
				}
				else {
					double x = -b/a;
					System.out.printf("PT có nghiệm x = %.1f", x);
				}
                break;
            case 2:
                // Gọi hàm giải phương trình bậc hai
                break;
            case 3:
                // Gọi hàm tính tiền điện theo phương pháp lũy tiến
                break;
            case 4:
                System.out.print("Bạn đã chọn Exit!");
                break;
            default:
                System.out.print("Lựa chọn không có trong Menu!");
                break;
			}
		}while(chon != 4);
		
	}

}
