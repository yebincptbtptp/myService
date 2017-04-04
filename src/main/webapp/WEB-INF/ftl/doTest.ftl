<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="padding-left:50px;">
	<h1>逻辑</h1>
	
	<h2>1、取基本值</h2>
	<div>
		<ul style="list-style: none;">
			<li>
			整数：<font color="red">${intVar}</font><br/>
			</li>
			<li>
			长整形：<font color="orange">${longVar}</font><br/>
			</li>
			<li>
			字符串：<font color="yellow">${strVar}</font><br/>
			</li>
			<li>
			双精度：<font color="green">${doubleVar}</font><br/>
			</li>
			<li>
			布尔值：<font color="navy">${booleanVar?string('对','错')}</font><br/>
			</li>
			<li>
			时间：<font color="blue">${dateVar?string('yy-MM-dd HH:mm:ss')}</font><br/>
			</li>
			<li>
			空：<font color="purple">${nullVar!'默认值'}</font><br/>
			</li>
		</ul>
	</div>
	
	<hr/>
	<h1>逻辑</h1>
	<h2>取值</h2>
	<div>
		<ul style="list-style: none;">
			<li>取值&运算</li>
			<#assign a=100>
			a = <font color="red">${a}</font><br/>
			a+100 = <font color="red">${a+100}</font><br/>
		</ul>
	</div>
</body>
</html>