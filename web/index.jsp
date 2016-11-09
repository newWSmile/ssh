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
<body style="text-align:center;">
<form name="form1" action="<c:url value='/one.action'/>" method="post">
    <table border="0">
        <tr>
            <td colspan="2" bgcolor="#FDDDE" align="center">
                用户登录
            </td>
        </tr>
        <tr>
            <td align="right">
                用户名：
            </td>
            <td>
                <input type="text" name="name" style="width: 100px;" />
            </td>
        </tr>
        <tr>
            <td align="right">
                密码：
            </td>
            <td>
                <input type="password" name="pwd" style="width:100px;" />
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="登录" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>
