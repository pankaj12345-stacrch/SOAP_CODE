<%-- 
    Document   : f_to_c
    Created on : Jul 14, 2021, 2:11:16 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
    <%-- start web service invocation --%><hr/>
    <%
        String d=request.getParameter("data");
        Integer dd=Integer.parseInt(d);
    try {
	service.TempService_Service service = new service.TempService_Service();
	service.TempService port = service.getTempServicePort();
	 // TODO initialize WS operation arguments here
	double f = dd;
	// TODO process result here
	java.lang.Double result = port.fToC(f);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
