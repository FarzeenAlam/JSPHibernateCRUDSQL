<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Details</title>
</head>
<body>

	<form action="addStudent" method="post">
	<fieldset>
	<legend>Add a record</legend>
	<label>Enter the name:</label><br>
	<input type = "text" name="Name" required><br>
	<label>Enter the position:</label><br>
	<input type = "text" name="Position" required><br>
	<input type = "submit" value="Add"><br>
	</fieldset>
	</form>

</body>
</html>