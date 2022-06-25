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
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ViewReports extends JFrame {

	private JPanel contentPane;
	public JTable table;
	public JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_2  ;
	public JComboBox comboBox ;
	public JButton btnNewButton,btnNewButton_1 ;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ViewReports() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 914, 765);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("View Reports");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(333, 29, 268, 64);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("View Reports By");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(58, 111, 172, 86);
		contentPane.add(lblNewLabel_1);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new Controller.ViewRepEvent(this));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Weekly", "Monthly","By Course"}));
		comboBox.setBounds(424, 123, 300, 64);
		contentPane.add(comboBox);
		
		btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new Controller.ViewRepEvent(this));
		btnNewButton.setActionCommand("Search");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(293, 246, 137, 44);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new Controller.ViewRepEvent(this));
		btnNewButton_1.setActionCommand("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(541, 241, 158, 54);
		contentPane.add(btnNewButton_1);
		
		table = new JTable();
		table.getSelectionModel().addListSelectionListener(new Controller.ViewRepEvent(this));
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.setBounds(12, 377, 872, 328);
		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(25, 340, 833, 365);
		contentPane.add(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(760, 306, 71, 44);
		contentPane.add(lblNewLabel_2);
		long x=System.currentTimeMillis();
		java.sql.Date obj=new java.sql.Date(x);
	}
}
