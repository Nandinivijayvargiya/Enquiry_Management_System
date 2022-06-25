package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.FeeData;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FeesPage extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	public JComboBox comboBox;
	public JLabel lblNewLabel,lblFeesPage,lblNewLabel_1,lblFeesDate,lblNewLabel_2 ; 
	public JButton btnAdd,btnNewButton;
	public JTextField textField_2;
	public JLabel lblNewLabel_3;
	public JTextField textField_3;
	public JLabel lblNewLabel_4;
	public JTextField textField_4;
	public JLabel lblNewLabel_5;
	public JLabel lblNewLabel_6;
	public JLabel lblNewLabel_7;
	

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public FeesPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 893, 761);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Student Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(36, 118, 133, 59);
		contentPane.add(lblNewLabel);
		
		lblFeesPage = new JLabel("Fees Page");
		lblFeesPage.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblFeesPage.setBounds(321, 43, 209, 35);
		contentPane.add(lblFeesPage);
		
		FeeData fd=new FeeData();
		comboBox = new JComboBox(fd.getallsname());
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.addItemListener(new Controller.FeeEventPage(this));
		comboBox.setEditable(true);
		comboBox.setBounds(412, 126, 288, 72);
		contentPane.add(comboBox);
		
		lblNewLabel_1 = new JLabel("RID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(36, 283, 133, 16);
		contentPane.add(lblNewLabel_1);
		
		lblFeesDate = new JLabel("Fee Amount");
		lblFeesDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFeesDate.setBounds(36, 382, 159, 72);
		contentPane.add(lblFeesDate);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(634, 382, 153, 59);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Fee Date");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(36, 488, 133, 52);
		contentPane.add(lblNewLabel_2);
		
		
		textField_1 = new JTextField();
		long x=System.currentTimeMillis();
		java.sql.Date obj=new java.sql.Date(x);
		textField_1.setText(obj.toString());
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(412, 488, 288, 62);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new Controller.FeeEventPage(this));
		btnAdd.setActionCommand("Add");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.setBounds(96, 611, 133, 59);
		contentPane.add(btnAdd);
		
		btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new Controller.FeeEventPage(this));
		btnNewButton.setActionCommand("Cancel");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(488, 611, 133, 59);
		contentPane.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(412, 259, 288, 59);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(245, 563, 188, 44);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setBounds(207, 382, 137, 51);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_4 = new JLabel("-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(362, 386, 95, 44);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new Controller.FeeEventPage(this));
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setBounds(412, 382, 141, 51);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_5 = new JLabel("=");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(577, 403, 31, 16);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Paid Fees");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(433, 443, 141, 16);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(461, 91, 174, 22);
		contentPane.add(lblNewLabel_7);
		
	}
}
