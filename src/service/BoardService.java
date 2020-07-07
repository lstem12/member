package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import common.Connector;

public class BoardService {

	public List<Map<String,Object>> getBoardList(){
		List<Map<String,Object>> boardList = new ArrayList<>();
		Connection con = null;
		try {
			con = Connector.getConnection();
			String sql = "select * from board";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Map<String,Object> map = new HashMap<>();
				map.put("num", rs.getInt("num"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			Connector.close();
		}
		return boardList;
	}
}
