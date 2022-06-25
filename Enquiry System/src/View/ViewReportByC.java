package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import Model.ViewRepData;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ViewReportByC extends JFrame {

	private JPanel contentPane;
	public JTable table;
	public JLabel lblNewLabel,lblNewLabel_1;
	public JComboBox comboBox ;
	public JButton btnNewButton,btnNewButton_1 ;
	public JTextField textField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ViewReportByC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 896, 767);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("View Report By Course");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(330, 13, 278, 72);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("By Courses");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(12, 144, 214, 59);
		contentPane.add(lblNewLabel_1);
		ViewRepData vrd=new ViewRepData();
		comboBox = new JComboBox(vrd.getdistinctenquiry());
		comboBox.addItemListener(new Controller.ViewREventCourse(this));
		
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setBounds(439, 144, 286, 48);
		contentPane.add(comboBox);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.getSelectionModel().addListSelectionListener(new Controller.ViewREventCourse(this));
		table.setBounds(12, 378, 924, 329);
		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(25, 359, 833, 348);
		contentPane.add(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new Controller.ViewREventCourse(this));
		btnNewButton.setActionCommand("Search");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(330, 292, 152, 54);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new Controller.ViewREventCourse(this));
		btnNewButton_1.setActionCommand("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(539, 292, 158, 54);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(330, 219, 164, 43);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
