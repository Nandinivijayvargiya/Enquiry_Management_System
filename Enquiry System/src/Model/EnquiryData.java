package Model;
import java.sql.Date;
import java.sql.*;
public class EnquiryData {
	Data D1;
	public EnquiryData()
	{
		D1=new Data();
		
	}
	public boolean addenquiry(String name,String mobno,String email,String cdate,String status,String clgname,String coursename,String enquiryf)
	{
		String Sql="insert into Enquiry(ename,mobile_no,college_name,course,email_id,edate,estatus,enquiryfor) values(?,?,?,?,?,?,?,?)";
		D1.preparestmt(Sql);
		D1.SetStringParameter(1,name);
		D1.SetStringParameter(2,mobno);
		D1.SetStringParameter(3,clgname);
		D1.SetStringParameter(4,coursename);
		D1.SetStringParameter(5,email);
		Date date=Date.valueOf(cdate);
		D1.SetDateParameter(6,date);
		D1.SetStringParameter(7,status);
		D1.SetStringParameter(8,enquiryf);
		return D1.executeUpdate();
		
	}
	public String[] get_distinct_Course()
	{
		D1.preparestmt("select distinct Course from Enquiry");
		D1.executeQuery();
		String Str[]=D1.rsToOneArray();
		return Str;
	
	}
	public String[] get_distinct_College_Name()
	{
		D1.preparestmt("select distinct College_Name from Enquiry");
		D1.executeQuery();
		String Str[]=D1.rsToOneArray();
		return Str;
	
	}
	public ResultSet get_Databy_id(int ID)
	{
		String sql="select * from Enquiry where EID=?";
		D1.preparestmt(sql);
		D1.SetIntParameter(1,ID);
		D1.executeQuery();
		
		return D1.rs;
	
	}
	public ResultSet get_Databy_Ename(String name)
	{
		String sql="select * from enquiry where EName=?";
		D1.preparestmt(sql);
		D1.SetStringParameter(1,name);
		D1.executeQuery();
		return D1.rs;
	}
	public ResultSet get_Databy_course(String course)
	{
		String sql="select * from Enquiry where Course=?";
		D1.preparestmt(sql);
		D1.SetStringParameter(1,course);
		D1.executeQuery();
		
		return D1.rs;
	}
	public ResultSet get_Databy_All()
	{
		String sql="Select * from Enquiry";
		D1.preparestmt(sql);
		
		D1.executeQuery();
		
		return D1.rs;
	}
	public boolean updateenquiry(String name,String mobno,String email,String cdate,String clgname,String coursename,String status,int id,String enquiryf)
	{
		String Sql="update Enquiry set ename=?,mobile_no=?,college_name=?,course=?,email_id=?,edate=?,estatus=?,enquiryfor=? where eid=?";
		D1.preparestmt(Sql);
		D1.SetStringParameter(1,name);
		D1.SetStringParameter(2,mobno);
		D1.SetStringParameter(3,clgname);
		D1.SetStringParameter(4,coursename);
		D1.SetStringParameter(5,email);
	    D1.SetStringParameter(6,cdate);
		D1.SetStringParameter(7,status);
		D1.SetStringParameter(8,enquiryf);
		D1.SetIntParameter(9,id);
        return D1.executeUpdate();
		
	}
	public boolean updateStatus(int eid, String status)
	{
		String Sql="UPDATE Enquiry set estatus=? where eid=?";
		D1.preparestmt(Sql);
		D1.SetStringParameter(1,status);	
		D1.SetIntParameter(2,eid);
        return D1.executeUpdate();
		
	}
	public boolean deleteEnquiry(int id)
{
	String sql="delete * from Enquiry where EID=?";
	D1.preparestmt(sql);
	D1.SetIntParameter(1,id);
	return D1.executeUpdate();
	
}
	public String[] readdatabyid(int x) {
		String sql="select *  from enquiry where Eid=?";
		D1.preparestmt(sql);
		D1.SetIntParameter(1, x);
		D1.executeQuery();
		String data[]=D1.readOneRow();
		return data;

	
	
}
	public String[] getallid() {
		String sql="select EID from Enquiry";
		D1.preparestmt(sql);
		D1.executeQuery();
		String str[]=D1.rsToOneArray();
		return str;
	} 
	
}
	
