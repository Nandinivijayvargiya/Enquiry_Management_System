package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.EnquiryData;
import View.DeletePage;
import View.EnquiryPage;
import View.HomePage;
import View.ViewPage;

public class ViewEventPage implements ActionListener, ListSelectionListener {
EnquiryPage ep;
EnquiryData ed;
ViewPage vp;
public ViewEventPage(EnquiryPage enquiryPage) {
	// TODO Auto-generated constructor stub
	ep=enquiryPage;
	ed=new EnquiryData();
	 
}
	public ViewEventPage(ViewPage viewPage) {
		// TODO Auto-generated constructor stub
		vp=viewPage;
		ed=new EnquiryData();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Search"))
		{
			
			String Data=vp.textField.getText();
			ResultSet rs;
			String SearchBy=vp.comboBox.getSelectedItem().toString();
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
			vp.table.setModel(Model.Data.buildTableModel(rs)); 
		}
		
		if(e.getActionCommand().equals("Cancel"))
		{
			HomePage hp=new HomePage();
			hp.setVisible(true);
			vp.setVisible(false);
			
		}

	}
		

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		String EID=vp.table.getValueAt(vp.table.getSelectedRow(),0).toString();
		vp.dispose();
		EnquiryData d1=new EnquiryData();
		
		EnquiryPage ep=new EnquiryPage();
		
		String[] data = d1.readdatabyid(Integer.parseInt(EID));
		ep.lblEnquiryPage.setText("View Enquiry");
		String op=ep.lblEnquiryPage.getText();
		
		if(op.equals("View Enquiry")) {
			ep.lblNewLabel_1.setText(EID);
			ep.btnAdd.setText("View");
			ep.btnAdd.setActionCommand("View");
		}
		ep.btnAdd.setVisible(false);
		ep.btnNewButton.setVisible(true);
	
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
