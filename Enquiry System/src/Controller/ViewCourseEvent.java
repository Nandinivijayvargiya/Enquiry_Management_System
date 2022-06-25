package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.CourseData;
import View.CoursePage;
import View.HomePage;
import View.ViewCourse;


public class ViewCourseEvent implements ActionListener, ListSelectionListener {
ViewCourse vc;
CourseData cd;

	public ViewCourseEvent(ViewCourse viewCourse) {
		// TODO Auto-generated constructor stub
		vc=viewCourse ;
		cd=new CourseData();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Search"))
		{
		String data=vc.textField.getText();
	   ResultSet rs;
	   String searchby=vc.comboBox.getSelectedItem().toString();
	   if(searchby.equalsIgnoreCase("CID"))
		   {
		   rs=cd.getdatabyid(Integer.parseInt(data));
		   }
	   else if(searchby.equalsIgnoreCase("CName"))
	   {
		   rs=cd.getdatabycname(data);
		   }
	   
	   else {
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
		String CID=vc.table.getValueAt(vc.table.getSelectedRow(), 0).toString();
		vc.dispose();
		String data[]=cd.readdatabyid(Integer.parseInt(CID));
		CoursePage cp = new CoursePage ();
		cp.setVisible(true);
		cp.lblNewLabel.setText("View Course");
		String op=cp.lblNewLabel.getText();
		
		if(op.equals("View Course")) {
			cp.lblNewLabel_6.setText(CID);
			cp.btnNewButton.setVisible(false);
			//cp.lblNewLabel_1.setVisible(true);
		}
		cp.textField.setText(data[1]);
		cp.textField_2.setText(data[3]);
		cp.comboBox.setSelectedItem(data[2]);
		
		
		
	}

}
