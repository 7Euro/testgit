<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table align="center">
	<tr><h3 align="center">显示用户信息</h3></tr>
	<tr>
		<th>编号 </th><th>姓名</th><th>地址</th><th>性别</th><th>删除</th><th>更新</th>
	</tr>
	<tbody id="tbody"></tbody>
</table>
<script type="text/javascript" src="<%=request.getContextPath() %>/src/trade/js/jquery-1.7.1.js"></script>
<script type="text/javascript">
$(document).ready(function(){
$(function(){
	$.post("user!display.action",{},function(data){
		console.log(data);	
		for(var i = 0; i<data.list.length; i++){
		$("#tbody").append("<tr><td>"+data.list[i].nameNo+"</td><td>"+data.list[i].name+"</td><td>"
				+data.list[i].address+"</td><td>"+data.list[i].sex+"</td><td>"
				+"<input name='"+data.list[i].uid+"' type='button' value='删除' onclick='deleteUser(this)' />"+"</td><td>"
				+"<input name='"+data.list[i].uid+"' type='button' value='更新' onclick='updateUser(this)' />"+""            
		);
		}
	});
});

});
function deleteUser(obj){
	var uid = obj.name;
	$.post("user!deleteUser.action",{"user.uid":uid},function(data){
		window.location.href = "listUser.jsp";
	});
}
function updateUser(obj2){
	var uid = obj2.name;
	window.location.href = "updateUser.jsp?uid="+uid;
}

</script>
</body>
</html>