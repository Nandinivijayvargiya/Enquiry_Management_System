package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Date;
import java.sql.ResultSet;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.ViewRepData;
import View.HomePage;
import View.ViewReportByC;
import View.ViewReports;

public class ViewRepEvent implements ActionListener, ListSelectionListener, ItemListener {
ViewReports vr;
ViewRepData vrd;
	public ViewRepEvent(ViewReports viewReports) {
		// TODO Auto-generated constructor stub
		vr=viewReports;
		vrd=new ViewRepData();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Search"))
		{
			//String Data=vr.textField_1.getText();
			ResultSet rs = null;
			String SearchBy=vr.comboBox.getSelectedItem().toString();
			if(SearchBy.equals("Weekly"))
			{
		rs=vrd.getDatabyDateWeekly();
		
			}
			else if(SearchBy.equals("Monthly"))
			{
		rs=vrd.getDatabyDateMonthly();
		
			}
			
			vr.table.setModel(Model.Data.buildTableModel(rs)); 
			
		}
		if(e.getActionCommand().equals("Cancel"))
		{
			HomePage hp=new HomePage();
			hp.setVisible(true);
			vr.setVisible(false);
			
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String SearchBy=vr.comboBox.getSelectedItem().toString();
		if(SearchBy.equals("By Course"))
		{
			ViewReportByC vrc=new ViewReportByC();
			vrc.setVisible(true);
			vr.dispose();
		}
		
		
	}

}
