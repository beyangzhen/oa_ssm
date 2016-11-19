<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/jquery-3.1.0.min.js"></script>
	<title>首页</title>
</head>
	<body>
		<div style="position:absolute; top:15px; left:20px;">
			<div>
				<span>您好，管理员【${sessionScope.user.username }】 </span><a href="../toIndex.action">退出</a>&nbsp;<a href="${pageContext.request.contextPath }/admin/toIndex">后台管理</a>
			</div>
			<div>
				<ul class="baseUI" style="list-style-type:none;">
					<li url="${pageContext.request.contextPath }/toPersonal"><a href="#"><span>个人中心</span></a></li>
					<li url="${pageContext.request.contextPath }/toHistoryExam"><a href="#"><span>我的考试</span></a></li>
				</ul>
				<!-- 内容页面 -->
				<div class="right" style="position:absolute; top:35px; left:37px;">
						
				</div>
			</div>
		</div>
		<script type="text/javascript">
			$(function() { 
				$(".baseUI li").on("click", function() {
					var url = $(this).attr("url");
					$(".right").load(url);		
				});
			});
		</script>
	</body>
</html>
