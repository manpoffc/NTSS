<%@page import ="util.DBManager"%>

<%@ page language= "java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>


<html>

<body>

<%
    DBManager dbmanager = new DBManager();
    out.println(dbmanager.getconn());
%>
</body>
</html>