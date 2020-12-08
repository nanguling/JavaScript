<%--
  Created by IntelliJ IDEA.
  User: 何小帅
  Date: 2020/12/8
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function init() {
            var obj = ${requestScope.key};
            document.getElementById("id").value = obj.id;
            document.getElementById("name").value = obj.name;
            document.getElementById("address").value = obj.address;
        }
    </script>
</head>
<body onload="init()">
    <table border="2" align="center">
        <tr>
            <td>部门编号</td>
            <td><input type="text" id="id"></td>
        </tr>
        <tr>
            <td>部门名称</td>
            <td><input type="text" id="name"></td>
        </tr>
        <tr>
            <td>部门地址</td>
            <td><input type="text" id="address"></td>
        </tr>
    </table>
</body>
</html>
