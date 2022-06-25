package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.ViewRepData;
import View.HomePage;
import View.ViewReportByC;

public class ViewREventCourse implements ItemListener, ActionListener, ListSelectionListener {
ViewReportByC vrc;
ViewRepData vrd;
	public ViewREventCourse(ViewReportByC viewReportByC) {
		// TODO Auto-generated constructor stub
		vrc=viewReportByC;
		vrd=new ViewRepData();
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String str=vrc.comboBox.getSelectedItem().toString();
		 
		   vrc.textField.setText(str);
		   

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Search"))
		{
			String Data=vrc.textField.getText();
			ResultSet rs = null;
			String SearchBy=vrc.comboBox.getSelectedItem().toString();
			if(SearchBy.equals(vrc.textField.getText()))
			{
		rs=vrd.getDatabyCourse(Data);
		
			}
			vrc.table.setModel(Model.Data.buildTableModel(rs)); 
		}
		if(e.getActionCommand().equals("Cancel"))
		{
			HomePage hp=new HomePage();
			hp.setVisible(true);
			vrc.setVisible(false);
			
		}
		
		
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
	
		}
	
		
	}


