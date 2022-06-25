package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Model.FeeData;
import View.FeesPage;
import View.HomePage;


public class FeeEventPage implements ItemListener, ActionListener, KeyListener {
FeesPage fp;
FeeData fd;
	public FeeEventPage(FeesPage feesPage) {
		// TODO Auto-generated constructor stub
		fp=feesPage;
		fd=new FeeData();
	}

	

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		String str=fp.comboBox.getSelectedItem().toString();
		   int x=fd.getridbysname(str);
		   fp.textField_2.setText(x+"");
		   String str1=(fp.textField_2.getText());
		   int y=fd.getfeesbysname(str1);
		   fp.textField_3.setText(y+"");
		  
			
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Add"))
		{
			String name,rid,feedate,famount;
			name=fp.comboBox.getSelectedItem().toString();
			rid=(fp.textField_2.getText());
			feedate=fp.textField_1.getText();
			famount=fp.textField.getText();
			if(fd.addfee(name, rid, feedate, famount))
			{
				fp.lblNewLabel_3.setText("Added Successfully");
			}
			else
			{
				fp.lblNewLabel_3.setText("Failed");
			}
		}
			if(e.getActionCommand().equals("Cancel"))
			{
				
				HomePage hp=new HomePage();
				hp.setVisible(true);
				fp.setVisible(false);
				
			}
			
		}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		int tfees,paidfees,amountleft;
		tfees=Integer.parseInt(fp.textField_3.getText());
		paidfees=Integer.parseInt(fp.textField_4.getText());
		amountleft=tfees-paidfees;
		fp.textField.setText(Integer.toString(amountleft));
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		
	}

	


