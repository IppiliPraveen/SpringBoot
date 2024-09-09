<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="UTF-8">
<title>Register page</title>
</head>
<link href="style\style.css" rel="stylesheet" type="text/css">
<body style="background-color: #EBEFEE;">
	<div align="center" class="headerStyle">
		<h1 class="h1">Register</h1>
	</div>
	<div align="right">
		<table align="right">
			<tr>
				<f:form action="logout" method="post">
					<table align="right" class="actionButton">
						<tr>
							<td><button class="button" type="submit" name="Close">Close</button></td>

						</tr>
					</table>
				</f:form>
			</tr>
		</table>
	</div>
	<div align="center" class="box-shadow">
		<f:form action="userRegister" method="post" modelAttribute="login">
			<table class="table">
				<tr class="tr">
					<td class="td"><img src="images/userID.png"></td>
					<td class="td"><f:input style="text-align: center" path="userName"
							placeholder="User Id" /></td>
				</tr>
				<tr class="td">
					<td class="td"><img src="images/locked.png"></td>
					<td class="td"><f:input type="password"
							style="text-align: center" path="password" placeholder="Password" /></td>
				</tr>
			</table>
			</br>
			<table class="actionButton">
				<tr class="tr">
					<td class="td" colspan="2" align="center"><button class="button" type="submit"
							name="register">register</button></td>
				</tr>
			</table>
		</f:form>
	</div>
</body>

</html>