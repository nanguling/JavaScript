<%--
  Created by IntelliJ IDEA.
  User: 何小帅
  Date: 2020/12/6
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        var arr = [
            "allen","mike","tom","king","jones","tomcat","ohhhh","pick","java","c++","oop","hello","peach","apple"
        ];
        function fun1() {
            //1.读取用户在文本框输入的内容
            var context = document.getElementById("one").value;
            if (context == "") {
                document.getElementById("two").style.display = "none"
                return;
            }
            //2.到数组中定位包含了指定内容的字符串
            var value = "";
            for (var i = 0;i < arr.length;i++) {
                var str = arr[i];
                //indexOf方法
                if (str.indexOf(context) != -1) {
                    value += str+"<br/>";//allen</br>mike</br>....
                }
            }
            //3.将定位字符串作为文字显示内容填充到DIV标签
            var dom = document.getElementById("two");
            if (value == "") {
                dom.style.display = "none"
                return;
            }
            dom.innerHTML = value;
            dom.style.display = "block";
        }
    </script>
</head>
<body>
    <center>
        <div>
            <img src="baidu.png" width="270" height="129"/>
        </div>
        <input type="text" id="one" size="50" onkeyup="fun1()"><input type="button" style="background: blue;color: white" value="百度一下">
        <div id="two" style="background: antiquewhite;color: red;width: 400px;height: 400px;display: none"></div>
    </center>
</body>
</html>
