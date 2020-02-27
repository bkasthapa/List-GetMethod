<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

</head>
<body>
	<h2>Customer Data Edit Page</h2>

	<f:form id="editForm" modelAttribute="doedit" action="editsave"
		method="post">


		<table align="center">

			<tr>
				<td></td>
				<td><f:hidden path="id" /></td>
			</tr>

			<tr>
				<td><f:label path="name">Name: </f:label></td>
				<td><f:input path="name" name="name" id="name" /></td>
			</tr>

			<tr>
				<td><f:label path="address">Address: </f:label></td>
				<td><f:input path="address" name="address" id="address" /></td>
			</tr>

			<tr>
				<td><f:label path="age">Age: </f:label></td>
				<td><f:input path="age" name="age" id="age" /></td>
			</tr>

			

			<td></td>
			<td align="center"><f:button id="edit" name="edit">
					<input type="submit" value="Edit Save" />
				</f:button></td>
			</tr>
			<tr></tr>

		</table>

	</f:form>
</body>
</html>