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
</style>
<body>
<div class="table-responsive">
<h2 class="sub-header">跑车列表</h2>

<h3><%=request.getSession().getAttribute("msg")%>
</h3>

<div><a href="#">首页</a>
    <a href="#">管理</a>
    <a href="#">设置</a>
    <a href="http://www.baidu.com">帮助</a>
</div>

<form action="/CarQuery" method="post">
    <div style="margin-left: 12em; margin: 1em">
        <input type="text" placeholder="搜索条件[车名]" name="query"/>
        <input type="submit" value="搜索"/>
    </div>
</form>

<form action="/CarDel" method="post">

    <div style="margin-left: 3em ;margin: 1em">
        <a href="/jsp/carAdd.jsp">添加</a>
        <input type="submit" value="删除" name="del"/>
    </div>
    <table class="table">

        <thead class="thead-default">
        <tr>
            <th><input type="checkbox" onclick="checkalls(this)"/>全选</th>
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
                <td><input type="checkbox" value="${car.id}" name="check"/></td>
                <th scope="row">${car.id}</th>
                <td>${car.name}</td>
                <td>${car.model}</td>
                <td>${car.color}</td>
                <td><f:formatNumber value="${car.price}" type="CURRENCY" currencySymbol="$"/></td>
                <td>
                    <a href="/CarDetails?id=${car.id}">浏览</a>
                    <a href="/CarUpdata?id=${car.id}">更新</a>
                </td>
            </tr>
            </tbody>
        </c:forEach>
    </table>
</form>
    <a href="/jsp/carListAll.jsp">返回首页</a>
</div>

<script>
    function checkalls(e) {
        var checks = document.getElementsByName("check");
        for (var i = 0; i < checks.length; i++) {
            //alert(checks[i]);
            checks[i].checked = e.checked;
        }
    }
</script>
<%@include file="/Resources/js.jsp"%>
</body>
</html>
