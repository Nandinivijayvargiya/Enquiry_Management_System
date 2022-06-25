package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.RegistrationData;
import View.HomePage;
import View.Registration;
import View.ViewRegPage;

public class ViewRegPEvent implements ActionListener, ListSelectionListener {
ViewRegPage vrp;
RegistrationData rd;

	public ViewRegPEvent(ViewRegPage viewRegPage) {
		// TODO Auto-generated constructor stub
		vrp=viewRegPage;
		rd=new RegistrationData();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Search"))
		{
			String Data=vrp.textField.getText();
			ResultSet rs = null;
			String SearchBy=vrp.comboBox.getSelectedItem().toString();
			if(SearchBy.equals("CourseName"))
			{
		rs=rd.get_Databy_Course(Data);
		
			}
			else if(SearchBy.equals("RID"))
			{
				rs=rd.get_Databy_id(Integer.parseInt(Data));
			}
			vrp.table.setModel(Model.Data.buildTableModel(rs)); 
		}
		if(e.getActionCommand().equals("Cancel"))
		{
			HomePage hp=new HomePage();
			hp.setVisible(true);
			vrp.setVisible(false);
			
		}

	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		String RID=vrp.table.getValueAt(vrp.table.getSelectedRow(),0).toString();
		vrp.dispose();
		String[] data =rd.readdatabyid(Integer.parseInt(RID));
		Registration rg=new Registration();
		rg.lblNewLabel.setText("View Registration Page");
		String op=rg.lblNewLabel.getText();
		if(op.equals("View Registration Page"))
			{
			rg.lblNewLabel_7.setText(RID);
			rg.btnNewButton.setVisible(false);
			rg.btnNewButton_1.setVisible(true);
			}
		rg.setVisible(true);
		rg.comboBox.setSelectedItem(data[6]);
		rg.textField.setText(data[1]);
		rg.comboBox_1.setSelectedItem(data[2]);
		rg.textField_1.setText(data[5]);
		rg.textField_2.setText(data[4]);
		rg.textField_3.setText(data[3]);
		
		
		
		
		
	}

}
