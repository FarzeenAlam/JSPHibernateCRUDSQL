<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details to Edit</title>
</head>
<body>

	<form action="update">
	<fieldset>
	<legend>Enter the new details</legend>
	<label>Enter the id:</label><br>
	<input type="number" name="id" required><br>
	<label>Enter the name:</label><br>
	<input type="text" name="Name" required><br>
	<label>Enter the position:</label><br>
	<input type="text" name="Position" required><br>
	<input type = "submit" value="Edit"><br>
	</fieldset>
	</form>
</body>
</html>