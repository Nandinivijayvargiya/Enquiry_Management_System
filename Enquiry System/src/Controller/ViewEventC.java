package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.CallingData;
import Model.Data;
import Model.EnquiryData;
import View.AddCallingPage;
import View.CoursePage;
import View.EnquiryPage;
import View.HomePage;
import View.ViewCallingPage;

public class ViewEventC implements ActionListener, ListSelectionListener {
AddCallingPage ad;
CallingData cd;
ViewCallingPage vc;
	public ViewEventC(ViewCallingPage viewCallingPage) {
		// TODO Auto-generated constructor stub
		vc=viewCallingPage;
		cd=new CallingData();
	}
	public ViewEventC(AddCallingPage addCallingPage) {
		// TODO Auto-generated constructor stub
		ad=addCallingPage;
		cd=new CallingData();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Search"))
		{
		// TODO Auto-generated method stub
			String Data=vc.textField.getText();
			ResultSet rs=null;
			String SearchBy=vc.comboBox.getSelectedItem().toString();
		if(SearchBy.equals("EID")) {
			 rs=cd.getdatabyeid(Integer.parseInt(Data));
		}
		else if(SearchBy.equals("Ename")) {
		
			rs=cd.getdatabyname(Data);
			
		}
		
		else
		{
			rs=cd.getalldata();
		}
		
		vc.table.setModel(Model.Data.buildTableModel(rs));
	}
		if(e.getActionCommand().equals("Cancel"))
		{
			HomePage hp=new HomePage();
			hp.setVisible(true);
			vc.setVisible(false);
			
		}
	}
	
	

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		String EID=vc.table.getValueAt(vc.table.getSelectedRow(),0).toString();
		vc.setVisible(false);
		
		String[] data = cd.readdatabyid(Integer.parseInt(EID));
		AddCallingPage ad=new AddCallingPage();
		ad.lblNewLabel.setText("View Page");
		String op=ad.lblNewLabel.getText();
		if(op.equals("View Page"))
		{
			ad.lblNewLabel_8.setText(EID);
			ad.btnAdd.setText("View");
			ad.btnAdd.setActionCommand("View");
		}
		ad.btnNewButton.setVisible(true);
		ad.setVisible(true);
		ad.textField.setText(data[2]);
		ad.textField_1.setText(data[3]);
		ad.textField_2.setText(data[4]);
			ad.comboBox.setSelectedItem(data[1]);
			
		
		
	
		
	}

}
