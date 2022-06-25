package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
import javax.swing.JScrollPane;

public class ViewPage extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	public JTable table;
	public JLabel lblNewLabel,lblNewLabel_1 ;
	public JComboBox comboBox ;
	public JButton btnNewButton,btnNewButton_1 ;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ViewPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 876, 810);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Search Enquiry By");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(12, 122, 163, 44);
		contentPane.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"EID", "EName", "Course", "All"}));
		comboBox.setBounds(489, 122, 174, 36);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(240, 215, 199, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new Controller.ViewEventPage(this));
		btnNewButton.setActionCommand("Search");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(240, 311, 199, 55);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new Controller.ViewEventPage(this));
		btnNewButton_1.setActionCommand("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(527, 311, 158, 54);
		contentPane.add(btnNewButton_1);
		
		table = new JTable();
		table.setBounds(48, 415, 784, 295);
		table.getSelectionModel().addListSelectionListener(new Controller.ViewEventPage(this));
		contentPane.add(table);
		
		lblNewLabel_1 = new JLabel("View Page");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(259, 28, 191, 36);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(25, 379, 833, 357);
		contentPane.add(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	}
}
