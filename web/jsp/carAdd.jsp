<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/CarAdd" method="post">
    <div class="form-group">
        <input type="number" step="0.001" name="id" placeholder="id"/><br>
        <input type="text" name="name" placeholder="车名"/><br>
        <input type="text" name="model" placeholder="型号"/><br>
        <input type="text" name="color" placeholder="颜色"/><br>
        <input type="number" step="0.001" name="price" placeholder="价钱"/><br>
        <input type="submit" value="确定添加"/>
    </div>
</form>
</body>
</html>
