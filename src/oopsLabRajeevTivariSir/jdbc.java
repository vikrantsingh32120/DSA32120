package oopsLabRajeevTivariSir;
import java.sql.*; 
public class jdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306";
		String user="root";
		String pass="vikrant8090";
		String query="select * from `database1`.`employee table`";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
		rs.close();
		stmt.close();
		con.close();
	}

}
