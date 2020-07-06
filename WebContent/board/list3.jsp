<%@page import="java.sql.*"%>
<%@page import="common.Connector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String[] searchs = request.getParameterValues("search");
	String searchStr = request.getParameter("searchStr");
	String creusr = request.getParameter("creusr");
	Connection conn = Connector.getConnection();
	
	String sql = "select num,title,content,credat,creusr from board where 1=1";
	if(searchs!=null){
		for(String search:searchs){
			sql +=" and " + search + " like ('%'||?||'%')";
		}
	}
	PreparedStatement ps = conn.prepareStatement(sql);
	if(searchs!=null)
		for(int i=0;i<searchs.length;i++){
			ps.setString(i+1,searchStr);
		}
	ResultSet rs = ps.executeQuery();
%>
<form>
<lable for="title">제목</lable><input type="checkbox" id="title" name="search">
<lable for="content">내용</lable><input type="checkbox" id="content" name="search">
<lable for="creusr">날짜</lable><input type="checkbox" id="content" name="search">
<input type="text" name="searchStr">
<button>검색</button>
</form>

<table border="1">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>내용</th>
		<th>날짜</th>
		<th>사용자</th>
	</tr>
<%
while(rs.next()){
%>
	<tr>
		<td><%=rs.getInt("num")%></td>
		<td><%=rs.getString("title")%></td>
		<td><%=rs.getString("content")%></td>
		<td><%=rs.getString("credat")%></td>
		<td><%=rs.getString("creusr")%></td>
	</tr>
<%
}
%>
</table>
</body>
</html>