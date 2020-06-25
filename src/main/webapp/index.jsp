<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Success</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 50%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<h1>List Book</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Quantity</th>
    </tr>

    <s:iterator value="books">
        <tr>
            <td><s:property value="Id" /></td>
            <td><s:property value="BookName" /></td>
            <td><s:property value="Summary" /></td>
            <td><s:property value="AuthorId" /></td>

        </tr>
    </s:iterator>

</table>

</body>
</html>
