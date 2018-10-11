package jdbcutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JdbcUtil {
	/**
	 * 
	 * @return
	 * @�������õ�����
	 * @date:2018��2��27��
	 * @version:1.0.0.1
	 */
	public static Connection getConnection(){
		Connection con = null;
		try {
			String url="jdbc:mysql://localhost:3306/test";
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, "root", "159357123");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	/**
	 * 
	 * @param con ���Ӷ���
	 * @param ps Ԥ����
	 * @param rs �����
	 * @�������ر���Դ
	 * @date:2018��2��27��
	 * @version:1.0.0.1
	 */
	public static void close(Connection con,PreparedStatement ps,ResultSet rs){
		try {
			if(rs!=null){
			rs.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(ps!=null){
				ps.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				try {
					if(con!=null){
					con.close();}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		Connection con = JdbcUtil.getConnection();
		if(con!=null){
			System.out.println("ok");
		}else{ 
			System.out.println("on");
		}
	}
}
