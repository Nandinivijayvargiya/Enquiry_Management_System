package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.CourseData;
import View.CoursePage;
import View.DeleteCourse;
import View.HomePage;

public class DeleteCourseEvent implements ActionListener, ListSelectionListener {
DeleteCourse dc;
CourseData cd;

	public DeleteCourseEvent(DeleteCourse deleteCourse) {
		// TODO Auto-generated constructor stub
		dc=deleteCourse;
		cd=new CourseData();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Search"))
		{
			String data=dc.textField.getText();
	     	   ResultSet rs;
	     	   String searchby=dc.comboBox.getSelectedItem().toString();
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
	     		 dc.table.setModel(Model.Data.buildTableModel(rs)); 
	     	 
	     	   
	        }
		if(e.getActionCommand().equals("Cancel"))
		{
			HomePage hp=new HomePage();
			hp.setVisible(true);
			dc.setVisible(false);
			
		}
		}
		

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		String CID=dc.table.getValueAt(dc.table.getSelectedRow(), 0).toString();
		String data[]=cd.readdatabyid(Integer.parseInt(CID));
		CoursePage cp=new CoursePage();
		
		cp.lblNewLabel.setText("Delete Course");
		String op=cp.lblNewLabel.getText();
		cp.setVisible(true);
		if(op.equals("Delete Course")) {
			cp.lblNewLabel_6.setText(CID);
			cp.btnNewButton.setText("Delete");
			cp.btnNewButton.setActionCommand("Delete");
		}
		dc.dispose();
		cp.textField.setText(data[1]);
		cp.textField_2.setText(data[3]);
		cp.comboBox.setSelectedItem(data[2]);
		
	}


		
	}


