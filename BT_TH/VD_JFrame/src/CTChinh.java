import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class CTChinh {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("VD JFrame");
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300, 200); //Kích thước
		
		//Tạo bố cục
		f.setLayout(new FlowLayout());
		
		//Tạo button:
		JButton btnA = new JButton("Nút bên phải");
		JButton btnB = new JButton("Nút bên trái");
		
		//Gắn lên form:
		f.add(btnA);
		f.add(btnB);
		
		f.show();
	}
}
