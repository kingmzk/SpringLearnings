<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H1> i AM HERE <H1/>

 Result is :  <%= request.getAttribute("result") %>    
 
 <!-- Expression language  -->
 Result is : ${result}
</body>

</html>