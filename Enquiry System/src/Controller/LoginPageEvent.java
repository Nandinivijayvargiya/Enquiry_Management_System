package Controller;
import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.LoginPage;

public class LoginPageEvent implements ActionListener {
	LoginPage lp;
	LoginData ld=new LoginData();
	

	public LoginPageEvent(LoginPage loginPage) {
		// TODO Auto-generated constructor stub
		lp=loginPage;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
		String username,Pwd;
		username=lp.textField.getText();
  		Pwd=lp.passwordField.getText();
  		if(ld.checkLogin(username,Pwd))
  		{
			HomePage Hp=new HomePage();
  		Hp.setVisible(true);
  		lp.setVisible(false);
  		}
  		else
  		{
  			lp.lblNewLabel.setText("Login Failed");
  		}
  		
		
		
		
	}

}
