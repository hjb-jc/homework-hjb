<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="/Resources/css.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    table {
        border-collapse: collapse;
    }

    th, tr, td {
        border: 1px solid;
        padding: 1em;
    }
    body{background-color: #fff;}
</style>
<body>
<h2>跑车列表</h2>

<div class="form-group"><a href="#">首页</a>
    <a href="/jsp/carLogin.jsp">管理</a>
    <a href="#">设置</a>
    <a href="http://www.baidu.com">帮助</a>

</div>
<form action="/CarQuery" method="post" class="form-group">
    <div style=" margin: 1em">
        <input type="text" placeholder="搜索条件[车名]" name="query"/>
        <input type="submit" value="搜索"/>
    </div>
</form>
<form>
    <table class="table">
        <thead>
        <tr>
            <th>编号</th>
            <th>车名</th>
            <th>型号</th>
            <th>颜色</th>
            <th>价钱</th>
            <th>操作</th>
        </tr>
        </thead>
        <c:forEach items="${car}" var="car">
            <tbody>
            <tr>
                <th scope="row">${car.id}</th>
                <td>${car.name}</td>
                <td>${car.model}</td>
                <td>${car.color}</td>
                <td><f:formatNumber value="${car.price}" type="CURRENCY" currencySymbol="$"/></td>
                <td>
                    <a href="/CarDetails?id=${car.id}">浏览</a>
                    <a href="#">收藏</a>
                </td>
            </tr>
            </tbody>
        </c:forEach>
    </table>
</form>

<%@include file="/Resources/js.jsp" %>
</body>
</html>
