<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h>This is hello.jsp</h>
	<p>
		${info.name}
		<br />
		${info.intro }
	</p>
	<form action="<%=request.getContextPath()%>/hello/form" method="post">
		<input type="text" name="name" />
		<input type="submit" value="提交" />
	</form>
</body>
</html>