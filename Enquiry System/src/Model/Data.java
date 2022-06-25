package Model;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;
public class Data {
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	String sql;
	public static DefaultTableModel buildTableModel(ResultSet rs)
    {
	ResultSetMetaData metaData = null;
	Vector<Vector<Object>> Data = new Vector<Vector<Object>>();
	try {
		metaData = rs.getMetaData();
	} 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	// names of columns
	Vector<String> columnNames = new Vector<String>();
	int columnCount;
	try {
		columnCount = metaData.getColumnCount();

	for (int column = 1; column <= columnCount; column++) {
	   columnNames.add(metaData.getColumnName(column));
	}

	// data of the table

	while (rs.next()) {
	   Vector<Object> vector = new Vector<Object>();
	   for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
	       vector.add(rs.getObject(columnIndex));
	   }
	   Data.add(vector);
	}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return new DefaultTableModel(Data, columnNames);

	}
	
		public Data()
		{
			try
			{
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	        }
	        catch(ClassNotFoundException cnfex) 
			{
	 
	            System.out.println("Problem in loading or registering MS Access JDBC driver");
	            cnfex.printStackTrace();
	        }
	 
	        // Step 2: Opening database connection
	        try 
	        {
	 
	            String msAccDB = "E:\\EnquiryDatabase.accdb";
	            String dbURL = "jdbc:ucanaccess://" + msAccDB; 
	 
	            // Step 2.A: Create and 
	            // get connection using DriverManager class
	            con = DriverManager.getConnection(dbURL); 
	 
	            // Step 2.B: Creating JDBC Statement 
	         
	 
	        }
	        catch(SQLException sqlex)
	        {
	            sqlex.printStackTrace();
	        }
		}
	
	public void preparestmt(String Str)
	{
	try
	{
		stmt=con.prepareStatement(Str);
				
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	}
	public void SetStringParameter(String arg[])
	{
		for(int i=0;i<arg.length;i++)
		{
		try{
			stmt.setString(i+1, arg[i]);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		}
		
	}
	public void SetIntParameter(int loc,int value)
	{
		try
		{
			stmt.setInt(loc,value);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void SetDateParameter(int loc,java.sql.Date d1)
	{
		try
		{
			stmt.setDate(loc,d1);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void SetStringParameter(int loc,String value)
	{
		try
		{
			stmt.setString(loc,value);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void SetDoubleParameter(int loc,Double value)
	{
		try
		{
			stmt.setDouble(loc,value);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public boolean executeUpdate()
	{
		boolean x=false;
		try
		{
			x=stmt.execute();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return !x;
	}
	public void executeQuery()
	{
		try
		{
			rs=stmt.executeQuery();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public String[] readOneRow()
	{
		ArrayList str=new ArrayList();
		int i=0;
		try
		{
			ResultSetMetaData rsmd=rs.getMetaData();
			int col=rsmd.getColumnCount();
			if(rs.next())
			{
				for(i=1;i<=col;i++)
				{
					str.add(rs.getString(i));
				}
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		String str1[]=new String[str.size()];
		str1=(String[])str.toArray(str1);
		return str1;
	}
	public String[] rsToOneArray()
	{
		ArrayList str=new ArrayList();
		int i=0;
		try
		{
			while(rs.next())
			{
				str.add(rs.getString(1));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		String str1[]=new String[str.size()];
		str1=(String[])str.toArray(str1);
		return str1;
	}

	
}
