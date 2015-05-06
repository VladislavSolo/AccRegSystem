<%--
  Created by IntelliJ IDEA.
  User: Vladislav
  Date: 02.05.15
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <form method="post" action="/m">
    <center>
      <table border="1">
        <tr>
          <td>
            E-mail:
          </td>
          <td>
            <input type="text" name="email">
          </td>
        </tr>
        <tr>
          <td>
            Пароль:
          </td>
          <td>
            <input type="password" name="password">
          </td>
        </tr>
      </table>
      <input type="submit" value="enter">
      <input type="hidden" name="command" value="enter" />
      <font color="red">${check}</font>
    </center>
  </form>
</body>
</html>
