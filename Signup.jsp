<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>SIGN UP</h1>
	<form action="signup">
		<table style="with: 50%">
			<tr>
				<td>Emp ID</td>
				<td><input type="text" name="empID" /></td>
			</tr>
			<tr>
				<td>Emp name</td>
				<td><input type="text" name="empname" /></td>
			</tr>
			<tr>
				<td>Emp salary</td>
				<td><input type="text" name="empsalary" /></td>
			</tr>

			<tr>
				<td>Emp age</td>
				<td><input type="text" name="empage" /></td>
			</tr>
		</table>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>