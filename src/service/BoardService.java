package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
			String sql = "select num,title,credat,creusr from board";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Map<String,Object> map = new HashMap<>();
				map.put("num", rs.getInt("num"));
				map.put("title", rs.getString("title"));
				map.put("credat", rs.getString("credat"));
				map.put("creusr", rs.getString("creusr"));
				boardList.add(map);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			Connector.close();
		}
		return boardList;
	}
	public int insertBoard(Map<String,Object> board) {
		String sql = "insert into board(num, title, content, credat, cretim, creusr)\r\n" + 
				"values(\r\n" + 
				"(select nvl(max(num),0)+1 from board),\r\n" + 
				"?,?,to_char(sysdate,'YYYYMMDD'),to_char(sysdate,'HH24MiSS'),?)";
		
		Connection con = null;
		try {
			con = Connector.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, board.get("title").toString());
			ps.setString(2, board.get("content").toString());
			ps.setString(3, board.get("creusr").toString());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Connector.close();
		}
		return 0;
	}
}
