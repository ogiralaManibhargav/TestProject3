<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter the booking Details</title>
</head>
<body>
<table style="width:100%">


       <tr>
            <td>
               Bookingno
            </td>
            <td>
              age
            </td>
            <td>
            Bookingdate
            </td>
            <td>
              name
            </td>
          
            
       </tr>


<tr th:each="prod: ${Booking}">
      <td th:text="${prod.bookingId}"></td>
      <td th:text="${prod.age }"></td>
      <td th:text="${prod.bookingDate }"></td>
        <td th:text="${prod.name}"></td>
     
       
      
      
    </tr>

</table>
<a href ="deelete">Deleteflights</a>
<a href =registeringFlight>Add Flight details</a>

<a href ="find">Find</a>
</body>
</html>



</body>
</html>