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
    <title>这是查寻结果页面</title>
  </head>
  <body>
      <h2>这是查寻结果页面</h2>
      <c:iterator id="a" value="#request.users">
          <c:property value="name"/>,
          <c:property value="pwd"/><br/>
      </c:iterator>
      <a href="javascript:window.history.go(-1);">返回</a>
  </body>
</html>
