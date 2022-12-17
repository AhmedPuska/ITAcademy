<%-- 
    Document   : index
    Created on : Apr 1, 2019, 4:17:11 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="validate" action="register.jsp" method="post">
            <input type="text" name="firstname" placeholder="First Name" required/>
            <input type="text" name="lastname" placeholder="Last name" required/><br>
            <input type="email" name="email" placeholder="Email" onblur="validateEmail(this)" required/>
            <input type="password" name="password" placeholder="Password" required/><br>
            <input type="date" name="date" required/>
            <input type="radio" value="m" name="gender" required/>male 
            <input type="radio" value="f" name="gender" required/> female<br>
            <input type="submit"/>
        </form>
        <script>

            function validateEmail(f) {
                var email = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})$/;
                if (!f.value.match(email)) {
                    f.style.borderColor = "red";
                    f.false;
                } else {
                    f.style.borderColor = "green";
                    f.true;
                }
            }
        </script>

    </body>
</html>
