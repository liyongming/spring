<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<!-- <script type="text/javascript" src="js/cycle.js"></script> -->
<script type="text/javascript" src="js/json_parse_state.js"></script>
<script type="text/javascript" src="js/json_parse.js"></script>
<script type="text/javascript" src="js/json2.js"></script>
<script type="text/javascript">
(function(){
	sendData();
})();
function sendData(){
	$.ajax({
		   type: "post",
		   url: "bookController",
		   contentType:"application/json",
		   data: JSON.stringify({id:'1',name:'liyongming'}),
		   success: function(msg){
		     alert(msg);
		   }
		});
}
</script>
<body>
	<form action="login" method="post">
		姓名:<input type="text" name="name"><br>
		年龄:<input type="text" name="age"><br>
		<input type="submit" value="提交">
	</form>
</body>
</html>