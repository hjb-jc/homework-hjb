<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/Resources/css.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/CarUpdata" method="post" class="color-input-field">
    <div class="table-responsive">
        <input type="text" name="id" value="${car.id}" placeholder="id"/><br>
        <input type="text" name="name" value="${car.name}" placeholder="name"/><br>
        <input type="text" name="model" value="${car.model}" placeholder="model"/><br>
        <input type="text" name="color" value="${car.color}" placeholder="color"/><br>
        <input type="number" step="o.oo1" name="price" value="${car.price}" placeholder="price"/><br>
        <input type="submit" name="submit" value="提交更新"/>
    </div>
</form>
<%@include file="/Resources/js.jsp" %>
</body>
</html>
