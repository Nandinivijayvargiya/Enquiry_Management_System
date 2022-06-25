package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateCourse extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	public JTable table;
	public JLabel lblNewLabel,lblNewLabel_1;
	public 	JComboBox comboBox ;
	public JButton btnNewButton, btnNewButton_1;
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public UpdateCourse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Search Course By");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(26, 96, 202, 77);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Update Course");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(272, 26, 152, 54);
		contentPane.add(lblNewLabel_1);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CID", "CName"}));
		comboBox.setBounds(473, 113, 257, 60);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(256, 227, 202, 54);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new Controller.UpdateCourseEvent(this));
		btnNewButton.setActionCommand("Search");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(256, 297, 202, 42);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new Controller.UpdateCourseEvent(this));
		btnNewButton_1.setActionCommand("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(532, 297, 158, 39);
		contentPane.add(btnNewButton_1);
		
		table = new JTable();
		table.getSelectionModel().addListSelectionListener(new Controller.UpdateCourseEvent(this));
		table.setBounds(30, 449, 803, 251);
		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(25, 352, 833, 348);
		contentPane.add(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	}
}
