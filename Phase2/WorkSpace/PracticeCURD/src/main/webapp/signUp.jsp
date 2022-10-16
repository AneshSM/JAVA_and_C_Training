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
	<form action="signUpCon" method="post">
		<div style="text-align: center;">
			<div class="mb-3 row">
				<label for="username" class="col-sm-2 col-form-label">Username:</label>
				<div class="col-sm-10">
					<input type="text" id="username" name="cusUsrName" required>
				</div>
			</div>
			<div class="mb-3 row">
				<label for="passw" class="col-sm-2 col-form-label" >Password:</label>
				<div class="col-sm-10">
					<input type="password" id="passw" name="cusPassw" required>
				</div>
			</div>
			<div class="mb-3 row">
					<label for="name" class="col-sm-2 col-form-label" >Name:</label>
					<div class="col-sm-10">
						<input type="text" id="name" name="cusName" required>
					</div>
				</div>
			</div>
			<div class="mb-3 row">
					<label for="Email" class="col-sm-2 col-form-label">Email:</label>
					<div class="col-sm-10">
						<input type="email" id="Email" name="cusEmail" required>
					</div>
			</div>
			<div class="mb-3 row">
					<label for="phno" class="col-sm-2 col-form-label">Phone Number:</label>
					<div class="col-sm-10">
						<input type="number" min="1111111111" max="9999999999" id="phno" name="cusPhNo">
					</div>
			</div>
				<div style="text-align: center;">
					<input type="submit" class="btn btn-success" value="SignUp">
				</div>
	</form>
</body>
</html>