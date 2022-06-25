package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.CourseData;
import Model.EnquiryData;
import Model.RegistrationData;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Registration extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	public JTextField textField_2;
	public JTextField textField_3;
	public JLabel lblNewLabel,lblEid,lblCourseName,lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,lblNewLabel_4,lblNewLabel_5;
    public JComboBox comboBox,comboBox_1;
    public JButton btnNewButton,btnNewButton_1;
    public JLabel lblNewLabel_6;
    public JLabel lblNewLabel_7,lblNewLabel_8;
    public JTextField textField_1;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 976, 761);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Registration Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(246, 13, 348, 50);
		contentPane.add(lblNewLabel);
		
		lblEid = new JLabel("EID");
		lblEid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEid.setBounds(42, 117, 130, 60);
		contentPane.add(lblEid);
		EnquiryData ed=new EnquiryData();
		RegistrationData rd=new RegistrationData();
		
		comboBox = new JComboBox(rd.getallstatus());
		comboBox.setEditable(true);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setBounds(493, 117, 145, 44);
		contentPane.add(comboBox);
		
		lblNewLabel_1 = new JLabel("Registration Date");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(42, 231, 209, 72);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		//ForCurrentDate
		long x=System.currentTimeMillis();
		java.sql.Date obj=new java.sql.Date(x);
		textField.setText(obj.toString());
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(493, 247, 302, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblCourseName = new JLabel("Course Name");
		lblCourseName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCourseName.setBounds(42, 329, 159, 50);
		contentPane.add(lblCourseName);
		
		comboBox_1 = new JComboBox(rd.getdistinctcourse());
		comboBox_1.addItemListener(new Controller.RegistrationPageEvent(this));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_1.setBounds(493, 346, 329, 50);
		contentPane.add(comboBox_1);
		
		lblNewLabel_2 = new JLabel("Total Fees");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(41, 438, 117, 33);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("-");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(621, 468, 74, 16);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new Controller.RegistrationPageEvent(this));
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(644, 455, 116, 50);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
	    lblNewLabel_4 = new JLabel("Discount_Fees");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(644, 512, 139, 25);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("=");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(778, 466, 56, 16);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setBounds(809, 455, 116, 50);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new Controller.RegistrationPageEvent(this));
		btnNewButton.setActionCommand("Register");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(134, 562, 153, 60);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new Controller.RegistrationPageEvent(this));
		btnNewButton_1.setActionCommand("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(457, 562, 159, 60);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(272, 512, 242, 25);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(493, 88, 56, 16);
		contentPane.add(lblNewLabel_7);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(493, 455, 116, 50);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(42, 512, 178, 43);
		contentPane.add(lblNewLabel_8);
	}
}
