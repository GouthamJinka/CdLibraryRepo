<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<h2>CD LSIT</h2>

<table border="1">
<tr><th>Sl.NO</th><th>TITLE</th><th>ARTIST</th><th>YEAR OF RELEASE</th><th>NUMBER OF TRACKS</th><th>PLAYING TIME</th><th>TRACK LIST</th></tr>
<c:forEach items="${cd}" var="cdList">
			<tr>
				<td>${cdList.slNo}</td><td>${cdList.title}</td>	<td>${cdList.artist}</td>
				<td>${cdList.year}</td><td>${cdList.numberofTracks}</td><td>${cdList.playingtime}</td>
				<td><table border="1"><tr><th>TITLE</th><th>AUTHOR</th><th>PLAYING TIME</th></tr>
				<c:forEach items="${cdList.tracks}" var="tracks">
				<tr><td>${tracks.title}</td><td>${tracks.author}</td><td>${tracks.playingtime}</td></tr>
				</c:forEach>
				</table>
				</td>
			</tr>
</c:forEach>
</table>
</body>
</html>