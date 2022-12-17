<%-- 
    Document   : newUser
    Created on : Jun 14, 2019, 10:36:08 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .field{
                clear:both;
                padding: 5px;
            }
            .field label {
                text-align: left;
                width: 100px;
                float: left;
            }
            .error {
                color: red;
            }
        </style>
    </head>
    <body>
        <form:form action="newUser.htm" method="post" commandName="user">
            <div class="field">
                <form:label path="firstName">First name</form:label>
                <form:input path="firstName" />
                <form:errors path="firstName" cssClass="error"></form:errors>
            </div>
            <div class="field">
                <form:label path="lastName">Last name</form:label>
                <form:input path="lastName" />
                <form:errors path="lastName" cssClass="error"></form:errors>
            </div>
            <div class="field">
                <form:label path="dateOfBirth">Date of birth</form:label>
                <form:input path="dateOfBirth" type="date" id="date_field"/>
                <form:errors path="dateOfBirth" cssClass="error"></form:errors>
            </div>
            <div class="field">
                <form:label path="pid">Personal ID Number</form:label>
                <form:input path="pid" />
                <form:errors path="pid" cssClass="error"></form:errors>
            </div>
            <div class="field">
                <form:label path="email">Email</form:label>
                <form:input path="email" />
                <form:errors path="email" cssClass="error"></form:errors>
            </div>
            <div class="field">
                <form:label path="country">Country</form:label>
                <form:input path="country" />
                <form:errors path="country" cssClass="error"></form:errors>
            </div>
            <div class="field">
                <form:label path="city">City</form:label>
                <form:input path="city" />
                <form:errors path="city" cssClass="error"></form:errors>
            </div>
            <div class="field">
                <form:label path="postal">Postal code</form:label>
                <form:input path="postal" />
                <form:errors path="postal" cssClass="error"></form:errors>
            </div>
            <input type="submit" value="Sumbit"/>
        </form:form>
    </body>
</html>
