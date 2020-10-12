

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="StudentInfo.html">Insert Student Details</a>
        <br><br><br><br>
        <form action="ValidateServlet">
            Enter username : &nbsp;&nbsp;&nbsp;<input type="text" name="uname" value="" />
            <br><br>
            Enter Password : &nbsp;&nbsp;&nbsp;<input type="password" name="pass" value="" />
            <br><br>
            <input type="submit" value="Login" />
        </form>
    </body>
</html>
