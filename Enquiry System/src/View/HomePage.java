package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class HomePage extends JFrame {

	private JPanel contentPane;
	public JMenuBar menuBar;
	public JMenu mnEnquiry ;
    public JMenuItem mntmAdd,mntmView,mntmDelete,mntmUpdate;
    public JMenu mnCalling;
    public JMenuItem mntmAdd_1,mntmView_1;
    public JMenu mnRegistration;
    public JMenuItem mntmAdd_2,mntmView_2;
	public JMenu mnCourse;
	public JMenuItem mntmAdd_3,mntmUpdateCourse,mntmDeleteCourse,mntmViewCourse;
	public JMenu mnFees;
	public JMenu mnReport;
	public JMenu mnExit,menu;
	public JMenu mnLogOut;
	public JMenuItem menuItem,menuItem_1;
	public JMenuItem mntmAddFees,mntmViewFees,mntmLogOut;
	public JMenuItem mntmNewMenuItem;
	public JMenuItem mntmViewReports;
	private JLabel lblNewLabel;
	
	
    
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public HomePage() {
		setAlwaysOnTop(true);
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1177, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1924, 41);
		contentPane.add(menuBar);
		
		mnEnquiry = new JMenu("Enquiry    ");
		mnEnquiry.setForeground(Color.BLUE);
		mnEnquiry.setBackground(new Color(0, 255, 255));
		mnEnquiry.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		menuBar.add(mnEnquiry);
		
		mntmAdd = new JMenuItem("Add \r\n\r\n\r\n\r\nEnquiry");
		mntmAdd.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mntmAdd.setActionCommand("AddEnquiry");
		mntmAdd.addActionListener(new Controller.HomePageEvent(this));
		mnEnquiry.add(mntmAdd);
		
		mntmUpdate = new JMenuItem("Update Enquiry");
		mntmUpdate.addActionListener(new Controller.HomePageEvent(this));
		mntmUpdate.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mntmUpdate.setActionCommand("UpdateEnquiry");
		mnEnquiry.add(mntmUpdate);
		
		mntmDelete = new JMenuItem("Delete Enquiry");
		mntmDelete.addActionListener(new Controller.HomePageEvent(this));
		mntmDelete.setActionCommand("DeleteEnquiry");
		mntmDelete.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mnEnquiry.add(mntmDelete);
		
		mntmView = new JMenuItem("View Enquiry");
		mntmView.addActionListener(new Controller.HomePageEvent(this));
		mntmView.setActionCommand("ViewEnquiry");
		mntmView.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mnEnquiry.add(mntmView);
		
		mnCalling = new JMenu("Calling     ");
		mnCalling.setForeground(Color.BLUE);
		mnCalling.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		menuBar.add(mnCalling);
		
		mntmAdd_1 = new JMenuItem("Add Calling");
		mntmAdd_1.addActionListener(new Controller.HomePageEvent(this));
		mntmAdd_1.setActionCommand("AddCalling");
		mntmAdd_1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mnCalling.add(mntmAdd_1);
		
		mntmView_1 = new JMenuItem("View Calling");
		mntmView_1.addActionListener(new Controller.HomePageEvent(this));
		mntmView_1.setActionCommand("ViewCalling");
		mntmView_1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mnCalling.add(mntmView_1);
		
		mnRegistration = new JMenu("Registration     ");
		mnRegistration.setForeground(Color.BLUE);
		mnRegistration.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		menuBar.add(mnRegistration);
		
		mntmAdd_2 = new JMenuItem("Add Registration");
		mntmAdd_2.addActionListener(new Controller.HomePageEvent(this));
		mntmAdd_2.setActionCommand("AddRegistration");
		mntmAdd_2.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mnRegistration.add(mntmAdd_2);
		
		mntmView_2 = new JMenuItem("View Registration");
		mntmView_2.addActionListener(new Controller.HomePageEvent(this));
		mntmView_2.setActionCommand("ViewRegistration");
		mntmView_2.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mnRegistration.add(mntmView_2);
		
		mnCourse = new JMenu("Course     ");
		mnCourse.setForeground(Color.BLUE);
		mnCourse.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		menuBar.add(mnCourse);
		
		mntmAdd_3 = new JMenuItem("Add Course");
		mntmAdd_3.addActionListener(new Controller.HomePageEvent(this));
		mntmAdd_3.setActionCommand("AddCourse");
		mntmAdd_3.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mnCourse.add(mntmAdd_3);
		
		mntmUpdateCourse = new JMenuItem("Update Course");
		mntmUpdateCourse.addActionListener(new Controller.HomePageEvent(this));
		mntmUpdateCourse.setActionCommand("UpdateCourse");
		mntmUpdateCourse.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mnCourse.add(mntmUpdateCourse);
		
		mntmDeleteCourse = new JMenuItem("Delete Course");
		mntmDeleteCourse.addActionListener(new Controller.HomePageEvent(this));
		mntmDeleteCourse.setActionCommand("DeleteCourse");;
		mntmDeleteCourse.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mnCourse.add(mntmDeleteCourse);
		
		mntmViewCourse = new JMenuItem("View Course");
		mntmViewCourse.addActionListener(new Controller.HomePageEvent(this));
		mntmViewCourse.setActionCommand("ViewCourse");
		mntmViewCourse.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mnCourse.add(mntmViewCourse);
		
		mnFees = new JMenu("Fees     ");
		mnFees.setForeground(Color.BLUE);
		mnFees.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		menuBar.add(mnFees);
		
		mntmAddFees = new JMenuItem("Add Fees");
		mntmAddFees.addActionListener(new Controller.HomePageEvent(this));
        mntmAddFees.setActionCommand("AddFees");
		mntmAddFees.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mnFees.add(mntmAddFees);
		
		mntmViewFees = new JMenuItem("View Fees");
		mntmViewFees.addActionListener(new Controller.HomePageEvent(this));
		mntmViewFees.setActionCommand("ViewFees");
		mntmViewFees.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mnFees.add(mntmViewFees);
		
		mnReport = new JMenu("Report    ");
		mnReport.setForeground(Color.BLUE);
		mnReport.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		menuBar.add(mnReport);
		
		mntmViewReports = new JMenuItem("View Reports");
		mntmViewReports.addActionListener(new Controller.HomePageEvent(this));
		mntmViewReports .setActionCommand("ViewReports");
		mntmViewReports.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		mnReport.add(mntmViewReports);
		
		menu = new JMenu("");
		menuBar.add(menu);
		
		mnExit = new JMenu("Exit     ");
		mnExit.setForeground(Color.BLUE);
		mnExit.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		menuBar.add(mnExit);
		
		mntmNewMenuItem = new JMenuItem("Exit");
		mntmNewMenuItem.addActionListener(new Controller.HomePageEvent(this));
		mntmNewMenuItem.setActionCommand("Exit");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mnExit.add(mntmNewMenuItem);
		
		mnLogOut = new JMenu("Log Out");
		mnLogOut.setForeground(Color.BLUE);
		mnLogOut.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		menuBar.add(mnLogOut);
		
		mntmLogOut = new JMenuItem("Log Out");
		mntmLogOut.addActionListener(new Controller.HomePageEvent(this));
		mntmLogOut.setActionCommand("LogOut");
		mntmLogOut.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		mnLogOut.add(mntmLogOut);
		
		menuItem = new JMenuItem("");
		menuItem.setBounds(134, 473, 151, 24);
		contentPane.add(menuItem);
		
		menuItem_1 = new JMenuItem("");
		menuItem_1.setBounds(64, 384, 151, 24);
		contentPane.add(menuItem_1);
		
		lblNewLabel = new JLabel("");
		//int y=this.getHeight();
		//int x=this.getHeight();
		//lblNewLabel.setSize(lblNewLabel.getHeight(), lblNewLabel.getWidth());
	
		lblNewLabel.setIcon(new ImageIcon(""));
		lblNewLabel.setBounds(0, 41, 1504, 680);
		contentPane.add(lblNewLabel);
	}
}
