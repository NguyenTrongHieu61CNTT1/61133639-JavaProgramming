package hieu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScreenFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKQ;

	public ScreenFrame() {
		setTitle("Giải phương trình bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Phương trình bậc 2: ax^2 + bx + c = 0");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(24, 25, 428, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập a:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(24, 84, 106, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nhập b:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(24, 126, 106, 32);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nhập c:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(24, 168, 106, 32);
		contentPane.add(lblNewLabel_1_2);
		
		txtA = new JTextField();
		txtA.setBounds(130, 84, 106, 32);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(130, 126, 106, 32);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(130, 168, 106, 32);
		contentPane.add(txtC);
		
		JLabel lblNewLabel_1_3 = new JLabel("Kết quả:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(364, 84, 106, 32);
		contentPane.add(lblNewLabel_1_3);
		
		JButton btnKQ = new JButton("Giải");
		btnKQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Gọi hàm giải PT bậc 2
				GiaiPT();
			}
		});
		btnKQ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnKQ.setBounds(257, 84, 85, 116);
		contentPane.add(btnKQ);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setColumns(10);
		txtKQ.setBounds(364, 126, 263, 74);
		contentPane.add(txtKQ);
	}
	
	void GiaiPT() {
		//Lấy dữ liệu từ text box:
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		String str_soC = txtC.getText();
		
		//Chuyển dữ liệu sang double:
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double soC = Double.parseDouble(str_soC);
		
		//Thực hiện tính toán:
		double delta = Math.pow(soB, 2)-4*soA*soC;
		if (delta > 0) {
            double nghiem1 = (-soB + Math.sqrt(delta)) / (2.0 * soA);
            double nghiem2 = (-soB - Math.sqrt(delta)) / (2.0 * soA);
		}
		
		//Hiển thị:
		txtKQ.setText(String.valueOf(nghiem1));
		txtKQ.setText(String.valueOf(nghiem2));
	}
}
