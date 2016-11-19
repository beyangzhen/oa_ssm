<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	    <title>试题管理</title>
	    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
	    <meta http-equiv="imagetoolbar" content="no"/>
	    <meta name="apple-mobile-web-app-capable" content="yes"/>
	    <link href="${pageContext.request.contextPath }/resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath }/resources/css/axure_rp_page.css" type="text/css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath }/resources/ItemManage_files/axurerp_pagespecificstyles.css" type="text/css" rel="stylesheet">
	<!--[if IE 6]>
	    <link href="ItemManage_files/axurerp_pagespecificstyles_ie6.css" type="text/css" rel="stylesheet">
	<![endif]-->
	    <script src="${pageContext.request.contextPath }/resources/data/sitemap.js"></script>
	    <script src="${pageContext.request.contextPath }/resources/scripts/jquery-1.7.1.min.js"></script>
	    <script src="${pageContext.request.contextPath }/resources/scripts/axutils.js"></script>
	    <script src="${pageContext.request.contextPath }/resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
	    <script src="${pageContext.request.contextPath }/resources/scripts/axurerp_beforepagescript.js"></script>
	    <script src="${pageContext.request.contextPath }/resources/scripts/messagecenter.js"></script>
		<script src='${pageContext.request.contextPath }/resources/ItemManage_files/data.js'></script>
		
		<script type="text/javascript" src="${pageContext.request.contextPath }/resources/jquery-3.1.0.js"></script>
		
	</head>
	<body>
		<div id="u0" class="u0" >
			<DIV id="u0_line" class="u0_line" ></DIV>
		</div>
		<div id="u1" class="u1" >
			<DIV id="u1_line" class="u1_line" ></DIV>
		</div>
		
		<INPUT id="u83" type=text value="题目" class="u83"     >
		
		<INPUT id="u84" type=text value="类型" class="u84"     >
		
		<INPUT id="u85" type="submit" class="u85" value="搜索"   >
		
		<INPUT id="u86" type="submit" class="u86" value="添加"   >
		
		<div style="position:absolute; top:136px; left:167px;">
			<table border="1px" cellspacing="0" bordercolor="#808080" style="font-family:Arial; font-size:13px; font-weight:normal; font-style:normal; text-decoration:none; color:#333333;">
				<tr>
					<td width="94px" height="17px">题目</td>
					<td width="94px" height="17px">选项A</td>
					<td width="94px" height="17px">选项B</td>
					<td width="94px" height="17px">选项C</td>
					<td width="94px" height="17px">选项D</td>
					<td width="95px" height="17px">答案</td>
					<td width="94px" height="17px">类型</td>
					<td width="108px" height="17px">操作</td>
				</tr>
				<c:forEach var="s" items="${subjectList }" varStatus="status">
				<tr>
					<td width="94px" height="45px">${s.title.question }</td>
					<td width="94px" height="45px">${s.title.optionA }</td>
					<td width="94px" height="45px">${s.title.optionB }</td>
					<td width="94px" height="45px">${s.title.optionC }</td>
					<td width="94px" height="45px">${s.title.optionD }</td>
					<td width="95px" height="45px">${s.answer }</td>
					<td width="94px" height="45px">${s.type }</td>
					<td width="108px" height="45px" align="center">
						<button class="update" subjectId="${s.title.id }" value="修改">修改</button>&nbsp;
						<button class="delete" subjectId="${s.title.id }" value="删除">删除</button>
					</td>
				</tr>
				</c:forEach>
			</table>
		</div>
		
		
		<div id="u87" class="u87"  >
		<div id="u87_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">试题管理</span></p></div>
		</div>

		
		<div id="u89" class="u89"  >
		<div id="u89_rtf"><p style="text-align:left;"><a id="u90" ><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0000FF;">班级管理</span></a></p></div>
		</div>
		<div id="u91" class="u91"  >
		<div id="u91_rtf"><p style="text-align:left;"><a id="u92" ><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0000FF;">学生管理</span></a></p></div>
		</div>
		<div id="u93" class="u93"  >
		<div id="u93_rtf"><p style="text-align:left;"><a href="#"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0000FF;">试题管理</span></a></p></div>
		</div>
		<div id="u95" class="u95"  >
		<div id="u95_rtf"><p style="text-align:left;"><a href="${pageContext.request.contextPath }/admin/toExampaperManage"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0000FF;">试卷管理</span></a></p></div>
		</div>
		<div id="u97" class="u97"  >
		<div id="u97_rtf"><p style="text-align:left;"><a id="u98" ><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0000FF;">班主任</span><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0000FF;">管理</span></a></p></div>
		</div>
		<div id="u99" class="u99"  >
		<div id="u99_rtf"><p style="text-align:left;"><a id="u100" ><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0000FF;">讲师管理</span></a></p></div>
		</div>
		<div id="u101" class="u101"  >
		<div id="u101_rtf"><p style="text-align:left;"><a id="u102" ><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0000FF;">考试管理</span></a></p></div>
		</div>
		
		<div class="preload"><img src="ItemManage_files/u0_line.png" width="1" height="1"/><img src="ItemManage_files/u1_line.png" width="1" height="1"/><img src="ItemManage_files/u3_normal.png" width="1" height="1"/><img src="ItemManage_files/u17_normal.png" width="1" height="1"/><img src="ItemManage_files/u19_normal.png" width="1" height="1"/><img src="ItemManage_files/u33_normal.png" width="1" height="1"/></div>
	</body>
	
	<script src="${pageContext.request.contextPath }/resources/scripts/axurerp_pagescript.js"></script>
	<script src="${pageContext.request.contextPath }/resources/ItemManage_files/axurerp_pagespecificscript.js" charset="utf-8"></script>
	<script type="text/javascript">
		// jquery 入口
		$(function() { 
			// 点击添加按钮
			$('#u86').on('click', function() {
				location.href = '${pageContext.request.contextPath}/admin/toAddSubject';
			});
			
		});
	</script>
	<script type="text/javascript">
		// jquery 的入口
		$(function(){
			// 点击删除试题按钮
			$(".delete").off();
			$(".delete").on("click", function() {
				var id = $(this).attr('subjectId'); // 使用 this 才能达到指定删除
				location.href = '${pageContext.request.contextPath}/admin/deleteSubject?id=' + id;
			});
			
			// 点击修改试题按钮
			$(".update").off();
			$(".update").on("click", function() {
				var id = $(this).attr('subjectId'); // 使用 this 才能达到指定删除
				location.href = '${pageContext.request.contextPath}/admin/toUpdateSubject?id=' + id;
			});
			
		});
	</script>
</html>