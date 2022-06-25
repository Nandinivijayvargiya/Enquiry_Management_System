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

public class DeleteEventPage implements ActionListener, ListSelectionListener {
DeletePage dp;
EnquiryData ed;
EnquiryPage ep;
public DeleteEventPage(EnquiryPage enquiryPage) {
	// TODO Auto-generated constructor stub
	ep=enquiryPage;
	ed=new EnquiryData();
	 
}

	public DeleteEventPage(DeletePage deletePage) {
		// TODO Auto-generated constructor stub
		dp=deletePage;
		ed=new EnquiryData();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Search"))
		{
			String Data=dp.textField.getText();
			ResultSet rs = null;
			String SearchBy=dp.comboBox.getSelectedItem().toString();
			
			if(SearchBy.equals("EID"))
					{
				
				rs=ed.get_Databy_id(Integer.parseInt(Data));
					}
			dp.table.setModel(Model.Data.buildTableModel(rs)); 
					}
		if(e.getActionCommand().equals("Cancel"))
		{
			HomePage hp=new HomePage();
			hp.setVisible(true);
			dp.setVisible(false);
			
		}
		
		}

	



	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		String EID=dp.table.getValueAt(dp.table.getSelectedRow(),0).toString();
		
		EnquiryData d1=new EnquiryData();
		
		EnquiryPage ep=new EnquiryPage();
		String[] data = d1.readdatabyid(Integer.parseInt(EID));
		ep.lblEnquiryPage.setText("Delete Enquiry");
       String op=ep.lblEnquiryPage.getText();
   
		if(op.equals("Delete Enquiry")) {
			ep.lblNewLabel_1.setText(EID);
			ep.btnAdd.setText("Delete");
			ep.btnAdd.setActionCommand("Delete");
		}
			ep.btnAdd.setVisible(true);
			ep.btnNewButton.setVisible(true);
			ep.setVisible(true);
			ep.textField.setText(data[1]);
			ep.textField_1.setText(data[2]);
			ep.textField_2.setText(data[5]);
			ep.textField_3.setText(data[6]);
			ep.comboBox_2.setSelectedItem(data[7]);
			ep.comboBox.setSelectedItem(data[3]);
			ep.comboBox_1.setSelectedItem(data[4]);
			dp.dispose();
		}
	
	}

