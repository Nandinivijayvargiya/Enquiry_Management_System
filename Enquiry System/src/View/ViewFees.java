
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
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ViewFees extends JFrame {

	private JPanel contentPane;
	public JTable table;
	public JLabel lblNewLabel,lblNewLabel_1;
	public JComboBox comboBox;
    public JButton btnNewButton,btnNewButton_1 ;
    public JTextField textField;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ViewFees() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 871, 787);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("View Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(368, 13, 261, 85);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("View Registration By");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(12, 140, 199, 69);
		contentPane.add(lblNewLabel_1);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Name", "FID"}));
		comboBox.setEditable(true);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setBounds(465, 140, 243, 69);
		contentPane.add(comboBox);
		
		table = new JTable();
		table.getSelectionModel().addListSelectionListener(new Controller.ViewFeesEvent(this));
		table.setBounds(12, 427, 829, 300);
		contentPane.add(table);
		
	    btnNewButton = new JButton("Search");
	    btnNewButton.addActionListener(new Controller.ViewFeesEvent(this));
	    btnNewButton.setActionCommand("Search");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(263, 304, 216, 53);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new Controller.ViewFeesEvent(this));
		btnNewButton_1.setActionCommand("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(522, 303, 158, 54);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(290, 225, 159, 37);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}

