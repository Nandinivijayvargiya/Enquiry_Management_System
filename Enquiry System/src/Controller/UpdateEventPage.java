package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JLabel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.Data;
import Model.EnquiryData;
import View.EnquiryPage;
import View.HomePage;
import View.UpdatePage;

public class UpdateEventPage implements ActionListener, ListSelectionListener {
UpdatePage up;
EnquiryData ed;
	public UpdateEventPage(UpdatePage updatePage) {
		// TODO Auto-generated constructor stub
		up=updatePage;
		 ed=new EnquiryData();
	}
EnquiryPage ep;
	public UpdateEventPage(EnquiryPage enquiryPage) {
		// TODO Auto-generated constructor stub
		ep=enquiryPage;
		 ed=new EnquiryData();
		 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Search"))
		{
			String Data=up.textField.getText();
			ResultSet rs;
			String SearchBy=up.comboBox.getSelectedItem().toString();
			if(SearchBy.equals("EID"))
					{
				rs=ed.get_Databy_id(Integer.parseInt(Data));
					}
			else if(SearchBy.equals("EName"))
			{
				rs=ed.get_Databy_Ename(Data);
			}
			else if(SearchBy.equals("Course"))
			{
				rs=ed.get_Databy_course(Data);
			}
			else
			{
				rs=ed.get_Databy_All();
			}
			up.table.setModel(Model.Data.buildTableModel(rs)); 
		}
		if(e.getActionCommand().equals("Cancel"))
		{
			HomePage hp=new HomePage();
			hp.setVisible(true);
			up.setVisible(false);
			
		}		

	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		String EID=up.table.getValueAt(up.table.getSelectedRow(),0).toString();
		up.dispose();
		EnquiryData d1=new EnquiryData();
		
		EnquiryPage ep=new EnquiryPage();
		
		String[] data = d1.readdatabyid(Integer.parseInt(EID));
		ep.lblEnquiryPage.setText("Update Enquiry");
		String op=ep.lblEnquiryPage.getText();
		
		if(op.equals("Update Enquiry")) {
			ep.lblNewLabel_1.setText(EID);
			ep.btnAdd.setText("Update");
			ep.btnAdd.setActionCommand("Update");
		}
		ep.btnNewButton.setVisible(true);
		ep.btnAdd.setVisible(true);
		ep.setVisible(true);
		ep.textField.setText(data[1]);
		ep.textField_1.setText(data[2]);
		ep.textField_2.setText(data[5]);
		ep.textField_3.setText(data[6]);
		ep.comboBox_2.setSelectedItem(data[7]);
		ep.comboBox.setSelectedItem(data[3]);
		ep.comboBox_1.setSelectedItem(data[4]);
		
		}
	
	

}
