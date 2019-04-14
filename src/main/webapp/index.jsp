<%--
  Created by IntelliJ IDEA.
  User: mengyue
  Date: 2019/4/14
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My JSP 'checkCode' starting page</title>
    <script type="text/javascript">
        function reloadCode() {
            var time = new Date().getTime();
            document.getElementById("imagecode").src="<%= request.getContextPath()%>/servlet/ImageServlet?d="+time;
        }

    </script>
</head>
<body>
<form action="<%= request.getContextPath()%>/servlet/LoginServlet" method="get">
验证码:<input type="text" name="checkCode"/>
<img alt="验证码" id="imagecode" src="<%= request.getContextPath()%>/servlet/ImageServlet"/>
<a href="javascript:reloadCode();">看不清楚</a><br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
