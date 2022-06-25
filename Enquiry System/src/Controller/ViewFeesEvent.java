package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.FeeData;
import View.FeesPage;
import View.HomePage;
import View.Registration;
import View.ViewFees;

public class ViewFeesEvent implements ListSelectionListener, ActionListener {
ViewFees vf;
FeeData fd;

	public ViewFeesEvent(ViewFees viewFees) {
		// TODO Auto-generated constructor stub
		vf=viewFees;
		fd=new FeeData();
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		String FID=vf.table.getValueAt(vf.table.getSelectedRow(),0).toString();
		vf.dispose();
		String[] data =fd.readdatabyid(Integer.parseInt(FID));
		
		FeesPage Fp=new FeesPage();
		Fp.lblFeesPage.setText("View Fees Page");
		String op=Fp.lblFeesPage.getText();
		if(op.equals("View Fees Page"))
			{
		Fp.lblNewLabel_7.setText(FID);
			Fp.btnAdd.setVisible(false);
			Fp.btnNewButton.setVisible(true);
			}
		Fp.setVisible(true);
		Fp.comboBox.setSelectedItem(data[1]);
		Fp.textField_2.setText(data[2]);
		Fp.textField.setText(data[3]);
		Fp.textField_3.setVisible(false);
		Fp.textField_4.setVisible(false);
		Fp.lblNewLabel_4.setVisible(false);
		Fp.lblNewLabel_5.setVisible(false);
		Fp.lblNewLabel_6.setVisible(false);
		Fp.textField.setText(data[4]);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Search"))
		{
			String Data=vf.textField.getText();
			ResultSet rs = null;
			String SearchBy=vf.comboBox.getSelectedItem().toString();
			if(SearchBy.equals("Name"))
			{
		rs=fd.getdatabyname(Data);
		
			}
			else if(SearchBy.equals("FID"))
			{
				rs=fd.getdatabyfid(Integer.parseInt(Data));
			}
			vf.table.setModel(Model.Data.buildTableModel(rs)); 
		}
		if(e.getActionCommand().equals("Cancel"))
		{
			HomePage hp=new HomePage();
			hp.setVisible(true);
			vf.setVisible(false);
			
		}

	}
	
			
}
