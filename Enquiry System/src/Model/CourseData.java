package Model;

import java.sql.ResultSet;

import Model.Data;

public class CourseData {
	
		Data d1;

		public CourseData() {
			d1=new Data();
		}



		public boolean courseenquiry(String name, String duration, String fees) {
			// TODO Auto-generated method stub
			String sql="insert into course(CName,Duration,Fees) values(?,?,?)";
			d1.preparestmt(sql);
			d1.SetStringParameter(1,name);
			d1.SetStringParameter(2,duration);
			d1.SetIntParameter(3,Integer.parseInt(fees));
			return d1.executeUpdate();

		}
		public ResultSet getdatabyid(int cid) {
			String sql="select * from course where CID=?";
			d1.preparestmt(sql);
			d1.SetIntParameter(1,cid);
			 d1.executeQuery();
			return d1.rs;
			
			
		}
		public String[] readdatabyid(int x) {
			String sql="select *  from course where CID=?";
			d1.preparestmt(sql);
			d1.SetIntParameter(1,x);
			d1.executeQuery();
			String data[]=d1.readOneRow();
			return data;

		}

		public ResultSet getdatabycname(String CourseName) {
			String sql="select *  from Course where CName=?";
			d1.preparestmt(sql);
			d1.SetStringParameter(1,CourseName);
			d1.executeQuery();
			return d1.rs;
		}
		public boolean deleteenquiry(int cid) {
			String sql="delete * from course where CID=?";
			d1.preparestmt(sql);
			d1.SetIntParameter(1,cid);
			return d1.executeUpdate();
			// TODO Auto-generated method stub
		}

		public ResultSet getalldata() {
			String sql="select *  from course ";
			d1.preparestmt(sql);
			d1.executeQuery();
			return d1.rs;
		} 
		public boolean Updatecourseenquiry(String name, String duration, String fees,int cid) {
			// TODO Auto-generated method stub
			String sql="update course set CName=?,Duration=?,Fees=? where CID=?";
			d1.preparestmt(sql);
			d1.SetStringParameter(1,name);
			d1.SetStringParameter(2,duration);
			d1.SetStringParameter(3,fees);
			d1.SetIntParameter(4,cid);
			return d1.executeUpdate();

		}

		}



