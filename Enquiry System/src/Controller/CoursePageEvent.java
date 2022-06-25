package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.CourseData;
import View.CoursePage;
import View.HomePage;

public class CoursePageEvent implements ActionListener {
CoursePage cp;
CourseData cd;
	public CoursePageEvent(CoursePage coursePage) {
		// TODO Auto-generated constructor stub
		cp=coursePage;
		cd=new CourseData();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
if(e.getActionCommand().equals("Add")){

			
			String name,duration,fees;
			name=cp.textField.getText();
			fees=cp.textField_2.getText();
			duration=cp.comboBox.getSelectedItem().toString();
			
            if(cd.courseenquiry(name, duration, fees))
            {
				cp.lblNewLabel_5.setText("Insertion Successfull");
			    cp.setVisible(true);
		
            }
			else {
				cp.lblNewLabel_5.setText("Insertion Failed");
				cp.setVisible(true);
			}
}
            else if(e.getActionCommand().equals("Update"))
            {
            	int cid=Integer.parseInt(cp.lblNewLabel_6 .getText());
            	String name=cp.textField.getText();
            	String duration=cp.comboBox.getSelectedItem().toString();
            	String fees=cp.textField_2.getText();
            	
            	if(cd.Updatecourseenquiry(name, duration, fees,cid))
            	{
            		cp.lblNewLabel_5.setText("Updation Succesfull");
            	
            }
            	else
            	{
            		cp.lblNewLabel_5.setText("Updation Succesfull");
            	}
			}
            else if(e.getActionCommand().equals("Delete"))
            {
            	int cid=Integer.parseInt(cp.lblNewLabel_6 .getText());
            	if(cd.deleteenquiry(cid))
            	{
            		cp.lblNewLabel_5.setText("Deleted Successfully");
            	}
            	else
            	{
            		cp.lblNewLabel_5.setText("Deletion Failed");
            	}
            }
	
if(e.getActionCommand().equals("Cancel"))
{
	HomePage hp=new HomePage();
	hp.setVisible(true);
	cp.setVisible(false);
}
			
		
			
	}


	



	}

