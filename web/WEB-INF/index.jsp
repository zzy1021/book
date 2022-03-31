<%--
  Created by IntelliJ IDEA.
  User: qq185
  Date: 2022/1/5
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/book05_war_exploded/servlet3" method="post">
    用户名<input type="text" name="usetname"><br>
    密码<input type="password" name="password"><br>
    兴趣<input type="checkbox" name="hobby" value="c++">c++
    <input type="checkbox" name="hobby" value="java">java
    <input type="checkbox" name="hobby" value="js">js <br>
    <input type="submit"value="提交">
  </form>
  </body>
</html>
