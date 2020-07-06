<%@page import="common.Connector"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String title = request.getParameter("title");
String content = request.getParameter("content");
String creusr = request.getParameter("creusr");

String sql = "insert into board(num, title, content, credat, cretim, creusr)\r\n" + 
		"values(\r\n" + 
		"(select nvl(max(num),0)+1 from board),\r\n" + 
		"?,?,to_char(sysdate,'YYYYMMDD'),to_char(sysdate,'HH24MiSS'),?)";
Connection con = null;

try{
con = Connector.getConnection();
PreparedStatement ps = con.prepareStatement(sql);
ps.setString(1, title);
ps.setString(2, content);
ps.setString(3, creusr);

int result = ps.executeUpdate();
	if(result == 1){
		out.println("잘들어갔음");
	}
}catch(SQLException e){
		out.println("에러났음");
}finally{
	Connector.close();
}
%>
<script>
	location.href="/board/list.jsp";
</script>