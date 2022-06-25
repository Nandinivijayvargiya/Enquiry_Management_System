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
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeletePage extends JFrame {

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
	public DeletePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 770);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Search Enquiry By");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(24, 109, 166, 53);
		contentPane.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"EID"}));
		comboBox.setBounds(551, 116, 203, 44);
		contentPane.add(comboBox);
		
		lblNewLabel_1 = new JLabel("Delete Page");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(308, 32, 150, 53);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(265, 221, 232, 53);
		contentPane.add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBounds(12, 438, 856, 272);
		table.getSelectionModel().addListSelectionListener(new Controller.DeleteEventPage(this));
		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(25, 353, 833, 357);
		contentPane.add(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new Controller.DeleteEventPage(this));
		btnNewButton.setActionCommand("Search");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(275, 287, 225, 53);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new Controller.DeleteEventPage(this));
		btnNewButton_1.setActionCommand("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(535, 286, 178, 54);
		contentPane.add(btnNewButton_1);
	}
}
