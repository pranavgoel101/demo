package jdbc;
import java.sql.*;
import java.util.Scanner;
public class TestApplication {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Statement st=null;
		Scanner sc=new Scanner(System.in);
		int eid,esal,i,ch;
		String ename;

		try {
			//step 1: load driver
			Class.forName("oracle.jdbc.OracleDriver");
			//step 2: connection to db
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456789");
			System.out.println("connection done...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		do {
		System.out.println("1.Insert");
		System.out.println("2.Delete");
		System.out.println("3.Update");
		System.out.println("4.Search");
		System.out.println("5.Display all");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			try {
				System.out.println("enter id name and salary");
				eid=sc.nextInt();
				ename=sc.next();
				esal=sc.nextInt();
				ps=con.prepareStatement("insert into emp55 values(?,?,?)");
				ps.setInt(1,eid);
				ps.setString(2,ename);
				ps.setInt(3,esal);
				i=ps.executeUpdate();
				if(i>0)
					System.out.println("record saved");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				System.out.println("enter id to be deleted");
				eid=sc.nextInt();
				ps=con.prepareStatement("delete from emp55 where eid=?");
				ps.setInt(1,eid);
				i=ps.executeUpdate();
				if(i>0)
					System.out.println("record deleted");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 3:
			try {
				System.out.println("enter id to be updated");
				eid=sc.nextInt();
				System.out.println("enter new salary");
				esal=sc.nextInt();
				ps=con.prepareStatement("update emp55 set esal=? where eid=?");
				ps.setInt(1,esal);
				ps.setInt(2,eid);
				i=ps.executeUpdate();
				if(i>0)
					System.out.println("record updated");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;	
		case 4:
			try {
				System.out.println("enter id to be searched");
				eid=sc.nextInt();
				ps=con.prepareStatement("select * from emp55 where eid=?");
				ps.setInt(1,eid);
				rs=ps.executeQuery();
				if(rs.next())
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
				else
					System.out.println("not found");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 5:
			try {
				ps=con.prepareStatement("select * from emp55");
				rs=ps.executeQuery();
				ResultSetMetaData rsmd=rs.getMetaData();
				for(i=1;i<=rsmd.getColumnCount();i++)
				{
					System.out.print(rsmd.getColumnName(i)+"\t");
				}
				/*
				 * String str="select * from emp55";
				 * st=con.createStatement();
				 * rs=st.executeQuery(str);
				 */
				System.out.println();
				while(rs.next())
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;	
		}
		System.out.println("do you want to continue press 1 if yes");
		ch=sc.nextInt();
		}while(ch==1);
		
	}
}
