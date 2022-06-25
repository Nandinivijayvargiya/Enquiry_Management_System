package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.EnquiryData;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class EnquiryPage extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JLabel lblName,lblMobilenumber,lblEmailid,lblStatus,lblDate,lblCollegeName,lblCoursename,lblEnquiryPage ;
	public JButton btnAdd,btnNewButton;
	public JComboBox comboBox,comboBox_1,comboBox_2;
	public JButton btnNewButton_4; 
	public JLabel lblNewLabel,lblNewLabel_1  ;
	public JTextField textField_4;
	public JLabel lblNewLabel_2 ;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public EnquiryPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1317, 814);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(37, 70, 66, 69);
		contentPane.add(lblName);
		
		lblMobilenumber = new JLabel("Mobile_Number");
		lblMobilenumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMobilenumber.setBounds(37, 165, 160, 27);
		contentPane.add(lblMobilenumber);
		
		lblEmailid = new JLabel("Email_id");
		lblEmailid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmailid.setBounds(37, 242, 115, 27);
		contentPane.add(lblEmailid);
		
		lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDate.setBounds(37, 317, 85, 27);
		contentPane.add(lblDate);
		
		lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStatus.setBounds(37, 387, 85, 27);
		contentPane.add(lblStatus);
		
		lblCollegeName = new JLabel("College Name");
		lblCollegeName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCollegeName.setBounds(36, 461, 131, 27);
		contentPane.add(lblCollegeName);
		
		lblCoursename = new JLabel("Course_Name");
		lblCoursename.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCoursename.setBounds(37, 530, 160, 39);
		contentPane.add(lblCoursename);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(514, 82, 324, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(514, 156, 324, 39);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(514, 230, 324, 39);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		long x=System.currentTimeMillis();
		java.sql.Date obj=new java.sql.Date(x);
		textField_3.setText(obj.toString());
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setBounds(514, 298, 324, 39);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		EnquiryData ed=new EnquiryData();
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(ed.get_distinct_College_Name()));
		
		comboBox.setEditable(true);
		comboBox.setBounds(514, 448, 324, 46);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_1.setModel(new DefaultComboBoxModel(ed.get_distinct_Course()));
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(514, 514, 324, 46);
		contentPane.add(comboBox_1);
		
		lblEnquiryPage = new JLabel("Enquiry Page");
		lblEnquiryPage.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblEnquiryPage.setBounds(296, 13, 249, 46);
		contentPane.add(lblEnquiryPage);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new Controller.EnquiryPageEvent(this));
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.setBounds(66, 670, 131, 59);
		contentPane.add(btnAdd);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Pending", "Joined", "Rejected"}));
		comboBox_2.setBounds(514, 372, 324, 59);
		contentPane.add(comboBox_2);
		
		btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new Controller.EnquiryPageEvent(this));
		btnNewButton.setActionCommand("Cancel");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(405, 670, 140, 59);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(238, 552, 235, 59);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(586, 53, 131, 16);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Enquiry For");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(37, 582, 160, 29);
		contentPane.add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setBounds(514, 582, 324, 46);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
