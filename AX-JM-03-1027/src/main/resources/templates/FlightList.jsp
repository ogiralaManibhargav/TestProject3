
<!DOCTYPE html>
<html>
<style>
table, th, td {
  border:1px solid black;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>FlightListDetails</title>
<h1><center>FlightListDetails</center></h1>
</head>
<body>
<table style="width:100%">


       <tr>
            <td>
               FlightNo
            </td>
            <td>
               CarrierName
            </td>
            <td>
               FlightModel
            </td>
            <td>
               Source
            </td>
            <td>
               Destination
            </td>
            <td>
            Status
            </td>
       </tr>


<tr th:each="prod: ${Flight}">
      <td th:text="${prod.FlightNo}"></td>
      <td th:text="${prod.carrierName }"></td>
      <td th:text="${prod.flightModel }"></td>
      <td th:text="${prod.source }"></td>
        <td th:text="${prod.destination }"></td>
      <td th:text="${prod.status }"></td>
      
      
    </tr>

</table>
<a href ="deelete">Deleteflights</a>
<a href =registeringFlight>Add Flight details</a>

<a href ="find">Find</a>
</body>
</html>