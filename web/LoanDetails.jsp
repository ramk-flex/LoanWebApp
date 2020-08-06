<%--
  Created by IntelliJ IDEA.
  User: ramu
  Date: 2020-05-27
  Time: 09:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Loan Details</title>
    <style>
        .errorblock{
            color:  #000;
            background-color: aqua;
            border: 3px solid brown;
        }
    </style>

    <script language="JavaScript1.5">
        function _logout(){
            alert('Logout clicked');
            var form = document.getElementById("loanDetails");
            form.action = "/lwa/api/logout";
            form.submit();
        }
    </script>
</head>
<body>
    <form:form id="loanDetails" modelAttribute="loanDetails" method="post" action="register">
        <form:errors path="*" cssClass="errorblock" element="div" />
        <table>
            <tr>
                <td>Mortgage Type:</td>
                <td><form:input path="mortgageType"/></td>
            </tr>
            <tr>
                <td>Loan Amount:</td>
                <td><form:input path="loanAmount"/></td>
            </tr>
            <tr>
                <td>Loan Term:</td>
                <td><form:input path="loanTerm"/></td>
            </tr>
            <tr>
                <td>Loan Product Type:</td>
                <td><form:input path="productType"/></td>
            </tr>

            <tr>
                <td colspan="2">
                    <input type="submit" value = "Create Loan"/>
                    <input type="button" value = "Log Out" onclick="_logout()"/>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
