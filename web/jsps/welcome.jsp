<%--
  Created by IntelliJ IDEA.
  User: 军街
  Date: 2016/9/22
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="/struts-tags" %>
<html>
  <head>
    <title>这是测试页面</title>
      <style type="text/css">
          tr{
              width: 30%;
              height: 20px;
              background-color: darkgoldenrod;
          }
          td{
              width: 20%;
              height: 20px;
              background-color: thistle;
          }
      </style>
      <script language="JavaScript">
          function add() {
              var row = tb1.insertRow();
              var cell = row.insertCell();
              cell.innerHTML="<input type='text' name='name' />";
              var cell2 = row.insertCell();
              cell2.innerHTML="<input type='text' name='pwd' />";
          }
      </script>
  </head>
  <body>
      <h2>这是测试页面</h2>
      <h3>登录成功</h3>

       <a href="<c:url value='/one!query.action'/>">显示所有用户</a>
      <form action="<c:url value='/one!save.action' />" method="post">
          <table border="1" width="30%" id="tb1">
              <tr bgcolor="#f0ffff">
                  <td bgcolor="#ffe4c4">用户名</td>
                  <td bgcolor="#5f9ea0">密码</td>
              </tr>
          </table>
          <%--点击button后动态出来一行填写数据--%>
          <input type="button" onclick="add();" value="增加信息" />
          <input type="submit" value="保存"/>
      </form>
  </body>
</html>
