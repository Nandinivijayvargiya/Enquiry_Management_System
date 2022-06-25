package Model;

import java.sql.Date;
import java.sql.ResultSet;

import Model.Data;

public class CallingData {
	
		Data d1;

		public CallingData() {
			d1=new Data();
		}
		private void setStringParameter(int i, String feedback) {
			// TODO Auto-generated method stub
			
		}
		public boolean callingenquiry(String feedback,String eid, Date cadate, Date rdate1) {
			// TODO Auto-generated method stub
			
			String sql="insert into calling(feedback,eid,cdate,rdate) values(?,?,?,?)";
			d1.preparestmt(sql);
			d1.SetStringParameter(1,feedback);
			d1.SetStringParameter(2,eid);
			d1.SetDateParameter(3,cadate);
			d1.SetDateParameter(4,rdate1);
			return d1.executeUpdate();
			
		}
		public ResultSet getdatabyeid(int id) {
			String sql="select *  from calling where eid=?";
			d1.preparestmt(sql);
			d1.SetIntParameter(1,id);
			d1.executeQuery();
			return d1.rs;
		}

		public ResultSet getdatabyname(String name) {
			String sql="select *  from calling where eid=(select eid from enquiry where ename=?)";
			d1.preparestmt(sql);
			d1.SetStringParameter(1,name);
			d1.executeQuery();
			return d1.rs;
		}
		public ResultSet getdatabydate(Date date) {
			String sql="select *  from enquiry where edate=?";
			d1.preparestmt(sql);
			d1.SetDateParameter(1,date);
			d1.executeQuery();
			return d1.rs;
		}
		public String[] readdatabyid(int x) {
			String sql="select *  from calling where cid=?";
			d1.preparestmt(sql);
			d1.SetIntParameter(1,x);
			d1.executeQuery();
			String data[]=d1.readOneRow();
			return data;

		}
		public ResultSet getalldata() {
			String sql="select *  from calling ";
			d1.preparestmt(sql);
			d1.executeQuery();
			return d1.rs;
		} 



		}



