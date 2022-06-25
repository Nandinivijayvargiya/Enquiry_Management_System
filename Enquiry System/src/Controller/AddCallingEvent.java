package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import Model.CallingData;
import View.AddCallingPage;
import View.HomePage;

public class AddCallingEvent implements ActionListener {
AddCallingPage ac;
CallingData cd;
public AddCallingEvent(AddCallingPage addCallingPage) {
	// TODO Auto-generated constructor stub
		ac=addCallingPage;
		cd=new CallingData();
}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Add"))
		{
			String feedback,cadate,rdate,eid;
			eid=(ac.comboBox.getSelectedItem().toString());
			feedback=ac.textField.getText();
			cadate=ac.textField_1.getText();
			rdate=ac.textField_2.getText();
			Date date=null;
			date = Date.valueOf(cadate);
			rdate=ac.textField_2.getText();
			int x=Integer.parseInt(rdate);
			//To add date
			Date rdate1=Date.valueOf(date.toLocalDate().plusDays(x));
			
		if(cd.callingenquiry(feedback, eid, rdate1,date))
		{
			ac.lblNewLabel_7.setText("Insertion Successfull");
			
		}
		else
		{
			ac.lblNewLabel_7.setText("Insertion failed");
		}
		}
		if(e.getActionCommand().equals("Cancel"))
		{
			
		HomePage Hp=new HomePage();
		Hp.setVisible(true);
		ac.setVisible(false);
		}
		
			
		}

	}


