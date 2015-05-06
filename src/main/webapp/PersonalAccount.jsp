<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Vladislav
  Date: 05.05.15
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="list" class="java.util.ArrayList" scope="request"/>
<html>
<head>
    <title>Личный кабинет</title>
</head>
<body>
  <center>
    Добро пожаловать ${name}! Это ваш личный кабинет. Здесь вы можете делать заказы.
    <br>
    <hr>
    <br>
    <center>
      <table border = "1" cellpadding="1" cellspacing="1">
        <tr>
          <td>
            <b>ID заказа:</b>
          </td>
          <td>
            <b>Срок выполнения:</b>
          </td>
          <td>
            <b>Название шаблона:</b>
          </td>
          <td>
            <b>Тип шаблона:</b>
          </td>
          <td>
            <b>Формат шаблона:</b>
          </td>
          <td>
            <b>Размер шаблона:</b>
          </td>
          <td>
            <b>Название материала:</b>
          </td>
          <td>
            <b>Тип Материала:</b>
          </td>
        </tr>
        <c:forEach items="${list}" var="list">
          <tr>
            <td>
                ${list.getIdOrder()}
            </td>
            <td>
                ${list.getDeadLine()}
            </td>
            <td>
                ${list.getTemplateName()}
            </td>
            <td>
                ${list.getTemplateType()}
            </td>
            <td>
                ${list.getTemplateFormat()}
            </td>
            <td>
                ${list.getTemplateSize()}
            </td>
            <td>
                ${list.getProductName()}
            </td>
            <td>
                ${list.getProductType()}
            </td>
            <td>

            </td>
          </tr>
        </c:forEach>
    </table>
  </center>
</body>
</html>
