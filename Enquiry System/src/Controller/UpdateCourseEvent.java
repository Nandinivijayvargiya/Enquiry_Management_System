package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.CourseData;
import View.CoursePage;
import View.HomePage;
import View.UpdateCourse;

public class UpdateCourseEvent implements ActionListener, ListSelectionListener {
UpdateCourse uc;
CourseData cd;
	public UpdateCourseEvent(UpdateCourse updateCourse) {
		// TODO Auto-generated constructor stub
		uc=updateCourse;
		cd=new CourseData();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Search"))
		{
			String data=uc.textField.getText();
     	   ResultSet rs;
     	   String searchby=uc.comboBox.getSelectedItem().toString();
     	   if(searchby.equals("CID"))
     		   {
     		   rs=cd.getdatabyid(Integer.parseInt(data));
     		   }
     	   else if(searchby.equals("CName"))
     	   {
     		   rs=cd.getdatabycname(data);
     		   }
     	   
     	   else {
     		   rs=cd.getalldata();
     	   }
     		 uc.table.setModel(Model.Data.buildTableModel(rs)); 
     	 
     	   
        }
		if(e.getActionCommand().equals("Cancel"))
		{
			HomePage hp=new HomePage();
			hp.setVisible(true);
			uc.setVisible(false);
			
		}
	}
	

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		String EID=uc.table.getValueAt(uc.table.getSelectedRow(), 0).toString();
		uc.dispose();
		CoursePage cp=new CoursePage();
		CourseData cd=new CourseData();
		String data[]=cd.readdatabyid(Integer.parseInt(EID));
		cp.lblNewLabel.setText("Update Course");
		String op=cp.lblNewLabel.getText();
		
		if(op.equals("Update Course")) {
			cp.lblNewLabel_6.setText(EID);
			cp.btnNewButton.setText("Update");
			cp.btnNewButton.setActionCommand("Update");
		}
		cp.btnNewButton_1.setVisible(true);
		cp.setVisible(true);
		cp.textField.setText(data[1]);
		cp.textField_2.setText(data[3]);
		cp.comboBox.setSelectedItem(data[2]);
		
		
	}

}
