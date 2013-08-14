<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Opprett Person</title>
    </head>
    <body>
        <h1>Opprett person</h1>
        ${error }
        <form action="${pageContext.request.contextPath}/person/opprett" method="post">
	        Personnummer <input type="text" name="personnummer"><br/>
	        Fornavn <input type="text" name="fornavn"><br/>
	        Etternavn <input type="text" name="etternavn"><br/>
	        <input type="submit" value="Lagre">
        </form>
    </body>
</html>
