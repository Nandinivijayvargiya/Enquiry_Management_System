package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.EnquiryData;
import Model.EnquiryData;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCallingPage extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,lblNewLabel_4,lblNewLabel_5,lblNewLabel_6,lblNewLabel_8 ;
	public JButton btnAdd ,btnNewButton;
	public JComboBox comboBox ;
	public JLabel lblNewLabel_7;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public AddCallingPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 761);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Calling Enquiry");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(299, 35, 243, 41);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("EID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(55, 148, 116, 25);
		contentPane.add(lblNewLabel_1);
		
		EnquiryData d1=new EnquiryData();
		
		comboBox = new JComboBox(d1.getallid());
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setBounds(454, 148, 236, 33);
		contentPane.add(comboBox);
		
	    lblNewLabel_2 = new JLabel("Feedaback");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(55, 235, 116, 33);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(454, 235, 236, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Calling Date");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(55, 321, 116, 41);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		long x=System.currentTimeMillis();
		java.sql.Date obj=new java.sql.Date(x);
		textField_1.setText(obj.toString());
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(454, 321, 236, 41);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Reminder Date");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(55, 417, 146, 33);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(479, 405, 161, 45);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	    
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new Controller.AddCallingEvent(this));
		btnAdd.setActionCommand("Add");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.setBounds(90, 567, 141, 53);
		contentPane.add(btnAdd);
		
		btnNewButton = new JButton("Cancel");	
		btnNewButton.addActionListener(new Controller.AddCallingEvent(this));
		btnNewButton.setActionCommand("Cancel");
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		btnNewButton.setBounds(454, 560, 131, 58);
		contentPane.add(btnNewButton);
		
		lblNewLabel_5 = new JLabel("After");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(420, 420, 77, 27);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Days");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(652, 417, 56, 25);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(294, 504, 264, 25);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(454, 89, 156, 33);
		contentPane.add(lblNewLabel_8);
	}
}
