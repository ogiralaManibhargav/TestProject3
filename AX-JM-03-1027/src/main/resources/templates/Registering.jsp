
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Registration</title>
</head>
<body>
<h1>Flight registration</h1>

<form action="/rest/saveFlightdetails" method="get">

<table>
<!-- <tr>
<td> Enter the Flightno:</td><td> <input type="text" name="Flightno"/></td></tr>
<tr>-->
<td>Enter the CarrierName:</td><td><input type="text"name="carrierName"/></td>
</tr>
<tr>
<td>Enter the FlightModel:</td><td><input type="text"name="flightModel"/></td>
</tr>
<tr>
<td>Enter the SeatCapacity:</td><td><input type="text"name="seatCapacity"/></td>
</tr>
<tr>
<td>Enter the Source:</td><td><input type="text"name="source"/></td>
</tr>
<tr>
<td>Enter the Destination:</td><td><input type="text"name="destination"/></td>
</tr>
</tr>
<tr>
<td>Enter the Dateofjourney:</td><td><input type="text"name="dateOfjourney"/></td>
</tr>
<tr><td><input type="submit" value="Register"/></td></tr>
</table>


</form>


<a href ="Allflights">ViewFlights</a>
<a href ="deelete">Deleteflights</a>
<a href ="find">Find</a>
</body>
</html>