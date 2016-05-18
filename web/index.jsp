<%@ page import="DAO.testjdbc" %><%--
  Created by IntelliJ IDEA.
  User: viv
  Date: 12.05.2016
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  prefix="h" uri="http://java.sun.com/jsp/jstl/core"  %>


<!DOCTYPE html>
<html lang="ru">
<head>
  <meta charset="utf-8">
  <title>Записная Книжка</title>
</head>
<body>
  <h1>Записная книжка</h1>

  <form name="searchA" method="post" action="index.jsp">
    <p><b>Выбор по алфавиту:</b><br>
      <input type="submit" value="A" id="A" size="30" autofocus>
      <input type="submit" value="B" id="B" size="30">
      <input type="submit" value="C" id="C" size="30">
      <input type="submit" value="D" id="D" size="30">
      <input type="submit" value="E" id="E" size="30">
      <input type="submit" value="F" id="F" size="30">
      <input type="submit" value="G" id="G" size="30">
      <input type="submit" value="H" id="H" size="30">
      <input type="submit" value="I" id="I" size="30">
      <input type="submit" value="J" id="J" size="30">
      <input type="submit" value="K" id="K" size="30">
      <input type="submit" value="L" id="L" size="30">
      <input type="submit" value="M" id="M" size="30">
      <input type="submit" value="N" id="N" size="30">
      <input type="submit" value="O" id="O" size="30">
      <input type="submit" value="P" id="P" size="30">
      <input type="submit" value="Q" id="Q" size="30">
      <input type="submit" value="R" id="R" size="30">
      <input type="submit" value="S" id="S" size="30">
      <input type="submit" value="T" id="T" size="30">
      <input type="submit" value="U" id="U" size="30">
      <input type="submit" value="V" id="V" size="30">
      <input type="submit" value="W" id="W" size="30">
      <input type="submit" value="X" id="X" size="30">
      <input type="submit" value="Y" id="Y" size="30">
      <input type="submit" value="Z" id="Z" size="30">
    </p>
  </form>


  <form name="searchA" method="post" action="index.jsp" >
    <p><b>Поиск по любому атрибуту:</b><br>
      <input type="input" value="" id="input" wight="20%">
      <input type="submit" value="Поиск" id="search" size="300">
    </p>
  </form>

  <table width="100%" cellspacing="0" cellpadding="4" border="1">
    <tr bgcolor="#cccccc">
      <td colspan="2" height="30">Peoples</td>
    </tr>
    <tr>
      <td width="20%">First and Last names</td>
      <td>Details</td>
    </tr>
      <tr>
          <td width="20%">href: "First and Last names"</td>
          <td>Last Name</td>
      </tr>
      <tr>
          <td width="20%">href: "First and Last names"</td>
          <td>First Name</td>
      </tr>
      <tr>
          <td width="20%">href: "First and Last names"</td>
          <td>Phone</td>
      </tr>
  </table>


  <% testjdbc tc = new testjdbc();
      tc.check();  %>

</body>
</html>

