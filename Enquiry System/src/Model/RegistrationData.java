package Model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ComboBoxModel;

public class RegistrationData {
	Data D1;
	
	public RegistrationData()
	{
		D1=new Data();
		
	}
	
	
	
	public boolean addreg(String redate,String coursename,int eid,String tfees,String dfees,String cfees)
	{
		String sql="insert into Registration(RDate,CourseName,EID,TotalFees,DiscountF,CourseFees) values(?,?,?,?,?,?)";
		D1.preparestmt(sql);
		Date date=Date.valueOf(redate);
		D1.SetDateParameter(1,date);
		D1.SetStringParameter(2,coursename);
		D1.SetIntParameter(3,eid);
		D1.SetStringParameter(4,tfees);
		D1.SetStringParameter(5,dfees);
		D1.SetStringParameter(6,cfees);
		
		return D1.executeUpdate();
		
	}
	public ResultSet getdatabyname(String CourseName) {
		String sql="select *  from Registration where CourseName=?";
		D1.preparestmt(sql);
		D1.SetStringParameter(1,CourseName);
		D1.executeQuery();
		return D1.rs;
	}
	public ResultSet getdatabydate(Date date) {
		String sql="select *  from Registration where rdate=?";
		D1.preparestmt(sql);
		D1.SetDateParameter(1,date);
		D1.executeQuery();
		return D1.rs;
	}
	
	
	public ResultSet getdatabyid(int rid) {
		String sql="select * from Registration where RID=?";
		D1.preparestmt(sql);
		D1.SetIntParameter(1,rid);
		D1.executeQuery();
		return D1.rs;
		
		
	}
	public String[] readdatabyid(int x) {
		String sql="select * from Registration where RID=?";
		D1.preparestmt(sql);
		D1.SetIntParameter(1,x);
		D1.executeQuery();
		String data[]=D1.readOneRow();
		return data;

	}
	/*public boolean updateReg(String redate,String coursename,String eid,String tfees,String dfees,String cfees)
	{
		String sql="update Registration set Rdate=?,CourseName=?,EID=?,TotalFees=?,SubmittedF=?,CourseFees=?";
		D1.preparestmt(sql);
		Date date=Date.valueOf(redate);
		D1.SetDateParameter(1,date);
		D1.SetStringParameter(2,coursename);
		D1.SetStringParameter(3,eid);
		D1.SetStringParameter(4,tfees);
		D1.SetStringParameter(5,dfees);
		D1.SetStringParameter(6,cfees);
		
		return D1.executeUpdate();
		
	}
	public boolean deleteReg(int eid)
	{
		String sql="Delete * from Registration where eid=?";
		D1.preparestmt(sql);
		D1.SetIntParameter(1,eid);
		return D1.executeUpdate();
	}
	public ResultSet get_Databy_All()
	{
		String sql="Select * from Registration";
		D1.preparestmt(sql);
		
		D1.executeQuery();
		
		return D1.rs;
	}
	*/
	public String[] getallstatus() {
		String sql="select EID from Enquiry where EStatus='Pending'";
		D1.preparestmt(sql);
		D1.executeQuery();
		String str[]=D1.rsToOneArray();
		return str;
	}
	
	public int getfeesbycourse(String course) {
		// TODO Auto-generated method stub
		String sql="select  Fees from Course where CName=?";
		D1.preparestmt(sql);
		D1.SetStringParameter(1, course);
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
	public String[] getdistinctcourse() {
		String sql="select distinct CName from Course";
		D1.preparestmt(sql);
		D1.executeQuery();
		String str[]=D1.rsToOneArray();
		return str;
	}
	public ResultSet get_Databy_Course(String name)
	{
		String sql="select * from Registration where CourseName=?";
		D1.preparestmt(sql);
		D1.SetStringParameter(1,name);
		D1.executeQuery();
		return D1.rs;
	}
	public ResultSet get_Databy_id(int id)
	{
		String sql="select * from Registration where RID=?";
		D1.preparestmt(sql);
		D1.SetIntParameter(1,id);
		D1.executeQuery();
		return D1.rs;
	}
	/*public ResultSet getdatabydate1(Date date) {
		String sql="select *  from enquiry where edate=?";
		D1.preparestmt(sql);
		D1.SetDateParameter(1,date);
		D1.executeQuery();
		return D1.rs;
	}
	*/
	
}
