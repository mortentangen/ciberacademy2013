<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Hello World with Spring 3 MVC</title>
</head> 
<body>
<h1>Register new book</h1><br />
<form:form commandName="BOOK" method="POST" action="add">
    <table>
        <tr>
            <td colspan="2">
                <form:errors path="*" cssStyle="color : green;"/>
            </td>
        </tr>
        <tr><td>Author</td><td><form:input path="author" /></td></tr>
        <tr><td>Title</td><td><form:input path="title" /></td></tr>
        <tr><td>Price</td><td><form:input path="price" /></td></tr>
        <tr>
            <td>Year</td>
            <td>
                <form:select path="year">
                    <form:option value="2005"/>
                    <form:option value="2006"/>
                    <form:option value="2007"/>
                    <form:option value="2008"/>
                </form:select>
            </td>
        </tr>
        <tr><td colspan="2"><input type="submit" value="Save Changes" /></td><a href="/cibrary2/book/list" ><input type="button" value="List bøker" name="list"/></tr>
    </table>
</form:form>
</body>
</html>

<!-- <input type="button" name="blah" onclick="document.location.href='asdf.jsp'"> -->
<!--  <a href="asdf.jsp"><input type="button name="blah"></a>  -->