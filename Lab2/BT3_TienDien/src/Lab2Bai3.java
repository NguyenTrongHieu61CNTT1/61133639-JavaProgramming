import java.util.Scanner;

public class Lab2Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số kWh điện đã sử dụng: ");
		double kWh = scanner.nextDouble();
		double tien = 0;
		
		if(kWh <= 50)
			tien = kWh*1000;
		else
			tien = 50*1000 + (kWh - 50)*1200;
		
		System.out.printf("Số tiền điện cần thanh toán là: %.2f VNĐ", tien);
	}

}
