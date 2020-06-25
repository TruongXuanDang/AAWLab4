<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Product</title>
</head>
<body>

<s:form action="book" method="POST">
    <s:textfield name="name" label="Name"/>
    <s:textfield name="summary" label="Summary"/>
    <s:submit value="Save" />
</s:form>

</body>
</html>
