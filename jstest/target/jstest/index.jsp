<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<head></head>
<body>
<button type="button" onclick="functionAlert()">点击跳出弹窗</button>
<p id="demo">点击下面的按钮改变文字样式</p>
<button type="button" onclick="functionChange()">点击更换</button>
<h2><script>document.write("这是通过documen.write写出来的内容")</script></h2>
</body>
<script>
    function functionAlert() {
        alert('我是跳出的弹窗');
    }
    function functionChange() {
        x=document.getElementById("demo");
        x.innerHTML="全都变啦！";
        x.style.color="#5AFF8F"
    }
</script>
</html>
