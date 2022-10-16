<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>SignUp</title>
</head>
<body align="center">
	<div>
		<h1>SignUp</h1>
		<br>
	</div>
	<form action="signIn" method="post">
		<div style="text-align: center;">
			<div class="mb-3 row">
				<label for="username" class="col-sm-2 col-form-label">Username:</label>
				<div class="col-sm-10">
					<input type="text" id="username" name="cusUsrName">
				</div>
			</div>
			<div class="mb-3 row">
				<label for="passw" class="col-sm-2 col-form-label">Password:</label>
				<div class="col-sm-10">
					<input type="text" id="passw" name="cusPassword">
				</div>
			</div>
			<div style="text-align: center;">
				<input type="submit" class="btn btn-success" value="SignIn">
			</div>
		</div>
	</form>
</body>
</html>