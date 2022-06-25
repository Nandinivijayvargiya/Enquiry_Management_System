package Model;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.Calendar;

public class ViewRepData {
	Data d1;
	public ViewRepData()
	{
		d1=new Data();
	}
public ResultSet getDatabyDateWeekly()
{
	String sql="select * from enquiry where edate between ? and ?";
//#23-06-2019# and #22-07-2019#" + 
		
//	String sql="SELECT * FROM ENQUIRY WHERE `EDate` >= NOW() - INTERVAL 10 DAY AND `EDate`  < NOW()";
	d1.preparestmt(sql);
	java.sql.Date sdate,edate;
	edate=new java.sql.Date(System.currentTimeMillis());
	Calendar c = Calendar.getInstance();
    c.setTime(edate);
    c.add(Calendar.DATE, -7);
    sdate=new java.sql.Date(c.getTimeInMillis());
    
	  
	d1.SetDateParameter(1, sdate);
	d1.SetDateParameter(2, edate);
	
	d1.executeQuery();
	return d1.rs;
}
public ResultSet getDatabyDateMonthly()
{
	String sql="select * from enquiry where edate between ? and ?";
//#23-06-2019# and #22-07-2019#" + 
		
//	String sql="SELECT * FROM ENQUIRY WHERE `EDate` >= NOW() - INTERVAL 10 DAY AND `EDate`  < NOW()";
	d1.preparestmt(sql);
	java.sql.Date sdate,edate;
	edate=new java.sql.Date(System.currentTimeMillis());
	Calendar c = Calendar.getInstance();
    c.setTime(edate);
    c.add(Calendar.MONTH, -1);
    sdate=new java.sql.Date(c.getTimeInMillis());
    
   
	d1.SetDateParameter(1, sdate);
	d1.SetDateParameter(2, edate);
	
	d1.executeQuery();
	return d1.rs;
}
public String[] getdistinctenquiry() {
	String sql="select distinct EnquiryFor from Enquiry";
	d1.preparestmt(sql);
	d1.executeQuery();
	String str[]=d1.rsToOneArray();
	return str;
}
public ResultSet getDatabyCourse(String course)
{
String sql="Select * from Enquiry where EnquiryFor=?";
d1.preparestmt(sql);
d1.SetStringParameter(1,course);
d1.executeQuery();
return d1.rs;
}
public void countrow()
{
String sql="SELECT COUNT(*) AS rowcount FROM Enquiry where EDate=?";
d1.preparestmt(sql);
d1.executeQuery();

}
}
