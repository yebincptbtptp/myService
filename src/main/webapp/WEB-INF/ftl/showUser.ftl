<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户信息</title>
</head>
<body>
	<h1>${User.name}</h1>
	<hr>
	<#list users as item>
		<font color="red">${item.name}</font><br>
	</#list>
	<hr>
	<#list userMap?keys as key>
		<font color="red">${key} : ${userMap[key].age}</font><br>
	</#list>
	<hr>
	<#assign userAge = User.age>
	<#if (userAge >= 65)>
		<font color="blue">${User.name}已经退休了</font><br>
	<#else>
		<font color="blue">${User.name}处在职业生涯</font><br>
	</#if>
</body>
</html>