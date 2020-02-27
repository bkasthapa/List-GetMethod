<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Patient List</h1>

<table border="2" width="70%" cellpadding="2">
	<tr>
		
		<th>Name</th>
		<th>Address</th>
		<th>Age</th>
		<th>DOB</th>
	</tr>
	
	<c:forEach var="ward" items="${list}">
		<tr>
			
			<td>${ward.name}</td>
			<td>${ward.address}</td>
			<td>${ward.age}</td>
			<td>${ward.doB}</td>


		</tr>
	</c:forEach>
</table>