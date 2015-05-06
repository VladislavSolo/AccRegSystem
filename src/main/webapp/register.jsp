<%--
  Created by IntelliJ IDEA.
  User: Vladislav
  Date: 04.05.15
  Time: 20:10
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
      <font size="+3">
        Здравствуйте, введите пожалуйста ваши данные и придумайте хороший пароль.
      </font>
      <table border="2">
        <tr>
          <td>
            Имя:
          </td>
          <td>
            <input type="text" name="name">
          </td>
        </tr>
        <tr>
          <td>
            Фамилия:
          </td>
          <td>
            <input type="text" name="lastname">
          </td>
        </tr>
        <tr>
          <td>
            Адрес проживания:
          </td>
          <td>
            <input type="text" name="address">
          </td>
        </tr>
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
            <input type="text" name="password">
          </td>
        </tr>
      </table>
      <input type="submit" value="register">
      <input type="hidden" name="command" value="register"/>
    </center>
  </form>
</body>
</html>
