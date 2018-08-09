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
	<tr >
		<td colspan="2" ><h1>添加用户信息</h1></td>
	</tr>
	<tr>
		<td>编号</td>
		<td><input type="text" size="20" id="nameNo"></td>
	</tr>
	<tr>
		<td>姓名 </td>
		<td><input type="text" size="20" id="name"></td>
	</tr>
	<tr>
		<td>地址</td>
		<td><input type="text" size="20" id="address"></td>
	</tr>
	<tr>
		<td>性别</td>
		<td><input type="text" size="20" id="sex"></td>
	</tr>
	<tr >
		<td colspan="2"><input type="button" value="确认更改" id="bt"></td>
	</tr>
</table>
<script type="text/javascript" src="<%=request.getContextPath() %>/src/trade/js/jquery-1.7.1.js"></script>
<script type="text/javascript">
	$(function(){
		var uid = ${param.uid};
		$.post("user!findUser.action",{"user.uid":uid},function(data){
			console.log(data);
			$("#name").val(data.user.name);
			$("#nameNo").val(data.user.nameNo);	
			$("#address").val(data.user.address);
			$("#sex").val(data.user.sex);
			
		});
		
		$("#bt").click(function(data){
			var nameNo=$("#nameNo").val();
			var name=$("#name").val();
			var address=$("#address").val();
			var sex=$("#sex").val();
			var ObjNo = {
					"user.name":name,
					"user.nameNo":nameNo,
					"user.address":address,
					"user.sex":sex,
					"user.uid":uid,
			};
			$.post("user!updateUser.action",ObjNo,function(data){
				alert("更新成功");
				console.log(data);
				window.location.href="listUser.jsp";
			});
		});
	});
	
	
</script>
</body>
</html>