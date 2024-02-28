import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtPass;

	
	public LoginFrame() {
		setTitle("Đăng nhập vào hệ thống quản lý bán hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 43, 153, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu:");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMtKhu.setBounds(10, 96, 153, 32);
		contentPane.add(lblMtKhu);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUser.setBounds(165, 43, 171, 30);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtPass = new JPasswordField();
		txtPass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPass.setBounds(110, 96, 226, 28);
		contentPane.add(txtPass);
		
		JButton btnLogin = new JButton("Đăng Nhập");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý đăng nhập
				XuLyDangNhap();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setBounds(368, 45, 114, 30);
		contentPane.add(btnLogin);
	}
	
	void XuLyDangNhap() {
		//Lấy user và pass:
		String str_user = txtUser.getText();
		String str_pass = txtPass.getText();
		
		//Xử lý:
		if(str_user.equals("63CNTT") && str_pass.equals("123")) {
			HomeFrame homePage = new HomeFrame();
			homePage.setVisible(true);
			this.setVisible(false); //Ẩn form login
		}
		else {
			//Xóa dữ liệu nhập:
			txtUser.setText("");
			txtPass.setText("");
			
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng nhập thất bại");
		}
	}
}
