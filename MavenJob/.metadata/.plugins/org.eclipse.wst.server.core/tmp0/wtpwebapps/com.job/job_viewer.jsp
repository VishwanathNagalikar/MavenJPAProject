<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.form {
	margin-left: 20%;
	margin-right: 20%;
	width: 50%;
	height: 100%;
	background-color: #44ed98;
	text-align: center;
}

p {
    display:block;]
	align-items:center;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<div class="form">
		<form action="ServletController" method="post">

			<p>
				Candidate ID :<input type="text" name="candidate_id">
			</p>
			<p>
				Name: <input type="text" name="candidate_name">
			</p>
			<p>
				Skills: <input type="text" name="skills">
			</p>
			<p>
				Experience : <input type="text" name="experience">
			</p>
			<input type="submit" name="SUBMIT">

		</form>
	</div>
</body>
</html>