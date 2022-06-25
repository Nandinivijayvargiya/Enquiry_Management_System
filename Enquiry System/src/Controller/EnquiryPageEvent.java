package Controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JLabel;

import Model.*;

import View.EnquiryPage;
import View.HomePage;
import View.*;
public class EnquiryPageEvent implements ActionListener {
EnquiryPage obj;
EnquiryData ed;
UpdatePage up;
	public EnquiryPageEvent(EnquiryPage enquiryPage) {
		// TODO Auto-generated constructor stub
		obj=enquiryPage;
		ed=new EnquiryData();
		
	}
	public EnquiryPageEvent(UpdatePage updatePage) {
		// TODO Auto-generated constructor stub
		up=updatePage;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(e.getActionCommand().equals("Add"))
		{
			
			String name,mobno,email,cdate,status,clgname,coursename,enquiryf;
			name=obj.textField.getText();
			mobno=obj.textField_1.getText();
			email=obj.textField_2.getText();
			cdate=obj.textField_3.getText();
			status=obj.comboBox_2.getSelectedItem().toString();
			clgname=obj.comboBox.getSelectedItem().toString();
			coursename=obj.comboBox_1.getSelectedItem().toString();
			enquiryf=obj.textField_4.getText();
			if(ed.addenquiry(name,mobno,email,cdate,status,clgname,coursename,enquiryf))
			{
				obj.lblNewLabel.setText("Insertion Successfull");
			}
			else
			{
				obj.lblNewLabel.setText("Insertion Failed");
			}
		}
		else if(e.getActionCommand().equals("Update")) {
			
			
			int eid=Integer.parseInt(obj.lblNewLabel_1 .getText());
			String name=obj.textField.getText();
			String mobno=obj.textField_1.getText();
			String email=obj.textField_2.getText();
			String cdate=obj.textField_3.getText();
			String status=obj.comboBox_2.getSelectedItem().toString();
			String clgname=obj.comboBox.getSelectedItem().toString();
			String coursename=obj.comboBox_1.getSelectedItem().toString();
			String enquiryf=obj.textField_4.getText();
			if(ed.updateenquiry(name, mobno, email, cdate, clgname, coursename, status,eid,enquiryf))
			{
				obj.lblNewLabel.setText("Update Succesfully");
			}
			else
			{
				obj.lblNewLabel.setText("Updatation Failed");
			}
			}

		else if(e.getActionCommand().equals("Delete")) {
			
			int eid=Integer.parseInt(obj.lblNewLabel_1.getText());
			
			
			if(ed.deleteEnquiry(eid))
			{
				obj.lblNewLabel.setText("Deleted Succesfully");
			}
			else
			{
				obj.lblNewLabel.setText("Deletion Failed");
			}
		}
			
		 if(e.getActionCommand().equals("Cancel"))
			{
				
			HomePage Hp=new HomePage();
			Hp.setVisible(true);
			obj.setVisible(false);
			}
			}
}
		
		
	
		
		
	


	


