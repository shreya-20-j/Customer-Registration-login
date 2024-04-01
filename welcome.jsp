<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <style>
        /* CSS styles for the box */
        .box-heading {
             background-color: #white; /* Green background color */
            color: black; /* White text color */
            text-align: center; /* Center align the text */
            padding: 20px; /* Add padding */
            width: 100%; /* Full width */
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2); /* Add a shadow */
            position: fixed; /* Fix the position */
            top: 80; /* Stick to the top */
            left: 0; /* Align to the left */
            z-index: 999; /
        }
        
        /* CSS styles for the "Welcome" text */
        .box-heading h1 {
            margin: 0;
            font-size: 24px;
        }
        
      
        .box-heading p {
            margin: 20px; 
            font-size: 14px;
        }
    </style>
</head>
<body>

  <div class="box-heading">
        <h1>
         <%
out.print("Welcome  "+request.getAttribute("myname"));

%> 
</h1>
    </div>
    
</body>
</html>