package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CoursePage extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	public JTextField textField_2;
	public JLabel lblNewLabel,lblCourseName,lblNewLabel_2,lblNewLabel_3,lblNewLabel_4;
	public JComboBox comboBox;
	public JButton btnNewButton,btnNewButton_1;
	public JLabel lblNewLabel_5;
	public JLabel lblNewLabel_6;
	
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public CoursePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 753);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Course Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(322, 13, 246, 52);
		contentPane.add(lblNewLabel);
		
	    lblCourseName = new JLabel("Course Name");
		lblCourseName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCourseName.setBounds(42, 156, 194, 58);
		contentPane.add(lblCourseName);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(464, 156, 262, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Fees");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(42, 270, 160, 52);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(464, 270, 262, 52);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Duration");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(43, 368, 95, 39);
		contentPane.add(lblNewLabel_3);
		
		comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"3 Months", "6 Months"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setBounds(464, 379, 262, 52);
		contentPane.add(comboBox);
		
		btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new Controller.CoursePageEvent(this));
		btnNewButton.setActionCommand("Add");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(56, 519, 134, 69);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new Controller.CoursePageEvent(this));
		btnNewButton_1.setActionCommand("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(464, 519, 130, 69);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(244, 469, 221, 37);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(464, 78, 160, 32);
		contentPane.add(lblNewLabel_6);
	}
}
