<!--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>-->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search by Source or destination</title>
</head>
<body>
<form action="bysource/"method="get">
Enter the source :<input type="text"  name="findbysrc" id="findbysrc">
<input type="submit" value="search">
</form>
<form action="bydestination/"method="get">
Enter the Destination :<input type="text"  name="findbydestiny" id="findbydestiny">
<input type="submit" value="search">
</form>

<a href ="/rest/Allflights">ViewFlights</a>
<a href =/rest/registeringFlight>Add Flight details</a>
</body>
</html>