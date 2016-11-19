<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>添加试题</title>
		<!-- jquery  jquery.form 异步提交 -->
		<script>
			$(function() {
				var form = $("#addSubjectForm");
				form.off();
				form.on("submit", function() {
					form.ajaxSubmit(function() {
						alert("添加成功");
						form[0].reset(); // 重置表单
						// $("#addSubjectForm input").not(":submit").val(""); // 重置表单
					});
					return false; // 阻止form的默认行为
				});
				
			});
		</script>
	</head>
	<body>
		<h1>添加试题</h1>
		<hr>
		<form action="addSubject" method="post" id="addSubjectForm" >
			题  目:<input name="title.question" type="text" value="${subject.title.question }" style="margin:3px;"/><br/>
			选项A:<input name="title.optionA" type="text" value="${subject.title.optionA }" style="margin:3px;"/><br/>
			选项B:<input name="title.optionB" type="text" value="${subject.title.optionB }" style="margin:3px;"/><br/>
			选项C:<input name="title.optionC" type="text" value="${subject.title.optionC }" style="margin:3px;"/><br/>
			选项D:<input name="title.optionD" type="text" value="${subject.title.optionD }" style="margin:3px;"/><br/>
			类  型:<input name="type" type="text" value="${subject.type }" style="margin:3px;"/><br/>
			答  案:<input name="answer" type="text" value="${subject.answer }" style="margin:3px;"/><br/><br/>
			<input type="submit" value="添加" style="margin:3px;"/><br/><br/>
			<!-- 显示错误信息 -->
			<c:if test="${allErrors!=null }">
			    <c:forEach items="${allErrors }" var="error">
			        <span style="color:red; margin-left:30px;" >${ error.defaultMessage}<br/></span>
			    </c:forEach>
			</c:if>
		</form>
	</body>
</html>