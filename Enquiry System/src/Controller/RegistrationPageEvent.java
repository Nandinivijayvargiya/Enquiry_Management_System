package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.sql.Date;

import javax.swing.JTextField;

import Model.EnquiryData;
import Model.RegistrationData;
import View.HomePage;
import View.Registration;

public class RegistrationPageEvent implements ActionListener, ItemListener, KeyListener {
Registration rg;
RegistrationData rd;
EnquiryData ed;
	public RegistrationPageEvent(Registration registration) {
		// TODO Auto-generated constructor stub
		rg=registration;
		rd=new RegistrationData ();
		ed=new EnquiryData();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Register"))
		{
			
			String coursename,tfees,dfees,cfees,redate;
		   int eid;
			redate=rg.textField.getText();
			coursename=rg.comboBox_1.getSelectedItem().toString();
			eid=Integer.parseInt(rg.comboBox.getSelectedItem().toString());
			tfees=(rg.textField_3.getText());
			cfees=(rg.textField_1.getText());
			dfees=(rg.textField_2.getText());
			
			if(rd.addreg(redate, coursename, eid, tfees, dfees,cfees))
			{
				rg.lblNewLabel_6.setText("Register Successfully");
				
			}
			String status="Joined";
		   if(ed.updateStatus(eid,status))
			{
				rg.lblNewLabel_8.setText("Update Status");
			}
			else
			{
				rg.lblNewLabel_6.setText("Registeration Failed");
			}
		}
			if(e.getActionCommand().equals("Cancel"))
			{
				HomePage hp=new HomePage();
				hp.setVisible(true);
				rg.setVisible(false);
			}
			
				

	}

	

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
			String str=rg.comboBox_1.getSelectedItem().toString();
		   int x=rd.getfeesbycourse(str);
		   rg.textField_1.setText(x+"");
			
		}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		int tfees,dfees,cfees;
		cfees=Integer.parseInt(rg.textField_1.getText());
		//System.out.print("Hello");
		dfees=Integer.parseInt(rg.textField_2.getText());
		tfees=cfees-dfees;
		rg.textField_3.setText(Integer.toString(tfees));
		
	}
		

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
		
	}


