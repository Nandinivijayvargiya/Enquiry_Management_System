package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class UpdatePage extends JFrame {

	public static final String Table = null;
	private JPanel contentPane;
	public JLabel lblNewLabel;
	public JComboBox comboBox ;
	public JButton btnSearch,btnNewButton_1  ;
	public  JLabel lblNewLabel_1;
	public JTextField textField;
	public JTable table;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public UpdatePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1334, 772);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Search Enquiry By");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(12, 120, 242, 68);
		contentPane.add(lblNewLabel);
		
	    comboBox = new JComboBox();
	    comboBox.setModel(new DefaultComboBoxModel(new String[] {"EID", "EName", "Course", "All"}));
	    comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setBounds(761, 128, 396, 54);
		contentPane.add(comboBox);
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new Controller.UpdateEventPage(this));
		btnSearch.setActionCommand("Search");
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSearch.setBounds(365, 278, 242, 61);
		contentPane.add(btnSearch);
		
		btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new Controller.UpdateEventPage(this));
		btnNewButton_1.setActionCommand("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(635, 267, 158, 72);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel("Update Page");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(448, 28, 262, 45);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(355, 220, 252, 45);
		contentPane.add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.setBounds(12, 424, 1170, 277);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getSelectionModel().addListSelectionListener(new Controller.UpdateEventPage(this));
		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(25, 352, 692, 360);
		contentPane.add(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	}
}
