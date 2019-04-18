<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	.container {
		min-width : 400px;
		line-height: 50px;
	}
</style>
</head>
<body>
<div class="container">
	<table width="100%">
		<colgroup>
			<col width="10%">
			<col width="50%">
			<col width="20%">
			<col width="20%">
		</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${resultList }" var="result">
				<tr>
					<td align="center">${result.num }</td>
					<td align="left"><a href="${pageContext.request.contextPath }/detail?num=${result.num }">${result.title }</a></td>
					<td align="center">${result.name }</td>
					<td align="center">${result.regdate }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	${pagination }
</div>
</body>
</html>