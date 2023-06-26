<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SearchItem</title>
</head>

<body>
	<form action="<%=request.getContextPath()%>/SearchServlet"
		method="get">
		<table>
			<tr>
				<td>Find all Dishes containing :</td>
				<td><input type="text" name="searchItem" id="searchItem" /></td>
				<td><input type="submit" value="Search"></td>
			</tr>



		</table>
	</form>
</body>
</html>