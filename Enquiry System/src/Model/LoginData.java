package Model;
import java.sql.*;
import Controller.*;
public class LoginData {
	Data D1;
	public LoginData()
	{
		D1=new Data();
	}
	public boolean checkLogin(String uname,String pwd)
	{
		D1.preparestmt("select * from Login where username=? and password=?");
		D1.SetStringParameter(1,uname);
		D1.SetStringParameter(2, pwd);
		D1.executeQuery();
		try
		{
			if(D1.rs.next())
			{
				return true;
			}
			else 
			{
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return false;
		}
	}

