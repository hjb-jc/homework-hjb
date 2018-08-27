<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="/Resources/css.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>${car.name}</h2>
<ul class="list-group">
    编号：<li class="list-group-item list-group-item-dark">${car.id}</li>
    型号：<li class="list-group-item list-group-item-dark">${car.model}</li>
    颜色：<li class="list-group-item list-group-item-dark">${car.color}</li>
    价钱：<li class="list-group-item list-group-item-dark">${car.price}</li>
</ul>
</body>
</html>
