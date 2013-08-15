<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>Opprett Person</title>
        <style type="text/css">
        	.error {
        		color: red;
        	}
        </style>
    </head>
    <body>
        <h1>Opprett person</h1>
        <form:form action="${pageContext.request.contextPath}/person/opprett" method="post" modelAttribute="personfbo">
	        Personnummer <form:input type="text" path="personnummer"/><form:errors path="personnummer" class="error"></form:errors><br/>
	        Fornavn <form:input type="text" path="fornavn"/><form:errors path="fornavn" class="error"></form:errors><br/>
	        Etternavn <form:input type="text" path="etternavn"/><form:errors path="etternavn" class="error"></form:errors><br/>
	        <input type="submit" value="Lagre">
        </form:form>
    </body>
</html>
