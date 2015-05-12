<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="list" class="java.util.ArrayList" scope="request"/>
<jsp:useBean id="ownerList" class="java.util.ArrayList" scope="request"/>

<html>
<head>
  <title>Личный кабинет</title>
  <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-latest.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/jquery.tablesorter.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/jquery.tablesorter.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/form.js"></script>


  <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/style.css"/>

</head>
<body >
<form method="post" action="/m">
  <div>
  <center>
    Добро пожаловать ${name}! Это ваш личный кабинет. Здесь вы можете делать заказы.
    <br>
    <hr>
    <br>
    <center>
      <table id = "myTable" border = "1" class = "tablesorter" align="left">
        <thead>
        <tr>
          <th>
            <b>Номер заказа:</b>
          </th>
          <th>
            <b>Количество:</b>
          </th>
          <th>
            <b>Название шаблона:</b>
          </th>
          <th>
            <b>Тип шаблона:</b>
          </th>
          <th>
            <b>Формат шаблона:</b>
          </th>
          <th>
            <b>Размер шаблона:</b>
          </th>
          <th>
            <b>Название материала:</b>
          </th>
          <th>
            <b>Тип Материала:</b>
          </th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="list">
          <tr>
            <td>
                ${list.getIdOrder()}
            </td>
            <td>
                ${list.getNumber()}
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
          </tr>
        </c:forEach>
        </tbody>
      </table>

      <table id = "myTable2" border = "1" class = "tablesorter" align="left">
        <thead>
        <tr>
          <th>
            <b>Order number:</b>
          </th>
          <td>
            <b>Name owner order:</b>
          </td>
          <td>
            <b>Notes:</b>
          </td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${ownerList}" var="ownerList">
          <tr>
            <td width="10%">
                ${ownerList.getIdOrder()}
            </td>
            <td width="45%">
                ${ownerList.getName()}
            </td>
            <td width="45%">
                ${ownerList.getNote()}
            </td>
          </tr>
        </c:forEach>
        </tbody>
      </table>

    </center>
  </center>
  </div>

  <div class="fleft">
    <select id="cd-dropdown" class="cd-select">
      <option value="-1" selected>Выбираем браузер</option>
      <option value="1" class="icon-chrome">Chrome</option>
      <option value="2" class="icon-safari">Safari</option>
      <option value="3" class="icon-IE">Internet Explorer</option>
      <option value="4" class="icon-firefox">Firefox</option>
      <option value="5" class="icon-opera">Opera</option>
    </select>
  </div>

  <div class="box" align="center">
    <h2>Управление заказами</h2>
    <h3><span>Поиск по заказам</span></h3>
    <ul>
      <li>Поиск по номеру: </li>
      <li>Поиск по названию: </li>
    </ul>

    <h3><span>Удаление заказа</span></h3>
    <ul>
      <li>Удалить заказ под номером: </li>
      <input type="text" name = "idDelete"/>
      <input type="submit" name="command" value="delete"/>
    </ul>
    <h3><span>Добавление заказов</span></h3>
    <ul>
      <li><a href="#" id="modal1">Сделать заказ по собственному шаблону</a></li>
      <li><a href="#" id="modal2">Собрать шаблон</a></li>
    </ul>
  </div>

</form>

<div id="modal_form">
  <form action="/m" method="post">

    <p>Enter a small name of your template<br />
      <input type="text" name="ownerTemplateName" />
    </p>
    <p>Enter a description of template, type and other information,
      which you want to use in your order  <br />
      <input type="text" name="ownerTemplateNote" />
    </p>
    <p>Enter a number of your templates <br />
      <input type="text" name="ownerTemplateNumber" />
    </p>
    <p style="text-align: center; padding-bottom: 10px;">
      <input type="submit" value="Add" />
      <input type="hidden" name="command" value="addOwnerTemplate">
    </p>

  </form>
</div>

<div id="modal_form2">
  <input type="button" class="but" value="reset" onclick="reset()"/>
  <input type="button" class="but" value="Start" onclick="f()"/>

  <form name = "addTemplate" action="/m" method="post">
    Enter number of pieces:<br/>
    <input type='text' name='orderNumber' />
    <p id="idd">
    </p>
    <input type="submit" name="command" value="addOrder">

  </form>
</div>

<div id="overlay"></div>

</body>
</html>
