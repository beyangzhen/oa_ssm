<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>修改试题</title>
		<!-- jquery  jquery.form 异步提交 -->
		<script>
			$(function() {
				var form = $("#updateSubjectForm");
				form.off();
				form.on("submit", function() {
					form.ajaxSubmit(function() {
						alert("修改成功");
						form[0].reset(); // 重置表单
						// $("#addSubjectForm input").not(":submit").val(""); // 重置表单
					});
					return false; // 阻止form的默认行为
				});
				
			});
		</script>
	</head>
	<body>
		<h1>修改试题</h1>
		<hr>
		<form action="updateSubject" method="post" id="updateSubjectForm">
			<input name="id" type="hidden" value="${subject.id }">
			题  目:<input name="question" type="text" value="${subject.title.question }" style="margin:3px;"/><br/>
			选项A:<input name="optionA" type="text" value="${subject.title.optionA }" style="margin:3px;"/><br/>
			选项B:<input name="optionB" type="text" value="${subject.title.optionB }" style="margin:3px;"/><br/>
			选项C:<input name="optionC" type="text" value="${subject.title.optionC }" style="margin:3px;"/><br/>
			选项D:<input name="optionD" type="text" value="${subject.title.optionD }" style="margin:3px;"/><br/>
			类  型:<input name="type" type="text" value="${subject.type }" style="margin:3px;"/><br/>
			答  案:<input name="answer" type="text" value="${subject.answer }" style="margin:3px;"/><br/><br/>
			<input type="submit" value="修改" style="margin:3px;"/><br/>
		</form>
	</body>
</html>