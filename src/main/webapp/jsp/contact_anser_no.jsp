<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ServletTest Contact</title>
</head>
<body>
<%@page import="bean.ContactCastomer" %>
<% ContactCastomer cc = (ContactCastomer)request.getAttribute("contactCastomer") ;%>

<p>名前：<%=cc.getName() %><p>
<p>会社：<%=cc.getCompany() %></p>
<p>メールアドレス：<%=cc.getAddress() %></p>
<p>問い合わせ内容：<%=cc.getInquiry() %></p>
<p>メルマガ種類：
<%for(String type: cc.getMerumaga_type()){ 
	out.println(type+",");
}%>
</p>
<p>資料請求希望：<%=cc.getDocument_request() %></p>


</body>
</html>