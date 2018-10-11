package Dao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import Bean.Bean;
import Dao.ServletDao;
import jdbcutil.JdbcUtil;

public class ServletDaoimp implements ServletDao{

	@Override
	public List<Bean> lists() {
		List<Bean>list=new ArrayList<Bean>();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="SELECT * FROM staffinfo";
		con=JdbcUtil.getConnection();
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				list.add(new Bean(rs.getString("staName"), rs.getString("staSex"), rs.getString("staEnroDate")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.close(con, ps, rs);
		}
		return list;
	}
	
	public static void main(String[] args) {
		List<Bean>lists=new ServletDaoimp().lists();
		for (Bean bean : lists) {
			System.out.println(bean.getStaName()+"="+bean.getStaEnroDate()+"="+bean.getStasex());
		}
	}
	
}
