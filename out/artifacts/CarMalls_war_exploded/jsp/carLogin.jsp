<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        div {
            margin: 2em;
        }
        input{ margin: 1em;}
    </style>
</head>
<body>
<form name="frm" method=post>
    <div class="form-group">
        用户名：<input type="text" name="userName"/><span>*必填</span><br>
        密码：<input type="password" name="pwd"/><span>*必填</span><br>
        验证码：<textarea name="tet" rows="10"></textarea><br>
        <input type="submit" name="submit" value="登录" onclick="checkLogin()"/><br>
        <a href="#">忘记密码？</a>
        <a href="#">新用户注册？</a>
    </div>
</form>

<script>
    function checkLogin(){
        var username = frm.userName.value;
        var pwd = frm.pwd.value;
        var numb=[1,2,3,4,5,6,7,8,9];

        if(username == "" && pwd ==""  ){
            alert("用户名和密码不能为空");
            frm.action="/jsp/carLogin.jsp";
        }else if("gk"==username && "123"==pwd){
            frm.action="/CarListBackground";
        }

       /* if("gk"==username && "123"==pwd){
            frm.action="/CarListBackground";
        }else{
            frm.action="/jsp/carLogin.jsp";
        }*/

    }
</script>

</body>
</html>
