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

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;

	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 23));
		setTitle("Máy Tính Đơn Giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập vào số a:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBounds(10, 38, 161, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpVoS = new JLabel("Nhập vào số b:");
		lblNhpVoS.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNhpVoS.setBounds(10, 106, 161, 48);
		contentPane.add(lblNhpVoS);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtA.setBounds(174, 38, 183, 48);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtB.setColumns(10);
		txtB.setBounds(174, 106, 183, 48);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("CỘNG");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Gọi hàm xử lý phép cộng
				hamCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnCong.setBounds(378, 38, 105, 48);
		contentPane.add(btnCong);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Gọi hàm xử lý phép nhân
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNhan.setBounds(378, 106, 105, 48);
		contentPane.add(btnNhan);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Gọi hàm xử lý phép trừ
				hamTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnTru.setBounds(492, 38, 93, 48);
		contentPane.add(btnTru);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Gọi hàm xử lý phép chia
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnChia.setBounds(493, 106, 93, 48);
		contentPane.add(btnChia);
		
		JLabel lblKQ = new JLabel("Kết quả:");
		lblKQ.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblKQ.setBounds(10, 181, 161, 48);
		contentPane.add(lblKQ);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtKQ.setColumns(10);
		txtKQ.setBounds(174, 181, 183, 48);
		contentPane.add(txtKQ);
	}
	
	void hamCong() {
		//Lấy dữ liệu từ text box:
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		
		//Chuyển dữ liệu sang double:
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		
		//Thực hiện tính toán:
		double tong = soA + soB;
		
		//Hiển thị:
		txtKQ.setText(String.valueOf(tong));
	}
	
	void hamTru() {
		//Lấy dữ liệu từ text box:
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
				
		//Chuyển dữ liệu sang double:
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
				
		//Thực hiện tính toán:
		double tru = soA - soB;
				
		//Hiển thị:
		txtKQ.setText(String.valueOf(tru));
	}
}
