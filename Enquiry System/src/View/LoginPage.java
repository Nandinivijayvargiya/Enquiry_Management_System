package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import Controller.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	public JPasswordField passwordField;
	public JLabel lblUsername,lblPassword;
	public JButton btnLogin;
	public JLabel lblNewLabel;
	public JLabel lblLoginPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1343, 776);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(22, 201, 95, 35);
		contentPane.add(lblUsername);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(22, 290, 122, 45);
		contentPane.add(lblPassword);
		
		textField = new JTextField("abc");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(390, 204, 257, 45);
		contentPane.add(textField);
		textField.setColumns(10);		
		
		passwordField = new JPasswordField("123");
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(390, 298, 257, 37);
		contentPane.add(passwordField);
		passwordField.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new Controller.LoginPageEvent(this));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(239, 471, 183, 35);
		contentPane.add(btnLogin);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setBounds(194, 393, 242, 35);
		contentPane.add(lblNewLabel);
		
		lblLoginPage = new JLabel("LOGIN PAGE");
		lblLoginPage.setForeground(Color.BLUE);
		lblLoginPage.setBackground(Color.WHITE);
		lblLoginPage.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblLoginPage.setBounds(271, 66, 178, 35);
		contentPane.add(lblLoginPage);
	}
}
