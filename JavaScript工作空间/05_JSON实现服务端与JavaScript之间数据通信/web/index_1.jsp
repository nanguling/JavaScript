
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        var obj = ${requestScope.key};
        window.alert("学生编号:"+obj.id+" 学生姓名:"+obj.name);
    </script>
</head>
<body>

</body>
</html>
