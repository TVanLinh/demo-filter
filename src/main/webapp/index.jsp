<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.GregorianCalendar" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<%
    Calendar calendar= GregorianCalendar.getInstance();
    out.print(calendar.getTime());
    response.setHeader("refresh","1");
%>
<fieldset>
    <legend>Demo filter in user</legend>
    <form method="get" action="/MyServlet1">
        <input type="text" name="action"/><br><br>
        <input type="submit" value="Send">
    </form>
</fieldset>
<%--<c:redirect url="MyServlet2"/>--%>
</body>
</html>
