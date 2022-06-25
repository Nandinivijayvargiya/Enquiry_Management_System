package Model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FeeData {
Data D1;
public FeeData()
{
	D1=new Data();
}
public String[] getallsname() {
	String sql="select Ename from Enquiry where EStatus='Join'";
	D1.preparestmt(sql);
	D1.executeQuery();
	String str[]=D1.rsToOneArray();
	return str;
}
public int getridbysname(String sname) {
	// TODO Auto-generated method stub
	String sql="select RID from [Registration] JOIN Enquiry on Enquiry.EID=[Registration].EID where EName=?";
	D1.preparestmt(sql);
	D1.SetStringParameter(1,sname);
	D1.executeQuery();
	try {
		if(D1.rs.next()) {
			try {
				return D1.rs.getInt(1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			return 0;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return 0;
	
}
public boolean addfee(String name,String rid,String feedate,String famount)
{
	String sql="insert into Fees(Name,RID,FeeDate,FeeAmount) values(?,?,?,?)";
	D1.preparestmt(sql);
	D1.SetStringParameter(1,name);
	D1.SetStringParameter(2,rid);
	Date date=Date.valueOf(feedate);
	D1.SetDateParameter(3,date);
	
	
	D1.SetStringParameter(4,famount);
	
	return D1.executeUpdate();
	
}

public int getfeesbysname(String sname) {
	// TODO Auto-generated method stub
	String sql="select TotalFees from Registration where RID=?";
	D1.preparestmt(sql);
	D1.SetStringParameter(1,sname);
	D1.executeQuery();
	try {
		if(D1.rs.next()) {
			try {
				return D1.rs.getInt(1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			return 0;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return 0;
	
	
}
public ResultSet getdatabyname(String name) {
	String sql="select *  from Fees where Name=?";
	D1.preparestmt(sql);
	D1.SetStringParameter(1,name);
	D1.executeQuery();
	return D1.rs;
}

public ResultSet getdatabyfid(int fid) {
	String sql="select * from Fees where FID=?";
	D1.preparestmt(sql);
	D1.SetIntParameter(1,fid);
	D1.executeQuery();
	return D1.rs;
	
	
}
public String[] readdatabyid(int x) {
	String sql="select * from Fees where FID=?";
	D1.preparestmt(sql);
	D1.SetIntParameter(1,x);
	D1.executeQuery();
	String data[]=D1.readOneRow();
	return data;

}


}
